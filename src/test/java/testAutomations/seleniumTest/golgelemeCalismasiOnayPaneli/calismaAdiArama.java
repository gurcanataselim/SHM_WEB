package testAutomations.seleniumTest.golgelemeCalismasiOnayPaneli;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class calismaAdiArama extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;


    @FindBy(xpath = "//span[contains(text(),'Hesap')]")
    public WebElement hesapBtn;


    @FindBy(xpath = "//span[contains(text(),'Gölgeleme Çalışması Onay Paneli')]")
    public WebElement golgelemeCalismaOnayPaneliBtn;

    @FindBy(xpath = "//input[@id='search-tree-data']")
    public WebElement calismaAdiAramaBtn;

    @FindBy(xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li[1]/span[1]")
    public WebElement ilkEklemeBtn;


    @FindBy(xpath = "//body/div[@id='menu-']/div[1]")
    public WebElement boslugatikla;

    @FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/div[1]/div[1]")
    public WebElement islemTipi;

    @FindBy(xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li[1]/span[1]")
    public WebElement olusturBtn;



    @Test
    public void testcalismaAdiArama() throws Exception {
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
            Fwait.until(ExpectedConditions.visibilityOf(golgelemeCalismaOnayPaneliBtn));
            golgelemeCalismaOnayPaneliBtn.click();
        }catch(Exception e){
            Logger.warn("Gölgeleme Çalışması Onay Paneli butonuna tıklanmadı.");
        }



        try{
            Fwait.until(ExpectedConditions.visibilityOf(calismaAdiAramaBtn));
            calismaAdiAramaBtn.click();
            calismaAdiAramaBtn.sendKeys("test15");
        }catch(Exception e){
            Logger.warn("Çalişma adi arama paneline Tıklanmadı");
        }


        Thread.sleep(3000);


        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
