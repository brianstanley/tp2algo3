package fiuba.algo3.tp2.juego.MapaConstruccionHerramienta.Figuras;


public abstract class FiguraDeHerramienta{

   protected int madera;
   protected int piedra;
   protected int metal;


    public int getCantidadMadera(){
        return this.madera;
    }
    public int getCantidadPiedra(){
        return this.piedra;
    }
    public int getCantidadMetal(){
        return this.metal;
    }
}


