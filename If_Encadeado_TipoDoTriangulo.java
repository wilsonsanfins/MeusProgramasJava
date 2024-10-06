import javax.swing.*;

public class  If_Encadeado_TipoDoTriangulo {
    public static void main(String args[]) {
        int A, B, C;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o Lado A"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o Lado B"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite o Lado C"));

        if (A > 0 && B > 0 && C > 0) { // Verifica se todos os lados são positivos
            if (A + B > C && A + C > B && B + C > A) { // Verifica se forma um triângulo
                if (A != B && A != C && B != C) {
                    JOptionPane.showMessageDialog(null, "O triângulo é ESCALENO");
                } else if (A == B && B == C) {
                    JOptionPane.showMessageDialog(null, "O triângulo é EQUILÁTERO");
                } else {
                    JOptionPane.showMessageDialog(null, "O triângulo é ISÓSCELES");
                }
            } else {
                JOptionPane.showMessageDialog(null, "!!! NÃO FORMA UM TRINANGULO !!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "!!! NÃO FORMA UM TRINANGULO !!!");
        }
    }
}
