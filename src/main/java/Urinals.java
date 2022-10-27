/*
@author: Yashkumar Maheshwari
 */
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Urinals {
    public static void main(String[] args){

    }
    public String openFile() throws FileNotFoundException {
        String data = null;
        File myObj = new File("src/data.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
        return data;
    }

    public Boolean goodString( String str ) { // checks to see if valid string
        return str != null;
    }
}
