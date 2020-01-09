package com.chenhao.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * file的一些基本方法
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("Test.txt");
        //file是硬盘中文件的一个映射
        //而不是一个文件
        if (!file.exists()) {
            file.createNewFile();
        }

        //文件是否可读
        boolean canRead = file.canRead();
        //文件是否可执行
        boolean canExecute = file.canExecute();
        //文件是否可写
        boolean canWrite = file.canWrite();

        System.out.println(canExecute);
        System.out.println(canWrite);
        System.out.println(canRead);
        System.out.println(file.exists() + "======>");
        long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
        String canonicalPath = file.getCanonicalPath();
        System.out.println(canonicalPath);
        String parent = file.getParent();
        System.out.println(parent);
//        File[] files = file.listFiles();
//        for (File file1 : files) {
//            System.out.println(file1);
//        }
        boolean delete = file.delete();
        System.out.println(delete);
        System.out.println(file.exists() + "======>");
    }

}
