public class Mario extends MarioState {
    protected MarioState estado;

    public Mario() {
        this.estado = MarioPequeno.getInstance();
    }

    public void setEstado(MarioState estado) {
        this.estado = estado;
    }

    public boolean pegarCogumelo() {
        return estado.pegarCogumelo(this);
    }

    public boolean pegarFlor() {
        return estado.pegarFlor(this);
    }

    public boolean pegarPena() {
        return estado.pegarPena(this);
    }

    public boolean levarDano() {
        return estado.levarDano(this);
    }


    public String getEstado() {
        return null;
    }
}