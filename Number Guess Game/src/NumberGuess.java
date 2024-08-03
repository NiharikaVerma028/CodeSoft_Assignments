import java.util.Scanner;
public class NumberGuess {
    public static void playGame(){
        Scanner ip=new Scanner(System.in);
        int secretNo=1+(int)(100*Math.random());
        int max=5;
        int attempts,guess;
        
        System.out.println("Welcome to Number Guess Game.");
        System.out.println("You have to choose number between 1-100");
        System.out.println("You have maximum 5 attempts to guess the number.");
        for(attempts=0;attempts<max;attempts++){
                    System.out.println("Attempts"+(attempts+1)+": Enter your guess:");
                    guess=ip.nextInt();
                    if(secretNo==guess){
                                System.out.println("Congratulations! You have guessed the correct no");
                                break;
                    }else if(secretNo>guess&&attempts!=max-1){
                                System.out.println("The Secret no is gretter than your guess");
                    }else if(secretNo<guess&&attempts!=max-1){
                                System.out.println("The secret no is less than your guess");
                    }
                    
        }
        if(attempts==max){
                                System.out.println("You have no more attempts");
                                System.out.println("The secret no was : "+secretNo);

                    }
       
    }
    
    public static void main(String args[]){
        playGame();
    }
}
