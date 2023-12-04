package TestRunner;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Setup;
import Screens.Landingscrn;

public class TestRnr extends Setup {
    Landingscrn Lpage;
    
    @BeforeTest
    public void okbtn() throws InterruptedException {
        Lpage=new Landingscrn(driver);

        Thread.sleep(1000);
        Lpage.popupBTN.click();
        System.out.println("STEP:-1 click on popup OK button");
        Thread.sleep(1000);
    }
    @Test(priority = 1,description = "Clicked on chrome icon")
    public void chromeicon() throws InterruptedException {
        Lpage=new Landingscrn(driver);
       Lpage.clickonchrome();
       System.out.println("STEP:-2 Tap on Chrome ICON");
    }

    @Test(priority = 2, description = "dptdwn")
    public void dropdownbtn() throws InterruptedException{
        Lpage = new Landingscrn(driver);
        Lpage.clickdropdwn();
        System.out.println("STEP:-3 tap on drop down button ");
      

    }
    @Test(priority =3 ,  description ="tapdemo")
    public void taphello() throws InterruptedException  {
        Lpage = new Landingscrn(driver);
        Lpage.taphellobtn();
        System.out.println("STEP:-4 tap on hello demo ");
      

    }

    @Test(priority =4 ,  description ="textname")
    public void textname() throws InterruptedException{
        Lpage = new Landingscrn(driver);
        Lpage.textname();
        System.out.println("STEP:-5 typed name");
        
    }

    @Test(priority =5 ,  description ="dtndwn")
    public void selectdropdwnbtn() throws InterruptedException{
        Lpage = new Landingscrn(driver);
        Lpage.selectdropdwnbtn();
        System.out.println("STEP:-6 select drop down");
   
    }
    @Test(priority =6 ,  description ="tap merceds")
    public void tapmercedes() throws InterruptedException{
        Lpage=new Landingscrn(driver);
        Lpage.tapmercedes();
        System.out.println("STEP:-7 select mercedes");
        Thread.sleep(2000);
    }

    @Test(priority =7, description="submited")
    public void submit() throws InterruptedException{
        Lpage = new Landingscrn(driver);
        Lpage.submit();
        System.out.println("STEP:-8 submitted");
        

        
    }




}
