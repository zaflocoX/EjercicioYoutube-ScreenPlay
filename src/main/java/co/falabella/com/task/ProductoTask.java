package co.falabella.com.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;


import static co.falabella.com.ui.ProductoUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductoTask implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Clear.field(LBL_CANTIDAD_PRODUCTO),
                Enter.theValue("3").into(LBL_CANTIDAD_PRODUCTO).thenHit(Keys.ENTER)

        );
    }

    public static Performable clickCantidad(){
        return instrumented(ProductoTask.class);
    }

}
