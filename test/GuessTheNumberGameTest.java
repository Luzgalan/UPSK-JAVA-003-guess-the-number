import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

public class GuessTheNumberGameTest {
    @Test
    public void checkGuessTest (){
        //Crea un mock de la interfaz de player
        Player playerMock = mock(Player.class);

        // Configurar el comportamiento del mock para el método makeGuess
        when(playerMock.makeGuess()).thenReturn(34);

        // Llamar al método checkGuess con el mock
        GuessTheNumberGame.checkGuess(playerMock);

        // Verificar el comportamiento esperado
        verify(playerMock).insertNumber(34);
    }

}