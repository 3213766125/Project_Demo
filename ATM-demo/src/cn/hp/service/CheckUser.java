package cn.hp.service;
import cn.hp.model.AccountUser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CheckUser {
    //    用户
    public static void User() throws Exception {
//        List<String> list = new ArrayList<>();
//        Reader reader = new FileReader("D:\\a.txt");
//        BufferedReader buffered = new BufferedReader(reader);
//        Writer writer = new FileWriter("a.txt");
//        BufferedWriter rewriter = new BufferedWriter(writer);
//        String out;
//        while ((out = buffered.readLine()) != null)
//        {
//            list.add(out);
//
//        }
//        //释放资源
//        buffered.close();
//        rewriter.close();
//
//        for (String userList : list){
//            System.out.println(userList);
//        }

        List<AccountUser> list = new ArrayList<>();
        AccountUser accountUser = new AccountUser();
        accountUser.setAccount("账户");
        accountUser.setName("姓名");
        accountUser.setPassword("密码");
        accountUser.setPhone("手机号");
        accountUser.setMoney("余额");
        System.out.print(accountUser.getAccount()+"\t"+"  ");
        System.out.print(accountUser.getName()+"\t");
        System.out.print(accountUser.getPassword()+" ");
        System.out.print(accountUser.getPhone()+"\t");
        System.out.print(accountUser.getMoney());
        System.out.println(" ");
//        list.add(accountUser);
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
        for (AccountUser as:list){
            System.out.print(as.getAccount()+"  ");
            System.out.print(as.getName()+"\t");
            System.out.print(as.getPassword()+"\t");
            System.out.print(as.getPhone()+"\t");
            System.out.print(as.getMoney());
            System.out.println(" ");

        }
    }

}
