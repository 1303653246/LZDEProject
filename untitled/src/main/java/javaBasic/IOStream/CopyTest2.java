package javaBasic.IOStream;

import org.junit.Test;

import java.io.*;
import java.util.Arrays;

/**
 * CopyTest2:
 *
 * @author: zsm
 * @time: 2023/5/10 10:10
 */
public class CopyTest2 {

    /**
     * 拷贝文件夹
     *
     * @param src
     * @param dest:
     * @return: void    
     * @author: zsm
     * @time: 2023/5/10 16:39
     */
    private static void copeDir(File src, File dest) throws IOException {
        //存在创建失败，不存在创建，不会报错
        dest.mkdirs();
        //递归
        //进入数据源
        File[] files = src.listFiles();
        //遍历数组
        assert files != null;
        for (File file : files) {
            if (file.isFile()) {
                //判断文件，拷贝
                FileInputStream fileInputStream = new FileInputStream(file);
                FileOutputStream fileOutputStream = new FileOutputStream(new File(dest, file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fileInputStream.read(bytes)) != -1) {
                    System.out.println(Arrays.toString(bytes));
                    fileOutputStream.write(bytes,0,len);
                }
                fileInputStream.close();
                fileOutputStream.close();
            } else {
                //判断文件夹，递归
                copeDir(file, new File(dest, file.getName()));
            }
        }
    }

    @Test
    public void test1() throws IOException {
        File file1 = new File("D:\\untitled\\dsadasdasd");
        File file2 = new File("D:\\untitled\\dest");
        copeDir(file1,file2);
    }

//    @Test
    public void test2() {

        try (
                FileReader fileReader = new FileReader("D:\\untitled\\TestChinese.txt");
                FileWriter fileWriter = new FileWriter("D:\\untitled\\TestChinese2.txt")
        ) {
            int read;
            while ((read = fileReader.read()) != -1) {
                System.out.print((char) read);
                fileWriter.write((char) read);
            }
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
