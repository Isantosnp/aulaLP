package revisao.cantina;

import javax.swing.*;
import java.util.Scanner;

public class Cantina {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog(" Informe o nome do cliente:");
        String nomeMassa = JOptionPane.showInputDialog("Informe o nome da massa:");
        double  valorMassa = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da massa:"));


        Pedido pedido = new Pedido();
        pedido.cliente = new Cliente(nome);
        pedido.massa = new Massa(nomeMassa, valorMassa);

        int opcao;
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha os ingredientes: \n1. Bacon\n2. Mussarela\n3. Tomate\n4. Queijo\n5. Sair"));

        while (opcao != 5) {
            switch (opcao) {
                case 1:
                    pedido.lista.add(new Ingrediente("Bacon"));
                    break;
                case 2:
                    pedido.lista.add(new Ingrediente("Mussarela"));
                    break;
                case 3:
                    pedido.lista.add(new Ingrediente("Tomate"));
                    break;
                case 4:
                    pedido.lista.add(new Ingrediente("Queijo"));
                    break;
                default:
                    break;
            }
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha os ingredientes: \n1. Bacon\n2. Mussarela\n3. Tomate\n4. Queijo\n5. Sair"));


        }

        JOptionPane.showMessageDialog(null, "Pedido feito para " + pedido.cliente.getNome() + "\n" + pedido.massa.getTipo() + "\nValor R$ " + pedido.calcularValor(), "Cantina", JOptionPane.INFORMATION_MESSAGE);
    }

}

