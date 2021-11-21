package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class IngresoPage extends util {
    @FindBy(xpath = "//a[contains(text(),'Samsung galaxy s6')]") private WebElement txtproducto1;
    @FindBy(xpath = "//a[contains(text(),'Nokia lumia 1520')]") private WebElement txtproducto2;
    @FindBy(xpath = "//a[@id='cat']") private WebElement lblCategoria;
    @FindBy(xpath = "//a[contains(text(),'Add to cart')]") private WebElement btnaddcart;
    @FindBy(xpath = "//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]") private WebElement txtHome;
    @FindBy(xpath = "//a[@id='cartur']") private WebElement txtCarrito;
    @FindBy(xpath = "//button[contains(text(),'Place Order')]") private WebElement btnPlaceOrder;
    @FindBy(xpath = "//input[@id='name']") private WebElement txbName;
    @FindBy(xpath = "//input[@id='country']") private WebElement txbCountry;
    @FindBy(xpath = "//input[@id='city']") private WebElement txbCity;
    @FindBy(xpath = "//input[@id='card']") private WebElement txbCreditCard;
    @FindBy(xpath = "//input[@id='month']") private WebElement txbMonth;
    @FindBy(xpath = "//input[@id='year']") private WebElement txbYear;
    @FindBy(xpath = "//button[contains(text(),'Purchase')]") private WebElement btnPurchase;

    public IngresoPage(){
        PageFactory.initElements(driver,this);
    }
    public void seleccionarProducto1(){

        wait.until(ExpectedConditions.elementToBeClickable(lblCategoria));
        txtproducto1.click();
        //wait.until(ExpectedConditions.elementToBeClickable(btnIngrsarGoogle));
       // btnIngrsarGoogle.click();
    }

    public void clickBtnADD(){
        wait.until(ExpectedConditions.elementToBeClickable(btnaddcart));
        btnaddcart.click();
        driver.switchTo().alert().accept();
        txtHome.click();
    }

    public void seleccionarProducto2(){
        wait.until(ExpectedConditions.elementToBeClickable(lblCategoria));
        txtproducto2.click(); }

    public void VisualiazarCarrito(){
        wait.until(ExpectedConditions.elementToBeClickable(txtCarrito));
        txtCarrito.click();
    }
    public void ClickPlaceOrder(){ wait.until(ExpectedConditions.elementToBeClickable(btnPlaceOrder));
        btnPlaceOrder.click(); }
    public void IngresarDatos(String Name,String Country, String Ctiy,String CreditCard,String Month,String Year){
        txbName.sendKeys(Name);
        txbCountry.sendKeys(Country);
        txbCity.sendKeys(Ctiy);
        txbCreditCard.sendKeys(CreditCard);
        txbMonth.sendKeys(Month);
        txbYear.sendKeys(Year);
        btnPurchase.click();
    }

}

