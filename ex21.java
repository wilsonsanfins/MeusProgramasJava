import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {

        int x = 1;
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[7][10];

        System.out.println("Insira os dados da sua matriz 6x10 : ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
            matriz[i][j] = sc.nextInt(); 
            }
        }

        for(int j=0; j<10; j++){
            int soma = 0;
            for(int i=0; i<6; i++){
             soma += matriz[i][j];
            }
            matriz[6][j] = soma;
        }

        System.out.println("\n" +"Matriz completa:");
        for(int i=0; i<7; i++){
            for(int j=0; j<10; j++){
            System.out.print( matriz[i][j]);
            }
            System.out.println("");
        }

            System.out.println("\nSoma de cada coluna: ");
            for(int j=0; j<10; j++){ 
                System.out.println("Soma da coluna "+ x++ +" : "+ matriz[6][j]);
            }
            
           sc.close();
    }
}