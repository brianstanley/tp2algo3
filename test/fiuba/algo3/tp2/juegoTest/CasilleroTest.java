package fiuba.algo3.tp2.juegoTest;

import fiuba.algo3.tp2.juego.Casillero;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.Material;
import fiuba.algo3.tp2.materiales.MetalMaterial;
import org.junit.Assert;
import org.junit.Test;

public class CasilleroTest {

@Test
public void seAlmacenaUnMaterialEnUnCasillero(){
    MaderaMaterial unaMadera = new MaderaMaterial();
    Casillero unCasillero = new Casillero();
    unCasillero.almacenarMaterial(unaMadera);
    Material materialGuardado = unCasillero.getMaterialGuardado();
    Assert.assertEquals(unaMadera.getClass() , materialGuardado.getClass());
}

@Test
public void seCreaUnCasilleroYElMaterialAlmacenadoEsNulo(){
    Casillero unCasillero = new Casillero();
    Assert.assertEquals(null, unCasillero.getMaterialGuardado());
}

@Test
public void seAlmacenaUnMaterialEnUnCasilleroReemplazandoAlPreviamenteAlmacenado(){
    MaderaMaterial unaMadera = new MaderaMaterial();
    Casillero unCasillero = new Casillero();
    unCasillero.almacenarMaterial(unaMadera);
    Material materialGuardado = unCasillero.getMaterialGuardado();
    Assert.assertEquals(unaMadera.getClass() , materialGuardado.getClass());

    MetalMaterial unMetal = new MetalMaterial();
    unCasillero.almacenarMaterial(unMetal);
    Assert.assertEquals(unMetal.getClass(), unCasillero.getMaterialGuardado().getClass());
}

@Test
public void seEliminaElMaterialAlmacenadoEnUnCasillero(){
    MaderaMaterial unaMadera = new MaderaMaterial();
    Casillero unCasillero = new Casillero();
    unCasillero.almacenarMaterial(unaMadera);
    Material materialGuardado = unCasillero.getMaterialGuardado();
    Assert.assertEquals(unaMadera.getClass() , materialGuardado.getClass());

    unCasillero.eliminarMaterialAlmacenado();
    Assert.assertEquals(null, unCasillero.getMaterialGuardado());
}

}
