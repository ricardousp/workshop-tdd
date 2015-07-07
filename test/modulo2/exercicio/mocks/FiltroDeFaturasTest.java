package modulo2.exercicio.mocks;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class FiltroDeFaturasTest {
	
	private FiltroDeFaturas filtro;
	private RepositorioDeFaturas repositorio;
	private List<Fatura> listaFaturas;
	
	@Before
	public void setUp(){
		repositorio = Mockito.mock(RepositorioDeFaturas.class);
		
	}
	
	@Test
	public void filtraMaioresque2000(){
		
		Calendar dataFatura1 = new GregorianCalendar(2015, Calendar.MARCH, 10);		
		
		Fatura f1 = new Fatura(dataFatura1, "Ricardo", 2500);		
				
		RepositorioDeFaturas repositorio = Mockito.mock(RepositorioDeFaturas.class);
		Mockito.when(repositorio.todas()).thenReturn(Arrays.asList(f1));
		
		FiltroDeFaturas filtro = new FiltroDeFaturas(repositorio);
		List<Fatura> listaFaturas = filtro.filtra();
		
		assertEquals(1, listaFaturas.size());
		assertEquals(2500, listaFaturas.get(0).getValor(), 0.0001);		
		
	}
	
	@Test
	public void filtraFaturaMicrosoft(){
		
		Calendar dataFatura1 = new GregorianCalendar(2015, Calendar.SEPTEMBER, 27);	
		
		Fatura f1 = new Fatura(dataFatura1, "MICROSOFT", 1000);		
				
		RepositorioDeFaturas repositorio = Mockito.mock(RepositorioDeFaturas.class);
		Mockito.when(repositorio.todas()).thenReturn(Arrays.asList(f1));
		
		FiltroDeFaturas filtro = new FiltroDeFaturas(repositorio);
		List<Fatura> listaFaturas = filtro.filtra();
		
		assertEquals(1, listaFaturas.size());		
		assertEquals(1000, listaFaturas.get(0).getValor(), 0.0001);
		
	}
	
	@Test
	public void filtraFaturasAnteriores1999(){
		
		Calendar dataFatura1 = new GregorianCalendar(1994, Calendar.AUGUST, 5);	
		
		Fatura f1 = new Fatura(dataFatura1, "Mauricio", 1000);		
				
		RepositorioDeFaturas repositorio = Mockito.mock(RepositorioDeFaturas.class);
		Mockito.when(repositorio.todas()).thenReturn(Arrays.asList(f1));
		
		FiltroDeFaturas filtro = new FiltroDeFaturas(repositorio);
		List<Fatura> listaFaturas = filtro.filtra();
		
		assertEquals(1, listaFaturas.size());		
		assertEquals(1000, listaFaturas.get(0).getValor(), 0.0001);
		
	}

	@Test
	public void filtraFaturasAnterior1999comValor2000(){
		
		Calendar dataFatura1 = new GregorianCalendar(1998, Calendar.AUGUST, 5);	
		
		Fatura f1 = new Fatura(dataFatura1, "Mauricio", 2000);		
				
		RepositorioDeFaturas repositorio = Mockito.mock(RepositorioDeFaturas.class);
		Mockito.when(repositorio.todas()).thenReturn(Arrays.asList(f1));
		
		FiltroDeFaturas filtro = new FiltroDeFaturas(repositorio);
		List<Fatura> listaFaturas = filtro.filtra();
		
		assertEquals(1, listaFaturas.size());		
		assertEquals(2000, listaFaturas.get(0).getValor(), 0.0001);
		
	}
	
	
	
	
}
