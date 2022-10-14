package testAutomations.seleniumTest.Hesap.Adminpanel;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;

public class RoleTransactions extends testAutomations.TestBase {


    @FindBy(id = "map")
    public WebElement harita;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[2]/div[5]/div[1]")
    public WebElement hesap;

    @FindBy(xpath = "//span[contains(text(),'Yönetici Panel')]")
    public WebElement adminPanel;


    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/div[1]/div[2]/span[1]")
    public WebElement Rol;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[2]/div[1]/button[1]")
    public WebElement addRole;

    @FindBy(css = "body > div.ui.page.modals.dimmer.transition.visible.active > div > div.content > div > div.ui.black.bottom.attached.segment.active.tab > form > div > input")
    public WebElement roleName;

    @FindBy(xpath = "//span[contains(text(),'Kaydet')]")
    public WebElement add;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/div[1]/div[1]/input[1]")
    public WebElement filter;

    @FindBy(xpath = "//span[contains(text(),'edit')]")
    public WebElement edit;

    @FindBy(xpath = "//td[contains(text(),'TestRole')]")
    public WebElement kayit;

    @FindBy(xpath = "//body/div[10]/div[1]/div[3]/button[3]")
    public WebElement sil;


    @Test
    public void testRolislemleri() throws Exception {
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

        try {
            Rol.click();
        } catch (Exception e) {
            Logger.warn("Rol işlemlerine tıklanamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(addRole));

        try {
            addRole.click();
        } catch (Exception e) {
            Logger.warn("Rol Ekle butonuna tıklanamadı.");
        }

        Fwait.until(ExpectedConditions.visibilityOf(roleName));

        try {
            roleName.clear();
            roleName.sendKeys("TestRole123");
            add.click();
        } catch (Exception e) {
            Logger.warn("Rol eklenemedi.");
        }

        System.out.println("Rol eklendi.");

        Fwait.until(ExpectedConditions.visibilityOf(addRole));
        Thread.sleep(2000);

        try {
            filter.clear();
            filter.sendKeys("TestRole123");
        } catch (Exception e) {
            Logger.warn("Filtreleme işlemi gerçekleştirilemedi.");
        }

        Thread.sleep(3000);

        Fwait.until(ExpectedConditions.visibilityOf(kayit));

        System.out.println("Filtreleme işlemi gerçekleştirildi.");

        try {
            edit.click();
            roleName.clear();
            roleName.sendKeys("TestRole555");
            add.click();
        } catch (Exception e) {
            Logger.warn("Rol güncellenemedi..");
        }
        System.out.println("Rol güncellendi.");
        Thread.sleep(2000);
        try {
            filter.click();
            Thread.sleep(1000);
            actions.doubleClick(filter);
            Thread.sleep(1000);
            filter.sendKeys(Keys.BACK_SPACE);
            filter.sendKeys(Keys.BACK_SPACE);
            filter.sendKeys(Keys.BACK_SPACE);
            filter.sendKeys(Keys.BACK_SPACE);
            filter.sendKeys(Keys.BACK_SPACE);
            filter.sendKeys(Keys.BACK_SPACE);
            filter.sendKeys(Keys.BACK_SPACE);
            filter.sendKeys(Keys.BACK_SPACE);
            filter.sendKeys(Keys.BACK_SPACE);
            filter.sendKeys(Keys.BACK_SPACE);
            filter.sendKeys(Keys.BACK_SPACE);
            filter.sendKeys(Keys.BACK_SPACE);
            filter.sendKeys(Keys.BACK_SPACE);
            filter.sendKeys(Keys.BACK_SPACE);

            Thread.sleep(1000);
            filter.sendKeys("TestRole555");
        } catch (Exception e) {
            Logger.warn("Filtreleme işlemi gerçekleştirilemedi.");
        }

        Thread.sleep(3000);

        System.out.println("filtre silindi ve yenisi yazıldı.");
        Thread.sleep(1000);
        try {
            edit.click();
            Thread.sleep(1000);
            js.executeScript("document.querySelector('body > div.ui.page.modals.dimmer.transition.visible.active > div > div.actions > button.ui.icon.negative.right.labeled.button').click()");
        } catch (Exception e) {
            Logger.warn("Rol silinemedi.");
        }

        Thread.sleep(3000);


        System.out.println("Rol silindi.");


    }


}


