public class MarioPequeno extends MarioState {
    private MarioPequeno(){}
    private static MarioPequeno instance = new MarioPequeno();

    public static MarioPequeno getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Pequeno";
    }

    @Override
    public boolean pegarCogumelo(Mario mario) {
        mario.setEstado(MarioGrande.getInstance());
        return true;
    }

    @Override
    public boolean pegarFlor(Mario mario) {
        mario.setEstado(MarioGrande.getInstance());
        return true;
    }

    @Override
    public boolean pegarPena(Mario mario) {
        mario.setEstado(MarioGrande.getInstance());
        return true;
    }

    @Override
    public boolean levarDano(Mario mario) {
        mario.setEstado(MarioMorto.getInstance());
        return true;
    }

}