import javax.swing.JOptionPane;
public class Vetor_media_temperatura {
    public static void main(String args[]){
final int diasSemana=7;
float temperatura[]=new float[diasSemana];
float soma= 0f,media;
try {
    temperatura[0]= 19.0f;
    temperatura[1]= 23.0f;
    temperatura[2]= 21.0f;
    temperatura[3]= 25.0f;
    temperatura[4]= 22.0f;
    temperatura[5]= 20.0f;
    temperatura[6]= 24.0f;
    for(int i = 0; i< diasSemana;i++){
        soma=soma+temperatura[i];
    }
media=soma/diasSemana;
JOptionPane.showMessageDialog(null,"Media semana = "+media);

} catch (Exception e) {
  
    JOptionPane.showMessageDialog(null,"!!!ERRO!!!");

}


    }
    
}
