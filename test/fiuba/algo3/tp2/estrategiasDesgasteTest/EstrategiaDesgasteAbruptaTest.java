package fiuba.algo3.tp2.estrategiasDesgasteTest;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteAbrupta;
import fiuba.algo3.tp2.estrategiasDesgaste.excepciones.DurabilidadCeroExcepcion;
import org.junit.Assert;
import org.junit.Test;

public class EstrategiaDesgasteAbruptaTest {

    @Test
    public void desgasteAbruptoNoReduceSiNoSeRealizanTodosLosUsosDisponibles(){

        double durabilidadInical = 10;
        int usosDisponibles = 5;

        EstrategiaDesgasteAbrupta desgaste = new EstrategiaDesgasteAbrupta(durabilidadInical, usosDisponibles);

        desgaste.desgastar();
        desgaste.desgastar();

        Assert.assertEquals(durabilidadInical, desgaste.durabilidad(), 0.01);
    }

    @Test
    public void desgasteAbruptoReduceACeroSiSeRealizanTodosLosUsosDisponibles(){

        double durabilidadInical = 10;
        int usosDisponibles = 3;

        EstrategiaDesgasteAbrupta desgaste = new EstrategiaDesgasteAbrupta(durabilidadInical, usosDisponibles);

        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();

        Assert.assertEquals(0, desgaste.durabilidad(), 0.01);
    }

    @Test (expected = DurabilidadCeroExcepcion.class)
    public void siSeDesgastaCuandoLaDurabilidadEsCeroSeLanzaExcepcion(){
        double durabilidadInicial = 10;
        int usosDisponibles = 3;

        EstrategiaDesgasteAbrupta desgaste = new EstrategiaDesgasteAbrupta(durabilidadInicial, usosDisponibles);

        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();
    }

}
