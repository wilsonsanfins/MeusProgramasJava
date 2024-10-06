import javax.swing.JOptionPane;
public class SomaDeDoisNumeros {
    public static void main (String args[]){
        int valor1, valor2,soma;
        valor1=Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro valor ?"));  // converte String em Int por causa do integer.parseInt
        valor2=Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo valor?")); // converte String em Int por causa do integer.parseInt
        soma=valor1+valor2;
        JOptionPane.showMessageDialog(null,"O resultado da soma dos valores é : "+soma);
    }
}
