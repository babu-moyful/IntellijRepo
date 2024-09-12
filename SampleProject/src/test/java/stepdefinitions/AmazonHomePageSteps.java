package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomePageSteps {

    WebDriver driver;

    @Given("user navigates to amazon homepage")
    public void homePage(){
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

    }

    @When("user enters the product name {string}")
    public void productname(String productname){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productname);

    }

    @And("user clicks on Search button")
    public void searchIcon(){
        driver.findElement(By.xpath("//input[@value='Go']")).click();

    }


    @Then("user verify the title of page")
    public void validateTitle(){
        System.out.println(driver.getTitle());
    }

}

