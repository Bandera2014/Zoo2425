public class Dragon extends Animal implements Flying{
    public Dragon(){
        super("Drago", "Huge Monster that breathes fire");
    }
    @Override
    public String makeNoise(){
        return "You Should Run...";
    }
    @Override
    public String fly() {
        return "First you need to train me to fly";
    }
}