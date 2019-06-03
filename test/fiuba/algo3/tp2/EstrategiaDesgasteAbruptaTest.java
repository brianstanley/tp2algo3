package fiuba.algo3.tp2;

import org.junit.Assert;
import org.junit.Test;

public class EstrategiaDesgasteAbruptaTest {

    @Test
    public void desgasteAbruptoNoReduceSiNoSeRealizanTodosLosUsosDisponibles(){

        int durabilidadInical = 10;
        int usosDisponibles = 5;

        EstrategiaDesgasteAbrupta desgaste = new EstrategiaDesgasteAbrupta(durabilidadInical, usosDisponibles);

        desgaste.desgastar();
        desgaste.desgastar();

        Assert.assertEquals(durabilidadInical, desgaste.durabilidad());
    }

    @Test
    public void desgasteAbruptoReduceACeroSiSeRealizanTodosLosUsosDisponibles(){

        int durabilidadInical = 10;
        int usosDisponibles = 3;

        EstrategiaDesgasteAbrupta desgaste = new EstrategiaDesgasteAbrupta(durabilidadInical, usosDisponibles);

        desgaste.desgastar();
        desgaste.desgastar();
        desgaste.desgastar();

        Assert.assertEquals(0, desgaste.durabilidad());
    }
}
