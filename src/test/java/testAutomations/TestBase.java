package testAutomations;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions; //3. olarak kontrol edilecek yer. İmport eklenmiş olmalı, bunu kontrol ediyoruz.
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;


/**
 * Created by Emre Örs
 * Selam Mert
 * Date : 22.04.2022
 */


public class TestBase extends TestCase {

    protected static WebDriver driver;
    protected static FluentWait<WebDriver> Fwait;
    protected static Actions actions; //1. eklenecek yer.
    protected  static long randomLong = ((long)((Math.random() * 1000)+1000));
    protected static final String SERVIS_ADRESI = "https://live.basarsoft.com.tr/mania/web/#/login";
    protected String servisAdresi = SERVIS_ADRESI;
    protected static final Logger Logger = LoggerFactory.getLogger(TestBase.class);
    protected JavascriptExecutor scroll;
    protected StringBuffer verificationErrors = new StringBuffer();
    ChromeOptions options = new ChromeOptions();

    boolean isHeadless = true;


    @Before
    public void setUp() throws IOException {
        Locale.setDefault(new Locale("tr", "TR"));

        if (isHeadless) {
            WebDriverManager.chromedriver().setup();
            driver = setup_localDriver(isHeadless);
        } else {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        Logger.info("setUp(servisAdresi=" + servisAdresi + ").");
        actions = new Actions(driver); //2. eklenecek yer
        Fwait =
                new FluentWait<WebDriver>(driver)
                        .withTimeout(Duration.ofSeconds(5))
                        .pollingEvery(Duration.ofSeconds(1))
                        .ignoring(NoSuchElementException.class);
        scroll = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        options.addArguments("-incognito");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-popup-blocking");
        Map<String, Object> prefs = new HashMap<String, Object>();
        Map<String, Object> profile = new HashMap<String, Object>();
        Map<String, Object> contentSettings = new HashMap<String, Object>();
        // SET CHROME OPTIONS
        // 0 - Default, 1 - Allow, 2 - Block
        contentSettings.put("notifications", 0);
        profile.put("managed_default_content_settings", contentSettings);
        prefs.put("profile", profile);
        options.setExperimentalOption("prefs", prefs);

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver.get(servisAdresi);
    }





    protected static WebDriver setup_localDriver(boolean isHeadless) {
        System.setProperty("webdriver.chrome.logfile", "chromedriver.log");
        System.setProperty("webdriver.chrome.verboseLogging", "false");

        ChromeOptions options = new ChromeOptions();
        if (isHeadless) {
            options.addArguments("--headless");
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1920,1080");
            options.addArguments("--disable-extensions");
        }

        options.setExperimentalOption("prefs", new HashMap<String, String>() {{put("intl.accept_languages", "tr,tr_TR");}});

        Logger.info("setup_localDriver("+(isHeadless?"headless":"head:real")+").");

        return new ChromeDriver(options);
    }

    public void kullaniciGirisYap(WebDriver driver, Kullanici kullanici){
        try{
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]")).clear();
            driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys(kullanici.getAd());
            driver.findElement(By.cssSelector("#root > div > div.bg > div > div:nth-child(3) > div:nth-child(2) > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-11 > div > div > input")).clear();
            driver.findElement(By.cssSelector("#root > div > div.bg > div > div:nth-child(3) > div:nth-child(2) > div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-11 > div > div > input")).sendKeys(kullanici.getSifre());
            driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[4]/button[1]")).click();
        }catch (Exception e){
            Logger.warn("Giriş Yapılamadı.!");
        }

    }
// Metod tanımlanıp sonrasında metod ismi ile direkt çağırılabilir.
//    public void MertinSuperMetodu(){
//        try{
//            driver.manage().window().maximize();
//
//            driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
//        }catch (Exception e){
//            Logger.warn("Giriş Yapılamadı.!");
//        }
//
//    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
