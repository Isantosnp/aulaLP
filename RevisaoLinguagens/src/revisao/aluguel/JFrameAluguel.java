package revisao.aluguel;

import javax.swing.*;
import java.awt.*;

public class JFrameAluguel extends JFrame {
    public JFrameAluguel() {
        super("Aluguel de Veículos");

        Container c = getContentPane();
        setLayout(null);


        getContentPane().add(new JLabel("Dados do cliente: "));
        JLabel labelNome = new JLabel("Nome: ");
        JLabel labelCpf = new JLabel("CPF: ");
        JLabel labelTel = new JLabel("Telefone: ");


        labelNome.setBounds(28, 70, 57, 21);
        labelCpf.setBounds(28, 102, 57, 21);
        labelTel.setBounds(28, 134, 57, 21);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(578,578);
    }

    public static void main(String[] args) {
        new JFrameAluguel();
    }
}
