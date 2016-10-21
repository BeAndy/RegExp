import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrew on 10/21/2016.
 */
public class Reader {
    public static List<String> readFile(String way) throws IOException {
        BufferedReader fin = new BufferedReader(new FileReader(new File(way)));
        String line;
        List <String> itemsList=new ArrayList<String>();
        while ((line = fin.readLine()) != null)
            itemsList.add(line);
        fin.close();
        return itemsList;
    }
}
