package main.java.salesanalyses.analisador;
import main.java.salesanalyses.modelo.Venda;
import java.util.ArrayList;
import java.util.HashMap;

public class AnalisadorVendas {
    public static HashMap<String, Double> agruparPorCategoria(ArrayList<Venda> listaDeVendas) {
        //criação do objeto map com hashmap
        HashMap<String, Double> totaisPorCategoria = new HashMap<>();
        //iteração na lista provinda do LeitorVendas
        for (Venda venda : listaDeVendas) {
            //Associando chave valor para o mapa
            String categoria = venda.getCategoria();
            double preco = venda.getValor();
            // Adicionando chave valor com merge
            totaisPorCategoria.merge(categoria, preco, Double::sum);
        }

        return totaisPorCategoria;
    }
}
