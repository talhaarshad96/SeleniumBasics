import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autocomplete {
    private static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //move to Element

       /* driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));
        Actions action = new Actions(driver);
        action.moveToElement(name);
        name.sendKeys("Talha");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("2/3/2021");
        Thread.sleep(5000);*/

        //Switch window
       /* driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTab = driver.findElement(By.id("new-tab-button"));
        newTab.click();
        Thread.sleep(3000);
        String originalWinHandle = driver.getWindowHandle(); // saves the parent window because driver has the last one saved in it.
        Thread.sleep(3000);
       // for( String handle1 : driver.getWindowHandles())
       // {
       //     driver.switchTo().window(handle1);
       // }

        driver.switchTo().window(originalWinHandle);
        Thread.sleep(5000);*/

        //Switch To alert
       /* driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement alertbutton = driver.findElement(By.id("alert-button"));
        alertbutton.click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(5000);*/

        //using JavaScript
       /* driver.get("https://formy-project.herokuapp.com/modal");
        WebElement modal = driver.findElement(By.id("modal-button"));
        modal.click();

        WebElement close = driver.findElement(By.id("close-button"));
        //close.click(); //fails using this.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", close);
*/
        //drag and drop
       /* driver.get("https://formy-project.herokuapp.com/dragdrop");
        WebElement image = driver.findElement(By.id("image"));

        WebElement box = driver.findElement(By.id("box"));

        Actions action = new Actions(driver);
        action.dragAndDrop(image,box).build().perform();

        Thread.sleep(2000);*/

        //
        driver.get("https://formy-project.herokuapp.com/dragdrop");

        driver.quit();
    }
}
