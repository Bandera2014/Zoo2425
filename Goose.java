public class Goose extends Bird {
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
}







