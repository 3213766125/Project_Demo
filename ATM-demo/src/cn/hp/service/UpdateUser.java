package cn.hp.service;

import cn.hp.model.AccountUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdateUser {

    public static List update(){
        List<AccountUser> list = new ArrayList<>();
        AccountUser accountUser1 = new AccountUser();
        accountUser1.setAccount("52013141");
        accountUser1.setName("浪子1");
        accountUser1.setPassword("123");
        accountUser1.setPhone("1312561");
        accountUser1.setMoney("10001");
        AccountUser accountUser2 = new AccountUser();
        accountUser2.setAccount("52013142");
        accountUser2.setName("浪子2");
        accountUser2.setPassword("123");
        accountUser2.setPhone("1312562");
        accountUser2.setMoney("10002");
        AccountUser accountUser3 = new AccountUser();
        accountUser3.setAccount("52013143");
        accountUser3.setName("浪子3");
        accountUser3.setPassword("123");
        accountUser3.setPhone("1312563");
        accountUser3.setMoney("10003");
        AccountUser accountUser4 = new AccountUser();
        accountUser4.setAccount("52013144");
        accountUser4.setName("浪子4");
        accountUser4.setPassword("123");
        accountUser4.setPhone("1312564");
        accountUser4.setMoney("10004");
//        修改
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要修改的用户账户 :");
        String update = scanner.nextLine();
        accountUser1.setAccount(update);
        System.out.println("请输入要修改的名字 :");
        String name = scanner.nextLine();
        accountUser1.setName(name);
        System.out.println("请输入要修改的密码 :");
        String password = scanner.nextLine();
        accountUser1.setPassword(password);
        System.out.println("请输入要修改的手机号 :");
        String phone = scanner.nextLine();
        accountUser1.setPhone(phone);

        list.add(accountUser1);
        list.add(accountUser2);
        list.add(accountUser3);
        list.add(accountUser4);

        return list;
    }
}
