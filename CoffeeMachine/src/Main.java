import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String a;
        int b,c = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Seçim yapın");
        System.out.println("buy, fill, take, remaining, exit");
        a = sc.nextLine();

        if (a == "buy"){
            c = 1;
        }else if(a == "fill"){
            c = 2;
        }else if(a == "take"){
            c = 3;
        }else if(a == "reaminig"){
            c = 4;
        }else if(a == "exit"){
            c = 5;
        }


        switch(c){
            case 1:
                System.out.println("1 - Espresso, 2 - Latte, 3 - Cappuccino");
                b = sc.nextInt();

                CoffeeMachine coffeeMachine;

                switch (b) {
                    case 1: coffeeMachine = new CoffeeMachine(10,0,20,1,100);
                        break;

                    case 2: coffeeMachine = new CoffeeMachine(10,20,15,1,150);
                        break;

                    case 3: coffeeMachine = new CoffeeMachine(10,15,15,1,200);
                        break;
                }
            break;

            case 2:
                CoffeeMachine coffeeMachine1;

                coffeeMachine1 = new CoffeeMachine(400,540,120,9,550);
                System.out.println(coffeeMachine1);

                break;

            case 3:
                System.out.println("Kahve seçimi yapılmadı..");
                break;

            case 4:
                System.out.println("water = 400" +
                        "milk = 540" +
                        "beans = 120" +
                        "cups = 9" +
                        "money =550");

                break;

            case 5:
                System.out.println("Çıkış yapılıyor..");
                break;
        }



    }
}