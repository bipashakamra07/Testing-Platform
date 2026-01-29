package StepsFile;
import ExcelRead.BrowserConfi;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	BrowserConfi bc= new BrowserConfi();
	
	@Before
	public void launch_hook() {
		bc.open_browser();
	}
	
	@After
	public void close_browser() {
		bc.quit_driver();
	
	}

}

