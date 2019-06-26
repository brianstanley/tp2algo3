package fiuba.algo3.tp2.materiales;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.juego.ElementoDeCampo;
import fiuba.algo3.tp2.juego.Guardable;
import fiuba.algo3.tp2.juego.Mapa.Mapa;
import fiuba.algo3.tp2.juego.Navegador.Posicion;
import fiuba.algo3.tp2.materiales.ExcepcionesMateriales.MaterialRotoExcepcion;
import fiuba.algo3.tp2.vista.MaterialVista;

public abstract class Material implements ElementoDeCampo, Guardable {
    protected int durabilidad;
    protected MaterialVista materialVista;


    public void desgastarCon(Herramienta unaHerramienta) {
    }

    public int getDurabilidad() {
        return this.durabilidad;
    }

    public void ponerEnMapa(Mapa mapa, Posicion posicion){
        mapa.setContenidoCasillero(this, posicion);
    }

    public void quitarDelMapa(Mapa mapa, Posicion posicion){
        mapa.setContenidoCasillero(this, posicion);
    }


    public void checkDurabilidadValida(){
        if (durabilidad <= 0){
            throw new MaterialRotoExcepcion("este material ya fue desgastado");
        }
    }
}
