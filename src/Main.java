import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.print("请输入一个数字(输入负数结束程序)：");
            double num=input.nextDouble();
            boolean isFlag=true;
            if(num<0){
                System.out.println("程序结束！");
                break;
            }
            for (int i = 2; i < Math.sqrt(num); i++) {
                if(num%i==0){
                    isFlag=false;
                    break;
                }
                else{
                    continue;
                }
            }
            if(isFlag){
                System.out.println("输入的数字是质数！");
            }
            else{
                System.out.println("输入的数字不是质数！");
            }
        }
    }
}