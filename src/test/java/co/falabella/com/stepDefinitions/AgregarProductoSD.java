package co.falabella.com.stepDefinitions;


import co.falabella.com.interactions.DetallesInteraction;
import co.falabella.com.interactions.NombrePSeleccionado;
import co.falabella.com.questions.ValidacionCantidadProducto;
import co.falabella.com.questions.ValidacionNombreProducto;
import co.falabella.com.task.InicioTask;
import co.falabella.com.task.ListaDeProductosTask;
import co.falabella.com.task.ProductoTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

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
    @Cuando("busca y selecciona un producto y cantidad de su preferencia")
    public void buscaUnProductoYCantidadDeSuPreferencia() {
        theActorInTheSpotlight().attemptsTo(
                InicioTask.fromInicio(),
                ListaDeProductosTask.clickProducto(),
                NombrePSeleccionado.nombreObtenido(),
                ProductoTask.clickCantidad(),
                DetallesInteraction.valoresAgregados()

        );
    }
    @Entonces("agrega el producto al carro de compras valida el nombre y la cantidad seleccionada")
    public void agregaElProductoAlCarroDeComprasValidaElNombreYLaCantidadSeleccionada() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionNombreProducto.from(), Matchers.equalTo(true)
                ),
                seeThat(
                        ValidacionCantidadProducto.from(), Matchers.equalTo(true)
                )

        );




    }


}
