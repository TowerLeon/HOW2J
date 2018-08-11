/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: HelloWorld
 * Author:   Chris Li
 * Date:     8/11/2018 10:12 AM
 * Description: HelloWorld
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import org.omg.CORBA.COMM_FAILURE;
import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈HelloWorld〉
 *
 * @author Chris Li
 * @create 8/11/2018
 * @since 1.0.0
 */

//HelloWorld
class HelloWorld{
    public static void main(String[] args) {
        System.out.println("HelloWorld");
    }
}


//面向对象-类和对象
class Hero{
    String name;
    float hp;
    float armor;
    int moveSpeed;
    Hero(String name,float hp,float armor,int moveSpeed){
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }
}
class Item{
    String name;
    int price;
    Item(String name,int price){
        this.name = name;
        this.price = price;
    }
}
class Instance{

    public static void main(String[] args) {
        Hero ailun = new Hero("ailun",1000,10,10);
//    Ailun.name = "ailun";
//    Ailun.hp = 1000;
//    Ailun.armor = 10;
//    Ailun.moveSpeed = 10;

        Item sword = new Item("草薙",100);
//    Sword.name = "草薙";
//    Sword.price = 100;
        System.out.println("The hero name is " + ailun.name);
    }
}

//控制流程-练习-闰年
class WhichYear{
    public static void main(String[] args) {
        System.out.print("请输入年份：");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if (a % 4 == 0 & a % 100 != 0){
            System.out.println(a + "是闰年！");
        }
            else if (a % 400 == 0){
                System.out.println(a + "是闰年！");
            }
            else {
                System.out.println(a + "不是闰年！");
            }
        }
}

//控制流程-练习-季节
class WhichSeason{
    public static void main(String[] args) {
        System.out.print("请输入月份：");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        switch (a){
            case (1):
                System.out.println(a + "月是第一季度");
                break;
            case (2):
                System.out.println(a + "月是第一季度");
                break;
            case (3):
                System.out.println(a + "月是第一季度");
                break;
            case (4):
                System.out.println(a + "月是第二季度");
                break;
            case (5):
                System.out.println(a + "月是第二季度");
                break;
            case (6):
                System.out.println(a + "月是第二季度");
                break;
            case (7):
                System.out.println(a + "月是第三季度");
                break;
            case (8):
                System.out.println(a + "月是第三季度");
                break;
            case (9):
                System.out.println(a + "月是第三季度");
                break;
            case (10):
                System.out.println(a + "月是第四季度");
                break;
            case (11):
                System.out.println(a + "月是第四季度");
                break;
            case (12):
                System.out.println(a + "月是第四季度");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}

//控制流程-练习-阶乘
class Nplus{
    public static void main(String[] args) {
        System.out.println("请输入N的数值：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 1;
        while (n > 1){
            sum = sum * n;
            n--;
        }
        System.out.println("N的阶乘值为：" + sum);
    }
}

//控制流程-练习-乞丐
class YaoQian{

    int YaoQian(int d){

        int sum = 0;
        int money = 1;
        for (int i = 1; i <= d; i++) {
            sum += money;
            money *= 2;
        }
        return sum;
    }
}
class Income{
    public static void main(String[] args) {
        System.out.println("请输入乞讨总天数：");
        Scanner s = new Scanner(System.in);
        YaoQian y = new YaoQian();

        int a = s.nextInt();
        System.out.println("乞讨总金额是" + y.YaoQian(a));

        }
    }

//控制流程-练习-忽略倍数
class PrintDigits{
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i <= n; i++) {
i
        }
    }
}