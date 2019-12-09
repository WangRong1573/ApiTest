package com.udp;

/**
 * @author rong.wang
 * @date 21:07  2019/12/9
 */
public class TestDiGui {
    public static void main(String[] args) {

        System.out.println(fac(5));
        System.out.println();
        f(5);
    }
    static long fac(int i){
        if (i==1){
            return 1;
        }else {
            return i*fac(i-1);
        }
    }

    static void f(int n){
        int s=1;
        for (int j = 1; j <=n ; j++) {
            s=s*j;
        }
        System.out.println(s);
    }
}
