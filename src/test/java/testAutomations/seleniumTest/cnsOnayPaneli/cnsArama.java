package testAutomations.seleniumTest.cnsOnayPaneli;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class cnsArama extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;


    @FindBy(xpath = "//span[contains(text(),'Hesap')]")
    public WebElement hesapBtn;



    @FindBy(xpath = "//span[contains(text(),'CNS Onay Paneli')]")
    public WebElement cnsOnayPanelBtn;

    @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/div[1]/div[1]")
    public WebElement onayDurumuBtn;

    @FindBy(xpath = "//input[@id='search-tree-data']")
    public WebElement cnsAramaBtn;


    @FindBy(xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li[1]/span[1]")
    public WebElement ilkEklemeBtn;


    @FindBy(xpath = "//body/div[@id='menu-']/div[1]")
    public WebElement boslugatikla;

    @FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/div[1]/div[1]")
    public WebElement islemTipi;

    @FindBy(xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li[1]/span[1]")
    public WebElement olusturBtn;







    @Test
    public void testcnsArama() throws Exception {
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
            Fwait.until(ExpectedConditions.visibilityOf(cnsOnayPanelBtn));
            cnsOnayPanelBtn.click();

        }catch(Exception e){
            Logger.warn("Cns Onay Paneline Tıklanmadı .");
        }


        try{
            Fwait.until(ExpectedConditions.visibilityOf(cnsAramaBtn));
            cnsAramaBtn.click();
            cnsAramaBtn.sendKeys("MARKER_200");

        }catch(Exception e){
            Logger.warn("Cns  arama butonuna  tıklanmadı ve filtreleme yapılamadı.");
        }
        Thread.sleep(3000);



        try {
            Fwait.until(ExpectedConditions.visibilityOf(onayDurumuBtn));
            onayDurumuBtn.click();
        }catch(Exception e){
            Logger.warn("Onay durumu filtresine tıklanmadı.");
        }


        try {
            Fwait.until(ExpectedConditions.visibilityOf(ilkEklemeBtn));
            ilkEklemeBtn.click();
//            js.executeScript("document.querySelector('#menu- > div.MuiPaper-root.MuiMenu-paper.MuiPopover-paper.MuiPaper-elevation8.MuiPaper-rounded > ul > li:nth-child(1) > span.MuiButtonBase-root.MuiIconButton-root.jss20.MuiCheckbox-root.MuiCheckbox-colorSecondary.MuiIconButton-colorSecondary > span.MuiIconButton-label > input').click()");
        }catch(Exception e){
            Logger.warn("İlk ekleme filtresine tıklanmadı.");
        }


        try {
            Fwait.until(ExpectedConditions.visibilityOf(boslugatikla));
            boslugatikla.click();
        }catch(Exception e){
            Logger.warn("Boşluğa tıklanmadı.");
        }


        try {
            Fwait.until(ExpectedConditions.visibilityOf(islemTipi));
            islemTipi.click();
        }catch(Exception e){
            Logger.warn("İşlem tipi filtresine tıklanmadı.");
        }

        Thread.sleep(3000);

        try {
            Fwait.until(ExpectedConditions.visibilityOf(olusturBtn));
            olusturBtn.click();
        }catch(Exception e){
            Logger.warn("Oluştur filtresine tıklanmadı.");
        }


        try {
            Fwait.until(ExpectedConditions.visibilityOf(boslugatikla));
            boslugatikla.click();
        }catch(Exception e){
            Logger.warn("Oluştur filtresine tıklanmadı.");
        }






        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
