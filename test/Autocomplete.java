import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

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

        //radio buttons
      /*  driver.get("https://formy-project.herokuapp.com/radiobutton");
        WebElement radioBtn1 = driver.findElement(By.id("radio-button-1"));
        radioBtn1.click();

        WebElement radioBtn2 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioBtn2.click();

        WebElement radioBtn3 = driver.findElement(By.id("radio-button-1"));
        radioBtn3.click();*/

        //date picker
       /* driver.get("https://formy-project.herokuapp.com/datepicker");
        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.sendKeys("03/03/2021");
        datepicker.sendKeys(Keys.ENTER);*/

        //confirm the form is submitted

        WebDriverWait wait = new WebDriverWait(driver,10);

        WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));

        String alertText = alert.getText();

        assertEquals("The form was successfully submitted", alertText);


        driver.quit();
    }
}
