import java.util.Scanner;

public class HumanPlayer extends Player {

    public int makeGuess(){
        // Crea una instancia de la clase Scanner
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        // Leer el número ingresado por el usuario
        int numeroIngresado = scanner.nextInt();
        return numeroIngresado;
    }
    public void addName( ){
        // Crea una instancia de la clase Scanner
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa tu nombre: ");
        // Leer el número ingresado por el usuario
        String nombreIngresado = scanner.nextLine();
        //Agregamos el nombre a la clase
        super.insertName(nombreIngresado);

    }
}
