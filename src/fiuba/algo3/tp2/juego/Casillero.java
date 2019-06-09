package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.materiales.Material;

public class Casillero {

    private Material materialPresente;

    public Casillero(Material unMaterial){
        this.materialPresente = unMaterial;
    }

    public Casillero(){
        this(null);
    }

    public Material GetMaterialGuardado() {
        return this.materialPresente;
    }

    public void AlmacenarMaterial(Material unMaterial){
        this.materialPresente = unMaterial;
    }

    public void EliminarMaterialAlmacenado(){
        this.AlmacenarMaterial(null);
    }

}
