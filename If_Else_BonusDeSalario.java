import javax.swing.JOptionPane;
public class If_Else_BonusDeSalario {
public static void main (String args[]){
float salario , bonus;
int tempo;
salario= Float.parseFloat(JOptionPane.showInputDialog("Qual é o seu salário ? "));
tempo= Integer.parseInt(JOptionPane.showInputDialog("Quanto tempo você está na empresa ?"));
if(tempo >=5 ){
bonus = salario*0.20f; // Viadagem do java para Float
}
else{
    bonus = salario*0.10f;// Viadagem do java para Float
}
JOptionPane.showMessageDialog(null,"o valor que você recebeu de bonus é "+ bonus);
}    
}
