package testAutomations.seleniumTest.adminManiaOnayPaneli;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;



public class panelKapat extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @FindBy(xpath = "//span[contains(text(),'Hesap')]")
    public WebElement hesapBtn;


    @FindBy(xpath = "//span[contains(text(),'Mania Planı Onay Paneli')]")
    public WebElement maniaPlanıOnayPaneliBtn;

    @FindBy(xpath = "//header/div[1]/label[1]")
    public WebElement pencere;




    @Test
    public void testpanelKapat() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }


        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(hesapBtn));
        hesapBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(maniaPlanıOnayPaneliBtn));
        maniaPlanıOnayPaneliBtn.click();

        Fwait.until(ExpectedConditions.visibilityOf(pencere));
        pencere.click();



        try{js.executeScript("document.querySelector('#root > div > div:nth-child(3) > div.share-panel.react-draggable.react-draggable-dragged > header > div > label.share-panel-close-button > span').click()");
        }catch(Exception e){
            Logger.warn("Panel kapatılamadı.");
        }












//        String bodyText = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[5]")).getText();
//        Assert.assertTrue("Text not found!", bodyText.contains("Nesne"));

//        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
//        act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

//
//        System.out.println("File is Uploaded Successfully");


        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}