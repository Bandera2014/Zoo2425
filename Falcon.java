public class Falcon extends Bird implements Flying{
    public Falcon(){
        super();
    }
    @Override
    public String fly(){
        return "Flappin my wings";
    }
    @Override
    public String poop(){
        return "Make it rain";
    }
}
