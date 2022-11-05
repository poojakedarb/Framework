package scripting;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.Addtocartpage;
import pomPages.SkillraryDemoLogin;
import pomPages.Skillraryloginpage;

public class Testcase1 extends BaseClass{
	
	@Test
	public void tcl() {
	Skillraryloginpage sl=new Skillraryloginpage(driver);
	sl.gearsbuttonbutton();
	sl.skillrarydemoapp();
	
	driverutilies.switchtabs(driver);
	
	SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
	driverutilies.mouseHover(driver,sd.getCoursetab());
	sd.seleniumtrainingbtn();
	
	Addtocartpage ad=new Addtocartpage(driver);
	driverutilies.doublrclick(driver,ad.getPlus());
	ad.cartbutton();
	driverutilies.alertpopup(driver);
	}
	

}
