package com.guangzhougang.chapter1;

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        check c=new check(10000);
        System.out.println("欢迎使用谷粒记账软件！");
        boolean isFlag=true;
        c.showmenu();
        while (isFlag){
            System.out.print("请输入要使用的功能的编号：");
            Scanner input=new Scanner(System.in);
            int choice=input.nextInt();
            switch (choice){
                case 1:
                {
                    System.out.println("收支类型\t\t"+"款项\t\t"+"账户余额");
                    c.showinfo();
                    break;
                }
                case 2:
                case 3:
                {
                    System.out.print("请输入款项:");
                    double money=input.nextDouble();
                    c.inout(money);
                    System.out.println("记录成功！");
                    break;
                }
                case 4:
                {
                    isFlag=false;
                    System.out.println("退出程序！");
                    break;
                }
                default:
                {
                    System.out.println("输入不正确！请重新输入！");
                }
            }
        }
    }
}

class check{
    private double balance;
    private String inoutinfo="";

    public check(double balance) {
        this.balance = balance;
    }

    public void showmenu(){
        System.out.println("------------谷粒记账软件------------");
        System.out.println();
        System.out.println("\t\t1 收支明细");
        System.out.println("\t\t2 登记收入");
        System.out.println("\t\t3 登记支出");
        System.out.println("\t\t4 退出");
    }

    public void showinfo(){
        System.out.println(inoutinfo);
    }

    public void inout(double money){
        balance+=money;
        if(money<0){
            inoutinfo+="支出    \t\t"+money+"\t\t"+balance+"\n";
        }
        else{
            inoutinfo+="收入    \t\t"+money+"\t\t"+balance+"\n";
        }

    }
}