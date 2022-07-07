public class MarioGrande extends MarioState {
    private MarioGrande(){}
    private static MarioGrande instance = new MarioGrande();

    public static MarioGrande getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Grande";
    }
    public boolean pegarFlor(Mario mario) {
        mario.setEstado(MarioFogo.getInstance());
        return true;
    }

    public boolean pegarPena(Mario mario) {
        mario.setEstado(MarioCapa.getInstance());
        return true;
    }

    public boolean levarDano(Mario mario) {
        mario.setEstado(MarioPequeno.getInstance());
        return true;
    }
}
