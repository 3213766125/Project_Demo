package cn.hp.service;

import cn.hp.web.UserLogin;

import java.util.Scanner;

public class QuitUser {
    public static void quit() {
        // 退出操作
        Scanner del = new Scanner(System.in);
        System.out.println("您是否继续操作(yes/no ?)");
        String quit = del.next();

            if(quit.equals("yes")){
                UserLogin.show();
            }else if(quit.equals("no")){

                System.out.println("已退出");
                return;
            }

//        switch (quit){
//
//            case "yes" :
//                    UserLogin.show();
//                break;
//
//            case "no" :
//                System.out.println("已退出");
//                return;
//        }
    }

}
