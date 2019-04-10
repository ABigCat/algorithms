package com.algorithm1.test01;

import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {
        /**
         * 编写一段代码，将一个正整数用二进制表示转换为一个String类型的值s
         * answer: 将余数逆序打出
         */
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        // 方法一:自带方法
        System.out.println(Integer.toBinaryString(x));
        // 方法二:将余数逆序后输出
        StringBuilder s = new StringBuilder();
        while (x != 0){
            s.append(x % 2);
            x = x / 2;
        }
        System.out.println(s.reverse());
        // 方法三：余数前插法拼接字符串
        String s1 = "";
        for (int n = x; n > 0; n /= 2)
            s1 = (n % 2) + s1;
        System.out.println(s1);

    }
}
