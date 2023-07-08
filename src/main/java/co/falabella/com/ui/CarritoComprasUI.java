package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoComprasUI {

    public static final Target BTN_AGREGAR_PRODUCTO = Target.the("Agrega el producto a carrito")
            .locatedBy("//button[@id='add-to-cart-button']");
    public static final Target BTN_IR_CARRITO = Target.the("Ir al carrito")
            .locatedBy("//a[@id='linkButton']");
}
