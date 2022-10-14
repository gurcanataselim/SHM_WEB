package testAutomations.seleniumTest.adminManiaOnayPaneli;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class maniaOnayPaneliOlsFiltreleme extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;



    @FindBy(xpath = "//span[contains(text(),'Hesap')]")
    public WebElement hesapBtn;


    @FindBy(xpath = "//span[contains(text(),'Mania Planı Onay Paneli')]")
    public WebElement maniaPlanıOnayPaneliBtn;

    @FindBy(xpath = "//input[@id='search-tree-data']")
    public WebElement OlsFiltrelemeBtn;




    @Test
    public void testmaniaOnayPaneliOlsFiltreleme() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try{
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        }catch (Exception e){
            Logger.warn("Kullanıcı login olamadı.");
        }




        try{
            Fwait.until(ExpectedConditions.visibilityOf(hesapBtn));
            hesapBtn.click();
        }catch(Exception e){
            Logger.warn("Hesap butonuna tıklanmadı.");
        }



        try{
            Fwait.until(ExpectedConditions.visibilityOf(maniaPlanıOnayPaneliBtn));
            maniaPlanıOnayPaneliBtn.click();
        }catch(Exception e){
            Logger.warn("Mania Planı Onay Paneline Tıklanmadı");
        }


        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(OlsFiltrelemeBtn));
        OlsFiltrelemeBtn.click();
        OlsFiltrelemeBtn.sendKeys("Sivas");



        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
