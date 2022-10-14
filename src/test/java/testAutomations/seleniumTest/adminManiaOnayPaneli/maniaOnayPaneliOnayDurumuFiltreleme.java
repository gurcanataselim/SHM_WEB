package testAutomations.seleniumTest.adminManiaOnayPaneli;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testAutomations.Kullanici;


public class maniaOnayPaneliOnayDurumuFiltreleme extends testAutomations.TestBase {
    private String baseUrl;
    private boolean acceptNextAlert = true;



    @FindBy(xpath = "//span[contains(text(),'Hesap')]")
    public WebElement hesapBtn;


    @FindBy(xpath = "//span[contains(text(),'Mania Planı Onay Paneli')]")
    public WebElement maniaPlanıOnayPaneliBtn;

    @FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/div[1]/div[1]")
    public WebElement onayDurumuBtn;

    @FindBy(xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li[1]/span[1]/span[1]")
    public WebElement ilkEklemeBtn;


    @FindBy(xpath = "//body/div[@id='menu-']/div[1]")
    public WebElement boslugatikla;




//    @FindBy(css ="#menu- > div.MuiPaper-root.MuiMenu-paper.MuiPopover-paper.MuiPaper-elevation8.MuiPaper-rounded > ul > li:nth-child(1) > span.MuiButtonBase-root.MuiIconButton-root.jss56.MuiCheckbox-root.MuiCheckbox-colorSecondary.MuiIconButton-colorSecondary > span.MuiIconButton-label > input")
//    public WebElement ilkEklemeBtn;

//





    @Test
    public void testmaniaOnayPaneliOnayDurumuFiltreleme() throws Exception {
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



        try {
            Fwait.until(ExpectedConditions.visibilityOf(onayDurumuBtn));
            onayDurumuBtn.click();
        }catch(Exception e){
            Logger.warn("Onay durumu filtresine tıklanmadı.");
        }

        try {
            Fwait.until(ExpectedConditions.visibilityOf(ilkEklemeBtn));
            ilkEklemeBtn.click();
        }catch(Exception e){
            Logger.warn("İlk ekleme filtresine tıklanmadı.");
        }


        try {
            Fwait.until(ExpectedConditions.visibilityOf(boslugatikla));
            boslugatikla.click();
        }catch(Exception e){
            Logger.warn("Boşluğa tıklanmadı.");
        }







        System.out.println("Test Tamamlandı!");
        Thread.sleep(3000);
    }
}
