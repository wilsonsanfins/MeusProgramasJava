import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        int x = 0;
        System.out.println("insira os dados da sua matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] >= 15 && matriz[i][j] <= 20) {
                    x++;
                }
            }

        }
        
        if (x >= 1) {
            System.out.println("A sua matriz tem " + x + " numeros entre 15 e 20");
        }
        else{
            System.out.println("A sua matriz tem não possui numeros entre 15 e 20");

        }
        sc.close();
    }
}
