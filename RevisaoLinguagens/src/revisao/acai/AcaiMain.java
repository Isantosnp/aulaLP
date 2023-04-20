package revisao.acai;

import javax.swing.JOptionPane;

public class AcaiMain {
    public static void main(String[] args) {
        Acai acai = new Acai();
        int tamanho, acrescimoSorvete;
        double valor = 0;
        tamanho = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tamanho que você deseja: \n 1 - 300Ml \n 2 - 500Ml \n 3 - 700Ml",
                "Acaiteria", JOptionPane.QUESTION_MESSAGE));
        acai.setTamanho(tamanho);
        acrescimoSorvete = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja acresimo de sorvete ? \nDigite 1- SIM \n 2-NÃO", "Açaiteria", JOptionPane.QUESTION_MESSAGE));
        if(acrescimoSorvete == 1){
            acai.calculaValor(true);
        }
        else if (acrescimoSorvete == 2 ) {
            acai.calculaValor(false);
        }
        JOptionPane.showMessageDialog(null, "O valor do seu Açaí é de : "+acai.getValor(), "Acaiteria", JOptionPane.INFORMATION_MESSAGE);
    }
}
