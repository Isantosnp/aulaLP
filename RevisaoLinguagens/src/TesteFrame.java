import javax.swing.JFrame;  // COntainer

//Dependentes do Container
import javax.swing.JButton;   //Botão
import javax.swing.JLabel;      //Exibir texto ñ editável
import javax.swing.JPanel;     // É a área onde abriga e organiza os componentes inseridos

public class TesteFrame {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Interface Gráfica");
                JButton botao = new JButton("Botão do Swing");
                JLabel texto = new JLabel("Número de  clicks: 0");
        JPanel painel = new JPanel( );
        painel.add(botao);
        painel.add(texto);
        janela.getContentPane( ).add(painel);
        janela.setSize(300,200);
        janela.show( );
    }
}
