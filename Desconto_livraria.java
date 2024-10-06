import javax.swing.JOptionPane;
public class Desconto_livraria {
    public static void main(String[] args) {
        int quant_livros;
        float Criterio_A, Criterio_B;
        quant_livros=Integer.parseInt(JOptionPane.showInputDialog("Digite quantos livros pretende comprar"));
Criterio_A=(quant_livros*0.25f)+7.50f;
Criterio_B=(quant_livros*0.50f)+2.50f;
if(Criterio_A>Criterio_B){
    JOptionPane.showMessageDialog(null,"O melhor criterio para essa compra é o B o preço sai por R$"+Criterio_B);
}else{
    JOptionPane.showMessageDialog(null,"O melhor criterio para essa compra é o A o preço sai por R$"+Criterio_A);
}
    }
}
