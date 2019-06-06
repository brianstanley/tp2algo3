package fiuba.algo3.tp2;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLineal;
import org.junit.Assert;
import org.junit.Test;

public class EstrategiaDesgasteLinealTest {

    @Test
    public void desgasteLinealInciaConDurabilidadAsignadaTest(){

        int durabilidadInicial = 10;
        int fuerza = 3;

        EstrategiaDesgasteLineal desgaste = new EstrategiaDesgasteLineal(durabilidadInicial, fuerza,1);

        Assert.assertEquals(durabilidadInicial, desgaste.durabilidad());
    }

    @Test
    public void desgasteLinealNoRecibeDivisorEntoncesReduceSegunFuerzaAsignada(){

        int durabilidadInicial = 10;
        int fuerza = 3;
        int durabilidadEsperada = durabilidadInicial;

        EstrategiaDesgasteLineal desgaste = new EstrategiaDesgasteLineal(durabilidadInicial, fuerza);

        desgaste.desgastar();
        durabilidadEsperada -= fuerza;

        Assert.assertEquals(durabilidadEsperada, desgaste.durabilidad());
    }

    @Test
    public void desgasteLinealReduceSegunFuerzaYDivisorAsignado() {

        int durabilidadInicial = 10;
        int fuerza = 3;
        double divisor = 2;
        int durabilidadEsperada = durabilidadInicial;

        EstrategiaDesgasteLineal desgaste = new EstrategiaDesgasteLineal(durabilidadInicial, fuerza, divisor);

        desgaste.desgastar();
        durabilidadEsperada -= fuerza / divisor;

        Assert.assertEquals(durabilidadEsperada, desgaste.durabilidad());
    }


    @Test
    public void desgasteLinealReduceSegunFuerzaYDivisorAsignado2() {

        /* el divisor es numero con decimal */

        int durabilidadInicial = 10;
        int fuerza = 3;
        double divisor = 1.5;
        int durabilidadEsperada = durabilidadInicial;

        EstrategiaDesgasteLineal desgaste = new EstrategiaDesgasteLineal(durabilidadInicial, fuerza, divisor);

        desgaste.desgastar();
        durabilidadEsperada -= fuerza / divisor;

        Assert.assertEquals(durabilidadEsperada, desgaste.durabilidad());
    }


}