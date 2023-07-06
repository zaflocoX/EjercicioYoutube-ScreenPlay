package co.falabella.com.task;

import co.falabella.com.interactions.ProductoAleatorio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ListaDeProductosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ProductoAleatorio.elegirProducto()
        );
    }

    public static Performable clickProducto(){
        return instrumented(ListaDeProductosTask.class);
    }
}
