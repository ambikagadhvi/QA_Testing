package TESTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Add_to_cart_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/MonoBeach-Princess-Castle-Lights-Outdoor/dp/B07GCJ4F3W/ref=pd_ci_mcx_mh_ci_mcx_mr_mp_m_0?pd_rd_w=KWLQo&content-id=amzn1.sym.dd455c32-ea31-4d1b-8e49-d9944894e6dc&pf_rd_p=dd455c32-ea31-4d1b-8e49-d9944894e6dc&pf_rd_r=7WSRGB3JKS8GC2560AQ5&pd_rd_wg=LbVJA&pd_rd_r=069fba70-1224-44e3-92af-fa721bc49ff1&pd_rd_i=B07GCJ4F3W");
		
		
		WebElement qty = driver.findElement(By.id("quantity"));
		Select s= new Select(qty);
		
		s.selectByIndex(1);
		
		driver.findElement(By.id("add-to-cart-button")).click();

		String Actual = driver.findElement(By.id("nav-cart-count")).getText();
		System.out.println(Actual);
}
}