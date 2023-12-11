package Base;

import io.appium.java_client.android.AndroidDriver;
import utilitys.capturingutility;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Setup {
    public AndroidDriver driver;
    //public static final String PACKAGE_ID="com.amazon.mShop.android.shopping";
    @BeforeTest
    public AndroidDriver setUp() throws MalformedURLException {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("deviceName","DAQWOJZ99SV87LZL");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","11");
        cap.setCapability("automationName","uiautomator2");
        cap.setCapability("appPackage","io.selendroid.testapp");
        cap.setCapability("appActivity","io.selendroid.testapp.HomeScreenActivity");
        String appURL = System.getProperty("user.dir")+ File.separator + "app" + File.separator + "selendroid-test-app.apk";
        cap.setCapability("app", appURL);
        //cap.setCapability("appPackage","com.amazon.mShop.android.shopping");
        //cap.setCapability("appActivity","com.amazon.mShop.splashscreen.StartupActivity");
        //cap.setCapability("autoGrantPermissions",true);
        URL url=new URL("http://127.0.0.1:4723/");
        driver=new AndroidDriver(url,cap);
        return driver;
    }
   @AfterMethod
    public void screenShot(ITestResult result){
        if(ITestResult.FAILURE==result.getStatus()){
            try{
                 capturingutility utils=new   capturingutility();
                utils.takeScreenshotForFailure(driver);
            }
            catch (Exception exception){
                System.out.println(exception.toString());
            }
        }
        else{
            try{
                capturingutility utils=new   capturingutility();
                utils.takeScreenshotForSuccess(driver);
            }
            catch (Exception exception){
                System.out.println(exception.toString());
            }
        }
    }

    @AfterTest
    public void close(){
        driver.quit();
    }
}
