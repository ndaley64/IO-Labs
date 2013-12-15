/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ndaley
 */
public class CSVTextFileConverter implements TextFileConverter{
    private BufferedReader bufferedReader;
    private List<String> records = new ArrayList<String>();
    
    @Override
    public List<String> convertFileToMap(File f) throws IOException{
        try {
            bufferedReader = new BufferedReader(new FileReader(f));
            String temp = bufferedReader.readLine();
            
            while(temp != null){
                records.add(temp);
                temp = bufferedReader.readLine();
            }
        } catch (IOException ioe) {
            System.err.println("Error reading from file!");
        } finally{
            try{
                bufferedReader.close();
            } catch(Exception e){
                System.err.println("Error closing bufferedReader!");
            }
        }
        
        return records;
    }
    
}
