import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarioTest {

    Mario mario;

    @BeforeEach
    public void setUp() {
        mario = new Mario();
    }

    //Mario Pequeno
    @Test
    public void marioPequenoLevaDano(){
        mario.setEstado(MarioPequeno.getInstance());
        assertTrue(mario.levarDano());
    }
    @Test
    public void marioPequenoPegaCogumelo() {
        mario.setEstado(MarioPequeno.getInstance());
        assertTrue(mario.pegarCogumelo());
    }
    @Test
    public void marioPequenoPegaPena(){
        mario.setEstado(MarioPequeno.getInstance());
        assertTrue(mario.pegarPena());
    }
    @Test
    public void marioPequenoPegaFlor(){
        mario.setEstado(MarioPequeno.getInstance());
        assertTrue(mario.pegarFlor());
    }


    //Mario Grande

    @Test
    public void marioGrandeLevaDano(){
        mario.setEstado(MarioGrande.getInstance());
        assertTrue(mario.levarDano());
    }
    @Test
    public void marioGrandePegaCogumelo(){
        mario.setEstado(MarioGrande.getInstance());
        assertFalse(mario.pegarCogumelo());
    }
    @Test
    public void marioGrandePegaPena(){
        mario.setEstado(MarioGrande.getInstance());
        assertTrue(mario.pegarPena());
    }
    @Test
    public void marioGrandePegaFlor(){
        mario.setEstado(MarioGrande.getInstance());
        assertTrue(mario.pegarFlor());
    }

    //Mario Capa
    @Test
    public void marioCapaLevaDano(){
        mario.setEstado(MarioCapa.getInstance());
        assertTrue(mario.levarDano());
    }
    @Test
    public void marioCapaPegaCogumelo(){
        mario.setEstado(MarioCapa.getInstance());
        assertFalse(mario.pegarCogumelo());
    }
    @Test
    public void marioCapaPegaPena(){
        mario.setEstado(MarioCapa.getInstance());
        assertFalse(mario.pegarPena());
    }
    @Test
    public void marioCapaPegaFlor(){
        mario.setEstado(MarioCapa.getInstance());
        assertTrue(mario.pegarFlor());
    }

    //Mario Fogo
    @Test
    public void marioFogoLevaDano(){
        mario.setEstado(MarioFogo.getInstance());
        assertTrue(mario.levarDano());
    }
    @Test
    public void marioFogoPegaCogumelo(){
        mario.setEstado(MarioFogo.getInstance());
        assertFalse(mario.pegarCogumelo());
    }
    @Test
    public void marioFogoPegaPena(){
        mario.setEstado(MarioFogo.getInstance());
        assertTrue(mario.pegarPena());
    }
    @Test
    public void marioFogoPegaFlor(){
        mario.setEstado(MarioFogo.getInstance());
        assertFalse(mario.pegarFlor());
    }
}