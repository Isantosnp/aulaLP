package universidadeXTI;

import javax.swing.*;

public class Janela extends JFrame{
    public Janela() {    // Construtor da Janela é o que instancia a classe Jframe para criá-la

        super("MInha primeira Janela");
        getContentPane().add(new JButton("clique aqui"));   //  O metodo getContentPane()  é o metodo do  container onde vc coloca todos os objetos de interface dentro dele para que ele crie o objeto dentro da interface
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                // Serve para definir a operação padrão quando o usuário clica no X para fechar a janela
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Janela();  //Inicializar a janela
    }
}
