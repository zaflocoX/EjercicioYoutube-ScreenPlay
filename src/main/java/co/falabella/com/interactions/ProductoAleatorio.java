package co.falabella.com.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;
import java.util.Random;

import static co.falabella.com.ui.ListaDeProductosUI.LBL_LISTA_PRODUCTOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductoAleatorio implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listaProductos = LBL_LISTA_PRODUCTOS.resolveAllFor(actor);

        Random random = new Random();
        int listaProductosRandom = random.nextInt(listaProductos.size());
        listaProductos.get(listaProductosRandom).click();
    }

    public static Performable elegirProducto(){
        return instrumented(ProductoAleatorio.class);
    }
}
