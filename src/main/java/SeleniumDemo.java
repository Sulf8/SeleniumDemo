import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "selenium\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.rpgnuke.ru/");
        System.out.println(webDriver.getTitle());
        System.out.println(webDriver.getCurrentUrl());

        WebElement paginationButton2;
        for (int i = 1; i < 10; i++) {
            webDriver.get("https://www.rpgnuke.ru/");
            paginationButton2 = webDriver.findElement(By.xpath("//*[@id=\"text-17\"]/div[2]/p/strong[1]/a["+i+"]"));
            paginationButton2.click();
            Thread.sleep(2000);
        }
        webDriver.quit();
    }
}
