package com.chenhao.file;

/**
 * 递归
 */
public class Recursive {

    private static int i;

    public static void main(String[] args) {
        getName();
    }

    public static void getName() {
        System.out.println("chenhao");
        while (i++ < 10) {
            getName();
        }

    }
}
