package Array;

import org.junit.Test;

public class ArranjoTeste {
	void teste() {
		Arranjo a = new Arranjo;
		
		
	}
	
	@Test
	assertEquals(510, a.menor(), "O menor dever ser 510");
	assertEquals(940, a.maior(), "O mair dever ser 940");
	assertEquals(7540, a.soma(), "A soma dever ser 7540");
	assertEquals(0, a.repeticoes(3), "940 aparece 2 vezes");
	assertEquals(1, a.repeticoes(790), "790 aparece 1 vezes");
	assertEquals(1, a.repeticoes(940), "940 aparece 2 vezes");
}
