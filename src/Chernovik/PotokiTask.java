package Chernovik;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PotokiTask {
    public static void main(String[] args) {
        String data = "Hello world";
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Roman\\Documents\\альпака1.jpg")) {
            byte[] buf = data.getBytes();
            fos.write(buf,0,buf.length);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("File has written");




    }
}
