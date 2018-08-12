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
class IgnoreDigits{
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 | i % 5 == 0) {

            } else {
                System.out.printf(i + "\n" );
            }

        }
    }
}


//控制流程-练习-百万富翁
class Cal{
    double result;
    double rsingle;
    double result2;
    void setCal(int p,double r,int n){
        rsingle = 1;
        result = 0;
        for (int i = 1; i <= n; i++) {
            rsingle *= (1 + r);
            result += rsingle;
        }
        result2 = result * p;
//    double getCal(){
//            return result;
//        }

    }
}
class Millonare{
    public static void main(String[] args) {
        Cal m = new Cal();
        int year = 1;
        double ceiling = 1000000;
        m.setCal(12000,0.2,1);
        double temp = m.result2;
        while (temp < ceiling){
            year ++;
            m.setCal(12000,02,year);
            temp = m.result2;
        }
        System.out.println("完成百万富翁的年度是" + year);
    }
}

//控制流程-练习-黄金分割点
class Div {
    int[] a; //numerator or denominator
    int n; //index
    double[][] b; //result array
    double[][] c; //minus result array
    final double GOLD = 0.618;

    void setDiv(int n) {
        this.n = n;
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = a[i] / a[j];
                c[i][j] = b[i][j] - GOLD;
                c[i][j] = Math.abs(c[i][j]);
            }
        }
    }

    double getMin(int n) {
        this.n = n;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (c[i][j] > c[i][j + 1]) {
                    double temp = c[i][j];
                    c[i][j] = c[i][j + 1];
                    c[i][j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (c[i][0] > c[i + 1][0]) {
                double temp = c[i][0];
                c[i][0] = c[i + 1][0];
                c[i + 1][0] = temp;
            }
        }
        return c[0][0];
    }
}
class FindGold{
    public static void main(String[] args) {
        Div ob = new Div();
        int[] a = new int[];
        ob.setDiv(20);
        double result = ob.getMin(20);
        System.out.println("最小值是" + result);
    }
}



