
package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product(String nome, double preco, int quantidade) {
		this.name = nome;
		this.price = preco;
		this.quantity = quantidade;
		
	}//construtor sobrecarga
	public Product(String nome, double preco) {
		this.name = nome;
		this.price = preco;
		
		
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