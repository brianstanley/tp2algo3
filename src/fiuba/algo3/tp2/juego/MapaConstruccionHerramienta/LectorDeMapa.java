package fiuba.algo3.tp2.juego.MapaConstruccionHerramienta;

import fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.Figuras.*;

public class LectorDeMapa{

    private MapaConstruccionHerramienta mapa;

    public FiguraConstruible evaluarMapa(MapaConstruccionHerramienta mapa){

        this.mapa = mapa;

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

        return (this.esMapaDeHacha() && mapa.hayMaderaEnPosicion(0,0) && mapa.hayMaderaEnPosicion(0,1)
                && mapa.hayMaderaEnPosicion(1,0));
    }
    private boolean esMapaDeHachaPiedra(){

        return (this.esMapaDeHacha() && mapa.hayPiedraEnPosicion(0,0) && mapa.hayPiedraEnPosicion(0,1)
                && mapa.hayPiedraEnPosicion(1,0));
    }
    private boolean esMapaDeHachaMetal(){

        return (this.esMapaDeHacha() && mapa.hayMetalEnPosicion(0,0) && mapa.hayMetalEnPosicion(0,1)
                && mapa.hayMetalEnPosicion(1,0));
    }

    private boolean esMapaDePicoMadera(){

        return (this.esMapaDePico() && mapa.hayMaderaEnPosicion(0,0) && mapa.hayMaderaEnPosicion(0,1)
                && mapa.hayMaderaEnPosicion(0,2));
    }
    private boolean esMapaDePicoPiedra(){

        return (this.esMapaDePico() && mapa.hayPiedraEnPosicion(0,0) && mapa.hayPiedraEnPosicion(0,1)
                && mapa.hayPiedraEnPosicion(0,2));
    }
    private boolean esMapaDePicoMetal(){

        return (this.esMapaDePico() && mapa.hayMetalEnPosicion(0,0) && mapa.hayMetalEnPosicion(0,1)
                && mapa.hayMetalEnPosicion(0,2));
    }

    private boolean esMapaDePicoFinoMetalYPiedra(){

        return (this.esMapaDePicoFino() && mapa.hayMetalEnPosicion(0,0) && mapa.hayMetalEnPosicion(0,1)
                && mapa.hayMetalEnPosicion(0,2) && mapa.hayPiedraEnPosicion(1,0));
    }




    private boolean esMapaDeHacha(){

        return (mapa.hayMaderaEnPosicion(1,1) && mapa.hayMaderaEnPosicion(2,1)
                && mapa.noHayMaterialEnPosicion(0,2) && mapa.noHayMaterialEnPosicion(1,2)
                && mapa.noHayMaterialEnPosicion(2,0) && mapa.noHayMaterialEnPosicion(2,2));
    }
    private boolean esMapaDePico(){

        return (mapa.hayMaderaEnPosicion(1,1) && mapa.hayMaderaEnPosicion(2,1)
                && mapa.noHayMaterialEnPosicion(1,0) && mapa.noHayMaterialEnPosicion(1,2)
                && mapa.noHayMaterialEnPosicion(2,0) && mapa.noHayMaterialEnPosicion(2,2));
    }
    private boolean esMapaDePicoFino(){

        return (mapa.hayMaderaEnPosicion(1,1) && mapa.hayMaderaEnPosicion(2,1)
                && mapa.noHayMaterialEnPosicion(2,0) && mapa.noHayMaterialEnPosicion(1,2)
                && mapa.noHayMaterialEnPosicion(2,2));
    }
}