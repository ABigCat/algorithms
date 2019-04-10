package com.algorithm1.test01;

import java.util.Scanner;

public class exercise01$05 {
    // psvm + 回车
    public static void main(String[] args) {
        // sout + 回车
        // alt+enter 自动导包
        // 1.1.1
        System.out.println("---------1.1.1----------");
        System.out.println((0+15)/2); //7
        System.out.println(2.0e-6*100000000.1);  //200.0000002   2.0e-6 是一个科学计数法，表示 0.000002
        System.out.println(true && false || true && true); //true  &&比||优先
        System.out.println(true || true && false); //true
        System.out.println("------------------------");
        // 1.1.2
        System.out.println("---------1.1.2----------");
        System.out.println((1+2.236)/2); //1.618
        System.out.println(1+2+3+4.0);   //10.0
        System.out.println(4.1>= 4);     // true
        System.out.println(1+2+"3");     //33   //1+2 =3 (int )  3+"3" convert to string "33"
        System.out.println("------------------------");
        // 1.1.3
        System.out.println("---------1.1.3----------");
      /*  Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a == b && b ==c ){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }*/
        System.out.println("------------------------");
        // 1.1.4
        System.out.println("---------1.1.4----------");
        int x = 1, y = 2, z = 3;
        /**
         * Cannot resolve symbol 'then'
         * */
        // if (x > y) then c = 0;
        // if x > y {z = 0;}  // 无括号
        // if(x > y) z = 0;   // right
        // if(x > y) c = 0 else  b = 0 // 缺少冒号
        System.out.println("------------------------");
        // 1.1.5
        /**
         * 编写一段程序，如果double类型的x和y都严格位于0和1之间打印true
         * 否则打印false
         */
        System.out.println("---------1.1.5----------");
        double m = 0.0001, n = 0.0000001;
        if (m > 0.0 && m < 1.0 && n > 0.0 && n < 1.0 ){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("------------------------");

    }
}
