package modulo1.exercicio.desconto;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AplicadorDeDescontoTest {
	
	private AplicadorDeDescontos desconto;
	
	@Before
	public void setUp(){
		desconto = new AplicadorDeDescontos();
	}
	
	// 1 Teste
	@Test
	public void macbookEIphoneTemDesconto(){
		Item it1 = new Item("MACBOOK", 1, 3000);
		Item it2 = new Item("IPHONE", 1, 1500);
		Compra compra = new Compra(Arrays.asList(it1, it2));
		desconto.aplica(compra);
		Assert.assertEquals((3000+1500)*0.85, compra.getValorLiquido(), 0.0001);		
	}
	
	@Test
	public void notebookEWindowsPhoneTemDesconto(){
		Item it1 = new Item("NOTEBOOK", 1, 1800);
		Item it2 = new Item("WINDOWS PHONE", 1, 750);
		Compra compra = new Compra(Arrays.asList(it1, it2));
		desconto.aplica(compra);
		Assert.assertEquals((1800+750)*0.88, compra.getValorLiquido(), 0.0001);
	}
	
	@Test
	public void xboxTemDesconto(){
		Item it1 = new Item("XBOX", 1, 2700);	
		Compra compra = new Compra(Arrays.asList(it1));
		desconto.aplica(compra);
		Assert.assertEquals(2700*0.3, compra.getValorLiquido(), 0.0001);
	}
	
//	@Test
//	public void descontoAteDoisProdutos(){
//		Item it1 = new Item("XBOX", 1, 2700);	
//		Compra compra = new Compra(Arrays.asList(it1));
//		desconto.aplica(compra);
//		Assert.assertEquals(2700*0.3, compra.getValorLiquido(), 0.0001);
//	}
//	
//	@Test
//	public void xboxTemDesconto(){
//		Item it1 = new Item("XBOX", 1, 2700);	
//		Compra compra = new Compra(Arrays.asList(it1));
//		desconto.aplica(compra);
//		Assert.assertEquals(2700*0.3, compra.getValorLiquido(), 0.0001);
//	}
	
	
	
}
