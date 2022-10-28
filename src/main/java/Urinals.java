/*
@author: Yashkumar Maheshwari
 */
import java.io.*;
import java.util.*;

public class Urinals {
    ArrayList<String> inputs = new ArrayList<>();
    public static void main(String[] args){

    }
    public Boolean openFile(String path) {
        try {
            File file = new File(path);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String data;
            while ((data = br.readLine()) != null){
                if(data.equals("EOF") || data.equals("-1")) {
                    break;
                }
                inputs.add(data);
            }
            br.close();
            return true;
        }
        catch (FileNotFoundException E){
            return false;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Boolean goodString( String str ) { // checks to see if valid string
        return str != null;
    }

    public Boolean validInput( String str){ // check if input is in 0 and 1 format
        boolean flag = true;
        for(int i = 0;i<str.length();i++){
            if (str.charAt(i) != '0' && str.charAt(i) != '1'){
                flag = false;
            }
        }
        return flag;
    }


}
