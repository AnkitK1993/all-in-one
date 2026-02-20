package practice.basic;

import java.util.Scanner;

public class Antara {

    public static void main(String[] args) throws InterruptedException {
        String son="Ankit";
        String daughter="Antara";
        System.out.println("Who's favorite child do you want to know?");

        Scanner input = new Scanner(System.in);
        String n=input.next();

        switch(n){
            case "Mom":{
                System.out.println(son);
                Thread.sleep(1000);
                System.out.println("Pehla baccha pehla baccha hota hai");
            }
            break;
            case "Dad":{
                System.out.println("Thinking.....");
                Thread.sleep(2000);
                System.out.println("Ummm .. " + daughter);
            }
        }
    }
}
