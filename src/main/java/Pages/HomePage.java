package Pages;

import drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
       private final WebDriver driver;

       public HomePage(){
           driver = DriverSingleton.getDriver();
           PageFactory.initElements(driver,this);
       }

       @FindBy(css="#bs-example-navbar-collapse-1 > ul:nth-child(1) > li:nth-child(1) > a")
       private WebElement makeDepositLink;

       @FindBy(css = "#bs-example-navbar-collapse-1 > ul:nth-child(1) > li:nth-child(2) > a")
       private WebElement viewDepositslink;

       @FindBy(css = "#bs-example-navbar-collapse-1 > ul:nth-child(1) > li:nth-child(3) > a")
       private WebElement memberInfoLink;

       @FindBy(css = "#bs-example-navbar-collapse-1 > ul:nth-child(1) > li.dropdown > a")
       private WebElement productsLink;

       @FindBy(css = "#bs-example-navbar-collapse-1 > ul:nth-child(1) > li:nth-child(5) > a")
       private WebElement auditLogLink;

       @FindBy(css = "#bs-example-navbar-collapse-1 > ul:nth-child(1) > li:nth-child(6) > a")
       private WebElement updateProfileLink;
       
        @FindBy(css="#page-content-wrapper > div:nth-child(3) > div > div.panel.panel-heading.ysheading")
        private WebElement makeDepositTitle;

        @FindBy(css = "#page-content-wrapper > div:nth-child(4) > div > div.panel.panel-heading.ysheading")
        private WebElement manageDepositsTitle;

        @FindBy(css = "#page-content-wrapper > div:nth-child(4) > div > div.panel.panel-heading.ysheading")
        private WebElement documentsTitle;

        @FindBy(css = "#bs-example-navbar-collapse-1 > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(1) > a")
        private WebElement depositGroupLink;

        @FindBy(css = "#page-content-wrapper > div:nth-child(4) > div > div.panel.panel-heading.ysheading")
        private WebElement depositGroupTitle;

        @FindBy(css="#page-content-wrapper > div:nth-child(4) > div > div.panel.panel-heading.ysheading")
        private WebElement auditLogTitle;

        @FindBy(css = "#page-content-wrapper > div:nth-child(4) > div > div.panel.panel-heading.ysheading")
        private WebElement userTitle;



       // methods for the different webElements

      public void clickMakeDepositLink(){
          makeDepositLink.click();
      }

      public String getMakeDepositTitle(){
          return makeDepositTitle.getText();
      }
     // view deposits
      public void clickViewDepositsLink(){
          viewDepositslink.click();
      }

    public String getManageDepositsTitle(){
        return manageDepositsTitle.getText();
    }

    //memberInfo Link

    public void clickmemberInfoLink(){
        memberInfoLink.click();
    }

    public String getdocumentsTitle(){
        return documentsTitle.getText();
    }

    //productsLink
    public void clickproductsLink(){
        productsLink.click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(depositGroupLink));
        depositGroupLink.click();
    }

    public String getdepositGroupTitle(){
        return depositGroupTitle.getText();
    }

    // auditLogLink
    public void clickauditLogLink(){
        auditLogLink.click();
    }

    public String getauditLogTitle(){
        return auditLogTitle.getText();
    }

    //updateProfileLink
    public void clickupdateProfileLink(){
        updateProfileLink.click();
    }

    public String getuserTitle(){
        return userTitle.getText();
    }






}
