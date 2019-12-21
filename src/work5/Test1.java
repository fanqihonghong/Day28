package work5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:/a.txt");
        FileOutputStream fos=new FileOutputStream("E:/a.txt");
        int len;
        byte[] b=new byte[1024];
        while ((len=fis.read(b))!=-1){
            //写
            fos.write(b,0,len);
        }


        fis.close();
        fos.close();
    }
}
