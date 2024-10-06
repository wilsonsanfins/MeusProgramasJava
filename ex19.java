import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int[][] matriz = new int[5][5];
        System.out.println("insira os dados da matriz " + x++ + " :");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j]= sc.nextInt();
               
            }
        }
        System.out.println("\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "");
            }
            System.out.println();
        }
        sc.close();
    }
}
