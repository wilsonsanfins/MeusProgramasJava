import javax.swing.JOptionPane;
public class Case_Escolha_cod_Produto {
    public static void main(String args[]){
int codigo;
codigo=Integer.parseInt(JOptionPane.showInputDialog("Digite o Código"));
switch(codigo){
    case 001 : JOptionPane.showMessageDialog(null,"CADERNO");
    break;
    case 002 : JOptionPane.showMessageDialog(null,"LÁPIS");
    break;
    case 003 : JOptionPane.showMessageDialog(null,"BORRACHA");
    break;
    default:JOptionPane.showMessageDialog(null,"DIVERSOS");
}

    }
}
