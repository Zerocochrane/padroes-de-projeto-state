public abstract class MarioState {

    public abstract String getEstado();

    boolean pegarCogumelo(Mario mario){
        return false;
    }
    boolean pegarFlor(Mario mario){
        return false;
    }
    boolean pegarPena(Mario mario){
        return false;
    }
    boolean levarDano(Mario mario){
        return false;
    }
}