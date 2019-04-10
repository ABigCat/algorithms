package com.algorithm1.test01;

public class exercise07 {
    public static void a(){
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001){
            t = (9.0/t + t) / 2.0;
        }
        System.out.printf("%.5f\n",t);
    }

    public static void b(){
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static void c(){
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        a();
        b();
        c();
    }
}
/**
 * 3.00009
 * 499500
 * 10000
 */
