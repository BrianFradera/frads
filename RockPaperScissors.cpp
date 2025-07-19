#include <iostream>
#include <ctime>
#include "chooseWinner.cpp"

using namespace std;


::string getComputerChoice(){
    srand(time(0));
    int num = rand()%15 + 1;
    switch(num){
        case 1: return "rock";
        case 2: return "paper";
        case 3: return "scissors";
        case 4: return "gun";
        case 5: return "lightning";
        case 6: return "devil";
        case 7: return "dragon";
        case 8: return "water";
        case 9: return "air";
        case 10: return "sponge";
        case 11: return "water";
        case 12: return "tree";
        case 13: return "human";
        case 14: return "snake";
        case 15: return "fire";
    }
    return 0;
}


::string getUserChoice(){
    string player;

    do{
    cout << "Rock-Paper-Scissors Game!\n";
    cout << "*************************\n";
    cout << "Choose Between: rock, paper, scissors, gun, lightning, devil, dragon, water, air, sponge, water, tree, human, snake, fire\n";
    cin >> player;
    }while(player != "rock" && player!= "paper" && player !=  "scissors" 
        && player!= "gun" && player!= "lightning" && player!= "devil" && player!= "dragon" 
        && player!= "water" && player!= "air" && player!= "sponge" && player!= "water" 
        && player!= "tree" && player!= "human" && player!= "snake" && player!= "fire" );
    return player;
}



int play(){
    string player;
    string computer;
    

    player = getUserChoice();
    cout << "Your turn: ";
    cout << player;

    computer = getComputerChoice();
    cout  << "\nComputer's turn: ";
    cout << computer;
    cout << "\n";

    chooseWinner(player, computer);
    return 0;
}

