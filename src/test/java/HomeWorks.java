import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWorks
{
    WebDriver wd;



@BeforeClass

public void setUp(){
    wd=new ChromeDriver();
    wd.get("https://telranedu.web.app/login");
}

@Test
public void cssLocator(){
    WebElement el = wd.findElement(By.tagName("button"));
    WebElement element = wd.findElement(By.cssSelector("button"));

    WebElement divcontainer = wd.findElement(By.className("container"));
    WebElement divcontainer1 = wd.findElement(By.cssSelector(".container"));

    WebElement nav = wd.findElement(By.id("nav"));
    WebElement nav1 = wd.findElement(By.cssSelector("#nav"));

    WebElement divElement = wd.findElement(By.cssSelector("[class = 'container'] "));
    WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder=\"Type your name\"]"));
    WebElement inputEmail1 = wd.findElement(By.cssSelector("[placeholder=\"Email\"]"));



}
}