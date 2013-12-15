/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ndaley
 */
public class CSVTextFileConverter implements TextFileConverter{
    private BufferedReader bufferedReader;
    private List<HashMap> recordsListOfMaps = new ArrayList<HashMap>();
    private List<String> recordsListOfStrings = new ArrayList<String>();
    
    @Override
    public List<HashMap> convertFileToListOfMaps(File f) throws IOException{
        try {
            bufferedReader = new BufferedReader(new FileReader(f));
            String temp = bufferedReader.readLine();
            Map map = new HashMap();
            String[] properties = new String[8];
            properties = temp.split(",");
            String key = "";
            String value = "";
            for(int i = 0; i < properties.length; i++){
                String[] temp2 = new String[2];
                temp2 = properties[i].split("=");
                key = temp2[0];
                value = temp2[1];
                map.put(key, value);
            }
            recordsListOfMaps.add((HashMap)map);
            temp = bufferedReader.readLine();
            
            while(temp != null){
                map = new HashMap();
                properties = temp.split(",");
                key = "";
                value = "";
                for(int i = 0; i < properties.length; i++){
                    String[] temp2 = new String[2];
                    temp2 = properties[i].split("=");
                    key = temp2[0];
                    value = temp2[1];
                    map.put(key, value);
                }
                recordsListOfMaps.add((HashMap)map);
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

        return recordsListOfMaps;
    }

    @Override
    public List<String> convertFileToListOfStrings(File f) throws IOException {
        try {
            bufferedReader = new BufferedReader(new FileReader(f));
            String temp = bufferedReader.readLine();
            
            while(temp != null){
                recordsListOfStrings.add(temp);
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
        
        return recordsListOfStrings;
    }
    
}
