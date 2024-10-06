import javax.swing.JOptionPane;
public class impar_ou_par {
    public static void main (String args[]){
        float numero;
        numero=Float.parseFloat(JOptionPane.showInputDialog("Digite um número"));
        if(numero%2==1){
JOptionPane.showMessageDialog(null,"O número " +numero+" é impar");
       }else{
JOptionPane.showMessageDialog(null,"O número " +numero+" é par");
       }
    }
}

