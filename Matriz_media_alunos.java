import javax.swing.JOptionPane;

public class Matriz_media_alunos {
    public static void main(String args[]) {
        final int nProvas = 3;
        final int nAlunos = 10;
        float NotaProva[][] = new float[nAlunos][nProvas];
        float MedAlunos[] = new float[nAlunos];
        float MedProvas[] = new float[nProvas];
        float Soma;
        String num;
        try {
            for (int i = 0; i < nAlunos; i++) {
                Soma = 0;
                for (int j = 0; j < nProvas; j++) {
                    num = JOptionPane.showInputDialog(null, "Entre com a nota do Aluno " + i + " Prova - " + j);
                    NotaProva[i][j] = Float.parseFloat(num);
                    Soma = Soma + NotaProva[i][j];
                }

                MedAlunos[i] = Soma / nProvas;
            }
            for (int j = 0; j < nProvas; j++) {

                Soma = 0;
                for (int i = 0; i < nAlunos; i++) {

                    Soma = Soma + NotaProva[i][j];
                }
                MedProvas[j] = Soma / nAlunos;
            }
            for(int i=0;i<nAlunos;i++){
                JOptionPane.showMessageDialog(null,"Media da aluno - "+i+" : "+MedAlunos[i]);
            }
        
        for(int i=0;i<nProvas;i++){
            JOptionPane.showMessageDialog(null,"Media da Prova - "+i+" : "+MedProvas[i]);
        }

            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"!!!ERRO!!!");

        }

    }
}
