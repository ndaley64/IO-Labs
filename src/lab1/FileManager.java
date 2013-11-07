package lab1;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ndaley
 */
public class FileManager {
    private FileInput input;
    private FileOutput output;
    
    public FileManager(FileInput input, FileOutput output){
        setInput(input);
        setOutput(output);
    }

    public void setInput(FileInput input) {
        this.input = input;
    }

    public void setOutput(FileOutput output) {
        this.output = output;
    }
    
    public List<String> inputFile(String filePath){
        List list = null;
        try {
            list = input.inputFile(filePath);
        } catch (IOException ex) {
            System.err.println("Error in File Manager somehow!");
        }
        
        return list;
    }
}
