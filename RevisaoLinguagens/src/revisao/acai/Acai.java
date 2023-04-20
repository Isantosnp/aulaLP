package revisao.acai;

public class Acai {
    private int tamanho;
    private double valor;
    private boolean possuiAcrescimo;

    public Acai() {
        this.tamanho = tamanho;
        this.valor = valor;
        this.possuiAcrescimo = possuiAcrescimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPossuiAcrescimo() {
        return possuiAcrescimo;
    }

    public void setPossuiAcrescimo(boolean possuiAcrescimo) {
        this.possuiAcrescimo = possuiAcrescimo;
    }

    public void calculaValor(boolean possuiSorvete) {
        if (tamanho == 300) {
            this.valor += 8.00;
        } else if (tamanho == 500) {
            valor += 10.00;
        } else if (tamanho == 700) {
            valor += 12.00;
        }

        if (this.possuiAcrescimo) {
            this.valor += this.valor;
        } else {
            valor += 2.00;
        }
    }
}
