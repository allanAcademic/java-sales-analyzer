package main.java.salesanalyses.modelo;

public class Venda {
    private String produto;
    private String categoria;
    private int quantidade;
    private double valor;
    private String dataVenda;

    //Método construtor
    public Venda(String produto, String categoria, String quantidade, String valor, String dataVenda) {
        this.produto = produto;
        this.categoria = categoria;
        this.quantidade = Integer.parseInt(quantidade);
        this.valor = Double.parseDouble(valor);
        this.dataVenda = dataVenda;
    }

    //Métodos de acesso
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    //Métodos de sobrescrita

    @Override
    public String toString() {
        return "Produto: " + this.produto + " Categoria: " + this.categoria + " Quantidade: " + this.quantidade +
                " Valor: " + this.valor + " Data de venda:" + this.dataVenda;
    }
}
