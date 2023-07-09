package co.falabella.com.questions;

import co.falabella.com.interactions.DetallesInteraction;
import co.falabella.com.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static co.falabella.com.ui.ProductoUI.LBL_CANTIDAD_PRODUCTO;

public class ValidacionCantidadProducto implements Question<Boolean> {
    private  static ArrayList<Map<String, String>> data= new ArrayList<>();
    @Override
    public Boolean answeredBy(Actor actor) {
        String Cantidad;
        try {
            data = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Data.xlsx","Busqueda");
            Cantidad = data.get(0).get("Cantidad");
            String CantidadCarrito = DetallesInteraction.cantidadProductoEnCarrito();
            return Cantidad.equals(CantidadCarrito);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static Question<Boolean> from(){
        return new ValidacionCantidadProducto();
    }

}
