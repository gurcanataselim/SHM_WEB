package testAutomations.seleniumTest.havaalaniListesi;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class dxfExport extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;


    @FindBy(xpath = "//span[contains(text(),'Havaalanı Listesi')]")
    public WebElement HavaalanıList;
    @FindBy(xpath = "//input[@id='search-tree-data']")
    public WebElement Verigir;
    @FindBy(xpath = "//tbody/tr[12]/td[1]/div[1]/button[4]/span[1]/span[1]")
    public WebElement dxfExport;



    @Test
    public void testdxfExport() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        } catch (Exception e) {
            Logger.warn("Kullanıcı login olamadı.");
        }
        Thread.sleep(2000);


        Fwait.until(ExpectedConditions.visibilityOf(HavaalanıList));
        HavaalanıList.click();

        Fwait.until(ExpectedConditions.visibilityOf(Verigir));
        Verigir.clear();
        Verigir.sendKeys("Havaalanı");
        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(dxfExport));
        dxfExport.click();
        Thread.sleep(50000);


        System.out.println("Test Tamamlandı!");
        Thread.sleep(1000);
    }
}
