package work5;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("E:/a1.txt");
        FileReader fr=new FileReader("D:/a.txt");
        int len;
        while ((len=fr.read())!=-1){
            fw.write(len);
        }
        fw.close();
        fr.close();
    }
}
