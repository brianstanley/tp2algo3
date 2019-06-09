package fiuba.algo3.tp2.estrategiasDesgasteTest;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLogaritmico;
import org.junit.Assert;
import org.junit.Test;

public class EstrategiaDesgasteLogaritmicoTest {

    @Test
    public void desgasteLogaritmicoReduceSegunDurabilidadYDivisorAsignado() {

        int durabilidadInicial = 200;
        double divisor = 10;
        int durabilidadEsperada = durabilidadInicial;

        EstrategiaDesgasteLogaritmico desgaste = new EstrategiaDesgasteLogaritmico(durabilidadInicial, divisor) ;

        desgaste.desgastar();
        durabilidadEsperada -= (durabilidadInicial / divisor);

        Assert.assertEquals(durabilidadEsperada, desgaste.durabilidad(), 0.01);
    }

}
