package testAutomations.seleniumTest.havaalaniListesi;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class arama extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;


    @FindBy(xpath = "//span[contains(text(),'Havaalanı Listesi')]")
    public WebElement HavaalanıList;
    @FindBy(xpath = "//tbody/tr[32]/td[1]/div[1]/button[1]/span[1]/span[1]")
    public WebElement HavaalanıListsec;
    @FindBy(xpath = "//input[@id='search-tree-data']")
    public WebElement Verigir;

    @Test
    public void testarama() throws Exception {
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
        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(Verigir));
        Verigir.clear();
        Verigir.sendKeys("Havaalanı");
        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(HavaalanıListsec));
        HavaalanıListsec.click();
        Thread.sleep(3000);


        System.out.println("Test Tamamlandı!");
        Thread.sleep(8000);
    }
}