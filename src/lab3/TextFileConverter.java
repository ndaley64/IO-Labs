/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author ndaley
 */
public interface TextFileConverter {
    public abstract List<HashMap> convertFileToListOfMaps(File f) throws IOException;
    public abstract List<String> convertFileToListOfStrings(File f) throws IOException;
}
