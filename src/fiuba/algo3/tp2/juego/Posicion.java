package fiuba.algo3.tp2.juego;

public class Posicion {

    private int coordenadaX;
    private int coordenadaY;

    public Posicion(){
        this.coordenadaX = 2;
        this.coordenadaY = 2;
    }

    public int getX(){
        return coordenadaX;
    }

    public int getY(){
        return coordenadaY;
    }

    public void moverEste(){
        this.coordenadaX += 1;
    }

    public void moverOeste(){
        this.coordenadaX -= 1;
    }

    public void moverNorte(){
        this.coordenadaY += 1;
    }

    public void moverSur(){
        this.coordenadaY -= 1;
    }


}
