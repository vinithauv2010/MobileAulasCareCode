package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GenerateExtendReports {
	static ExtentReports extent;
	
	public static ExtentReports getExtentReport() {
		
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Aulas Mobile Automation Reports");
		reporter.config().setDocumentTitle("Mobile Test Results");
		
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester","Prabhakara BM");
		
		
		return extent;
		
	}

}
