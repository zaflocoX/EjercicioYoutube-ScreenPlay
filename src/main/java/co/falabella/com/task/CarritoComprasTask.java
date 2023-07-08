package co.falabella.com.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.falabella.com.ui.CarritoComprasUI.BTN_AGREGAR_PRODUCTO;
import static co.falabella.com.ui.CarritoComprasUI.BTN_IR_CARRITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CarritoComprasTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_AGREGAR_PRODUCTO),
                Click.on(BTN_IR_CARRITO)
        );
    }
    public static Performable agregarCarrito(){
        return instrumented(CarritoComprasTask.class);
    }


}
