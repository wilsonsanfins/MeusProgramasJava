import javax.swing.JOptionPane;
import java.util.Scanner;
public class Matriz_3x5_entre15e20{
public static void main (String args[]){
    Scanner scan =new Scanner(System.in);
    int [][] matriz = new int[3][5];
    int x=0;
    try{
System.out.println("Entre com os dados da matriz: ");
for(int i=0; i<3; i++){
for(int j=0; j<5; j++){
    matriz[i][j]=scan.nextInt();
    if (matriz[i][j]>=15&& matriz [i][j]<=20){
        x++;
    }
}
}
if(x>=1){
    System.out.println("A sua matrix tem "+x+" numeros entre 15 e 20");
}
else{
    System.out.println("A sua matriz não possui numeros entre 15 e 20");
}




    }
    catch (Exception e) {
            JOptionPane.showMessageDialog(null,"!!!ERRO!!!");

        }

}


}