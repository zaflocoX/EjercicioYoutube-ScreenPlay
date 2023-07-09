package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductoUI {

    public static final Target LBL_CANTIDAD_PRODUCTO = Target.the("Cantidad para agregar Producto")
            .locatedBy("//input[@class='jsx-1075932685 product-count-value-input']");

    public static final Target BTN_AGREGAR_PRODUCTO = Target.the("Agrega el producto a carrito")
            .locatedBy("//button[@id='add-to-cart-button']");
    public static final Target BTN_IR_CARRITO = Target.the("Ir al carrito")
            .locatedBy("//a[@id='linkButton']");

    public static Target NOMBRE_PRODUCTO_VISTAPRODUCTO = Target.the("Titulo producto")
            .locatedBy("//div[contains(@class, 'jsx-1442607798')]");

}


