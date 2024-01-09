package utilities;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Action {


    public static void clickElement(By xpath){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(22));
        wait.until(ExpectedConditions.elementToBeClickable(xpath));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element = Driver.getDriver().findElement(xpath);
        element.click();
    }


    public static void sendKeysElement(By xpath, String key){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element = Driver.getDriver().findElement(xpath);
        element.sendKeys(key);
    }

    public static String getTextElement(By xpath){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element = Driver.getDriver().findElement(xpath);
        return element.getText();
    }

    public static void pressEnter(By xpath){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element=Driver.getDriver().findElement(xpath);
        element.sendKeys(Keys.ENTER);

    }

    public static void  checkElementText(By xpath, String text){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element=Driver.getDriver().findElement(xpath);
        Assert.assertEquals(element.getText(),text);
    }

    public static void elementPresent(By xpath){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element=Driver.getDriver().findElement(xpath);
    }
    public static void elementNotPresent(By xpath){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(xpath));
        WebElement element=Driver.getDriver().findElement(xpath);
    }

    public static WebElement findElement(By xpath){
        WebDriver webDriver = Driver.getDriver();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        return webDriver.findElement(xpath);
    }

    public static void  checkElementValue(By xpath, String text){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element=Driver.getDriver().findElement(xpath);
        Assert.assertEquals(element.getAttribute("value"),text);
    }

    public static void clearText(By xpath){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element=Driver.getDriver().findElement(xpath);
        element.clear();
    }
    public static void openChildLinkFromGrid(By xpath,String childId,String hrefClassName,int index){
        WebDriver webDriver = Driver.getDriver();
        WebElement element= webDriver.findElement(xpath);
        List<WebElement> elements = element.findElements(By.id(childId));
        WebElement firstChild = elements.get(index);
        String productLink = firstChild.findElement(By.className(hrefClassName)).getAttribute("href");
        webDriver.get(productLink);
    }
    public static void openLastChildLinkFromGrid(By xpath,String childId,String hrefClassName){
        WebDriver webDriver = Driver.getDriver();
        WebElement element= webDriver.findElement(xpath);
        List<WebElement> elements = element.findElements(By.id(childId));
        WebElement lastChild = elements.get(elements.size()-1);
        String productLink = lastChild.findElement(By.className(hrefClassName)).getAttribute("href");
        webDriver.get(productLink);
    }
    public static void increaseCountOfCheaperBasketItem(By xpath,String childId,String hrefClassName){
        WebDriver webDriver = Driver.getDriver();
        WebElement element= webDriver.findElement(xpath);
        List<WebElement> elements = element.findElements(By.className(childId));
        WebElement firstElement = elements.get(0);
        WebElement secondElement = elements.get(1);
        String firstPrice = firstElement.findElement(By.className("prd-prc2")).getText();
       String secondPrice = secondElement.findElement(By.className("prd-prc2")).getText();
        String firstNumber = firstPrice.split(" ")[0];
        String secondNumber = secondPrice.split(" ")[0];
        if(firstNumber.compareTo(secondNumber)>=0){
            List<WebElement> buttons = firstElement.findElements(By.tagName("button"));

        }else{
            List<WebElement> buttons = firstElement.findElements(By.tagName("button"));
            buttons.size();
        }

    }

    public static void addBasket(By xpath){
        WebDriver webDriver = Driver.getDriver();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        WebElement element= webDriver.findElement(xpath);
        WebElement firstChild = element.findElements(By.id("product-item")).get(5);
        String productLink = firstChild.findElement(By.className("prd-link")).getAttribute("href");
        webDriver.get(productLink);
    }
    public static void selectCheckbox(By xpath){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        WebElement element=Driver.getDriver().findElement(xpath);
        element.click();
//        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//        js.executeScript("arguments[0].click()", element);
    }
    public static void scrollAndClick(By xpath){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(xpath));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element=Driver.getDriver().findElement(xpath);
//        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//        js.executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        element.click();
    }
    public static void scrollUntilVisible(By xpath) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        WebElement element = Driver.getDriver().findElement(xpath);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(" +
                "{behavior: 'auto', block: 'center', inline: 'center'})", element);
    }

}
