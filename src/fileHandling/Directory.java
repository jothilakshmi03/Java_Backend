package fileHandling;

import java.io.File;
import java.io.IOException;

public class Directory {
    public static void main(String[] args) throws IOException {
        File folder=new File("my folder/javaFolder");
        if(folder.mkdirs()){
            System.out.println("Folder created");
        }else {
            System.out.println("Not created");
        }
        File file=new File(folder,"Example.txt");
        if(file.createNewFile()){
            System.out.println("file added");
        }else {
            System.out.println("file not created");
        }
        System.out.println(file.exists());
        System.out.println(folder.exists());
        System.out.println(file.getPath());
        System.out.println(folder.getName());
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        System.out.println(folder.canRead());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());
        System.out.println(file.length());
        System.out.println(file.lastModified());
        File newfile=new File("my folder/javaFolder","ex.txt");
        file.renameTo(newfile);
        System.out.println(newfile.getName());

        File[] files=folder.listFiles();
        for(File f:files){
            System.out.println(f);
        }
    }

}
