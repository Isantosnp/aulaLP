package revisao.cantina;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

        Massa massa ;
    List<Ingrediente> lista = new ArrayList<Ingrediente>();
        Cliente  cliente ;

    public double calcularValor() {
        double valorTotal = massa.getValor() + (lista.size() * 2.0);
        return valorTotal;
    }
}
