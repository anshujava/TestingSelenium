package sendSMS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class Main {
public static void main(final String[] args) {
    // Create a new instance of the html unit driver
    // Notice that the remainder of the code relies on the interface,
    // not the implementation.
    final WebDriver driver = new HtmlUnitDriver();
    ((HtmlUnitDriver)driver).setJavascriptEnabled(true);

    // And now use this to visit Google
    driver.get("http://www.google.com");

    try {
        Thread.sleep(30000);
    } catch (final InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    // Find the text input element by its name
    final WebElement element = driver.findElement(By.name("q"));

    // Enter something to search for
    element.sendKeys("Cheese!");

    // Now submit the form. WebDriver will find the form for us from the element
    element.submit();

    // Check the title of the page
    System.out.println("Page title is: " + driver.getTitle());

}
}
