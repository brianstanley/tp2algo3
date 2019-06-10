package fiuba.algo3.tp2.juego;

public class Navegador implements movible {

    private Posicion posicionActual;
    private Direccion direccionApuntada;

    public Navegador(){
        this.posicionActual = new Posicion();
        this.direccionApuntada = new DireccionNorte();
    }

    private Posicion mover(){
        return direccionApuntada.mover(posicionActual);
    }

    private void cambiarDireccion(Direccion nuevaDireccionAPuntar){
        this.direccionApuntada = nuevaDireccionAPuntar;
    }

    public void moverNorte(){
        DireccionNorte nuevaDireccion = new DireccionNorte();
        this.cambiarDireccion(nuevaDireccion);
        this.posicionActual =  this.mover();
    }

    public void moverSur(){
        DireccionSur nuevaDireccion = new DireccionSur();
        this.cambiarDireccion(nuevaDireccion);
        this.posicionActual =  this.mover();
    }

    public void moverEste(){
        DireccionEste nuevaDireccion = new DireccionEste();
        this.cambiarDireccion(nuevaDireccion);
        this.posicionActual = this.mover();
    }

    public void moverOeste(){
        DireccionOeste nuevaDireccion = new DireccionOeste();
        this.cambiarDireccion(nuevaDireccion);
        this.posicionActual = this.mover();
    }
}
