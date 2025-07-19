package Uno;

import java.util.ArrayList;

public class Player {
    private  String name;
    private  int score;
    private ArrayList<Card> c = new ArrayList<Card>();

    public Player(String n){
        name = n;

    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    public void incrementScore(){
        score++;
    }

    public void populate(){
        c=new ArrayList<Card>();
        for(int i = 0; i<7; i++){
            c.add(new Card());
        }
    }

    public void listCards(){
        for(int i = 0; i<c.size(); i++){
          System.out.println("Card " + (i+1) + ": " + c.get(i).toString());
          
        }

    }

    public ArrayList<Card> getList(){
        return c;
    }

    public void drawCard(){
        c.add(new Card());
    }

    public  void draw2(){
        for(int i = 0; i<2; i++){
        drawCard();
        }
    }

    public  void draw4(){
        for(int i = 0; i<4; i++){
         drawCard();
        }
    }

    public boolean checkCardCPU(Card card, Player p){
      for(int i = 0; i<c.size(); i++){
        if(Card.canPut(card, c.get(i))){
            p.getList().remove(i);
            return true;
        }
      }

      return false;
    }



    
    
}
