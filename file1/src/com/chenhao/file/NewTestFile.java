package com.chenhao.file;

import java.io.File;
import java.io.IOException;

/**
 * 设计一个方法，用来展示（遍历文件夹）
 * 参数-->file（代表文件或文件夹）
 */
public class NewTestFile {
    public void showFile(File file) throws IOException {
        File[] files = file.listFiles();
        if (files != null && files.length != 0) {
            for (File file1 : files) {
                this.showFile(file1);
            }
        }
        file.delete();
    }

    public static void main(String[] args) throws IOException {
        NewTestFile newTestFile = new NewTestFile();
        File file = new File("/home/chenhao/ideaproject/file");
        newTestFile.showFile(file);
    }
}
