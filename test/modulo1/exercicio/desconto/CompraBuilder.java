package modulo1.exercicio.desconto;

import java.util.ArrayList;
import java.util.List;

public class CompraBuilder {
	
	private List<Item> itens;
	
	public CompraBuilder(){
		this.itens = new ArrayList<Item>();		
	}
	
	public CompraBuilder com(String nome, double valor){
		Item it = new Item(nome, 1, valor);
		itens.add(it);
		return this;
	}
	
	public Compra constroi(){
		return new Compra(this.itens);
	}
		
}
