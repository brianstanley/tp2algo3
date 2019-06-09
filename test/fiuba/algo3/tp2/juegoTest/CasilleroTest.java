package fiuba.algo3.tp2.juegoTest;

import fiuba.algo3.tp2.juego.Casillero;
import fiuba.algo3.tp2.materiales.MaderaMaterial;
import fiuba.algo3.tp2.materiales.Material;
import fiuba.algo3.tp2.materiales.MetalMaterial;
import org.junit.Assert;
import org.junit.Test;

public class CasilleroTest {

@Test
public void SeAlmacenaUnMaterialEnUnCasillero(){
    MaderaMaterial unaMadera = new MaderaMaterial();
    Casillero unCasillero = new Casillero();
    unCasillero.AlmacenarMaterial(unaMadera);
    Material materialGuardado = unCasillero.GetMaterialGuardado();
    Assert.assertEquals(unaMadera.getClass() , materialGuardado.getClass());
}

@Test
public void SeCreaUnCasilleroYElMaterialAlmacenadoEsNulo(){
    Casillero unCasillero = new Casillero();
    Assert.assertEquals(null, unCasillero.GetMaterialGuardado());
}

@Test
public void SeAlmacenaUnMaterialEnUnCasilleroReemplazandoAlPreviamenteAlmacenado(){
    MaderaMaterial unaMadera = new MaderaMaterial();
    Casillero unCasillero = new Casillero();
    unCasillero.AlmacenarMaterial(unaMadera);
    Material materialGuardado = unCasillero.GetMaterialGuardado();
    Assert.assertEquals(unaMadera.getClass() , materialGuardado.getClass());

    MetalMaterial unMetal = new MetalMaterial();
    unCasillero.AlmacenarMaterial(unMetal);
    Assert.assertEquals(unMetal.getClass(), unCasillero.GetMaterialGuardado().getClass());
}

@Test
public void SeEliminaElMaterialAlmacenadoEnUnCasillero(){
    MaderaMaterial unaMadera = new MaderaMaterial();
    Casillero unCasillero = new Casillero();
    unCasillero.AlmacenarMaterial(unaMadera);
    Material materialGuardado = unCasillero.GetMaterialGuardado();
    Assert.assertEquals(unaMadera.getClass() , materialGuardado.getClass());

    unCasillero.EliminarMaterialAlmacenado();
    Assert.assertEquals(null, unCasillero.GetMaterialGuardado());
}

}
