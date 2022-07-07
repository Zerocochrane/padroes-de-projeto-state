public class MarioCapa extends MarioState {

    private MarioCapa(){}
    private static MarioCapa instance = new MarioCapa();

    public static MarioCapa getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Capa";
    }

    public boolean pegarFlor(Mario mario) {
        mario.setEstado(MarioFogo.getInstance());
        return true;
    }


    public boolean levarDano(Mario mario) {
        mario.setEstado(MarioGrande.getInstance());
        return true;
    }

}