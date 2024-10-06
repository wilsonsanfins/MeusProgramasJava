import javax.swing.JOptionPane;

class While_EnquantoMedia
 {
    public static void main(String args[]) {
        float numero, media, soma;
        int cont;
        cont = 0;
        soma = 0f;
        while (cont < 2) {
            numero = Float.parseFloat(JOptionPane.showInputDialog("Digite um número"));
            soma = soma + numero;
            cont = cont + 1;// somador : se ele for maior que 2 ou seja se for perguntado 2x ele soma os valores digitados e divide por ele

        }
        media=soma/cont;
        JOptionPane.showMessageDialog(null,"A media é "+media);
    }

}