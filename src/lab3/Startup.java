package lab3;

import lab1.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ndaley
 */
public class Startup {
    public static void main(String[] args) {
        TextFileConverter textFileConverter = new CSVTextFileConverter();
        FileOutput fileOutput = new TextFileOutput();
        FileInput fileInput = new TextFileInput(textFileConverter);
        FileManager fileManager = new FileManager(fileInput, fileOutput);
        
        String filePath = File.separatorChar + "temp" + File.separatorChar + "addressBook.txt";
        
        List<String> lineList = new ArrayList<String>(fileManager.inputFile(filePath));
        
        for(String s : lineList){
            System.out.println(s);
        }
        
        String record = fileManager.getRecord(filePath, 2);
        System.out.println("");
        System.out.println("Record 2: ");
        System.out.println(record);
        
        System.out.println("");
        String street = fileManager.getPropertyFromRecord(filePath, 1, "Street");
        System.out.println("Record 2 Street:");
        System.out.println(street);
    }
}
