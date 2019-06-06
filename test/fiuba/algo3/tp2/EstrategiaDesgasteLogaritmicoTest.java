package fiuba.algo3.tp2;

import fiuba.algo3.tp2.estrategiasDesgaste.EstrategiaDesgasteLogaritmico;
import org.junit.Assert;
import org.junit.Test;

public class EstrategiaDesgasteLogaritmicoTest {

    @Test
    public void desgasteLogaritmicoReduceSegunDurabilidadYDivisorAsignado() {

        int durabilidadInical = 200;
        double divisor = 10;
        int durabilidadEsperada = durabilidadInical;

        EstrategiaDesgasteLogaritmico desgaste = new EstrategiaDesgasteLogaritmico(durabilidadInical, divisor) ;

        desgaste.desgastar();
        durabilidadEsperada -= (durabilidadInical / divisor);

        Assert.assertEquals(durabilidadEsperada, desgaste.durabilidad());
    }

}
