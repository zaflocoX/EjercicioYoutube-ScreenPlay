package co.falabella.com.questions;

import co.falabella.com.interactions.DetallesInteraction;
import co.falabella.com.interactions.NombrePSeleccionado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionNombreProducto implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        String productoSeleccionado = NombrePSeleccionado.nombreValidacion(actor);
        String productoEnCarrito = DetallesInteraction.nombreProductoEnCarrito();
        return productoSeleccionado.contains(productoEnCarrito);
    }

    public static Question<Boolean> from(){
        return new ValidacionNombreProducto();
    }
}
