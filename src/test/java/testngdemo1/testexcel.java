package testngdemo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class testexcel {
  @Test
  public void readdats () throws IOException {
	  File scr=new File("C:\\seleniumexcel.xlsx");
	  FileInputStream fis=new  FileInputStream(scr);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sheet1=wb.getSheetAt(0);
	  String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
	  System.out.println("Data from excel is:"+data0);
	  String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
	  System.out.println("Data from excel is:"+data1);
	  sheet1.getRow(0).getCell(0).setCellValue("pass"); 
	  sheet1.getRow(1).getCell(0).setCellValue("fail");
	
	FileOutputStream fo=new FileOutputStream(scr);
	  wb.write(fo);
  }
}
