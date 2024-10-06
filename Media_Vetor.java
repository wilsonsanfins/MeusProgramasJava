import javax.swing.JOptionPane;
public class Media_Vetor {
    public static void main(String args[]){
        try {
            final int tamanho=10;
            float vetor[]=new float[tamanho];
            float media, soma=0;
            String num;
            for(int i = 0; i<vetor.length;i++){
                num=JOptionPane.showInputDialog("Digite o valor "+i+" :");
                vetor[i]=Float.parseFloat(num);
                soma=soma+vetor[i];
            }
            media=soma/vetor.length;
            JOptionPane.showMessageDialog(null, "Média :"+media);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro durante a leitura!");
         
        }


    }
    
}
