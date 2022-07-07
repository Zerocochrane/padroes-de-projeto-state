public class MarioMorto extends MarioState {

    private MarioMorto(){}
    private static MarioMorto instance = new MarioMorto();

    public static MarioMorto getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Morto";
    }

}
