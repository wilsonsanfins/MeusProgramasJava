import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][4];
        int total_pares = 0;
        int soma_impares = 0;
        int soma_total = 0;
        int totalElementos = 0;

        System.out.println("Digite os elementos da matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();
                soma_total += matriz[i][j];

                if (matriz[i][j] % 2 == 0) {
                    total_pares++;
                } else {
                    soma_impares += matriz[i][j];
                }
            }
        }

        int media = soma_total / totalElementos;
        
        System.out.println("Existem " + total_pares + " números pares. A soma dos números ímpares é: " + soma_impares + " A média de todos os valores dessa matriz é: " + media );

        scanner.close();
    }
}
