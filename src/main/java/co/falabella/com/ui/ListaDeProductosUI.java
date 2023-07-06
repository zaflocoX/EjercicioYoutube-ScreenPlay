package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ListaDeProductosUI {
    public static final Target LBL_LISTA_PRODUCTOS = Target.the("lista Productos Encontrados")
            .locatedBy("//*[@class='jsx-1576191951 pod-title-wrapper' and not (@is-empty)]");
}
