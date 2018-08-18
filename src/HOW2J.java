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

import com.sun.javafx.runtime.async.AbstractRemoteResource;
import org.omg.CORBA.COMM_FAILURE;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
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


//控制流程-练习-百万富翁,fail to work
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
//class Div {
//    int[] a; //numerator or denominator
//    int n; //index
//    double[][] c;

//    void setDiv(int n) {
//        this.n = n;
//
//
//        }
//    }
//
//    double getMin(int n) {
//        this.n = n;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - 1; j++) {
//                if (c[i][j] > c[i][j + 1]) {
//                    double temp = c[i][j];
//                    c[i][j] = c[i][j + 1];
//                    c[i][j + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < n - 1; i++) {
//            if (c[i][0] > c[i + 1][0]) {
//                double temp = c[i][0];
//                c[i][0] = c[i + 1][0];
//                c[i + 1][0] = temp;
//            }
//        }
//        return c[0][0];
//    }
//}
class FindGold {
    public static void main(String[] args) {
        int n = 20;
        int[] a = new int[n];
        double[][] b = new double[n][n]; //result array
        double[][] c = new double[n][n]; //minus result array
        final double GOLD = 0.618;


//        Div ob = new Div();

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
            //        ob.setDiv(20);
//        double result = ob.getMin(n);
        }
        System.out.println("最小值是" + c[0][0]);
    }
}

//控制流程-练习-水仙花数 ,fail to work
//class Flower{
//    public static void main(String[] args) {
//        Flower ob = new Flower();
//        int range = 900;
//        int[] a = new int[range];
//        String[] b = new String[range];
//        for (int i = 0; i < a.length; i++) {
//            a[i] = 100 + i;
//            b[i] = Integer.toString(a[i]);
//       }
//        for (int i = 0; i < a.length; i++) {
//            if ( ob.cal(i) == a[i] );
//
//        }
//    }
//    public int cal(int i){
//        int result;
//        result = Math.pow(Integer.parseInt(Integer.toString(i).substring(0,1)),2) + Math.pow(Integer.parseInt(Integer.toString(i).substring(1,2)),2) + Math.pow(Integer.parseInt(Integer.toString(i).substring(2,3)),2)
//        return result;
//    }
//
//}

//控制流程-练习-小学算术题，略

//数组-练习-数组最小值
class FindMin{
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.println("The array is " + a[i]);
        }

        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min >= a[i]){
                min = a[i];
            }
        }
        System.out.println("The minimum number is " + min);
    }
}

//数组-练习-数组反转
class ReverseArray{
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.println("The original array is : " + a[i]);
        }
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        System.out.println("The reversed array is : " + Arrays.toString(a));

    }
}

//数组-练习-排序
class SortSelect{
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println("The original array is " + Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println("The sorted array is " + Arrays.toString(a));
    }
}

class SortBubble{
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        System.out.println("The original array is " + Arrays.toString(a));
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("The sorted array is " + Arrays.toString(a));
    }
}

//数组-练习-最大值
class Biggest{
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
        a[i] = (int) (Math.random() * 100);
        }
        int max = a[0];
        System.out.println("The original array is " + Arrays.toString(a));
        for (int x : a) {
            max = max > x ? max : x;
        }
        System.out.printf("The biggest number is " + max);
    }
}

//数组-练习-合并数组
class CombineArray{
    public static void main(String[] args) {
        int ran1 = (int) (Math.random() * 6) + 5;
        int ran2 = (int) (Math.random() * 6) + 5;
        int[] a = new int[ran1];
        int[] b = new int[ran2];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 100);
        }
        System.out.println("The ran1 array is " + Arrays.toString(a));
        System.out.println("The ran2 array is " + Arrays.toString(b));
        int[] c = new int[ran1 + ran2];
        System.arraycopy(a,0,c,0,ran1);
        System.arraycopy(b,0,c,ran1,ran2);
        System.out.println("The combined array is " + Arrays.toString(c));
    }
}

//数组-练习-二维数组
class TwoDimensionalArray{
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
        int max = a[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (max < a[i][j]){
                    max = a[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("The max value is " + max);
        System.out.println("The coordinate is " + x + y);
    }
}

//数组-练习-二维数组排序
class TwoDimensionalArraySort{
    public static void main(String[] args) {
        //a[][] 初始化
        int[][] a = new int[5][8];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int) (Math.random() * 100);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        //to one-dimensional array
        int[] b = new int[40];
        for (int i = 0; i < a.length; i++) {
            System.arraycopy(a[i],0,b,0 + i * 8,a[i].length);
        }
        System.out.println("The b array is " + Arrays.toString(b));
        //sort
        Arrays.sort(b);
        System.out.println("The sorted b array is " + Arrays.toString(b));
        System.out.println("The sorted a array is :");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = b[i * a[0].length + j];
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

    }
}

//类和对象-练习-护甲
class ItemOne {
    String name;
    int price;
}
class Armor extends ItemOne{
    int ac;
}
class HuJia{
    public static void main(String[] args) {
        Armor ob1 = new Armor();
        Armor ob2 = new Armor();
        ob1.name = "布甲";
        ob1.price = 300;
        ob1.ac = 15;
        ob2.name = "锁子甲";
        ob2.price = 500;
        ob2.ac = 40;
        System.out.print("名称: "+ob1.name+" "+ "价格： "+ob1.price+" "+ "护甲等级： "+ob1.ac);
        System.out.print("\n名称: "+ob2.name+" "+ "价格： "+ob2.price+" "+ "护甲等级： "+ob2.ac);
    }
}

//类和对象-练习-治疗,如果把Support1与UseSupport1合并则会容易很多
class Hero1{
    String name;
    int hp;
    float armor;
    int moveSpeed;
}
class Support1 extends Hero1{
    void heal(){}
    void heal(Hero1 h){
        h = new Hero1();
        System.out.println("为指定的英雄加血：" + h.name);
    }
    void heal(Hero1 h,int hp){
        h = new Hero1();
        h.hp = hp;
        System.out.println("为指定的英雄加血：" + h.hp);
    }
}
class UseSupport1{
    public static void main(String[] args) {
        Hero1 ob1 = new Hero1();
        Support1 ob2 = new Support1();
        ob2.heal();
        ob2.heal(ob1);
        ob2.heal(ob1,30);
    }
}

//correct answer
class Hero2{
    String name;
    int hp;
    float armor;
    int moveSpeed;
}
class Support2 extends Hero2{
    public void heal(){
        System.out.println(name  + "为英雄加血");
    }
    public void heal(Hero2 h){
        System.out.println(name + "为" + h.name +"加血");
    }
    public void heal(Hero2 h, int hp){
        System.out.println(name + "为" + h.name + "加了" + hp +"的血");
    }
    public static void main(String[] args){
        Support2 su = new Support2();
        su.name = "蔡文姬";
        su.hp = 1000;
        Hero2 h = new Hero2();
        h.name = "亚瑟";
        su.heal();
        su.heal(h);
        su.heal(h,su.hp);
    }
}


//类和对象-练习-构造方法
class Hero3{
    String name;
    int hp;
    float armor;
    int moveSpeed;
    void Hero2(String heroName,float heroHP,float heroArmor,int heroMoveSpeed){}
}

//类和对象-练习-构造方法(this)
class Hero4 {
    String name;
    int hp;
    float armor;
    int moveSpeed;
    public void hero4(String name,float hp){
        this.name = name;
        this.hp = (int) hp;
    }
}


//类和对象-练习-传参
//略

//类和对象-练习-包
//略

//类和对象-练习-类属性
//略

//类和对象-练习-类方法
//略

//类和对象-练习-属性初始化
class Hero5 {
    public String name;
    //= "some hero";

    public void Hero5(){
        name = "one hero";
    }
    {
       // name = "the hero";
    }

}
class try1{
    public static void main(String[] args) {
        Hero5 ob1 = new Hero5();
        System.out.println(ob1.name);
    }
}

//类和对象-练习-单例模式
//懒汉与饿汉，略


//类和对象-练习-枚举
class MeiJu{
    enum Herotype{
        TANK,WIZARD,ASSASSIN,ASSIST,WARRIOR,RANGED,PUSH,FARMING
    }

    public static void main(String[] args) {
        for (Herotype x: Herotype.values()
             ) switch (x){
            case TANK:
                System.out.println("坦克");
                break;
            case WIZARD:
                System.out.println("法师");
                break;
            case ASSASSIN:
                System.out.println("刺客");
                break;
            case WARRIOR:
                System.out.println("近战");
                break;
            case ASSIST:
                System.out.println("辅助");
                break;
            case RANGED:
                System.out.println("远程");
                break;
            case PUSH:
                System.out.println("推进");
                break;
            case FARMING:
                System.out.println("打野");
                break;
                default:
                    break;
        }

        }
    }


//接口与继承-练习-接口
class Hero6{
    String name;
    int hp;
    float armor;
    int moveSpeed;
    }
interface Healer6{
    public void heal();
}
class Support6 extends Hero6 implements Healer6 {
    @Override
    public void heal() {
        System.out.println("The interface is implemented.");
    }

    public static void main(String[] args) {
        Support6 ob = new Support6();
    }
}

//接口与继承-练习-类型转换
//略



//接口与继承-练习-重写
class Item7{
    String name;
    int price;
    Item7(){ }
    void effect(){
        System.out.println("no effect");
    }
}
class MagicPotion extends Item7{
    @Override
    void effect(){
        System.out.println("蓝瓶使用后，可以回魔法");
    }

    public static void main(String[] args) {
        MagicPotion ob = new MagicPotion();
        ob.effect();
    }

}

//接口与继承-练习-多态

