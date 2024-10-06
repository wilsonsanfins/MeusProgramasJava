import javax.swing.JOptionPane;;
public class Fatorial {
    public static void main (String args[]){
int numero;
int fat;
numero=Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
fat=fatorial(numero);
JOptionPane.showMessageDialog(null,"O fatorial de "+numero+" é "+fat);
    }
    static int fatorial (int numero){
        int f=1;
        for (int i=1; i<=numero;i++)
        f=f*i;
        return f;


    }
    }

    
