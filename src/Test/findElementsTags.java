package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsTags {
//element tags
	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swapnil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		
		List <WebElement> linksList= driver.findElements(By.tagName("a"));
		
		System.out.println(linksList.size());
		for(int i=0; i<linksList.size(); i++){
			System.out.println(linksList.get(i).getText());
			
			/*String linkText=linksList.get(i).getText();
			//Thread.sleep(5000);
		if(linkText.equals("Your Amazon.com"));
			{
				linksList.get(i).click();
				break;
			}*/
		}
		//System.out.println("total links are: " + linksList.size());*/

	}

}
