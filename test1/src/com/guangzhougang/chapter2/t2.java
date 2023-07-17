package com.guangzhougang.chapter2;

import org.junit.Test;

import java.util.Arrays;

public class t2 {
    public static void main(String[] args) {
        int[] a =new int[4];
        if(a!=null)
            System.out.println("动态数组创建成功！");
        for (int i = 0; i < 4; i++) {
            a[i]=i+5;
        }
        int[] b =new int[]{1,2,3,4};

        for(int i:a){
            System.out.println(i);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(b[i]);
        }
        System.out.print("这是数组b的几个元素：");
        System.out.print(b[0]+""+'\t');
        System.out.print(b[1]+""+'\t');
        System.out.print(b[2]+""+'\t');
        System.out.print(b[3]+""+'\t');
    }
    
    @Test
    public void test1(){
        int[][] abc=new int[3][];
        int[][] adc=new int[6][5];
        int[][] cba=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int l=cba.length;
        int l1=cba[0].length;
        System.out.println(l);
        System.out.println(l1);
        for (int[] ints : cba) {
            for (int anInt : ints) {
                System.out.print(anInt);
                System.out.print("      ");
            }
            System.out.println();
        }
    }

    @Test
    public void test2(){
        double[] array=new double[5];
        System.out.println("数组数值初始化：");
        for (int i = 0; i < array.length; i++) {
            array[i]= Math.random()*10+1;
            System.out.print(array[i]);
            System.out.print('\t');
        }
        System.out.println();
        System.out.println("对数组进行升序排序：");
        double temp;
        boolean isFlag=false;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    isFlag=true;
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            if(!isFlag)
                break;
            isFlag=false;
        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]);
//            System.out.print('\t');
//        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array));
        System.out.println("hot-fix test2");
    }
}


