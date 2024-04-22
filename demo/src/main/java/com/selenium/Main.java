package com.selenium;

import java.util.ArrayList;
import java.util.Random;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;

public class Main {
    public static void main(String[] args) {

        final WebDriver driver;
        final Map<String, Object> vars;
        JavascriptExecutor js;
       
        //public record setUp() {
          driver = new ChromeDriver();
          js = (JavascriptExecutor) driver;
          vars = new HashMap<String, Object>();
        //}
      
       //  public void tearDown() {
          driver.quit();
       // }
        int x = 0;
       
        while(true){
        Persona p1 = new Persona();
        driver.get("https://bibliotecaregional.carm.es/reserva-de-espacios-solicitud/");
        esperarTiempoAleatorio();
        driver.manage().window().setSize(new Dimension(918, 1005));
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-207")).click();
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-207")).click();
        esperarTiempoAleatorio();
        HacerScrollDown4(driver);
        driver.findElement(By.id("nf-field-207")).sendKeys(""+p1.getSolicitante());
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-217")).click();
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-217")).sendKeys(""+p1.getEntidad());
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-218")).click();
        esperarTiempoAleatorio();
         HacerScrollDown(driver);
        try{Thread.sleep(150);}catch (Exception e){};
        driver.findElement(By.id("nf-field-218")).sendKeys(""+p1.getContacto());
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-219")).click();
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-219")).sendKeys(""+p1.getEmail());
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-209")).click();
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-209")).sendKeys(""+p1.getTelefono());
        /*try{Thread.sleep(50);}catch (Exception e){};
        driver.findElement(By.cssSelector("#nf-field-221-wrap > .nf-field-element"+x)).click();*/
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-221")).click();
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-221")).sendKeys(""+p1.getMedios());
        esperarTiempoAleatorio();
        HacerScrollDown2(driver);
        try{Thread.sleep(200);}catch (Exception e){};
        driver.findElement(By.id("nf-field-210")).click();
        
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-210")).sendKeys(""+p1.getEspacio());
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-214")).click();
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-214")).sendKeys(""+p1.getDescripcion());
        esperarTiempoAleatorio();
        
        driver.findElement(By.id("nf-field-208")).click();
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-208")).sendKeys(""+p1.getDestinatarios());
        esperarTiempoAleatorio();
        HacerScrollDown3(driver); 
        try{Thread.sleep(300);}catch (Exception e){};
        driver.findElement(By.id("nf-field-220")).click();
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-220")).sendKeys(""+p1.getAsistentes());
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-213")).click();
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-213")).sendKeys(""+p1.getFecha());
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-215")).click();
        
        driver.findElement(By.id("nf-field-215")).sendKeys(""+p1.getHorario());
        esperarTiempoAleatorio();
        driver.findElement(By.id("nf-field-216")).click();
        x++;
      }
    }
    
    public static void esperarTiempoAleatorio(){
      Random random = new Random(); 
      int aleatorio = random.nextInt(5000)+3000;
      try{Thread.sleep(aleatorio);}catch (Exception e){};
    }
    public static void HacerScrollDown(WebDriver driver){
      JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight/4)");
    }
    public static void HacerScrollDown2(WebDriver driver){
      JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight/2)");
    }
    
    public static void HacerScrollDown3(WebDriver driver){
      JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    
    public static void HacerScrollDown4(WebDriver driver){
      JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight/6)");
    }
    }
    
 