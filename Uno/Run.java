package Uno;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Run {
    
public static void main(String[] args){
    System.out.print("************WELCOME TO UNO************\n");
            System.out.print("How many Players are playing (1 Player game will have a cpu provided) ");
            Scanner playerCount = new Scanner(System.in);
            int pcount = 0;
            boolean valid = false;
            while(!valid){
            
            try{
                pcount = playerCount.nextInt();
                valid = true;
                
            }
            catch (InputMismatchException e){
                    System.out.println("Please enter an Integer");
                    playerCount.next();
                    }}
            
            Game uno = new Game(pcount);
            uno.PlayPlayers();
            
           
            
            

}
    
}
