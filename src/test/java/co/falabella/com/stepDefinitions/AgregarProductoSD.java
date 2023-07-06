package co.falabella.com.stepDefinitions;

import co.falabella.com.task.InicioTask;
import co.falabella.com.task.ListaDeProductosTask;
import co.falabella.com.ui.InicioUI;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class AgregarProductoSD {


    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }
    @Dado("el usuario ingresa a la pagina de falabella")
    public void elUsuarioIngresaALaPaginaDeFalabella() {
        theActorCalled("Usuario").wasAbleTo(
                Open.url("https://www.falabella.com.co/falabella-co")
        );

    }
    @Cuando("busca un producto y cantidad de su preferencia")
    public void buscaUnProductoYCantidadDeSuPreferencia() {
        theActorInTheSpotlight().attemptsTo(
                InicioTask.fromInicio(),
                ListaDeProductosTask.clickProducto()
        );
    }
    @Entonces("puede agregar el producto al carro de compras")
    public void puedeAgregarElProductoAlCarroDeCompras() {

    }



}
