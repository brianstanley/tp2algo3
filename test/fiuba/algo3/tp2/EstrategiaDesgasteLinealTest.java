package fiuba.algo3.tp2;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLineal;
import org.junit.Assert;
import org.junit.Test;

public class EstrategiaDesgasteLinealTest {

    @Test
    public void desgasteLinealinciaConDurabilidadAsignadaTest(){

        int durabilidadInical = 10;
        int fuerza = 3;

        EstrategiaDesgasteLineal desgaste = new EstrategiaDesgasteLineal(durabilidadInical, fuerza);

        Assert.assertEquals(durabilidadInical, desgaste.durabilidad());
    }

    @Test
    public void desgasteLinealReduceSegunFactorDeReduccionAsigando(){

        int durabilidadInical = 10;
        int fuerza = 3;
        int durabilidadActual = durabilidadInical;

        EstrategiaDesgasteLineal desgaste = new EstrategiaDesgasteLineal(durabilidadInical, fuerza);

        desgaste.desgastar();
        durabilidadActual -= fuerza;

        Assert.assertEquals(durabilidadActual, desgaste.durabilidad());
    }
}
