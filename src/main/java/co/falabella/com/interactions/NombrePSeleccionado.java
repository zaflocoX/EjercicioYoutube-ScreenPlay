package co.falabella.com.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;


import static co.falabella.com.ui.ProductoUI.NOMBRE_PRODUCTO_VISTAPRODUCTO;

public class NombrePSeleccionado implements Interaction {

    public static String CantidadSeleccionada;
    public static String NombreSeleccinado;
    @Override
    public <T extends Actor> void performAs(T actor) {
        NombreSeleccinado = NOMBRE_PRODUCTO_VISTAPRODUCTO.resolveFor(actor).getText();
        actor.remember("ProductoSeleccionadoRandom",NombreSeleccinado);

    }

    public static NombrePSeleccionado nombreObtenido(){
        return new NombrePSeleccionado();
    }

    public static String nombreValidacion(Actor actor){
        return actor.recall("ProductoSeleccionadoRandom");
    }

}


