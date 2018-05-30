package Aula;
import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class ValoresTeste {
	@Test
	void testeInsercao11Unidades() {
		Valores principal = new Valores();
		principal.ins(25);
		principal.ins(18);
		principal.ins(13);
		principal.ins(6);
		principal.ins(0);
		principal.ins(120);
		principal.ins(33);
		principal.ins(1250);
		principal.ins(1);
		principal.ins(28);
		
		boolean TesteValidade = principal.ins(33);
		Assert.assertEquals(false,TesteValidade);
		
		
	}
	@Test
	void testeInsercao10Unidades() {
		Valores principal = new Valores();
		principal.ins(3);
		principal.ins(5);
		principal.ins(15);
		principal.ins(8);
		principal.ins(55);
		principal.ins(33);
		principal.ins(12);
		principal.ins(90);
		principal.ins(20);
		
		boolean  TesteValidade =  principal.ins(120);
		Assert.assertEquals(true,TesteValidade);
		
		
	}

	@Test
	void testeInsersao() {
		Valores principal = new Valores();
		principal.ins(25);
		Assert.assertEquals(Integer.valueOf(25), principal.getLista().get(0));
	}
	@Test
	void testeDeletar() {
		Valores principal = new Valores();
		principal.ins(25);
		principal.del(0);
		Integer  tamanhoLista =  principal.getLista().size();
		Assert.assertEquals(Integer.valueOf(0),tamanhoLista);
		
		
	}
	@Test
	void testeDeletarListaVazia() {
		Valores principal = new Valores();
		
		Integer  retorno = principal.del(0);
		Assert.assertEquals(Integer.valueOf(-1),retorno);
		
		
	}
	@Test
	void testeTamanhoLista() {
		Valores principal = new Valores();
		principal.ins(10);
		principal.ins(20);
		principal.ins(15);
		principal.ins(8);
		principal.ins(5);
		principal.ins(40);
		principal.ins(40);
		principal.ins(40);
		principal.ins(40);
		principal.ins(40);
		Integer  tamanho =  principal.size();
		Assert.assertEquals(Integer.valueOf(10),tamanho);
		
		
	}
	@Test
	void testeMaior() {
		Valores principal = new Valores();
		principal.ins(10);
		principal.ins(20);
		principal.ins(15);
		principal.ins(8);
		principal.ins(5);
		principal.ins(40);
		Integer maior =  principal.greater();
		Assert.assertEquals(Integer.valueOf(40),maior);
		
		
	}
	void testeMedia() {
		Valores principal = new Valores();
		principal.ins(10);
		principal.ins(20);
		principal.ins(15);
		principal.ins(8);
		principal.ins(5);
		principal.ins(40);
		Integer maior =  principal.greater();
		Assert.assertEquals(Integer.valueOf(40),maior);
		
		
	}
	@Test
	void testeMenor() {
		Valores principal = new Valores();
		principal.ins(10);
		principal.ins(20);
		principal.ins(15);
		principal.ins(8);
		principal.ins(5);
		principal.ins(40);
		Integer menor =  principal.lower();
		Assert.assertEquals(Integer.valueOf(5),menor);
		
		
	}

}

