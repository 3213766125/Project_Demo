package cn.hp.service;

import cn.hp.model.AccountUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteUser {

    public static void Delete() {

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
        list.add(accountUser1);
        list.add(accountUser2);
        list.add(accountUser3);
        list.add(accountUser4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的用户账户 :");
        String delete = scanner.nextLine();

        while (!"52013141".equals(delete) && !"52013142".equals(delete) && !"52013143".equals(delete) && !"52013144".equals(delete)) {
            System.out.println("你输入的账号不存在请重新输入 :");
            delete = scanner.nextLine();
        }

        switch (delete) {
            case "52013141": {
                boolean remove = list.remove(accountUser1);
                if (remove)
                    System.out.println("删除成功");
                break;
            }
            case "52013142": {
                boolean remove = list.remove(accountUser2);
                if (remove)
                    System.out.println("删除成功");
                break;
            }
            case "52013143": {
                boolean remove = list.remove(accountUser3);
                if (remove)
                    System.out.println("删除成功");
                break;
            }
            case "52013144": {
                boolean remove = list.remove(accountUser4);
                if (remove)
                    System.out.println("删除成功");
                break;
            }
        }
    }
}