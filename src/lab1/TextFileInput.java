package lab1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ndaley
 */
public class TextFileInput implements FileInput{
    private TextFileConverter tfc;
    private List<String> lineList = new ArrayList<String>();

    public TextFileInput(TextFileConverter tfc) {
        setTextFileConverter(tfc);
    }

    public void setTextFileConverter(TextFileConverter tfc) {
        this.tfc = tfc;
    }
    
    @Override
    public List<String> inputFile(String filePath) {
        lineList.clear();
        File file = new File(filePath);
        
        try{
            lineList = tfc.convertFileToMap(file);
        } catch(IOException ioe){
            System.err.println("Error reading from file!");
        }
        
        return lineList;
    }
            
}
