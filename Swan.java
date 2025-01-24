public class Swan extends Bird{
    public Swan(){
        super("Swan","Long Neck, swims and has a beak");
    }
    @Override
    public String poop(){
        return "White majestic turds";
    }
    @Override
    public String makeNoise() {
        return "Ca Caw";
    }
}