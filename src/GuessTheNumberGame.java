import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    private static Random random$ = new Random();
    private static int targetNumber$;


    public static void main(String[] args) {
        System.out.println("Welcome to the Guess the number game");
        //Se crea el numero aleatorio
        targetNumber$ = random$.nextInt(100) + 1;
        HumanPlayer jugadoraHuman = new HumanPlayer();
        ComputerPlayer jugadorCompu = new ComputerPlayer();
        jugadoraHuman.addName();
        boolean check;
        int turno = 0;
        do {
            if(turno == 0 ){
                System.out.println("Turno de: " + jugadoraHuman.getName());
               check = checkGuess(jugadoraHuman);
               turno = 1;
            } else {
                System.out.println("Turno de la computadora");
                check = checkGuess(jugadorCompu);
                turno = 0;
            }
        }while (!check);
    }
    private static boolean checkGuess(Player player){
        int numberIngresado = player.makeGuess();
        player.insertNumber(numberIngresado);
        //validar si es numero esta arriba o abajo
        if (numberIngresado > targetNumber$){
            System.out.println("El numero: " + numberIngresado + " es muy alto");
            return false;
        } else if (numberIngresado < targetNumber$) {
            System.out.println("El numero: " + numberIngresado + " es muy bajo");
            return false;
        }else{
            System.out.println("Felicidades");
            System.out.println(player.getGuesses());
            return true;
        }

    }


}