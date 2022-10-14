package testAutomations.seleniumTest.Hesap.Adminpanel;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class RaporYetkilileri extends testAutomations.TestBase {

    @FindBy(id = "map")
    public WebElement harita;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[5]/div[1]")
    public WebElement hesap;

    @FindBy(xpath = "//span[contains(text(),'Yönetici Panel')]")
    public WebElement adminPanel;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/div[1]/div[2]/span[1]")
    public WebElement Rol;

    @FindBy(xpath = "//span[contains(text(),'Rapor Yetkilileri')]")
    public WebElement RaporYetkilileri;

    @FindBy(xpath = "//tbody/tr[3]/td[1]/div[1]/button[1]/span[1]/span[1]")
    public WebElement Edit;

    @FindBy(xpath = "//tbody/tr[2]/td[1]/div[1]/button[1]")
    public WebElement edit1;

    @FindBy(xpath = "//tbody/tr[2]/td[3]/div[1]/div[1]/input[1]")
    public WebElement adi;

    @FindBy(xpath = "//tbody/tr[2]/td[2]/div[1]/div[1]/input[1]")
    public WebElement unvan;

    @FindBy(xpath = "//div[contains(text(),'Aktif')]")
    public WebElement durum;

    @FindBy(xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li[1]")
    public WebElement aktif;

    @FindBy(xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li[2]")
    public WebElement pasif;

    @FindBy(xpath = "//span[contains(text(),'check')]")
    public WebElement check;

    @FindBy(xpath = "//span[contains(text(),'clear')]")
    public WebElement iptal;

    @FindBy(xpath = "//span[contains(text(),'Güncelle')]")
    public WebElement guncelle;

    @FindBy(xpath = "//body[1]/div[5]/div[1]/div[2]/button[2]/span[1]")
    public WebElement ony;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]/div[1]/input[1]")
    public WebElement filtre;


    @Test
    public void testRaporYetkilileri() throws Exception {
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

        } catch (Exception e) {
            Logger.warn("Yönetim paneli butonuna tıklanamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(Rol));

        System.out.println("Admin Panele girildi.");


        Fwait.until(ExpectedConditions.visibilityOf(Rol));

        System.out.println("Admin Panele girildi.");


        try {
            RaporYetkilileri.click();

        } catch (Exception e) {
            Logger.warn("Rapor Yetkililerine giriş yapıldı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(guncelle));

        System.out.println("Admin Panele girildi.");

        try {
            filtre.sendKeys("HAVA");
            Thread.sleep(1000);
            edit1.click();
//            unvan.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
//            unvan.sendKeys("CUMHURBAŞKANI BAŞBAKAN");
//            Thread.sleep(2000);
//            check.click();

        } catch (Exception e) {
            Logger.warn("Unvan Guncellenemedi.");
        }

//        Fwait.until(ExpectedConditions.visibilityOf(guncelle));
        Thread.sleep(2000);


        try {
//            filtre.sendKeys("HAVA");
//            edit1.click();
            unvan.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Thread.sleep(1000);
            unvan.sendKeys("CUMHURBAŞKANI BAŞBAKAN");
            Thread.sleep(1000);
            check.click();

        } catch (Exception e) {
            Logger.warn("Unvan Guncellenemedi.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(guncelle));

        System.out.println("Unvan Guncellendi.");


        try {
            guncelle.click();
            Fwait.until(ExpectedConditions.visibilityOf(ony));
            ony.click();
            Thread.sleep(3000);
        } catch (Exception e) {
            Logger.warn("Rapor Yetkililerine giriş yapıldı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(guncelle));

        System.out.println("Unvan güncellemesi tamamlandı.");


        try {
            filtre.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            filtre.sendKeys("cu");
            Thread.sleep(1500);
            edit1.click();


        } catch (Exception e) {
            Logger.warn("Rapor Yetkililerine giriş yapıldı.");
        }

//        Fwait.until(ExpectedConditions.visibilityOf(guncelle));

        System.out.println("Adi değişimi için filtreleme yapıldı.");

        try {
            adi.click();
            adi.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            adi.sendKeys("Mert ŞEN");
            Thread.sleep(2500);
            check.click();
            guncelle.click();

            Fwait.until(ExpectedConditions.visibilityOf(ony));
            ony.click();

        } catch (Exception e) {
            Logger.warn("Rapor Yetkililerine giriş yapıldı.");
        }

        Thread.sleep(1500);


        Fwait.until(ExpectedConditions.visibilityOf(guncelle));


        try {
            filtre.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Thread.sleep(1500);
            filtre.sendKeys("cu");
            Thread.sleep(1500);
            edit1.click();
            Thread.sleep(1500);

        } catch (Exception e) {
            Logger.warn("İkinci filtre yapılamadı.");
        }
        Thread.sleep(1500);

//        Fwait.until(ExpectedConditions.visibilityOf(unvan));


        try {
            unvan.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            unvan.sendKeys("HAVAALANLARI DAİRE BAŞKANI");
        } catch (Exception e) {
            Logger.warn("Unvan düzeltilemedi.");
        }

        System.out.println("Unvan düzeltildi.");
        Thread.sleep(2000);
        http://demo.basarsoft.com.tr/Gfk/turkey/web50/Login
        try {
            adi.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            adi.sendKeys("MEHMET SALİH YALÇIN");
        } catch (Exception e) {
            Logger.warn("Adı düzeltilemedi.");
        }
        System.out.println("Adı düzeltildi.");

        try {
            check.click();
            Thread.sleep(1500);
            guncelle.click();
            ony.click();

        } catch (Exception e) {
            Logger.warn("Unvan düzeltilemedi.");
        }
        System.out.println("Test bitti");

    }

}
