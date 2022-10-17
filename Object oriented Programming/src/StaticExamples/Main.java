package StaticExamples;

public class Main {
    public static void main(String[] args) {
        Human Nishant = new Human(12, "Nish", 232, false);
        Human Nix = new Human(11, "Nix", 3232, true);

        System.out.println(Nishant.population);
        System.out.println(Nix.population);
        test();
        
    }

    static void test(){
        // greet();
        // instance navako lai entry chaidaina
        Main mn = new Main();
        mn.greet();
    }
    void greet(){
        test();// test pailai bata static ho. jata ni jana pauxa, object chaidaina
       // taile jasari ni instance banauna prxa
        System.out.println("Greet me");
    }
}
