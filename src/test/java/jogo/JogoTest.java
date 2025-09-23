package jogo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Test;

public class JogoTest {
	Jogador jogador = mock(Jogador.class);
	Dado dado1 = mock(Dado.class)
	Dado dado2 = mock(Dado.class)

	Jogo jogo = new Jogo()
	
	@Test
	public void testarJogo(){
		when(dado1.numero()).thenReturn(2);
		when(dado2.numero()).thenReturn(5);
		when(jogador.lancar(dado1, dado2)).thenReturn(dado1.numero() + dado2.numero());

		assertEquals(jogo.jogo(jogador, dado1, dado2), true)
	}
}
