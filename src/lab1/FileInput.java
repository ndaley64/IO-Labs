/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author ndaley
 */
public interface FileInput {
    public abstract List<String> inputFile(String filePath) throws IOException;
}
