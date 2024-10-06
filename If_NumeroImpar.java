import javax.swing.JOptionPane;
public class If_NumeroImpar {
    public static void main (String args[]){

        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite um número :"));
        if(numero %2==1){ // caso nao seja impar só fecha a porra do programa fdp >:(
            JOptionPane.showMessageDialog(null, "O numero "+numero+" é impar");
        }
    }
    
}
