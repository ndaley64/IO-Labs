package lab1;

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
        
        List<String> list = new ArrayList<String>(fileManager.inputFile(filePath));
        
        for(String s : list){
            System.out.println(s);
        }
        
        String record = fileManager.getRecord(filePath, 2);
        System.out.println("");
        System.out.println("Record 2: ");
        System.out.println(record);
        
        System.out.println("");
        System.out.println("Adding a record to the file!");
        fileManager.addRecord(filePath, "Bond, James, 007 Agent Ave, Nowhere, NA, 00007, bond007@gmail.com, 1-007-007-007");
        
        System.out.println("");
        System.out.println("Printing new appended file!");
        
        list.addAll(fileManager.inputFile(filePath));
        
//        for(String s : list){
//            System.out.println(s);
//        }
        
    }
}
