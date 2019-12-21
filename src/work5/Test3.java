package work5;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new FileReader("D:/a.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("E:/a2.txt"));
        String s;
        while ((s=br.readLine())!=null){
            bw.write(s);
            bw.newLine();

        }
        br.close();
        bw.close();
    }
}
