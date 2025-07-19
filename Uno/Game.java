package Uno;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    private  int currPlayer = 0;
    private  Card currCard = new Card("Start", "The game");
    private  static Player[] players;
    private  boolean reversed = false;
    private  boolean win = false;

    public Game(int playerCount){
        Scanner name = new Scanner(System.in);
        String playerName = "";
        players = new Player[playerCount];

        for(int i = 0; i<playerCount; i++){
            System.out.println("Player "+ (i+1) + ": What is your name: ");
            while(true){
                try{
                     playerName = name.nextLine(); 
                     break;
                } catch(InputMismatchException e){
                    System.out.println("Please enter a String");
                    name.next();
                }
            }
            players[i] = new Player(playerName);
            players[i].populate();

        }
        
        
    }
    public Game(){
        for(int i = 0; i<players.length; i++){
            players[i].populate();
            
        }
        currCard = new Card("biged", "Lol");
            reversed = false;
            currPlayer = 0;
        
    }


    

    public  void passRound(){
        if(players[currPlayer].getList().size()==1){
            System.out.print("\n!!!!!!!!!!!UNO!!!!!!!!!!!\n");
        }

        if(reversed){
            if(currPlayer==0){
                currPlayer=players.length-1;
            }
                else{
                    currPlayer--;
                }
        }
            else{
                if(currPlayer==players.length-1){
                    currPlayer=0;
                }
                    else{
                        currPlayer++;
                    }
            }
    }

    public void removeCard(Player p1, int c){
        currCard = p1.getList().get(c-1);
        p1.getList().remove(c-1);
    }

    public boolean checkWin(Player p1){
        if(p1.getList().size()==0){
            win = true;
            return true;
        }
        else{
            return false;
        }
    }


    public void Round(Player p1){

        System.out.println("\n" + p1.getName() + " Has "+ p1.getList().size() + " card(s) remaining");
        System.out.println("Player: " + p1.getName() + ", pick the NUMBER of the corresponding cards. The Current Card is: " + currCard.toString());
        p1.listCards();
        System.out.println("Option " +  (p1.getList().size()+1) + " Draw a Card");



        Scanner cardSelect = new Scanner(System.in);
        int cardsel;

        while(true){

            try
            {
            cardsel = cardSelect.nextInt();
            break;
        } catch(InputMismatchException e){
            System.out.println("Please enter an Integer");
            cardSelect.next();
        }
        }

        
        

        if(cardsel==p1.getList().size()+1){
            p1.drawCard();
            passRound();
            return;
        }

        Card card = p1.getList().get(cardsel-1);

        while(Card.canPut(currCard,card)==false){
            System.out.println("Please Put down a valid card or draw");
            cardsel = cardSelect.nextInt();
            card = p1.getList().get(cardsel-1);
            Card.canPut(currCard,card);

        }

        if(Card.canPut(currCard,card)){
            
            if(card.getNumber().equals("Reverse")){
            removeCard(p1,cardsel);
            if(checkWin(p1)){
                return;
            }
            reversed= !reversed;
            passRound();
            return;
            
        }

        if(card.getColor().equals("Wild")){
            removeCard(p1,cardsel);
            if(checkWin(p1)){
                return;
            }
            card.wild();
            passRound();
            return;

        }

        if(card.getNumber().equals("draw4")){
            removeCard(p1,cardsel);
            if(checkWin(p1)){
                return;
            }
                card.wild();
                passRound();
                players[currPlayer].draw4();
                return;
            
        }

        if(card.getNumber().equals("Skip")){
            removeCard(p1,cardsel);
            if(checkWin(p1)){
                return;
            }
            passRound();
            passRound();
            return;
        }

        if(card.getNumber().equals("draw2")){
            removeCard(p1,cardsel);
            if(checkWin(p1)){
                return;
            }
            passRound();
            players[currPlayer].draw2();
            return;
            
        }


            removeCard(p1,cardsel);
            if(checkWin(p1)){
                return;
            }


        }
            else{
                p1.drawCard();
            }

            passRound();

        
    }

    public static boolean playAgain(){
        Scanner runAg = new Scanner(System.in);
        System.out.println("Do You Want to Play Again (y/n)");
        String ans = "";

        while(true){

            try{
            ans = runAg.nextLine().toLowerCase();
            break;
            } catch(InputMismatchException e){
                System.out.println("Please enter a String");
                runAg.next();
            }
        }
        
         
        while(!ans.equals("y") && !ans.equals("n")){
            System.out.println("Please put in a valid response");
            ans=runAg.nextLine();
        }

        if(ans.equals("y")){
            return true;
        }
        else{
            return false;
        }
    }



    public void PlayPlayers(){
       
        while(win==false){
        Round(players[currPlayer]);
        
       }

       players[currPlayer].incrementScore();
       System.out.println("The Winner is: " + players[currPlayer].getName() + ", your current score is " + players[currPlayer].getScore() +"\n");
       

        if(playAgain()){
            win=false;
            Game g2 = new Game();
            g2.PlayPlayers();
        }
        else{
            System.out.println("\nFINAL SCORES:");
            for(int i = 0; i<players.length; i++){
               System.out.println(players[i].getName() + ": " + players[i].getScore());
            }
        }
    
        
    }

    public void RoundCPU(Player p1, Card c){
        for(int i = 0; i<p1.getList().size(); i++){
            
        }



    }
    
    
}
