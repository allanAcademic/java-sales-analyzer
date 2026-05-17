package main.java.salesanalyses.leitor;
import main.java.salesanalyses.modelo.Venda;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeitorVendas {

    public static ArrayList<Venda> lerVendas(String nomeArquivo) {
        String linhaArquivo;
        ArrayList<Venda> prodt = new ArrayList<>();
        BufferedReader leitor = null;
        nomeArquivo = nomeArquivo + ".csv";
        try {
            //lendo arquivo
            leitor = new BufferedReader(new FileReader(nomeArquivo));
            //pulando cabeçalho do csv
            leitor.readLine();
            //loop para alocar as linhas em lista
            while ((linhaArquivo = leitor.readLine()) != null) {
                //alocando em uma lista de String
                String[] listaProdutos = linhaArquivo.split(",");
                //fazendo objetos Vendas com informações do argumento
                Venda venda = new Venda(listaProdutos[0], listaProdutos[1], listaProdutos[2],
                        listaProdutos[3], listaProdutos[4]);
                prodt.add(venda);

            }
            for (Venda produto : prodt) {
                System.out.println(produto);
            }
            leitor.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Não encontrado");
        }
        return prodt;
    }
}

