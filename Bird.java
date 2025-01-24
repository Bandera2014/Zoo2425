public abstract class Bird extends Animal implements Walking{
    //a subclass of Animal - so animals that extend Bird are no longer Animals
    public Bird(){
        super("Bird thing","Drone");
    }
    public Bird(String name, String description){
        super(name,description);
    }
    public abstract String poop();

    @Override
    public String makeNoise(){
        return "tweet tweet";
    }
    @Override
    public String walk(){
        return "kind of hops and stuff";
    }
}
