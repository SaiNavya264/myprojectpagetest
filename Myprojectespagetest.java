import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myprojectespagetest {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\saina\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qamyprojects.ccbp.tech/");

        WebElement image1=driver.findElement(By.xpath("//div[@class='my-projects-home-page']//div[1]//img[1]"));
        image1.click();
        System.out.println(driver.findElement(By.className("advanced-technologies-title")).getText());
        System.out.println(driver.findElement(By.className("advanced-technologies-description")).getText());
        driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

        WebElement image2=driver.findElement(By.xpath("//div[@class='my-projects-home-page']//div[1]//img[2]"));
        image2.click();

        System.out.println(driver.findElement(By.className("diwali-card-name")).getText());
        System.out.println(driver.findElement(By.className("diwali-card-price")).getText());

        System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Diwali - Lamp']")).getText());
        System.out.println(driver.findElement(By.xpath("//p[normalize-space()='Rs 50']")).getText());

        System.out.println(driver.findElement(By.xpath("(//h1[normalize-space()='Sparklers'])[1]")).getText());
        System.out.println(driver.findElement(By.xpath("(//p[normalize-space()='Rs 150'])[1]")).getText());

        System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Fire Cracker']")).getText());
        System.out.println(driver.findElement(By.xpath("//p[normalize-space()='Rs 560']")).getText());

        driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

        WebElement image3=driver.findElement(By.xpath("(//img[@class='my-project-image'])[3]"));
        image3.click();

        System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Happy Meals']")).getText());
        System.out.println(driver.findElement(By.xpath("//p[@class='order-card-paragraph']")).getText());
        driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();

        WebElement image4=driver.findElement(By.xpath("(//img[@class='my-project-image'])[4]"));
        image4.click();
        System.out.println(driver.findElement(By.xpath("(//p[@class='news-category'])[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'All educational institutions in Assam to reopen fr')]")).getText());
        System.out.println(driver.findElement(By.xpath("//p[@class='news-description']")).getText());

        driver.findElement(By.xpath("//button[normalize-space()='Back']")).click();
        driver.quit();









    }
}

