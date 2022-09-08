package entidade;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class CompromissoTest {
	
//	@BeforeAll
//	public static void init(){
//		Compromisso comp = new Compromisso("Pilates", new LocalDate(2022, 10, 10), 5,10 );
//	}
//	@Test
//	@Order(1)
//	void TestandoOSetNome() {
//		Compromisso comp = new Compromisso();
//		assertEquals("Pilates", comp.getNome());
//	}
	@Test
	@Order(2)
	void TestandoOSetRepeticaoCOmpromisso() {
		Compromisso comp = new Compromisso();
		comp.setRepeticaoCompromisso(5);
		assertEquals(5,comp.getRepeticaoCompromisso());
	}
	@Test
	@Order(3)
	void TestantoOSetVezesRepeticaoCompromisso() {
		Compromisso comp = new Compromisso();
		comp.setVezesRepeticaoCompromisso(10);
		assertEquals(10,comp.getVezesRepeticaoCompromisso());
	}

}
