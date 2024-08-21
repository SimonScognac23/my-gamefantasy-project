package Controller;

import Controller.GameController2;







       import java.util.ArrayList;

import java.util.Scanner;

//import com.model.Transformable;

//import com.model.GameCharacter;

import Main.GameCharacter2;
import Main.GameCharacter3;
import Main.MainAdventurer;
import Main.MainDragon;
import Main.MainGoblin;
import Main.MainKnight;
import Main.MainThief;
import Main.MainWizard;
import View2.View;

                     

public class GameController2 {
	
	 private ArrayList<GameCharacter3> characters3;  // arraylist per i 5 goblin
	 private ArrayList<GameCharacter2> characters;  // ho importato l arraylist e mi sono creato il characters arraylist
	View view2 = new View();
	
	
	 
	 public GameController2(View view) {
	        this.characters = new ArrayList<>();
	        this.characters3 = new ArrayList<>();
	  	  
	        initializeCharacters();
	        
	    }
	 	 	        	 
	    private void initializeCharacters() {
	        characters.add(new MainThief());
	        characters.add(new MainKnight());
	        characters.add(new MainAdventurer());
	        characters.add(new MainWizard());
	        
	    }

	    public void startGame() {
	    	MainDragon dragon = new MainDragon();
	        Scanner scanner = new Scanner(System.in);

	        view2.displayWelcomeMessage();
	        view2.displayCharacterOptions(characters); // entra nel ciclo for per poi poter selezionare un personaggio nela parentesi uso il characters che fa riferimento al ciclo for 

	        int choice = scanner.nextInt();
	        GameCharacter2 player = characters.get(choice - 1); // gli dico che la scelta character è uguale al gamecharacter2 ossia il personaggio che andro a scegliere

	        view2.displayChosenCharacter(player); // mi mostra il personaggio che ho scelto 

	       view2.chooseMission(); 
	       int action = scanner.nextInt();
	       
	       if ( action == 1)  {
	    	   System.out.println(" Sono apparsi 5 Goblin ! ! !");
	    	   	 
	    	   
	   	        characters3.add(new MainGoblin()); //qui inizializzo i goblin i 5goblin facendo newMainGoglin
	   	        characters3.add(new MainGoblin());
	   	        characters3.add(new MainGoblin());
	   	        characters3.add(new MainGoblin());
	   	        characters3.add(new MainGoblin());	
	   	        	
	    	   //MainGoblin[] goblin = new MainGoblin[5];
	   	        
	   	     boolean tuttiGoblinSconfitti = false;

	         while (!tuttiGoblinSconfitti && player.getHealth() > 0) { //la condizione per cui finche i goblin non sono morti e la salute del giocatore non è a zero
	             tuttiGoblinSconfitti = true; // condizione per cui tutti i goblin finche non vengono sconfitti non ece dal ciclo
	    	   
	       for (int i = 0; i < characters3.size(); i++) {	
	    	   GameCharacter3 enemy = characters3.get(i); //qui vado a dire che gameCharacter3 è uguale a character3.get(i) ossia i goblin
	    	   if (enemy.getHealth() > 0) {  // condizione per cui i goblin sono maggiori di zero
                   tuttiGoblinSconfitti = false;
	    	   
	    	   
	    	       System.out.println(" é il tuo turno ! ! !"); 
	    	                    System.out.println(enemy);
	    	                  
	    	                  
	    	   if (enemy.getDefense() > 0) {
	    view2.displayAttackMessage(player, enemy);
	    		 view2.displayBattleOptions(); //qui chiamo il metodo del display della battaglia 
	    		     int action2 = scanner.nextInt();
	    		  	    		   	    	   
	    		   if ( action2 == 1) {
	    			   
	    		   enemy.subisciDanno(player.getAttack()); //nemico ossia enemy subisce danno dal giocatore player.getattack 
	    		   System.out.println("Gli HP dei goblin stanno a"  + enemy.getHealth()); //dopo mi controllo gli hp dei goblin
	    		   System.out.println();
	    		   System.out.println();
	    		   
	    		   
	    		   System.out.println();
	    		   System.out.println();	    		
	    	   }
	    		   else  if (action2 == 2) {
	    			   player.specialAbility();
	    		   }	    		   
	    		   System.out.println("I goblin stanno attaccando ! ! ! ");
	    		   player.subisciDanno(enemy.getAttack()); // ora faccio il contrario ossia dico che il giocatore subisce il danno dai goblin
	    		   System.out.println("Gli HP tuoi sono a :"  + player.getHealth());
	    		   System.out.println();
	    		   System.out.println();
	       }	       	    	
	     }	  
	    	   
	    	   if (tuttiGoblinSconfitti) {
	                System.out.println("Hai sconfitto tutti i goblin! Hai vinto!");
	                
	            } 
	    	   else if (player.getHealth() <= 0) {
	                System.out.println("Sei stato sconfitto dai goblin. Game over.");
	            }
	       }
         }
      }
	       
	       if (action == 2) {
	    	    view2.treasureForest();
	    	   int action3 = scanner.nextInt();
	    	   switch(action3) {
	    	   
	    	   case 1: 
	    		   System.out.println(" Tesoro non presente ");
	    		   view2.treasureForest();
	    		   action3 = scanner.nextInt();
	    	   case 2:
	    		   System.out.println(" Tesoro non presente ");
	    		   view2.treasureForest();
	    		   action3 = scanner.nextInt();
	    		   
	    	   case 3: System.out.println(" Tesoro non presente ");
    		   view2.treasureForest();
    		   action3 = scanner.nextInt();
	    		   
	    	   case 4:   System.out.println(" Tesoro presente!!!! ");
    		   view2.chooseMission();
	    	   }	    	   	    	   
	       }
	       

	       if (action == 3) {
	    	   
	    	   System.out.println(" Il villaggio è sotto attacco del drago, sconfiggi il drago ! ! !");
	    	   System.out.println(" Inizia il combattimento: ");
	    	  	   	    	  
	    	   boolean dragonBeaten = false;  	    	   		    	    
	             
	             while (!dragonBeaten && player.getHealth() > 0) {// condizone per cui se il drago non è stato battuto e salute giocatore è > di zero
	                 view2.displayAttackMessage(player, dragon);
	                 view2.displayBattleOptions();
	                 int action3 = scanner.nextInt();

	                 switch (action3) {
	                     case 1:
	                         // Attacco normale
	                         dragon.subisciDanno(player.getAttack());// drago subisce danno da giocatore 
	                         System.out.println("Gli HP del drago stanno a " + dragon.getHealth());
	                         break;
	                     case 2:
	                         // Implementa qui la logica per l'abilità speciale
	                         System.out.println(player.getName() + " usa una abilità speciale!");
	                         player.specialAbility();
	                         break;
	                     default:
	                         System.out.println("Azione non valida. Per favore, scegli di nuovo.");
	                         continue;
	                 }

	                 if (dragon.getHealth() > 0) { // salute del drago non scende a zero 
	                     System.out.println("Il drago sta attaccando!");
	                     player.subisciDanno(dragon.getAttack());//attacco del drago
	                     System.out.println("Gli HP tuoi sono a: " + player.getHealth());
	                     System.out.println();
	                 }

	                 if (dragon.getHealth() <= 0) {
	                     dragonBeaten = true; // condizoone del drago morto 
	                     System.out.println("Hai sconfitto il Drago! Hai salvato il villaggio!");
	                 } else if (player.getHealth() <= 0) {
	                     System.out.println("Sei stato sconfitto dal drago. Game over.");
	                 }
	             }
	         }
	     }
}
