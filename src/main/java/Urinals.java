/*
@author: Yashkumar Maheshwari
 */
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Urinals {
    ArrayList<String> inputs = new ArrayList<>();
    public static void main(String[] args){

    }
    public Boolean openFile(String path) {
        try {
            String data;
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                inputs.add(data);
            }
            myReader.close();
            return true;
        }
        catch (FileNotFoundException E){
            return false;
        }
    }

    public Boolean goodString( String str ) { // checks to see if valid string
        return str != null;
    }

    public Boolean validInput( String str){ // check if input is in 0 and 1 format
        boolean flag = true;
        for(int i = 0;i<str.length();i++){
            System.out.println(str.charAt(i));
            if (str.charAt(i) != '0' && str.charAt(i) != '1'){
                flag = false;
            }
        }
        return flag;
    }
}
