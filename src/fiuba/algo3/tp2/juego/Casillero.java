package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.materiales.Material;

public class Casillero {

    private Material materialAlmacenado;

    public Casillero(){
        this.materialAlmacenado = null;
    }

    public Material getMaterialGuardado() {
        return this.materialAlmacenado;
    }

    public void almacenarMaterial(Material unMaterial){
        this.materialAlmacenado = unMaterial;
    }

    public Material eliminarMaterialAlmacenado(){
        Material materialRecogido = this.getMaterialGuardado();
        this.almacenarMaterial(null);
        return materialRecogido;
    }

}
