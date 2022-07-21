package Isamar.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! :D" );
        
        String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//identifica en que carpeta debe buscar el driver 
        System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");//estableciendo la propiedad .exe en el sistema
        WebDriver driver = new ChromeDriver(); //inicializando el driver
        driver.get("https://www.coppel.com/");// abre la pagina especificada
    }
}
