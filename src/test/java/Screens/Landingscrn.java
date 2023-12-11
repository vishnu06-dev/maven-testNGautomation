package Screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Landingscrn {
    @FindBy(id="com.android.permissioncontroller:id/continue_button")
    public WebElement continuebtn ;
    @FindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
    public WebElement popupBTN;
    @FindBy(id = "io.selendroid.testapp:id/buttonStartWebview")
    public WebElement chromeicon;
    @FindBy(id = "io.selendroid.testapp:id/spinner_webdriver_test_data")
    public WebElement dropdownbtn;
    @FindBy(id = "android:id/text1")
    public WebElement taphellodemo ;
    @FindBy(xpath = "//android.widget.EditText[@resource-id='name_input']")
    public WebElement textname;
    @FindBy(xpath = "//android.view.View[@text='Volvo']")
    public WebElement selectdropdwn;
    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Mercedes']")
    public WebElement selectmercedes;
    @FindBy(xpath = "//android.widget.Button[@text='Send me your name!']")
    public WebElement submitted;
   
    AndroidDriver driver;

    public Landingscrn(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickonchrome() throws InterruptedException {
//        btnDone.click();
       chromeicon.click();
        Thread.sleep(2500);
    }

    public void clickdropdwn() throws InterruptedException{
        dropdownbtn.click();
        Thread.sleep(2000);
    }
    public void taphellobtn() throws InterruptedException{
        taphellodemo.click();
        Thread.sleep(2000);

    }

    public void textname() throws InterruptedException{
        textname.click();
        textname.sendKeys("vishnu");
        Thread.sleep(2000);
    }

    public void selectdropdwnbtn() throws InterruptedException{
        selectdropdwn.click();
        Thread.sleep(2000);
    }
    
    public void tapmercedes () throws InterruptedException{
    selectmercedes.click();
    Thread.sleep(2000);
    }

    public void submit() throws InterruptedException{
    submitted.click();
    Thread.sleep(2000);

    }
}