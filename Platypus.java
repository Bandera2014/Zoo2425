public class Platypus extends Animal implements Flying{
    public Platypus(){
        super("Perry", "A platypus\n...\n    _=_\nplatypus\n PERRY THE PLATYPUS!!!");
    }
    @Override
    public String makeNoise() {
        return "*gasp*";
    }
    @Override
    public String fly(){
        return "gets yelled at by a scientist";
    }
}