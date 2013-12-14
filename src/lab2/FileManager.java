package lab2;

import lab1.*;
import java.io.IOException;
import java.util.List;

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
    
    public String getRecord(String filePath, int recordNumber){
        List list = null;
        String record = "";
        try {
            list = input.inputFile(filePath);
        } catch (IOException ex) {
            System.err.println("Error in File Manager somehow!");
        }
        
        if(recordNumber > list.size()){
            System.err.println("The text file does not contain that many records!");
        }else{
            record = (String)list.get(recordNumber - 1);
        }
        
        return record;
    }
    
    public void addRecord(String filePath, String record){
        output.addLine(filePath, record);
    }
}
