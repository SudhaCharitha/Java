package Seleniumprograms;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class TestBase {
	
	int testCaseNo = 0;
	
	@AfterMethod
	public void getTestDetails(ITestResult result) throws IOException {
		
		testCaseNo++;
		
		if(result.getStatus()==ITestResult.FAILURE) {
			updateResult(result.getTestClass().getName(), testCaseNo, result.getName().toString(), "Fail");
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			System.out.println("Method Name: " + result.getName());
			updateResult(result.getTestClass().getName(), testCaseNo, result.getName().toString(), "Pass");
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			updateResult(result.getTestClass().getName(), testCaseNo, result.getName().toString(), "Skip");
		}
	}
	
	public void updateResult(String className, int testCaseNo, String methodName, String testCaseStatus) throws IOException {
		String startDateTime = new SimpleDateFormat("dd-MM-yyyy HH-mm").format(new GregorianCalendar().getTime());
		System.out.println("Date and Time: " + startDateTime);
		
		String resultFile = ".\\src\\Seleniumprograms\\Result.html";

		File file = new File(resultFile);
		System.out.println("File Exists: " + file.exists());
		
		if(!file.exists()) {
			System.out.println("Html tags");
			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("<html>"+"\n");
			bw.write("<head><title>" + "Test Report" + "</title>" + "\n");
			bw.write("</head>" + "\n");
			bw.write("<body>"+"\n");
			bw.flush();
			bw.close();
		}
		
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(file, true));
		
		if(testCaseNo==1) {
			bw1.write("<table align='center' border='1'>"+"\n");
			bw1.write("<tr bgcolor='green'>"+"\n");
			bw1.write("<th>S.No</th>");
			bw1.write("<th>Class Name</th>");
			bw1.write("<th>Test Name</th>");
			bw1.write("<th>Test Status</th>");
			bw1.write("</tr>"+"\n");
		}
		
		bw1.write("<tr>"+"\n");
		bw1.write("<td>" + testCaseNo + "</td>" );
		bw1.write("<td>" + className + "</td>" );
		bw1.write("<td>" + methodName + "</td>" );
		bw1.write("<td>" + testCaseStatus + "</td>" );
		bw1.write("</tr>"+"\n");
		bw1.flush();
		
		
		if(testCaseNo == 4) {
		bw1.write("</table"+"\n");
		bw1.write("</body>"+"\n");
		bw1.write("</html>");
		bw1.flush();
		bw1.close();
		}
	}

}
