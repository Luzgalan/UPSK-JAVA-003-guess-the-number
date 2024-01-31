import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class HumanPlayerTest {

    @Test
    void makeGuess() {
        //configuración del escenario de la prueba
        HumanPlayer humanPlayer = new HumanPlayer();
        // Simular la entrada del usuario
        System.setIn(new java.io.ByteArrayInputStream("42\n".getBytes()));
        // Llamar al método que quieres probar
        int guess = humanPlayer.makeGuess();

        // Verificar si la suposición es la esperada
        assertEquals(42, guess);
    }

    @Test
    void addName() {
        //se crea un instancia de HumanPlayer
        HumanPlayer palabra = new HumanPlayer();

        System.setIn(new java.io.ByteArrayInputStream("Luz\n".getBytes()));
        //llamar el método que se tiene que probar
        palabra.addName();
        //verificar la prueba
        assertEquals("LUZ", palabra.getName());
    }
}