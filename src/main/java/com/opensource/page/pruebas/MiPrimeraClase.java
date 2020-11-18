package com.opensource.page.pruebas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiPrimeraClase {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dpjho\\IdeaProjects\\Choucair\\chromedriver.exe");
        WebDriver jhomar=new ChromeDriver();

        jhomar.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");

        jhomar.findElement(By.id("user_login")).sendKeys("opensourcsecm");
        jhomar.findElement(By.id("user_pass")).sendKeys("opensourcsecm");
        jhomar.findElement(By.id("wp-submit")).click();


    }

}
