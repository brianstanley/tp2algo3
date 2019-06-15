package fiuba.algo3.tp2.juegoTest;

import fiuba.algo3.tp2.juego.Casillero;
import fiuba.algo3.tp2.juego.ElementoDeCampo;
import fiuba.algo3.tp2.juego.ExcepcionesMapa.CasilleroOcupadoExcepcion;
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
    unCasillero.setContenido(unaMadera);
    ElementoDeCampo materialGuardado = unCasillero.getContenido();
    Assert.assertEquals(unaMadera.getClass() , materialGuardado.getClass());
}

@Test
public void seCreaUnCasilleroYElMaterialAlmacenadoEsNulo(){
    Casillero unCasillero = new Casillero();
    Assert.assertEquals(null, unCasillero.getContenido());
}

@Test (expected = CasilleroOcupadoExcepcion.class)
public void almacenarUnElementoEnUnCasilleroOcupadoLanzaExcepcion(){
    MaderaMaterial unaMadera = new MaderaMaterial();
    Casillero unCasillero = new Casillero();
    unCasillero.setContenido(unaMadera);
    MetalMaterial unMetal = new MetalMaterial();
    unCasillero.setContenido(unMetal);
}

@Test
public void seEliminaElMaterialAlmacenadoEnUnCasillero(){
    MaderaMaterial unaMadera = new MaderaMaterial();
    Casillero unCasillero = new Casillero();
    unCasillero.setContenido(unaMadera);
    ElementoDeCampo materialGuardado = unCasillero.getContenido();
    Assert.assertEquals(unaMadera.getClass() , materialGuardado.getClass());

    unCasillero.eliminarContenido();
    Assert.assertEquals(null, unCasillero.getContenido());
}

}
