package com.example.stdjavaprograms;

public class MyInterfaceProg {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[2];
        accounts[0] = new BankAccount(0);
        accounts[1] = new BankAccount(10000);
        System.out.println("Average balnce: " + average(accounts));

        Country[] countries = new Country[2];
        countries[0] = new Country();
        countries[0].setCountry("Uruguay");
        countries[0].setArea(176220);
        countries[1] = new Country("Thailand", 514000);
        System.out.println("Average area: " + average(countries));


    }

    private static double average(Measureable[] objects) {
        if (objects.length==0) {return 0;}
        double sum = 0;
        for (Measureable obj: objects){
            sum = sum + obj.getMeasure();
        }
        return sum/objects.length;

    }

/*    private static double average(BankAccount[] objects) {
        if (objects.length==0) {return 0;}
        double sum = 0;
        for (BankAccount obj: objects){
            sum = sum + obj.getMeasure();
        }
        return sum/objects.length;
    }*/
}
