import java.util.Random;

//la clase computerPlayer hereda de la clase Player
public class ComputerPlayer extends Player {

    private static final Random numeroRandom$ = new Random();

    public int makeGuess(){
       return numeroRandom$.nextInt(100) + 1;

    }

}
