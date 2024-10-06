
import javax.swing.JOptionPane;

public class Nprimo {
    public static void main(String args[]) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        
        if (isPrimo(numero)) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é primo");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não é primo");
        }
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;
    }
}
