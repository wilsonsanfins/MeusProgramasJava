import javax.swing.JOptionPane;

public class NprimosIntervalados {
    public static void main(String args[]) {
        int inicio, fim;

       
        inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite inferior do intervalo:"));
        fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite superior do intervalo:"));

     
        int contadorPrimos = 0;


        for (int i = inicio; i <= fim; i++) {
            if (isPrimo(i)) {
                contadorPrimos++;
            }
        }

  
        JOptionPane.showMessageDialog(null, "Existem " + contadorPrimos + " números primos no intervalo de " + inicio + " a " + fim + ".");
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
