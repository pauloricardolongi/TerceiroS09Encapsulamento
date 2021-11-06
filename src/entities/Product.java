
package entities;

public class Product {
	private  String name;
	private  double price;
	private  int quantity;//regra de negócio não cria setQuantidade
	
	//construtor padrão
	public Product() {
		
	}
	
	public Product(String nome, double preco, int quantidade) {
		this.name = nome;
		this.price = preco;
		this.quantity = quantidade;
		
	}//construtor sobrecarga
	public Product(String nome, double preco) {
		this.name = nome;
		this.price = preco;
			
	}
	public String getName() {
		return name;
	}
	
	public void setName(String nome) {
		this.name= nome;
		
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double preco) {
		this.price = preco;
	}
	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ "
				+ String.format("%.2f", price) 
				+ ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}