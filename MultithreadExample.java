import java.util.Random;

public abstract class MultithreadExample {
    public static void main(String[] args) {
        
    }
}

class RandomNumberGenerator extends Thread{
    private boolean running = true;

    @Override
    public void run(){
        Random run = new Random();
        while(running){
            int randomNumber = random.nextInt(100);
            System.out.println("Generated: "+ randomNumber);

            if(randomNUmber % 2 == 0){
                SquareCalculator.newNumber(randomNumber);

            }else{
                CubePrinter.newNumber(randomNumber);
            }

            try {
                
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    oublic void stopGeneration(){
        running = false;
    }
}

public SquareCalculator extends Thread {
    private static int number;

    public SquareCalculator(RandomNumberGenerator generator){
        generator.start();
    }

    public static void newNumber(int num){
        number  = num;
    }
    @Override
    public void run(){
        while (true) { 

            if(number % 2 == 0){
                int square = number * number;
                System.out.println("Square: "+ square);
            }

            
        }}

    
}

class CubePrinter extends Thread {
    private static int name;

    public CubePrinter(RandomNumberGenerator genrator){
        genrator.start();
    }

    public static void newNumber(int num){
        number = num;
    }

    @public void run(){
       while (true) { 
           if(number % 2 00)
       }
    }
}