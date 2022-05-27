package cn.hp.web;

import cn.hp.controller.impl.AdminImpl;
import cn.hp.service.*;

import java.util.Scanner;

/**
 * 管理员操作
 */

public class UserLogin {

    public static void main(String[] args) throws Exception {
        show();
        user();
        operate();
    }
    static int userLogin;

    public static void show() {
//        管理员卡号
        Scanner login = new Scanner(System.in);
//        客户卡号

//        密码
        Scanner password1 = new Scanner(System.in);

        while (true) {
            System.out.println("******************************");
            System.out.println("***********ATM取款机**********");
            System.out.println("******欢迎您使用ATM取款机******");
            System.out.println("******************************");

            System.out.println("请输入卡号 :");
            userLogin = login.nextInt();

            while (userLogin != 10 && userLogin != 11 && userLogin != 12 && userLogin != 13 && userLogin != 14 && userLogin != 15) {
                System.out.println("卡号输入有误请重新输入 :");
//               如果不正确再次输入
//               把正确的值付给 again继续往下走
                 userLogin = login.nextInt();
              }


            System.out.println("请输入密码 :");
            String password = password1.nextLine();
            while (!password.equals("123")) {
                System.out.println("密码输入有误请重新输入 :");
                password = password1.nextLine();
            }

            break;
            /*客户端*/
//            int client = 52013141;int client1 = 52013142;int client2 = 52013143;int client3 = 52013144;
//               while (true){
//                   if(userLogin==client&&userLogin==client1&&userLogin==client2&&userLogin==3){
//                       Client.client();
//                   }else {
//                       System.out.println("客户输入卡号有误:");
//                       userLogin=login.nextInt();
//                   }
//               }
        }

    }

    public static void user() throws Exception {
        AdminImpl admin = new AdminImpl();

        if(userLogin==10){
            admin.admin1();
        }else if(userLogin==11){
            admin.admin2();
        }else if(userLogin==12){
            admin.admin3();
        }else if(userLogin==13){
            admin.admin4();
        }else if(userLogin==14){
            admin.admin5();
        }else if (userLogin==15){
            admin.admin6();
        }
        operate();
    }
//
    public static void operate() throws Exception {

        Scanner scanner = new Scanner(System.in);

        int choose;

        while (true) {

//            System.out.println("欢迎管理员登录!");
            System.out.println("*********************************");
            System.out.println("******请输入你想要的操作类型:*****");
            System.out.println("*****1.查看用户    2.修改用户*****");
            System.out.println("*****3.删除        4.查看工资*****");
            System.out.println("*****5.退卡       ****************");
            System.out.println("*********************************");
            System.out.println("请选择 :");
            choose = scanner.nextInt();
            while (choose != 1 && choose != 2 && choose != 3 && choose != 4 && choose != 5) {
                System.out.println("你选择的选项不在此范围内请重新选择 :");
                choose = scanner.nextInt();
            }
            //      根据用户的选择进行页面的展示
            switch (choose) {
                case 1:
//                    查询用户
                    CheckUser.User();
                    break;
                case 2:
//                    修改用户
                    UpdateUser.update();
                    break;
                case 3:
//                    删除用户
                    DeleteUser.Delete();
                    break;
                case 4:
//                    用户余额
                    UserMoney.Money();
                    break;
                case 5:
 //                     退出操作
                    QuitUser.quit();
                   return;
            }

        }
    }

}
