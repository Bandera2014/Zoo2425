public class Cat extends Animal {
    public Cat(){
        super("Kitty","Meow");
    }

    @Override
    public String makeNoise(){
        return "Meow";
    }
}