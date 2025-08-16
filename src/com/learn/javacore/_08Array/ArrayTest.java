package com.learn.javacore._08Array;


public class ArrayTest {


    public static void main(String[] args) {
        int[] arr=new int[10];
        //[0,...]
        // ADDRESS
        System.out.println("arr addredd=>"+arr);
        // UPDATE
        arr[2]=4244;
        // TRAVERSE
        for(int a:arr){
            System.out.println(a);
        }
        System.out.println(arr.length);

        // 2D
        char crr[][]=new char[1][2];
        crr[0][0]='a';
        crr[0][1]='b';
        for(int i=0;i<crr.length;i++){
            for(int j=0;j<crr[i].length;j++){
                System.out.println(crr[i][j]);
            }
        }
        // Jagged array
        char[][] c=new char[2][];
        c[0]=new char[]{'a','b'};
        c[1]=new char[]{'c','d','e'};

        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                System.out.println(c[i][j]);
            }
        }



    }
}
