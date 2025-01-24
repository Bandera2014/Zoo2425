public class Goose extends Bird implements Walking{
    public Goose() {
        super("GoGo", "Bird that runs behind you");
    }
    @Override
    public String poop(){
        return "Canada Rules, America Drools!";
    }
    @Override
    public String makeNoise() {
        return "Honk";
    }
    @Override
    public String walk(){
        return "Chase you all the way home";
    }
}







