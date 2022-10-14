package testAutomations.seleniumTest.Hesap.Adminpanel;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;
import testAutomations.TestBase;


public class UsersTransactions extends TestBase {


    @FindBy(id = "map")
    public WebElement harita;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[5]/div[1]")
    public WebElement hesap;

    @FindBy(xpath = "//span[contains(text(),'Yönetici Panel')]")
    public WebElement adminPanel;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/div[1]/div[2]/span[1]")
    public WebElement Rol;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/div[2]/div[2]/span[1]")
    public WebElement Kullanicilar;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[2]/div[1]/button[1]")
    public WebElement kullaniciEkle;

    @FindBy(xpath = "//input[@id='outlined-basic-name']")
    public WebElement name;

    @FindBy(xpath = "//input[@id='outlined-basic-surname']")
    public WebElement surname;

    @FindBy(xpath = "//input[@id='outlined-basic-userName']")
    public WebElement nickName;

    @FindBy(xpath = "//input[@id='outlined-basic-eMail']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='standard-password-input']")
    public WebElement password;

    @FindBy(xpath = "//a[contains(text(),'Roller')]")
    public WebElement roller;

    @FindBy(xpath = "//td[contains(text(),'Admin')]")
    public WebElement admin;

    @FindBy(xpath = "//span[contains(text(),'Kullanıcıyı Kaydet')]")
    public WebElement kaydet;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]/div[1]/input[1]")
    public WebElement filtre;

    @FindBy(xpath = "//span[contains(text(),'edit')]")
    public WebElement edit;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/form[1]/div[1]/div[9]/button[1]/span[1]/span[1]")
    public WebElement update;

    @FindBy(id = "body")
    public WebElement body;


    @Test
    public void testUserTransactions() throws Exception {


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
        System.out.println("Admin panale girildi.");


        try {
            Kullanicilar.click();

        } catch (Exception e) {
            Logger.warn("Yönetim paneli butonuna tıklanamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(kullaniciEkle));
        System.out.println("Kullanıcılar penceresi açıldı.");


        try {
            kullaniciEkle.click();

        } catch (Exception e) {
            Logger.warn("Yönetim paneli butonuna tıklanamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(name));
        System.out.println("Kullanıcı ekleme penceresi açıldı.");


//        try {
//            name.click();
//            name.sendKeys("Test");
//            surname.clear();
//            surname.sendKeys("Test");
//            nickName.clear();
//            nickName.sendKeys("test.otomasyon");
//            email.clear();
//            email.sendKeys("test123@test.com");
//            password.clear();
//            password.sendKeys("Ms1234");
//        } catch (Exception e) {
//            Logger.warn("Kullanıcı bilgileri doldurulamadı.");
//        }

        try {
            name.click();
            name.clear();
            name.sendKeys("Test");

        } catch (Exception e) {
            Logger.warn("Yönetim paneli butonuna tıklanamadı.");
        }

        System.out.println("İsim girildi.");


        try {
            surname.clear();
            surname.sendKeys("Test");

        } catch (Exception e) {
            Logger.warn("Yönetim paneli butonuna tıklanamadı.");
        }

        System.out.println("Soyisim girildi.");


        try {
            nickName.clear();
            nickName.sendKeys("test.otomasyon" + randomLong);

        } catch (Exception e) {
            Logger.warn("Yönetim paneli butonuna tıklanamadı.");
        }

        System.out.println("Username girildi.");


        try {
            email.clear();
            email.sendKeys("test123" + randomLong, "@test.com");

        } catch (Exception e) {
            Logger.warn("Yönetim paneli butonuna tıklanamadı.");
        }

        System.out.println("E mail girildi.");


        try {
            password.clear();
            password.sendKeys("Ms1234");

        } catch (Exception e) {
            Logger.warn("Yönetim paneli butonuna tıklanamadı.");
        }

        System.out.println("Sifre girildi.");


        Thread.sleep(3000);
        try {
            roller.click();
            Thread.sleep(1500);
            admin.click();
        } catch (Exception e) {
            Logger.warn("Rol seçilemedi.");
        }

        System.out.println("Admin rolü seçildi.");


        try {
            kaydet.click();

        } catch (Exception e) {
            Logger.warn("Kullanıcı kaydedilemedi.");
        }
        Thread.sleep(2000);
        System.out.println("Kullanıcı kaydedildi.");


        String bodyText = driver.findElement(By.cssSelector("body")).getText();
        Assert.assertTrue("Text not found!", bodyText.contains("Kullanıcı Eklendi."));
        System.out.println("Ekleme kontrolü yapıldı.");


        Fwait.until(ExpectedConditions.visibilityOf(filtre));


        try {
            filtre.clear();
            filtre.sendKeys("test.otomasyon");
        } catch (Exception e) {
            Logger.warn("Filtreleme işlemi gerçekleştirilemedi.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(edit));
        Thread.sleep(2000);

        try {

            edit.click();

        } catch (Exception e) {
            Logger.warn("Düzenle butonuna tıklanamadı.");
        }
        Fwait.until(ExpectedConditions.visibilityOf(name));

        System.out.println("Edit pencersi açıldı.");


        try {
            name.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            name.sendKeys("Test123" + randomLong);


        } catch (Exception e) {
            Logger.warn("İsim değiştirilemedi.");
        }

        System.out.println("Isim Guncellendi.");


        try {
            update.click();

        } catch (Exception e) {
            Logger.warn("Güncelleme işlemi başarısız.");
        }

        System.out.println("Kaydet butonuna tıklandı.");


        Thread.sleep(1500);

        String bodyText1 = driver.findElement(By.cssSelector("body")).getText();
        Assert.assertTrue("Text not found!", bodyText1.contains("Kullanıcı başarı ile güncellendi."));

        System.out.println("Guncelleme kontrolu yapildi.");


        Thread.sleep(2000);


        System.out.println("Test bitti");

    }
}
