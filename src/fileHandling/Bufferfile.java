package fileHandling;

import java.io.*;

public class Bufferfile {
    public static void main(String[] args) {
        File file=new File("sample.txt");
        try{
            if(file.createNewFile()){
                System.out.println("file created successfully");
            }else {
                System.out.println("file exists already");
            }
        }catch (Exception e){ //IOException
            System.out.println(e);
        }

        //Buffer writer
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter("sample.txt"));
            bw.write("good evening");
            bw.newLine();
            bw.append("hello buddy!!");
            bw.close();
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            BufferedReader br=new BufferedReader(new FileReader("sample.txt"));
            String line;   // it will read line by line
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

}

