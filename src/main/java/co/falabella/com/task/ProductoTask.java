package co.falabella.com.task;

import co.falabella.com.utils.Excel;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static co.falabella.com.ui.ProductoUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Enter.theValue;

public class ProductoTask implements Task{
    private  static ArrayList<Map<String, String>> data= new ArrayList<>();


    @Override
    public <T extends Actor> void performAs(T actor) {



        try {
            data = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx","Busqueda");
            actor.attemptsTo(

                    Clear.field(LBL_CANTIDAD_PRODUCTO),
                    theValue(String.valueOf(data.get(0).get("Cantidad"))).into(LBL_CANTIDAD_PRODUCTO),
                    Click.on(BTN_AGREGAR_PRODUCTO),
                    Click.on(BTN_IR_CARRITO)
            );

        }catch (IOException e){
            throw new RuntimeException(e);
        }


    }

    public static Performable clickCantidad(){
        return instrumented(ProductoTask.class);
    }

}