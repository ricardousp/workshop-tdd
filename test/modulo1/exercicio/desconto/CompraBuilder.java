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
		// Valor padrao
//		if(itens == null){
//			Item it = new Item("Geladeira", 1, 1300);
//			itens.add(it);
//		}
		return new Compra(this.itens);
	}
		
}
