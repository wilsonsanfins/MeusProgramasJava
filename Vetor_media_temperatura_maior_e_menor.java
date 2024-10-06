import javax.swing.JOptionPane;
public class Vetor_media_temperatura_maior_e_menor {
public static void main(String args[]){
final int diasSemana =7;
float temperatura[] = new float [diasSemana];
 temperatura[0] = 19.0f;
 temperatura[1] = 23.0f;
 temperatura[2] = 21.0f;
 temperatura[3] = 25.0f;
 temperatura[4] = 22.0f;
 temperatura[5] = 20.0f;
 temperatura[6] = 24.0f;
float x;
for(int i=0; i<diasSemana;i++){
    for(int j=i+1;j<diasSemana;j++){
        if(temperatura[j]<temperatura[i]){
            x=temperatura[i];
            temperatura[i]=temperatura[j];
            temperatura[j]=x;
        }
    }

}
JOptionPane.showMessageDialog( null,"A temperatura maxima é : "+temperatura[6]);
JOptionPane.showMessageDialog(null,"A temperatura minima é : "+temperatura[0]);

}    
}
