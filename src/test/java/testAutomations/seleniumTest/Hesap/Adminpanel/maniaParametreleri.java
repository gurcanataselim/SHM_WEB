package testAutomations.seleniumTest.Hesap.Adminpanel;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import testAutomations.Kullanici;

public class maniaParametreleri extends testAutomations.TestBase {


    @FindBy(id = "map")
    public WebElement harita;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[5]/div[1]")
    public WebElement hesap;

    @FindBy(xpath = "//span[contains(text(),'Yönetici Panel')]")
    public WebElement adminPanel;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/div[1]/div[2]/span[1]")
    public WebElement Rol;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/div[4]")
    public WebElement maniaPara;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]/div[1]/input[1]")
    public WebElement filtre;

    @FindBy(xpath = "//tbody/tr[2]/td[1]/div[1]/button[1]")
    public WebElement edit;

    @FindBy(css = "#root > div > div:nth-child(3) > div > main > div:nth-child(2) > div > div > div > div > div > div > table > tbody > tr:nth-child(2) > td:nth-child(3) > div > div > input")
    public WebElement aletsizNo1;

    @FindBy(xpath = "//span[contains(text(),'check')]")
    public WebElement check;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[2]/div[1]/button[1]")
    public WebElement guncelle;

    @FindBy(css = "body > div.ui.page.modals.dimmer.transition.visible.active > div > div.actions > button.ui.icon.positive.right.labeled.button > span")
    public WebElement onay;


    @Test
    public void testmaniaParametreleri() throws Exception {
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            kullaniciGirisYap(driver, Kullanici.KULLANICI1);
        } catch (Exception e) {
            Logger.warn("Kullanıcı login olamadı.");
        }
        System.out.println("Login işlemi gerçekleştirildi.");

        Fwait.until(ExpectedConditions.visibilityOf(harita));


        try {
            hesap.click();
            adminPanel.click();
            Fwait.until(ExpectedConditions.visibilityOf(maniaPara));
            maniaPara.click();

        } catch (Exception e) {
            Logger.warn("Yönetim paneli butonuna tıklanamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(guncelle));
        System.out.println("Mania Parametreleri penceresi açıldı.");


        try {
            filtre.sendKeys("KonikEgim");
            Thread.sleep(2000);

        } catch (Exception e) {
            Logger.warn("Filtreleme yapılamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(edit));


        try {

            edit.click();

        } catch (Exception e) {
            Logger.warn("Filtreleme işlmei gerçekleştirilemedi.");

        }
        Fwait.until(ExpectedConditions.visibilityOf(aletsizNo1));


        try {

            aletsizNo1.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Thread.sleep(1000);
            aletsizNo1.sendKeys("10");
            check.click();


        } catch (Exception e) {
            Logger.warn("Filtreleme işlmei gerçekleştirilemedi.");

        }

        Thread.sleep(1500);


        try {

            guncelle.click();
            Thread.sleep(1500);
            onay.click();


        } catch (Exception e) {
            Logger.warn("Filtreleme işlmei gerçekleştirilemedi.");

        }

        try {
            driver.navigate().refresh();

        } catch (Exception e) {

        }

        Fwait.until(ExpectedConditions.visibilityOf(maniaPara));
//  Tekrar eski haline çevirildi.

        try {
            maniaPara.click();

        } catch (Exception e) {

        }

        Fwait.until(ExpectedConditions.visibilityOf(guncelle));
        System.out.println("Mania Parametreleri penceresi açıldı.");


        try {
            filtre.sendKeys("KonikEgim");


        } catch (Exception e) {
            Logger.warn("Filtreleme yapılamadı.");
        }
        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(edit));


        try {

            edit.click();

        } catch (Exception e) {
            Logger.warn("Filtreleme işlmei gerçekleştirilemedi.");

        }
        Fwait.until(ExpectedConditions.visibilityOf(aletsizNo1));


        try {

            aletsizNo1.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Thread.sleep(1000);
            aletsizNo1.sendKeys("10");
            check.click();


        } catch (Exception e) {
            Logger.warn("Filtreleme işlmei gerçekleştirilemedi.");

        }

        Thread.sleep(1500);


        try {

            guncelle.click();
            Thread.sleep(1500);
            onay.click();


        } catch (Exception e) {
            Logger.warn("Filtreleme işlmei gerçekleştirilemedi.");

        }


    };




}
