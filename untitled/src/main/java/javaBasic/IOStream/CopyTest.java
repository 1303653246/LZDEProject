package javaBasic.IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * CopyTest:
 *
 * @author: zsm
 * @time: 2023/5/8 15:14
 */
public class CopyTest {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\untitled\\src\\main\\java\\other\\test.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\untitled\\src\\main\\java\\other\\test3.txt");
            byte[] bytes = new byte[2];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1) {
                System.out.println(len);
                System.out.println(new String(bytes));
                fileOutputStream.write(bytes, 0, len);
            }
            fileOutputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
