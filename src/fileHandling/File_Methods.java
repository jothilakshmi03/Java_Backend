package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class File_Methods {
    public static void main(String[] args) {
        File file=new File("sample.txt");
//        try{
//            if(file.createNewFile()){
//                System.out.println("file created successfully");
//            }else {
//                System.out.println("file exists already");
//            }
//        }catch (Exception e){ //IOException
//            System.out.println(e);
//        }

        try {
            FileWriter fw=new FileWriter("sample.txt");
            fw.write("hello everyone");
            fw.append(" welcome to java class!!");
            fw.close();
            System.out.println("the content has been written sucessfully");
        }catch (Exception e){  //IOException
            System.out.println(e);
        }
        try {
            FileReader fr=new FileReader("sample.txt");  //it'll read character by character
            int character;
            while ((character=fr.read())!=-1){
                System.out.println((char)character);
            }
            fr.close();
            System.out.println("the content is read sucessfully");
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            if(file.delete()){
                System.out.println("the file has been deleted");
            }else {
                System.out.println("there is no file exist");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

