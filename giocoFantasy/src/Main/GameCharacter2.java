package Main;

public abstract class GameCharacter2 {
	
	 protected String name;   //creo le variabili e le metto private
	 protected int health;
	 protected int attack;
	 protected int defense;
	 
	 
	 
	 public GameCharacter2(String name, int health, int attack, int defense) {
	        this.name = name;
	        this.health = health;  // con il this mi permette di accedere ai vari nomi avventuriero,ladro ecc
	        this.attack = attack;
	        this.defense = defense;
	    }

	   public String getName() {       // uso i get per impostare il nome e accedere alle variabili
	        return name;
	    }

	    public int getHealth() {
	        return health;
	    }

	    public int getAttack() {
	        return attack;
	    }

	    public int getDefense() {
	        return defense;  // mi ritorna la difesa
	    }
	 
	    public void subisciDanno(int danno) {
	        health -= danno;
	        if (health < 0) {
	            health = 0;
	        }
	 
	    }
	    
	    public abstract void specialAbility(); //serve l override per poter accedere alle abilita speciali

	    @Override  // metodo too string per farmi ritornare una stringa 
	    public String toString() {
	        return name + " [HP: " + health + ", ATK: " + attack + ", DEF: " + defense + "]";
	    }
}
