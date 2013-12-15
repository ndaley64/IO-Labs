package lab3;

import lab1.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 *
 * @author ndaley
 */
public class TextFileOutput implements FileOutput{

    @Override
    public void addLine(String filePath, String s) {
        boolean append = true;
        
        File file = new File(filePath);
	PrintWriter out = null;
        
	try{
            out = new PrintWriter(new BufferedWriter(new FileWriter(file, append)));
            out.println(s);
        }catch(IOException ioe){
            System.err.println("Error writing to file!");
        }finally{
            try{
                out.close();
            }catch(Exception e){
                System.err.println("Error closing PrintWriter!");
            }
        }
    }
    
}
