package Main;

//import com.model.GameCharacter;


	
	public class MainAdventurer extends GameCharacter2 {  // main adventurer estende gamecharacter2
	    public MainAdventurer () {
	        super("Adventurer", 100, 15, 10); // il super mi permette di accedere alla superclasse e posso usare i pv,atk e dfs
	    }

	    @Override
	    public void specialAbility() {
	       
	        System.out.println(name + " Rapide Attack"); //attacco rapido
	        this.attack = 30;
	    }
	}


