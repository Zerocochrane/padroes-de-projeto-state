public class MarioFogo extends MarioState {

    private MarioFogo(){}
    private static MarioFogo instance = new MarioFogo();

    public static MarioFogo getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Fogo";
    }

    public boolean pegarPena(Mario mario) {
        mario.setEstado(MarioCapa.getInstance());
        return true;
    }

    public boolean levarDano(Mario mario) {
        mario.setEstado(MarioGrande.getInstance());
        return true;
    }
}
