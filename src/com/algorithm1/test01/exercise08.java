package com.algorithm1.test01;

public class exercise08 {
    public static void main(String[] args) {
        System.out.println('b');    // b
        System.out.println('b' + 'c'); // 197
        System.out.println((char)('b' + 'c')); //Å
        System.out.println((char)('a'+ 4));    // e
        /**
         * 1.部分ascii码值
         * b  98
         * c  99
         * a-z 97-122
         * A-Z 65-90
         * 共收录了 128 个字符，用一个字节就可以存储,
         * ASCII 编码中第 0~31 个字符（开头的 32 个字符）以及第 127 个字符（最后一个字符）都是不可见的（无法显示），
         * 但是它们都具有一些特殊功能，所以称为控制字符（ Control Character）或者功能码（Function Code）。
         */
    }
}
