package fiuba.algo3.tp2.estrategiasDesgasteTest;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLineal;
import org.junit.Assert;
import org.junit.Test;

public class EstrategiaDesgasteLinealTest {

    @Test
    public void desgasteLinealInciaConDurabilidadAsignadaTest(){

        double durabilidadInicial = 10;
        int fuerza = 3;

        EstrategiaDesgasteLineal desgaste = new EstrategiaDesgasteLineal(durabilidadInicial, fuerza,1);

        Assert.assertEquals(durabilidadInicial, desgaste.durabilidad(), 0.01);
    }

    @Test
    public void desgasteLinealNoRecibeDivisorEntoncesReduceSegunFuerzaAsignada(){

        double durabilidadInicial = 10;
        int fuerza = 3;
        double durabilidadEsperada = durabilidadInicial;

        EstrategiaDesgasteLineal desgaste = new EstrategiaDesgasteLineal(durabilidadInicial, fuerza);

        desgaste.desgastar();
        durabilidadEsperada -= fuerza;

        Assert.assertEquals(durabilidadEsperada, desgaste.durabilidad(), 0.01);
    }

    @Test
    public void desgasteLinealReduceSegunFuerzaYDivisorAsignado() {

        double durabilidadInicial = 10;
        int fuerza = 3;
        double divisor = 2;
        double durabilidadEsperada = durabilidadInicial;

        EstrategiaDesgasteLineal desgaste = new EstrategiaDesgasteLineal(durabilidadInicial, fuerza, divisor);

        desgaste.desgastar();
        durabilidadEsperada -= fuerza / divisor;

        Assert.assertEquals(durabilidadEsperada, desgaste.durabilidad(), 0.01);
    }


    @Test
    public void desgasteLinealReduceSegunFuerzaYDivisorAsignado2() {

        /* el divisor es numero con decimal */

        double durabilidadInicial = 10;
        int fuerza = 3;
        double divisor = 1.5;
        double durabilidadEsperada = durabilidadInicial;

        EstrategiaDesgasteLineal desgaste = new EstrategiaDesgasteLineal(durabilidadInicial, fuerza, divisor);

        desgaste.desgastar();
        durabilidadEsperada -= fuerza / divisor;

        Assert.assertEquals(durabilidadEsperada, desgaste.durabilidad(), 0.01);
    }


}