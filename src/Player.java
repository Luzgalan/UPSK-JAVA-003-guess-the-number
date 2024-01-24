import java.util.ArrayList;
import java.util.List;

public abstract  class Player {
    // Properties
    private  String name;
    protected List<Integer> guesses = new ArrayList<>();
    // Methods
    public abstract int makeGuess();
    public  String getName(){
        return this.name;
    }
    public List<Integer> getGuesses(){
        return this.guesses;
    }

    //inserta la posición de la jugadora
    public void insertNumber(int number){
        guesses.add(number);
    }
    public void insertName( String nombre ){
        name = nombre;
    }

}
