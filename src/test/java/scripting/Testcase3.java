package scripting;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CorejavaPage;
import pomPages.Skillraryloginpage;
import pomPages.WishlistPage;

public class Testcase3 extends BaseClass {
	
	@Test
	public void tc3() throws IOException, InterruptedException {
		Skillraryloginpage sl=new Skillraryloginpage(driver);
		sl.searchtextbox(pdata.getdata("coursename"));
		sl.searchbutton();
		
		CorejavaPage cp=new CorejavaPage(driver);
		cp.java();
		
		WishlistPage wp=new WishlistPage(driver);
		driverutilies.switchFrame(driver);
		wp.playbutton();
		Thread.sleep(10000);
		wp.pausebutton();
		driverutilies.switchbackframe(driver);
		wp.addttowishlistbtn();
	}
	

}
