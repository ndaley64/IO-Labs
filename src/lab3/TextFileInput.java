package lab3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ndaley
 */
public class TextFileInput implements FileInput{
    private TextFileConverter tfc;
    private List<String> lineListOfStrings = new ArrayList<String>();
    private List<HashMap> lineListOfMaps = new ArrayList<HashMap>();

    public TextFileInput(TextFileConverter tfc) {
        setTextFileConverter(tfc);
    }

    public void setTextFileConverter(TextFileConverter tfc) {
        this.tfc = tfc;
    }
    
    @Override
    public List<String> inputFileToListOfStrings(String filePath) {
        lineListOfStrings.clear();
        File file = new File(filePath);
        
        try{
            lineListOfStrings = tfc.convertFileToListOfStrings(file);
        } catch(IOException ioe){
            System.err.println("Error reading from file!");
        }
        
        return lineListOfStrings;
    }

    @Override
    public List<HashMap> inputFileToListOfMaps(String filePath) throws IOException {
        lineListOfMaps.clear();
        File file = new File(filePath);
        
        try{
            lineListOfMaps = tfc.convertFileToListOfMaps(file);
        } catch(IOException ioe){
            System.err.println("Error reading from file!");
        }
        
        return lineListOfMaps;
    }
            
}
