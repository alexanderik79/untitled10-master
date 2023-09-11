package org.example.service;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSaver {
    public static void saveUser(Object o){
        File file = new File("c:/data.txt");
        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file, true);
            writer.write(o.toString()+"\n");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
