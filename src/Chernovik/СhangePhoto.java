package Chernovik;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class СhangePhoto {
    public static void main(String[] args) {
        try (
                FileInputStream fin = new FileInputStream("C:\\Users\\Roman\\Documents\\альпака.jpg");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Roman\\Documents\\альпака1.jpg")
        ){
            byte[]buf = new byte[fin.available()];
            System.out.println(fin.available());
            fin.read(buf,0,buf.length);
            Random random = new Random();
            int t;

          for (int i = 50000; i <buf.length ; i++) {
               t=random.nextInt(5000);
               if (t==900);
               buf[i]+=(byte)1;
           }
            fos.write(buf,0,buf.length);//записываем из буфера в файл
        }
        catch(IOException ex){
            System.out.println(ex);
        }
    }
}
