package Classes;

import java.time.LocalDate;

public class Venda {

    private int qtdVenda;
    private LocalDate dtVenda;
    private Produto produtoVendido;



    public Produto getProdutoVendido() {
        return produtoVendido;
    }
    public void setProdutoVendido(Produto produtoVendido) {
        this.produtoVendido = produtoVendido;
    }
    public int getQtdVenda() {
        return qtdVenda;
    }
    public void setQtdVenda(int qtdVenda) {
        this.qtdVenda = qtdVenda;
    }

    public LocalDate getDtVenda() {
        return dtVenda;
    }
    public void setDtVenda(LocalDate dtVenda) {
        this.dtVenda = dtVenda;
    }

 
    //metodos

     public void concluirVenda(){

        produtoVendido.setQtdEstoque(produtoVendido.getQtdEstoque() - getQtdVenda());
    
    } 
}
