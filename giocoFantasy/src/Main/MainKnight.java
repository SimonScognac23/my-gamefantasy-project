package Main;

public class MainKnight extends GameCharacter2 {  // main adventurer estende gamecharacter2
    public MainKnight () {
        super("Knight", 120, 10, 15); // il super mi permette di accedere alla superclasse e posso usare i pv,atk e dfs
    }

    @Override
    public void specialAbility() {
       
        System.out.println(name + " Defense ");
        this.defense = 100; // DA SISTEMARE!!!!!!!!!!!!!!!!!
    }
}

