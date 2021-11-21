package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.IngresoPage;

public class stepDefinitions {

    IngresoPage ingreso;


    public stepDefinitions() {
        ingreso = new IngresoPage();

    }


    @Given("Que la web este operativa")
    public void queLaWebEsteOperativa() {
        hooks.driver.get("https://www.demoblaze.com/");
    }

    @Then("Seleccionar primer producto")
    public void seleccionarPrimerProducto() {
        ingreso.seleccionarProducto1();
        ingreso.clickBtnADD();
    }

    @And("Selecionar segundo producto")
    public void selecionarSegundoProducto() {
        ingreso.seleccionarProducto2();
        ingreso.clickBtnADD();
    }

    @And("Visualizar el carrito")
    public void visualizarElCarrito() {
        ingreso.VisualiazarCarrito();
        ingreso.ClickPlaceOrder();
    }

    @And("completar formulario de compra y finalizar la compra")
    public void completarFormularioDeCompraYFinalizarLaCompra() {
        ingreso.IngresarDatos("clenin","Peru","Lima","2424567575878723","07","2025");

    }
}
