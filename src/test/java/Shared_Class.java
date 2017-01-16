import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Tania Rimy on 1/2/2017.
 */


public class Shared_Class implements Webelement_Repository{

    public WebDriver driver;
    public String baseUrl;


    // Launch the browser and navigated to the destination page
    public void setup_Launch_Browser()
    {

        System.setProperty("webdriver.gecko.driver", "C:\\G\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\S\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseUrl = "https://stage-ea.starfishsolutions.com/starfish-stageEA/support/login.html";
//        baseUrl = "https://trunk.ssbbartgroup.com/public/reporting/view_modules.php?report_id=192587";
        driver.get(baseUrl);
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


    //log in to St@rfish
    public void logIn(String ID, String pass)
    {

        driver.findElement(By.id("username")).sendKeys(ID);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.xpath("//button[@type='button' and contains(text(), 'Login')]")).click();
    }


    //defined wait
    public void Delay(int duration)
    {
        try {
            Thread.sleep(duration);
        }catch(Exception e){}
    }


    //wait untill showing of any web element
    public void wait_untill(By by)
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }


    //print function
    public void print(String item)
    {
        System.out.println(item);
    }


    //header tab navigation and showing the confirmation message of successful navigation
    public void topTabNavigation(String tabNameWebElement, String tabName)
    {
        driver.findElement(By.xpath(tabNameWebElement)).click();
        Delay(2000);
        confirmNavigationByTab(tabName);
    }


    //navigating to admin submenu and showing the confirmation message of successful navigation
    public void navigateAdminSubmenu(String menu, String submenu, String submenuTitle)
    {
        if(elementCheck(By.id(id_submenu_notetypes)) == 1)
            driver.findElement(By.id(id_submenu_notetypes)).click();
        else
        {
            wait_untill(By.xpath(xpath_menu_feature_configuration));
            driver.findElement(By.xpath(xpath_menu_feature_configuration)).click();
            driver.findElement(By.id(id_submenu_notetypes)).click();
        }
        driver.findElement(By.xpath(xpath_menu_feature_configuration)).click();
        if(elementCheck(By.xpath(submenuTitle)) == 1)
            print("Navigation Successfully Done!!");
        else
            print("Navigation not Done!!");
    }


    //checking if any webelement is present or not
    public int elementCheck(By by)
    {

        WebElement display = driver.findElement(by);
//        System.out.println(display);
        if (display.isDisplayed()==true) return 1;
        else return 0;
    }


    //giving confirmation message by the TAB text
    public void confirmNavigationByTab(String item)
    {
        if(driver.getTitle().contains(item))
            print("Navigation Successfully Done!!");
        else
            print("Navigation not Done!!");
    }

}
