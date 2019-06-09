package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.materiales.Material;

public class Casillero {

    private Material materialAlmacenado;

    public Casillero(){
        this.materialAlmacenado = null;
    }

    public Material GetMaterialGuardado() {
        return this.materialAlmacenado;
    }

    public void AlmacenarMaterial(Material unMaterial){
        this.materialAlmacenado = unMaterial;
    }

    public void EliminarMaterialAlmacenado(){
        this.AlmacenarMaterial(null);
    }

}
