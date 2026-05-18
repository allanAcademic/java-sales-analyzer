package main.java.salesanalyses.leitor;
import main.java.salesanalyses.excecao.DadosInvalidosException;
import main.java.salesanalyses.modelo.Venda;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeitorVendas {

    public static ArrayList<Venda> lerVendas(String nomeArquivo) {
        String linhaArquivo; //variavel de verificação
        ArrayList<Venda> prodt = new ArrayList<>(); //ArrayList para armazenar objetos
        nomeArquivo = nomeArquivo + ".csv"; //variavel para formatação da pesquisa
        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))) { //transportando dados
            leitor.readLine(); //pulando cabeçalho
            while ((linhaArquivo = leitor.readLine()) != null) {  //loop para alocar as linhas na lista
                String[] listaProdutos = linhaArquivo.split(","); //separando por vírgula e adiconando na lista
                if (listaProdutos.length != 5) {
                    throw new DadosInvalidosException("Linha inválida: " + linhaArquivo);
                }
                Venda venda = new Venda(listaProdutos[0], listaProdutos[1], listaProdutos[2],
                        listaProdutos[3], listaProdutos[4]); //criando novo objeto com as separações provindas da lista
                prodt.add(venda); //adicionando a lista de objetos produtos
            }
        } catch (DadosInvalidosException e) { //verificador se ocorrer erro de dados
            System.out.println("Erro nos dados: " + e.getMessage());
        } catch (IOException e) { //verificador se não encontrar arquivos
            System.out.println("Arquivo não encontrado: " + nomeArquivo);
        }
        return prodt;
    }
}

