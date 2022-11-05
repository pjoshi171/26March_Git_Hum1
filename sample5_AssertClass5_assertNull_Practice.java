package Verification_Assertion;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sample5_AssertClass5_assertNull_Practice 
{
	@Test
	public void assertNull() throws EncryptedDocumentException, IOException 
	{
	        FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Desktop\\26March Selenium\\26Mar Eve.xlsx");
	        Cell actResult = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0);
	        
	        
	       Assert.assertNull(actResult,"actResult is not null");
	}
}
