
import javax.swing.JOptionPane;

public class Tabuada {
    public static void main(String[] args) {
        // Solicita ao usuário o número para o qual deseja calcular a tabuada
        float N = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));
        
        // Solicita ao usuário até qual número da tabuada ele deseja calcular
        int I = Integer.parseInt(JOptionPane.showInputDialog("Digite até qual número da tabuada deseja calcular: "));
        
        // Calcula e exibe a tabuada
        for (int multiplicador = 1; multiplicador <= I; multiplicador++) {
            float resultado = N * multiplicador;
            JOptionPane.showMessageDialog(null, N + " × " + multiplicador + " = " + resultado);
        }
    }
}



