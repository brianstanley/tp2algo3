package fiuba.algo3.tp2.estrategiasDesgaste.excepciones;

public class DurabilidadCeroExcepcion extends RuntimeException {

    public DurabilidadCeroExcepcion(String mensaje){
        super (mensaje);
    }
}
