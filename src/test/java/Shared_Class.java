import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Tania Rimy on 1/2/2017.
 */


public class Shared_Class implements Webelement_Repository{

    public WebDriver driver;
    public String baseUrl;

    public void setup_Launch_Browser(){

        System.setProperty("webdriver.gecko.driver", "C:\\G\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\S\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseUrl = "https://stage-ea.starfishsolutions.com/starfish-stageEA/support/login.html";
//        baseUrl = "https://trunk.ssbbartgroup.com/public/reporting/view_modules.php?report_id=192587";
        driver.get(baseUrl);
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void logIn() {

        driver.findElement(By.id("username")).sendKeys("ygold");
        driver.findElement(By.id("password")).sendKeys("st@rfish");
        driver.findElement(By.xpath("//button[@type='button' and contains(text(), 'Login')]")).click();
    }

    public void Delay(int duration) {
        try {
            Thread.sleep(duration);
        }catch(Exception e){}
    }

    public void print(String item)
    {
        System.out.println(item);
    }

    public void topTabNavigation(String tabNameWebElement, String tabName)
    {
        driver.findElement(By.xpath(tabNameWebElement)).click();
        Delay(2000);
        confirmNavigationByTab(tabName);
    }

    public void navigateAdminSubmenu(String menu, String submenu, String submenuTitle)
    {
        if(isElementPresent(By.xpath(submenu)))
            driver.findElement(By.xpath(submenu)).click();
        else
        {
            driver.findElement(By.xpath(menu)).click();
            driver.findElement(By.xpath(submenu)).click();
        }
        driver.findElement(By.xpath(menu)).click();
        if(isElementPresent(By.xpath(submenuTitle)))
            print("Navigation Successfully Done!!");
        else
            print("Navigation not Done!!");

    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void confirmNavigationByTab(String item)
    {
        if(driver.getTitle().contains(item))
            print("Navigation Successfully Done!!");
        else
            print("Navigation not Done!!");
    }

}
