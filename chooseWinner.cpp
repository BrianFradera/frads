#include <iostream>
#include <vector>
#include <string>


using namespace std;

void chooseWinner(string player, string computer){

    
    
    
    if (player == "rock"){
        if(computer == player){
               cout << "tie\n";
               }
               else if(computer == "gun" || computer == "lightning" || computer == "devil" || computer == "dragon" || computer == "water" || computer == "air" || computer == "paper" ){
                   cout << "You Lose\n";
               }
               else {
                   cout << "You Win\n";
               }
           }
        if (player == "paper"){
             if(computer == player){
                    cout << "tie\n";
                    }
                    else if(computer == "sponge" || computer == "wolf" || computer == "tree" || computer == "human" || computer == "snake" || computer == "scissors" || computer == "fire" ){
                        cout << "You Lose\n";
                    }
                    else {
                        cout << "You Win\n";
                    }
                }
        if (player == "scissors"){
             if(computer == player){
                    cout << "tie\n";
                    }
                    else if(computer == "fire" || computer == "rock" || computer == "gun" || computer == "lightning" || computer == "devil" ||computer ==  "dragon" || computer == "water" ){
                        cout << "You Lose\n";
                    }
                    else {
                        cout << "You Win\n";
                    }
                }
        if (player == "gun"){
             if(computer == player){
                    cout << "tie\n";
                    }
                    else if(computer == "lightning" || computer == "devil" || computer == "dragon" || computer == "water" || computer == "air" || computer == "paper" || computer == "sponge" ){
                        cout << "You Lose\n";
                    }
                    else {
                        cout << "You Win\n";
                    }
                }
        if (player == "lightning"){
             if(computer == player){
                    cout << "tie\n";
                    }
                    else if(computer == "devil" || computer == "dragon" || computer == "water" || computer == "air" || computer == "paper" || computer == "sponge" || computer == "wolf" ){
                        cout << "You Lose\n";
                    }
                    else {
                        cout << "You Win\n";
                    }
                }
        if (player == "devil"){
             if(computer == player){
                    cout << "tie\n";
                    }
                    else if(computer == "tree" || computer == "dragon" || computer == "water" || computer == "air" || computer == "paper" || computer == "sponge" || computer == "wolf" ){
                        cout << "You Lose\n";
                    }
                    else {
                        cout << "You Win\n";
                    }
                }
        if (player == "dragon"){
             if(computer == player){
                    cout << "tie\n";
                    }
                    else if(computer == "tree" || computer == "human" || computer == "water" || computer == "air" || computer == "paper" || computer == "sponge" || computer == "wolf" ){
                        cout << "You Lose\n";
                    }
                    else {
                        cout << "You Win\n";
                    }
                }
        if (player == "water"){
             if(computer == player){
                    cout << "tie\n";
                    }
                    else if(computer == "tree" || computer == "human" || computer == "snake" || computer == "air" || computer == "paper" || computer == "sponge" || computer == "wolf" ){
                        cout << "You Lose\n";
                    }
                    else {
                        cout << "You Win\n";
                    }
                }
        if (player == "air"){
             if(computer == player){
                    cout << "tie\n";
                    }
                    else if(computer == "tree" || computer == "human" || computer == "snake" || computer == "scissors" || computer == "paper" || computer == "sponge" || computer == "wolf" ){
                        cout << "You Lose\n";
                    }
                    else {
                        cout << "You Win\n";
                    }
        }
        if (player == "sponge"){
            if(computer == player){
                   cout << "tie\n";
                   }
                   else if(computer == "tree" || computer == "human" || computer == "snake" || computer == "scissors" || computer == "fire" || computer == "rock" || computer == "wolf" ){
                       cout << "You Lose\n";
                   }
                   else {
                       cout << "You Win\n";
                   }
               }
        if (player == "wolf"){
            if(computer == player){
                   cout << "tie\n";
                   }
                   else if(computer == "tree" || computer == "human" || computer == "snake" || computer == "scissors" || computer == "fire" || computer == "rock" || computer == "gun" ){
                       cout << "You Lose\n";
                   }
                   else {
                       cout << "You Win\n";
                   }
               }
        if (player == "tree"){
            if(computer == player){
                   cout << "tie\n";
                   }
                   else if(computer == "lightning" || computer =="human" || computer =="snake" || computer =="scissors" || computer =="fire" || computer =="rock" || computer =="gun" ){
                       cout << "You Lose\n";
                   }
                   else {
                       cout << "You Win\n";
                   }
               }
        if (player == "human"){
            if(computer == player){
                   cout << "tie\n";
                   }
                    if(computer == "devil" || computer == "lightning" || computer == "snake" || computer == "scissors" || computer == "fire" || computer == "rock" || computer == "gun" ){
                       cout << "You Lose\n";
                   }
                   else {
                       cout << "You Win\n";
                   }
               }
        if (player == "snake"){
            if(computer == player){
                   cout << "tie\n";
                   }
                   else if(computer == "devil" || computer == "lightning" || computer == "dragon" || computer == "scissors" || computer == "fire" || computer == "rock" || computer == "gun" ){
                       cout << "You Lose\n";
                   }
                   else {
                       cout << "You Win\n";
                   }
               }
        if (player == "fire"){
            if(computer == player){
                   cout << "tie\n";
                   }
                   else if(computer == "devil" || computer == "lightning" || computer == "dragon" || computer == "scissors" || computer == "water" || computer == "rock" || computer == "gun" ){
                       cout << "You Lose\n";
                   }
                   else {
                       cout << "You Win\n";
                   }
               }
    
        
    }