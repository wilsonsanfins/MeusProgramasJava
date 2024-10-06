import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][4];
        int x = 0, media = 0, par = 0;
        int[] contadorPorLinha = new int[2];
        System.out.println("insira os dados da sua matriz: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] >= 12 && matriz[i][j] <= 20) {
                    contadorPorLinha[i]++;
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {

                if (matriz[i][j] % 2 == 0) {
                    media += matriz[i][j];
                    par++;
                }
            }

        }
        System.out.println("a media dos numeros pares da matriz e de : " + media / par);
        for (int i = 0; i < contadorPorLinha.length; i++) {
            System.out.println("A linha " + (i + 1) + " tem " + contadorPorLinha[i] + " números entre 12 e 20.");
        }
        sc.close();
    }

}
