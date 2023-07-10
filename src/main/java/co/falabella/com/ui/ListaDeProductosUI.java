package co.falabella.com.ui;
import net.serenitybdd.screenplay.targets.Target;


public class ListaDeProductosUI {



    public static final Target LBL_LISTA_PRODUCTOS = Target.the("lista Productos Encontrados")
           // .located(By.xpath("//div[@id='testId-searchResults-products']"));
            .locatedBy("//*[@class='jsx-1576191951 title2 primary  jsx-2889528833 bold       pod-subTitle subTitle-rebrand' or @class='jsx-1833870204 copy2 primary  jsx-2889528833 normal       pod-subTitle subTitle-rebrand' ]");

    public static final Target BTN_COOKIES = Target.the("Aceptar cookies")
            .locatedBy("//button[@id='testId-accept-cookies-btn']");
}
