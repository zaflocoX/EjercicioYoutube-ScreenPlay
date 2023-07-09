package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoComprasUI {
    public static final Target NOMBRE_VISTA_DETALLECARRO = Target.the("Nombre detalles carrito")
            .locatedBy("//p[@data-testid='name']");
    public static final Target CANTIDAD_VISTA_DETALLESCARRO = Target.the("Agrega el producto a carrito")
            .locatedBy("//input[@class='chakra-input css-1hzo6s2']");

}


