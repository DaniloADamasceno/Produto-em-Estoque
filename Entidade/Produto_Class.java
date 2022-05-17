package Produto_em_Estoque.Entidade;

public class Produto_Class {

    public String nameProduto;
    public double price;
    public int quantity;

    //||---------- Criar Construtores para Atribuições  -----------

    public Produto_Class() { 
    }
    
    public Produto_Class(String nameProduto, double price, int quantity) {
        this.nameProduto = nameProduto;
        this.price = price;
        this.quantity = quantity;
    }
    
    public Produto_Class(String nameProduto, double price) {
        this.nameProduto = nameProduto;
        this.price = price;
        this.quantity = 0;

    }


    // Criando os metodos 
    public double totalValueInStock() { // para criar o valor dos produtos em estoque 
        return price * quantity;
    }

    public void addQuantity(int quantity) { // para adicionar produtos em Estoque 
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) { // para remover produtos em estoque 
        this.quantity -= quantity;
    }
    
    public String toString() { // Para Retornar um Print na tela 
        // o termo String.format e pra foratar a String
        return nameProduto + ", R$ " + String.format("%.2f", price) + ", Quantidade: " + quantity + ", Valor Toral em estoque (R$): "
                + String.format("%.2f", totalValueInStock()); 
    }

    public void addProduto(int newQuantity) {
    }

    public void addproduto(int newQuantity) {
    }
}
