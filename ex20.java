import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] matriz =  new int[5][5];

        System.out.println("insira os dados da matriz: ");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

         sc.close();

         for (int i = 0; i < 5; i++) {
            int elementdig = matriz[i][i];
              for (int j = 0; j < 5; j++) {
                 matriz[i][j] *= elementdig;
              }
         }
          System.out.println("A matriz com as linhas multiplicadas pelo elemento da diagonal principal é de: ");
          for(int i=0;  i<5; i++){
            for(int j=0; j<5; j++){
                System.out.printf("%d", matriz[i][j]);
               
            }
             System.out.println("");
          }
          
    }
}
