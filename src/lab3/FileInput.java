/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ndaley
 */
public interface FileInput {
    public abstract List<String> inputFileToListOfStrings(String filePath) throws IOException;
    public abstract List<HashMap> inputFileToListOfMaps(String filePath) throws IOException;
}
