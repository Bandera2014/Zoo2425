public class Pikachu extends Animal implements Walking {
    public Pikachu(){
        super("Pika","Electrified Rat...  but cuter");
    }

    @Override
    public String makeNoise() {
        return "Pikaaaaaaaaaa CHHHHUUU!!!!!!!!!!!!!!!!!";
    }

    @Override
    public String walk(){
        return "Quick Attack!";
    }
    
}
