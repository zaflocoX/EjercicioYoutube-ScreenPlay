package co.falabella.com.task;

import co.falabella.com.ui.InicioUI;
import co.falabella.com.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static co.falabella.com.ui.InicioUI.TXT_BUSQUEDA_PRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InicioTask implements Task {

    private static ArrayList<Map<String, String>> dataExcel = new ArrayList();
    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            dataExcel = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx","Busqueda");
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        actor.attemptsTo(

                Enter.theValue(dataExcel.get(0).get("Producto")).into(TXT_BUSQUEDA_PRODUCTO).thenHit(Keys.ENTER)
        );
    }

    public static Performable fromInicio(){
        return instrumented(InicioTask.class);
    }
}
