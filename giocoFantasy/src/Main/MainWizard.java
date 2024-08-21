package Main;

//import com.model.GameCharacter;


	
	public class MainWizard extends GameCharacter2 {
	    public MainWizard() {
	        super("Wizard", 80, 20, 5);
	    }

	    @Override
	    public void specialAbility() {
	       
	        System.out.println(name + " Fire Ball !!! ");
	        this.attack = 30;
	    }
	}


