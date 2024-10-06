import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class cobraSafada extends JPanel implements ActionListener {

    private final int TILE_SIZE = 30; // Tamanho dos quadrados
    private final int WIDTH = 800; // Largura da tela
    private final int HEIGHT = 600; // Altura da tela
    private final int NUM_TILES_X = WIDTH / TILE_SIZE;
    private final int NUM_TILES_Y = HEIGHT / TILE_SIZE;

    private final ArrayList<Point> snake = new ArrayList<>();
    private Point food;
    private Direction direction = Direction.RIGHT;
    private boolean gameOver = false;

    private static int points = 0;
    private static JLabel pointsLabel = new JLabel("Pontuação: 0");

    private final Timer timer = new Timer(100, this); // Atualiza o jogo a cada 100 ms

    public cobraSafada() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.white);
        this.setFocusable(true);
        this.add(pointsLabel);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        if (direction != Direction.DOWN)
                            direction = Direction.UP;
                        break;
                    case KeyEvent.VK_DOWN:
                        if (direction != Direction.UP)
                            direction = Direction.DOWN;
                        break;
                    case KeyEvent.VK_LEFT:
                        if (direction != Direction.RIGHT)
                            direction = Direction.LEFT;
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (direction != Direction.LEFT)
                            direction = Direction.RIGHT;
                        break;
                }
            }
        });

        initializeGame();
        
        timer.start();
    }

    private void initializeGame() {
        snake.clear();
        snake.add(new Point(NUM_TILES_X / 2, NUM_TILES_Y / 2)); // Começa no meio da tela
        spawnFood();
    }

    private void spawnFood() {
        Random rand = new Random();
        int x = rand.nextInt(NUM_TILES_X);
        int y = rand.nextInt(NUM_TILES_Y);
        food = new Point(x, y);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (gameOver) {
            g.setColor(Color.darkGray);
            g.drawString("Game Over!!! aperte R para recomeçar", WIDTH / 4, HEIGHT / 2);
            return;
        }

        // Desenha a comida
        g.setColor(Color.RED);
        g.fillRect(food.x * TILE_SIZE, food.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);

        // Desenha a cobra
        g.setColor(Color.GREEN);
        for (Point p : snake) {
            g.fillRect(p.x * TILE_SIZE, p.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);

     
           
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            moveSnake();
            checkCollisions();
            checkFoodCollision();
            repaint();
            
        }
    }

    private void moveSnake() {
        Point head = snake.get(0);
        Point newHead = new Point(head);

        switch (direction) {
            case UP:
                newHead.y--;
                break;
            case DOWN:
                newHead.y++;
                break;
            case LEFT:
                newHead.x--;
                break;
            case RIGHT:
                newHead.x++;
                break;
        }

        // Verifica se a nova posição da cabeça está dentro dos limites
        if (newHead.x < 0 || newHead.x >= NUM_TILES_X || newHead.y < 0 || newHead.y >= NUM_TILES_Y
                || snake.contains(newHead)) {
            gameOver = true;
            timer.stop();
            return;
        }

        snake.add(0, newHead);

        // Remove o final da cobra se não comeu comida
        if (!newHead.equals(food)) {
            snake.remove(snake.size() - 1);
        }
    }

    private void checkCollisions() {
        // Verifica se a cabeça da cobra colidiu com a própria cobra
        Point head = snake.get(0);
        if (head.x < 0 || head.x >= NUM_TILES_X || head.y < 0 || head.y >= NUM_TILES_Y
                || snake.subList(1, snake.size()).contains(head)) {
            gameOver = true;
            timer.stop();
        }
    }

    private void checkFoodCollision() {
        if (snake.get(0).equals(food)) {
            snake.add(new Point(food)); // Adiciona uma nova parte à cobra
            spawnFood(); // Gera nova comida

            points++;
            pointsLabel.setText("Pontuação: " + points);
        }
    }

    public void restartGame() {
        gameOver = false;
        initializeGame();
        timer.start();
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Jogo da Cobra Safada");
        cobraSafada game = new cobraSafada();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        game.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_R && game.gameOver) {
                    game.restartGame();
                }
            }
        });
    }

    private enum Direction {
        UP, DOWN, LEFT, RIGHT
    }
}
