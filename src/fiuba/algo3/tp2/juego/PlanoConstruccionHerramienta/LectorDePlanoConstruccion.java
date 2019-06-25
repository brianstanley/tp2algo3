package fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta;

import fiuba.algo3.tp2.juego.Navegador.Posicion;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.Figuras.*;

public class LectorDePlanoConstruccion {

    private PlanoConstruccionHerramienta plano;

    public FiguraConstruible evaluarMapa(PlanoConstruccionHerramienta plano){

        this.plano = plano;

        if (this.esMapaDeHachaMadera()) return new FiguraHachaMadera();
        if (this.esMapaDeHachaPiedra()) return new FiguraHachaPiedra();
        if (this.esMapaDeHachaMetal()) return new FiguraHachaMetal();
        if (this.esMapaDePicoMadera()) return new FiguraPicoMadera();
        if (this.esMapaDePicoPiedra()) return new FiguraPicoPiedra();
        if (this.esMapaDePicoMetal()) return new FiguraPicoMetal();
        if (this.esMapaDePicoFinoMetalYPiedra()) return new FiguraPicoFino();
        return new FiguraDesconocida();
    }


    private boolean esMapaDeHachaMadera(){

        return (this.esMapaDeHacha() && plano.hayMaderaEnPosicion( new Posicion(0,0))
                && plano.hayMaderaEnPosicion( new Posicion(0,1))
                && plano.hayMaderaEnPosicion( new Posicion(1,0)));
    }
    private boolean esMapaDeHachaPiedra(){

        return (this.esMapaDeHacha() && plano.hayPiedraEnPosicion( new Posicion(0,0))
                && plano.hayPiedraEnPosicion( new Posicion(0,1))
                && plano.hayPiedraEnPosicion( new Posicion(1,0)));
    }
    private boolean esMapaDeHachaMetal(){

        return (this.esMapaDeHacha() && plano.hayMetalEnPosicion( new Posicion(0,0))
                && plano.hayMetalEnPosicion( new Posicion(0,1))
                && plano.hayMetalEnPosicion( new Posicion(1,0)));
    }

    private boolean esMapaDePicoMadera(){

        return (this.esMapaDePico() && plano.hayMaderaEnPosicion( new Posicion(0,0))
                && plano.hayMaderaEnPosicion( new Posicion(0,1))
                && plano.hayMaderaEnPosicion( new Posicion(0,2)));
    }
    private boolean esMapaDePicoPiedra(){

        return (this.esMapaDePico() && plano.hayPiedraEnPosicion(new Posicion(0,0))
                && plano.hayPiedraEnPosicion(new Posicion(0,1))
                && plano.hayPiedraEnPosicion(new Posicion(0,2)));
    }
    private boolean esMapaDePicoMetal(){

        return (this.esMapaDePico() && plano.hayMetalEnPosicion(new Posicion(0,0))
                && plano.hayMetalEnPosicion(new Posicion(0,1))
                && plano.hayMetalEnPosicion(new Posicion(0,2)));
    }

    private boolean esMapaDePicoFinoMetalYPiedra(){

        return (this.esMapaDePicoFino() && plano.hayMetalEnPosicion(new Posicion(0,0))
                && plano.hayMetalEnPosicion(new Posicion(0,1))
                && plano.hayMetalEnPosicion(new Posicion(0,2))
                && plano.hayPiedraEnPosicion(new Posicion(1,0)));
    }




    private boolean esMapaDeHacha(){

        return (plano.hayMaderaEnPosicion(new Posicion(1,1))
                && plano.hayMaderaEnPosicion(new Posicion(2,1))
                && plano.noHayMaterialEnPosicion(new Posicion(0,2))
                && plano.noHayMaterialEnPosicion(new Posicion(1,2))
                && plano.noHayMaterialEnPosicion(new Posicion(2,0))
                && plano.noHayMaterialEnPosicion(new Posicion(2,2)));
    }
    private boolean esMapaDePico(){

        return (plano.hayMaderaEnPosicion(new Posicion(1,1))
                && plano.hayMaderaEnPosicion(new Posicion(2,1))
                && plano.noHayMaterialEnPosicion(new Posicion(1,0))
                && plano.noHayMaterialEnPosicion(new Posicion(1,2))
                && plano.noHayMaterialEnPosicion(new Posicion(2,0))
                && plano.noHayMaterialEnPosicion(new Posicion(2,2)));
    }
    private boolean esMapaDePicoFino(){

        return (plano.hayMaderaEnPosicion(new Posicion(1,1))
                && plano.hayMaderaEnPosicion(new Posicion(2,1))
                && plano.noHayMaterialEnPosicion(new Posicion(2,0))
                && plano.noHayMaterialEnPosicion(new Posicion(1,2))
                && plano.noHayMaterialEnPosicion(new Posicion(2,2)));
    }
}