package switch1;

import java.util.Scanner;

public class xiuxiri {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("请录入一个整数");
        int week = SC.nextInt();
        switch (week) {
            case 1,2,3,4,5:
                System.out.println("工作日");
                break;
            case 6:
                System.out.println("星期六");
            case 7:
                System.out.println("星期天");
            default:
                System.out.println("没有休息日了");
                break;
        }
    }
}
