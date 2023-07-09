package co.falabella.com.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import static co.falabella.com.ui.CarritoComprasUI.CANTIDAD_VISTA_DETALLESCARRO;
import static co.falabella.com.ui.CarritoComprasUI.NOMBRE_VISTA_DETALLECARRO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DetallesInteraction implements Interaction {
    private static String  nombreVistaCarro;
    private static String cantidadVistaCarro;

    @Override
    public <T extends Actor> void performAs(T actor) {

        nombreVistaCarro = NOMBRE_VISTA_DETALLECARRO.resolveFor(actor).getText();
        cantidadVistaCarro =CANTIDAD_VISTA_DETALLESCARRO.resolveFor(actor).getValue();

    }

    public static Performable valoresAgregados(){
        return instrumented(DetallesInteraction.class);
    }

    public static String nombreProductoEnCarrito(){
        return nombreVistaCarro;
    }

    public static String cantidadProductoEnCarrito(){
        return cantidadVistaCarro;
    }
}
