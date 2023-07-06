package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;

public class InicioUI {
    public static final Target TXT_BUSQUEDA_PRODUCTO = Target.the("TextBox Buscar")
            .locatedBy("//input[@id='testId-SearchBar-Input']");
}
