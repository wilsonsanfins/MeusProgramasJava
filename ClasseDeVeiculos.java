import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClasseDeVeiculos {
    private String marca;
    private String modelo;
    private int ano;
    private int potencia;
    private int eixos;
    private int carga;

    public ClasseDeVeiculos(String marca, String modelo, int ano, int potencia, int eixos, int carga) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.eixos = eixos;
        this.carga = carga;
    }

    public void alternar(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getEixos() {
        return eixos;
    }

    public int getCarga() {
        return carga;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Veículo");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel marcaLabel = new JLabel("Marca:");
        marcaLabel.setBounds(10, 10, 80, 25);
        frame.add(marcaLabel);

        JTextField marcaText = new JTextField(20);
        marcaText.setBounds(100, 10, 160, 25);
        frame.add(marcaText);

        JLabel modeloLabel = new JLabel("Modelo:");
        modeloLabel.setBounds(10, 40, 80, 25);
        frame.add(modeloLabel);

        JTextField modeloText = new JTextField(20);
        modeloText.setBounds(100, 40, 160, 25);
        frame.add(modeloText);

        JLabel anoLabel = new JLabel("Ano:");
        anoLabel.setBounds(10, 70, 80, 25);
        frame.add(anoLabel);

        JTextField anoText = new JTextField(20);
        anoText.setBounds(100, 70, 160, 25);
        frame.add(anoText);

        JLabel potenciaLabel = new JLabel("Potência:");
        potenciaLabel.setBounds(10, 100, 80, 25);
        frame.add(potenciaLabel);

        JTextField potenciaText = new JTextField(20);
        potenciaText.setBounds(100, 100, 160, 25);
        frame.add(potenciaText);

        JLabel eixosLabel = new JLabel("Eixos:");
        eixosLabel.setBounds(10, 130, 80, 25);
        frame.add(eixosLabel);

        JTextField eixosText = new JTextField(20);
        eixosText.setBounds(100, 130, 160, 25);
        frame.add(eixosText);

        JLabel cargaLabel = new JLabel("Carga:");
        cargaLabel.setBounds(10, 160, 80, 25);
        frame.add(cargaLabel);

        JTextField cargaText = new JTextField(20);
        cargaText.setBounds(100, 160, 160, 25);
        frame.add(cargaText);

        JButton submitButton = new JButton("Cadastrar");
        submitButton.setBounds(10, 200, 150, 25);
        frame.add(submitButton);

        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(10, 240, 250, 100);
        frame.add(resultArea);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String marca = marcaText.getText();
                String modelo = modeloText.getText();
                int ano = Integer.parseInt(anoText.getText());
                int potencia = Integer.parseInt(potenciaText.getText());
                int eixos = Integer.parseInt(eixosText.getText());
                int carga = Integer.parseInt(cargaText.getText());

                ClasseDeVeiculos veiculo = new ClasseDeVeiculos(marca, modelo, ano, potencia, eixos, carga);

                resultArea.setText("Marca: " + veiculo.getMarca() +
                        "\nModelo: " + veiculo.getModelo() +
                        "\nAno: " + veiculo.getAno() +
                        "\nPotência: " + veiculo.getPotencia() +
                        "\nEixos: " + veiculo.getEixos() +
                        "\nCarga: " + veiculo.getCarga());

                String novoModelo = JOptionPane.showInputDialog(frame, "Digite o novo modelo:");
                veiculo.alternar(novoModelo);

                resultArea.append("\nNovo Modelo: " + veiculo.getModelo());
            }
        });

        frame.setVisible(true);
    }
}
