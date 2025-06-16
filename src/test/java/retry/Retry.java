package retry;//this class is for retrying failed class

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer //IRetryAnalyzer is an interface which has abstract class. this will execute 2 tyms. if limit is above 2 then it means error
{

	int counter = 0;
	int retryLimit = 2;

	public boolean retry(ITestResult result)//above 2 times means code fails
	{
		if (counter < retryLimit) {
			counter++;
			return true;
		}
		return false;
	}
	
	
}
