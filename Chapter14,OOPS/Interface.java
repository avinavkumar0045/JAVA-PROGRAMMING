
import javax.sound.sampled.SourceDataLine;

public class Interface {
    public static void main(String[] args) {

        Queen q = new Queen(); // creating objects
        q.moves();

        
    }
}

interface  ChessPlayer { // creating interface (blueprint of classes)
    void moves();
}

class Queen implements ChessPlayer{//(creating class (blueprint of objects))
    public void moves(){
        System.out.println("right,left, uo, down,diagonal(in all directions)" );
    }

}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("right,left, uo, down" );
    }

}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("right,left, uo, down, diagonal-(only one step)" );
    }
}

/* 
public static void main(String args[]){
    Hervivore.sleep();
    Carnivore.eats();


}

interface Animal{
    void eats();
    void  sleeps();
}

class Hervivore implements Animal{
    public void eats(){
        System.out.println("Eats grass , fruites  ");
    }
    public void sleeps(){
        System.out.println("Sleeps anywhere");
    }
}

class Carnivore implements Animal{
    public void eats(){
        System.out.println("Eats flesh");
    }
    public void sleeps(){
        System.out.println("Sleeps in trees");
    }
} */
   



