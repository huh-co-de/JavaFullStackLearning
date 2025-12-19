package com.loose.coupling;

public class LooseCouplingMain {
    public static void main(String[] args) {
        UserDataProvider dataProvider = new UserDatabase();
        UserManager userManager = new UserManager(dataProvider);
//        System.out.println(dataProvider.getUserDetails());
        System.out.println(userManager.getUserInfo());
    }

}
