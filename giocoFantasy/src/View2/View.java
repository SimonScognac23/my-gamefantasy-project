package View2;

import java.util.ArrayList;
import java.util.List;

//import com.model.GameCharacter;

//import com.model.GameCharacter;

//import com.model.GameCharacter;

import Main.GameCharacter2;
import Main.GameCharacter3;
import Main.MainGoblin;



	public class View {
		
		
 private GameCharacter2 attacker;
private GameCharacter2 defender;

public void displayWelcomeMessage() {   // metodo void con un system.out
	        System.out.println("Benvenuto nel Mondo di Final Fantasy ! ! ! ! ! ");
	    }
	    

 public void displayCharacterOptions(List<GameCharacter2> characters) {   // con il characters  ciclo il for per selezionre il personaggio
	        System.out.println("Scegli un personaggio:");  //uso un ciclo for  nel main gamecharacters2 per stampare i personaggio!!!
	        for (int i = 0; i < characters.size(); i++) {   
	            System.out.println((i + 1) + ". " + characters.get(i));
	            	            
	        }
	    }
 
 public void chooseMission() {     // con un boolean choose che richiamo  su controller richiamo le missioni che sono 3!!!
     System.out.println("Scegli una missione:");
     System.out.println("1. Missione 1");
     
        System.out.println("2. Missione 2");
     
     System.out.println("3. Missione 3");
     System.out.println("che succede!?!!?!?!?");
 }

 
 public void displayChosenCharacter(GameCharacter2  character) {
     System.out.println("Hai scelto: " + character); // con character mi esce il personaggio che ho scelto 
 }
 
 public void displayAttackMessage(GameCharacter2 attacker, GameCharacter3 defender) {
     System.out.println(attacker.getName() + " attacca " + defender.getName() + "!");
 }
 
	public void displayAttackMessageGoblin(GameCharacter2 player,
			ArrayList<GameCharacter3> characters3) {
		
		System.out.println(attacker.getName() + " attacca " + defender.getName() + "!");
						
	}

	 public void displayBattleOptions(){
	    System.out.println("Scegli un'azione:");
	         System.out.println("1. Attacca");
	      	    System.out.println("2. Usa abilità speciale");
	        
	 }
	 
	 public void treasureForest() {
		  System.out.println("Trova il tesoro nella foresta! ! ! scegli dove andare: ");
   	   System.out.println(" 1 Palude dei Qu  2 Foresta dei Chocobo  3 Outer Heaven     4 Gongaga ");
		 
	 }
	
	
 
 
                  public void displayWinMessage() {   // ovviamente sono i casi se ho vinto oppure ho perso 
                              System.out.println("Hai vinto!");
                                      }

                                        public void displayLoseMessage() {  
                                            System.out.println("Hai perso!");
                                                 }

 
	}
	
	
	

