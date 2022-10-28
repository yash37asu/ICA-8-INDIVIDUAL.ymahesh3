/*
@author: Yashkumar Maheshwari
 */

import java.io.*;
import java.util.*;

public class Urinals {
    ArrayList<String> inputs = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("\n Urinal couting problem starts \n");
        String path = "urinal.dat";
        Urinals urinal = new Urinals();
        Boolean fileOpened = urinal.openFile(path);
        System.out.println("file opened: urinal.dat \nInput Arraylist generated!: "+ fileOpened);
        ArrayList<Integer> Results;
        Results = urinal.freeUrinals(urinal.inputs);
        System.out.println("Inputs validated \nOutput arraylist generated!");
        Boolean ruleCreated = urinal.writeToFile(Results);
        System.out.println("Output file generated at : rule.txt :"+ ruleCreated);
    }

    public Boolean openFile(String path) {
        try {
            File file = new File(path);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String data;
            while ((data = br.readLine()) != null) {
                if (data.equals("EOF") || data.equals("-1")) {
                    break;
                }
                inputs.add(data);
            }
            br.close();
            return true;
        } catch (IOException E) {
            return false;
        }
    }

    public Boolean emptyFile(String path){
        File file = new File(path);
        return file.length() == 0;

    }
    public Boolean goodString(String str) { // checks to see if valid string
        return str != null;
    }

    public Boolean validInput(String str) { // check if input is in 0 and 1 format
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public ArrayList<Integer> freeUrinals(ArrayList<String> input) {
        ArrayList<Integer> results = new ArrayList<>();
        Urinals urinal = new Urinals();
        for (int i = 0; i < input.size(); i++) {
            String str = input.get(i);
            int count = 0;
            int n = str.length();
            if (!urinal.goodString(str) || !urinal.validInput(str)) {
                count = -1;
                results.add(count);
                continue;
            }
            if (str.charAt(0) == '0' && str.charAt(1) == '0') {
                count++;
                StringBuilder chr = new StringBuilder(str);
                chr.setCharAt(0, '1');
                str = String.valueOf(chr);
            }

            for (int j = 1; j < n - 1; j++) {
                if (str.charAt(j - 1) == '0' && str.charAt(j + 1) == '0' && str.charAt(j) == '0') {
                    count++;
                    StringBuilder chr = new StringBuilder(str);
                    chr.setCharAt(i, '1');
                    str = String.valueOf(chr);
                }
            }
            for (int z = 0; z < n - 1; z++) {
                if (n > 1) {
                    if (str.charAt(z) == '1' && str.charAt(z + 1) == '1') {
                        count = -1;
                    }
                }
            }
            if (str.charAt(n - 1) == '0' && str.charAt(n - 2) == '0') {
                count++;
                StringBuilder chr = new StringBuilder(str);
                chr.setCharAt(n - 1, '1');
            }
            results.add(count);

        }
        return results;
    }

    public Boolean writeToFile(ArrayList<Integer> results) {
        int counter = 0;
        File file = new File("rule" +counter+".txt");
        try {
            if (file.createNewFile()) {
                FileWriter writer = new FileWriter(file);
                BufferedWriter addresult = new BufferedWriter(writer);
                for (Integer result : results) {
                    addresult.write(result + "");
                    addresult.newLine();
                }
                counter++;
                addresult.close();
                return true;
            } else {
                counter++;
                file = new File("rule"+counter+".txt");
                FileWriter writer = new FileWriter(file);
                BufferedWriter addresult = new BufferedWriter(writer);
                for (Integer result : results) {
                    addresult.write(result + "");
                    addresult.newLine();
                }
                addresult.close();
                return true;
            }
        } catch (IOException E) {
            return false;
        }
    }

}
