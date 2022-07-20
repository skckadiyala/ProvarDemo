package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="ProvarSalesforce"
     )             
public class MyPageObject {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Accounts']")
	public WebElement accounts;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Opportunities']")
	public WebElement opportunities;
	@LinkType()
	@FindBy(xpath = "//one-app-nav-bar-menu-item/a[normalize-space(.)='Cases']")
	public WebElement cases;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Cases']")
	public WebElement cases1;
			
}
