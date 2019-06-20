package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.picos.PicoFino;
import fiuba.algo3.tp2.herramientas.picos.PicoMetal;
import fiuba.algo3.tp2.herramientas.picos.PicoPiedra;
import fiuba.algo3.tp2.vista.Dibujable;
import fiuba.algo3.tp2.vista.MaterialVista;

public class MetalMaterial extends Material {

    public MetalMaterial() {
        this.durabilidad = 50;
    }

    public void desgastarCon(PicoPiedra unPicoDePiedra) {
        this.durabilidad -= unPicoDePiedra.getFuerza();
    }

    public void desgastarCon(PicoMetal unPicoDeMetal) {this.durabilidad -= unPicoDeMetal.getFuerza();}

    public void desgastarCon(PicoFino unPicoFino) {
        this.durabilidad -= unPicoFino.getFuerza();
    }

    @Override
    public Dibujable dibujo() {
        return new MaterialVista("iron.png");

    }
}
