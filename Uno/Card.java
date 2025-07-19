package Uno;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Card {
    private  String color;
    private String number;
    
    final static String[] colors = {"Red", "Blue", "Green", "Yellow", "Wild"};
    final static String[] numbers = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Zero","draw2", "draw4", "Skip", "Reverse"};




    public Card(){

        color=colors[(int)((Math.random()*5) )];
        number=numbers[(int)((Math.random()*14))];

    }

    public Card(String c, String n){
        c= colors[(int)((Math.random()*4))];
        n= numbers[(int)((Math.random()*10))];
        
        color = c;
        number = n;
    }

    

    public String toString(){
        if(color.equals("Wild")){
            return color;
        }

        else if(number.equals("draw4")){
            return number;
        }
            else{
                return  color + " " +number;
            }
            
    }


    public  String getColor(){
        return color;
    }
    
    public  String getNumber(){
        return number;
    }

    public void setColor(String s){
        color=s;
    }


     public void wild(){
        Scanner wild = new Scanner(System.in);
        String wil;
        System.out.print("What color do you want to set the color to(Red/Green/Blue/Yellow) ");
        while(true){

            try{
                wil = wild.nextLine().toLowerCase();
                break;
            } catch(InputMismatchException e){
                System.out.println("Please enter a String");
                wild.next();
            }
        }
         

        while(!wil.contains("red")  && !wil.contains("green") && !wil.contains("yellow") && !wil.contains("blue")){
            System.out.println("Put in a valid color text");
            wil = wild.nextLine();
        }
        if(wil.contains("red")){
            setColor("Red");
            number = "";
           
        }
        else if(wil.contains("green")){
            setColor("Green");
            number = "";
        }
        else if(wil.contains("blue")){
            setColor("Blue");
            number = "";
        }
        else if(wil.contains("yellow")){
            setColor("Yellow");
            number = "";
        }
    }

    public static  boolean canPut(Card card, Card card2){
        if (card.getColor().equals(card2.getColor()) || card.getNumber()==card2.getNumber() || card2.getColor().equals("Wild") || card2.getNumber().equals("draw4")){
            return true;
        }
            else{
                return false;
            }
    }
    
}
