import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ComputerPlayerTest {

    @Test
    void makeGuess() {
        // se crea la instancia de la clase ComputerPlayer
        ComputerPlayer computadora = new ComputerPlayer();
        int guess = computadora.makeGuess();

        // Verificar si la suposición es la esperada con assertTrue si el rango esta de lo esperado
        assertTrue(guess >= 1 && guess <= 100);
    }

}