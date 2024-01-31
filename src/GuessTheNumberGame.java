import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    private static Random random$ = new Random();
    private static int targetNumber$;
    // Código ANSI para poner el texto en color morado
    private static final String colorFondo = "\u001B[45m";
    // Código ANSI para poner el texto en color morado
    private static final String colorTextoCyan = "\u001B[36m";
    private static final String colorTextoMorado = "\u001B[35m";

    // Código ANSI para restablecer los colores a los valores por defecto
    private static final String resetColor = "\u001B[0m";
    public static void main(String[] args) {



        // Imprimir borde rojo y título vibrante
        System.out.println(colorTextoCyan);
        System.out.println("╔══════════════════════════════════════════════════════════════╗" );
        System.out.println("║🔥  ¡Bienvenid@ al Juego de Adivina el Número! Comencemoss! 🔥║" );
        System.out.println("╚══════════════════════════════════════════════════════════════╝" + resetColor);

        //Se crea el numero aleatorio
        targetNumber$ = random$.nextInt(100) + 1;
        HumanPlayer jugadoraHuman = new HumanPlayer();
        ComputerPlayer jugadorCompu = new ComputerPlayer();
        jugadoraHuman.addName();
        jugadorCompu.insertName("La computadora");
        boolean check;
        int turno = 0;
        do {
            if(turno == 0 ){
                System.out.println(colorTextoCyan + "****************************************************************"+ resetColor);
                System.out.println( " \uD83D\uDC69\uD83C\uDFFC\u200D\uD83D\uDCBB \u001B[36m Turno de " + jugadoraHuman.getName() + resetColor);
               check = checkGuess(jugadoraHuman);
               turno = 1;
            } else {
                System.out.println( colorTextoCyan+ "****************************************************************" + resetColor);
                System.out.println(  "\uD83D\uDCBB \u001B[36m Turno de la computadora" + resetColor);
                check = checkGuess(jugadorCompu);
                turno = 0;
            }
        }while (!check);
    }
    public static boolean checkGuess(Player player){
        int numberIngresado = player.makeGuess();

        player.insertNumber(numberIngresado);
        //validar si es numero esta arriba o abajo
        if (numberIngresado > targetNumber$){
            System.out.println( "\uD83D\uDEA9" + colorTextoMorado +  player.getName() + resetColor + "  ha ingresado el numero: \u001B[34m" + numberIngresado + " y la suposición es" + colorTextoMorado + " Alto");
            return false;
        } else if (numberIngresado < targetNumber$) {
            System.out.println("\uD83D\uDEA9" +  colorTextoMorado + player.getName() + resetColor +" ha ingresado el numero: \u001B[34m" + numberIngresado + " y la suposición es \u001B[31m Bajo");

            return false;
        }else{
            System.out.println(  player.getName() + colorTextoMorado + "\uD83C\uDF89 ¡Muchas felicidades! has adivinado el número. \uD83C\uDF89");
            System.out.println("Listado de intentos " + player.getGuesses());
            return true;
        }

    }


}