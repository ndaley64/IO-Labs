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
    }
}
