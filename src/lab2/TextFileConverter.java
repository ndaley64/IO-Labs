/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import lab1.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author ndaley
 */
public interface TextFileConverter {
    public abstract List<String> convertFileToMap(File f) throws IOException;
}
