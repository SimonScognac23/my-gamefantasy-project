package Main;


	
	public class MainThief extends GameCharacter2 {  // main adventurer estende gamecharacter2
	    public MainThief () {
	        super("Thief", 90, 10, 8); // il super mi permette di accedere alla superclasse e posso usare i pv,atk e dfs
	    }

	    @Override
	    public void specialAbility() {
	       
	        System.out.println(name + " Stealth "); //attacco rapido
	        this.defense = 100;
	    }
	}



