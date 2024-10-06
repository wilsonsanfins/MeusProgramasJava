import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QualSeuNome {
    public static void main(String[] args) {
        // Criar a janela principal (JFrame)
        JFrame frame = new JFrame("Saudação");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Usar layout nulo para posicionamento manual

        // Definir a cor de fundo da janela
        frame.getContentPane().setBackground(new Color(173, 216, 230)); // Cor azul claro

        // Criar e configurar o rótulo (JLabel) para o texto
        JLabel label = new JLabel("Qual seu nome?");
        label.setBounds(20, 20, 150, 25); // Posicionar o rótulo
        label.setForeground(new Color(0, 102, 204)); // Cor do texto (azul escuro)
        frame.add(label);

        // Criar e configurar o campo de texto (JTextField) para a entrada do usuário
        JTextField textField = new JTextField();
        textField.setBounds(150, 20, 120, 25); // Posicionar o campo de texto
        textField.setBackground(Color.WHITE); // Cor de fundo do campo de texto
        textField.setForeground(Color.BLACK); // Cor do texto
        frame.add(textField);

        // Criar e configurar o botão (JButton)
        JButton button = new JButton("Enviar");
        button.setBounds(100, 60, 100, 30); // Posicionar o botão
        button.setBackground(new Color(0, 153, 76)); // Cor de fundo do botão (verde)
        button.setForeground(Color.WHITE); // Cor do texto do botão
        button.setFocusPainted(false); // Remove o contorno ao focar
        frame.add(button);

        // Adicionar um ActionListener ao botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obter o nome do campo de texto e exibir uma mensagem
                String nome = textField.getText();
                JOptionPane.showMessageDialog(frame, "Bem-vindo: " + nome);
            }
        });

        // Tornar a janela visível
        frame.setVisible(true);
    }
}
