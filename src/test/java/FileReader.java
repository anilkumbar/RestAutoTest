import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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
    @Test(enabled = true)
    public static void fileExtentionReader() throws IOException
    {
        File file=new File("C://Users//ankumbar//Downloads//MayMonth payslip.pdf");
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getPath());

    }
    @Test(enabled = false)
    public static void excelFileReader() throws IOException
    {
        FileInputStream fileInputStream=new FileInputStream("C://Users//ankumbar//Downloads//MayMonth payslip.pdf");
        PDDocument pdDocument=PDDocument.load(fileInputStream);
        PDFTextStripper pdfTextStripper=new PDFTextStripper();
        String Data = pdfTextStripper.getText(pdDocument);
        System.out.println(Data.contains("KUMBAR ANIL ANNASAB"));
    }
}
