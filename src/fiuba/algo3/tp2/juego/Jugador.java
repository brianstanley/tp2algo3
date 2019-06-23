package fiuba.algo3.tp2.juego;

import fiuba.algo3.tp2.herramientas.Herramienta;
import fiuba.algo3.tp2.herramientas.hachas.HachaMadera;
import fiuba.algo3.tp2.juego.ExcepcionesHerrero.HerreroNoConoceFiguraACrearExcepcion;
import fiuba.algo3.tp2.juego.Navegador.*;
import fiuba.algo3.tp2.materiales.*;
import fiuba.algo3.tp2.juego.PlanoConstruccionHerramienta.PlanoConstruccionHerramienta;

public class Jugador implements Movible {

    private Inventario inventario;
    private Navegador navegador;
    private Herramienta herramientaActual;
    private Herrero herrero;

    public Jugador(Navegador navegadorJugador) {

        this.inventario = new Inventario();
        HachaMadera hacha = new HachaMadera();
        this.navegador = navegadorJugador;
        this.herramientaActual = hacha;
        this.herrero = new Herrero();
    }

    public Inventario getInventario() {
        return this.inventario;
    }

    public Navegador getNavegador() {
        return this.navegador;
    }

    public void agregarAlInventario(Guardable item){

        this.inventario.agregar(item);
    }

    public void crearHerramientaNueva(PlanoConstruccionHerramienta plano){

        try {

            Herramienta herramientaCreada = this.herrero.construirHerramienta(plano);
            this.inventario.agregar(herramientaCreada);

        } catch (HerreroNoConoceFiguraACrearExcepcion error){

            for (Guardable material : plano.obtenerMaterialesIngresados())
                this.inventario.agregar(material);
        }

    }

    @Override
    public void moverNorte() {
        DireccionNorte nuevaDireccion = new DireccionNorte();
        this.navegador.moverEnDireccion(nuevaDireccion);
    }

    @Override
    public void moverSur() {
        DireccionSur nuevaDireccion = new DireccionSur();
        this.navegador.moverEnDireccion(nuevaDireccion);
    }

    @Override
    public void moverEste() {
        DireccionEste nuevaDireccion = new DireccionEste();
        this.navegador.moverEnDireccion(nuevaDireccion);
    }

    @Override
    public void moverOeste() {
        DireccionOeste nuevaDireccion = new DireccionOeste();
        this.navegador.moverEnDireccion(nuevaDireccion);
    }

    public void romper() {
        ElementoDeCampo elementoEnFrente = this.navegador.obtenerElementoEnFrente();
        this.herramientaActual.romper((Material)elementoEnFrente);
        this.checkDurablilidadHerramientaEquipada();
    }

    public Herramienta getHerramientaActual() {
        return this.herramientaActual;
    }

    public void equiparHerramienta(Herramienta herramientaBuscada){
        if (this.inventario.tiene(herramientaBuscada)){
            this.agregarAlInventario(this.herramientaActual);
            this.herramientaActual = null;
            Guardable deInventario = this.inventario.removerItem(herramientaBuscada);
            this.herramientaActual = (Herramienta)deInventario;
        }
    }

    private void checkDurablilidadHerramientaEquipada(){
        if (herramientaActual.getDurabilidad() <= 0){
            herramientaActual = null;
        }
    }

}
