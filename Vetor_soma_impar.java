import javax.swing.JOptionPane;

public class Vetor_soma_impar {
    public static void main(String args[]) {
        final int tamanho = 5;
        int A[] = new int[tamanho];
        int soma = 0;
        String num;
        try {
            for (int i = 0; i < tamanho; i++) {
                num = JOptionPane.showInputDialog("Digite o valor " + i + ":");
                A[i] = Integer.parseInt(num);
            }
            for (int i = 0; i < tamanho; i++) {
                if(A[i] %2 !=0){
                    soma=soma+A[i];
                }
                JOptionPane.showMessageDialog(null,"Soma dos ímpares = "+soma);

            }
        } catch (Exception e) {
   JOptionPane.showMessageDialog(null,"!!!OCOREU UM ERRO!!!");
        }

    }

}
