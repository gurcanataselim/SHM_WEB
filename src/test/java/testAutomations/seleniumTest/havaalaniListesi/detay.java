package testAutomations.seleniumTest.havaalaniListesi;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class detay extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;


    @FindBy(xpath = "//span[contains(text(),'Havaalanı Listesi')]")
    public WebElement HavaalanıList;
    @FindBy(xpath = "//input[@id='search-tree-data']")
    public WebElement Verigir;
    @FindBy(xpath = "//tbody/tr[40]/td[1]/div[1]/button[2]/span[1]/span[1]")
    public WebElement Detay;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/span[1]")
    public WebElement Approach;
    @FindBy(xpath = "//tbody/tr[2]/td[2]/span[1]")
    public WebElement Conical;
    @FindBy(xpath = "//tbody/tr[3]/td[2]/span[1]")
    public WebElement InnerHorizontal;
    @FindBy(xpath = "//tbody/tr[4]/td[2]/span[1]")
    public WebElement Primary;
    @FindBy(xpath = "//tbody/tr[5]/td[2]/span[1]")
    public WebElement Runway;
    @FindBy(xpath = "//tbody/tr[6]/td[2]/span[1]")
    public WebElement Takeoff;
    @FindBy(xpath = "//tbody/tr[7]/td[2]/span[1]")
    public WebElement Transition;


    @Test
    public void testdetay() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        } catch (Exception e) {
            Logger.warn("Kullanıcı login olamadı.");
        }
        Thread.sleep(3000);


        Fwait.until(ExpectedConditions.visibilityOf(HavaalanıList));
        HavaalanıList.click();

        Fwait.until(ExpectedConditions.visibilityOf(Verigir));
        Verigir.clear();
        Verigir.sendKeys("Havaalanı");
        Thread.sleep(2000);

        Fwait.until(ExpectedConditions.visibilityOf(Detay));
        Detay.click();
        Thread.sleep(2000);

        Fwait.until(ExpectedConditions.visibilityOf(Approach));
        Approach.click();
        Thread.sleep(1000);
        Fwait.until(ExpectedConditions.visibilityOf(Conical));
        Conical.click();
        Thread.sleep(1000);
        Fwait.until(ExpectedConditions.visibilityOf(InnerHorizontal));
        InnerHorizontal.click();
        Thread.sleep(1000);
        Fwait.until(ExpectedConditions.visibilityOf(Primary));
        Primary.click();
        Thread.sleep(1000);
        Fwait.until(ExpectedConditions.visibilityOf(Runway));
        Runway.click();
        Thread.sleep(1000);
        Fwait.until(ExpectedConditions.visibilityOf(Takeoff));
        Takeoff.click();
        Thread.sleep(1000);
        Fwait.until(ExpectedConditions.visibilityOf(Transition));
        Transition.click();
        Thread.sleep(1000);

        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
