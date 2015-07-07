package modulo1.exercicio.desconto;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AplicadorDeDescontoTest {

	private AplicadorDeDescontos desconto;

	@Before
	public void setUp() {
		desconto = new AplicadorDeDescontos();
	}

	// Primeiro Teste Criado pelo Mauricio
	@Test
	public void macbookEIphoneTemDesconto() {
		Compra compra = new CompraBuilder()
			.com("MACBOOK", 3000)
			.com("IPHONE", 1500).constroi();
		desconto.aplica(compra);
		Assert.assertEquals((3000 + 1500) * 0.85, compra.getValorLiquido(),0.0001);
	}

	@Test
	public void notebookEWindowsPhoneTemDesconto() {		
		Compra compra = new CompraBuilder()
				.com("NOTEBOOK", 1800)
				.com("WINDOWS PHONE", 750).constroi();
		desconto.aplica(compra);
		Assert.assertEquals((1800 + 750) * 0.88, compra.getValorLiquido(),
				0.0001);
	}

	@Test
	public void xboxTemDesconto() {		
		Compra compra = new CompraBuilder()
		.com("XBOX", 2700).constroi();
		desconto.aplica(compra);
		Assert.assertEquals(2700 * 0.3, compra.getValorLiquido(), 0.0001);
	}

	 @Test
	 public void descontoAteDoisProdutos(){
		 Compra compra = new CompraBuilder()
			.com("GELADEIRA", 2, 900).constroi();
	 desconto.aplica(compra);
	 	Assert.assertEquals(900*0.98, compra.getValorLiquido(), 0.0001);
	 }
	 
	//
	// @Test
	// public void xboxTemDesconto(){
	// Item it1 = new Item("XBOX", 1, 2700);
	// Compra compra = new Compra(Arrays.asList(it1));
	// desconto.aplica(compra);
	// Assert.assertEquals(2700*0.3, compra.getValorLiquido(), 0.0001);
	// }

}
