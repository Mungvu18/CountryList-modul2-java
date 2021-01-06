import sun.plugin.javascript.navig.Link;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadWirterFileCountry {
    public static void main(String[] args) {
        File file = new File("D:\\modul2-java\\week3-IO\\Read-And-write-file-modul2-java\\src\\csv.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader= null;
        try{
          fileReader = new FileReader(file);
          bufferedReader = new BufferedReader(fileReader);
          String line = null;
          List<String> listCountry = new ArrayList<>();
            while ((line=bufferedReader.readLine())!=null){
                String[] string = line.split(",");
                String country = string[string.length-1];
                listCountry.add(country);
            }
            System.out.println("Danh sách các quốc gia là");
            System.out.println(listCountry);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e){}
        }
    }
}
