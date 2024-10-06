import javax.swing.JOptionPane;

public class Matriz_media_linhas_6x2 {
    public static void main(String args[]) {
        int G[][] = new int[6][2];
        double prod;
        String num;
        try {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 2; j++) {
                    num = JOptionPane.showInputDialog("Informe o valor G " + i + ", " + j + ":");
                    G[i][j] = Integer.parseInt(num);
                }

            }
            for (int i = 0; i < 6; i++) {
                prod = 1;//vem da biblioteca Math é uma raiz pelos menos é oq o livro fala :(
                for (int j = 0; j < 2; j++) {
                    prod = prod * G[i][j];
                }
                JOptionPane.showMessageDialog(null, "Linha " + i + ": " + Math.sqrt(prod));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "!!!ErrO!!!");

        }

    }

}
