import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class FileReader {

    @Test(enabled = false)
    public static void pdfFileReader() throws IOException
    {
        FileInputStream fileInputStream=new FileInputStream("C://Users//ankumbar//Downloads//MayMonth payslip.pdf");
        PDDocument pdDocument=PDDocument.load(fileInputStream);
        PDFTextStripper pdfTextStripper=new PDFTextStripper();
        String Data = pdfTextStripper.getText(pdDocument);
        System.out.println(Data.contains("121442"));
    }
    @Test(enabled = false)
    public static void fileExtentionReader() throws IOException
    {
        File file=new File("C://Users//ankumbar//Downloads//MayMonth payslip.pdf");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getTotalSpace());

    }
    @Test(enabled = true)
    public static void excelFileReader() throws IOException
    {
        try
        {
            File fis = new File("C://Users//ankumbar//Downloads//Interview Feedback.xlsx");

            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object
            Iterator<Row> itr = sheet.iterator();    //iterating over excel file
            System.out.println("Hello");
            while (itr.hasNext())
            {
                Row row = itr.next();
                Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column
                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();
                    CellType cel = cell.getCellType();
                  //  System.out.println(cel);
                    switch (cell.getCellType())
                    {

                           case STRING:    //field that represents string cell type
                            System.out.print(cell.getStringCellValue() + "\t\t\t");
                            break;
                        case NUMERIC:    //field that represents number cell type
                            System.out.print(cell.getNumericCellValue() + "\t\t\t");
                            break;
                        default:
                    }
                }
                System.out.println("");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

