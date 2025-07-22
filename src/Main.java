import java.util.Random;
import java.util.Scanner;

class Calculator {
    int num1;
    int num2;
    int calculateScanner;
    public void sumDisplay() {
        System.out.println(num1 + "+" + num2 + "=");
    }

    public boolean checkTrue() {
        if (num1 + num2 == calculateScanner) {
            return true;
        } else {
            return false;
        }
    }

    Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}
class NewEnemy {
    Scanner scanner = new Scanner(System.in);
    boolean isTrue;

    NewEnemy(int num1, int num2) {
        Calculator calculator = new Calculator(num1, num2);
        calculator.sumDisplay();
        calculator.calculateScanner = scanner.nextInt();
        isTrue = calculator.checkTrue();
        if (isTrue) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}



public class Main {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + " You are an tarnish who is summoned to save the world from chaos. The demigods fight and turn the world to their battlefield. You must defeat them, become elden lord and rebuild the Land Between! ");
        NewEnemy margit = new NewEnemy(23,56);
        if (margit.isTrue) {
            NewEnemy godrick = new NewEnemy(125, 654);
            if (godrick.isTrue) {
                NewEnemy radahn = new NewEnemy(1485, 3409);
                if (radahn.isTrue) {
                    NewEnemy morgott = new NewEnemy(9854, 12532);
                    if (morgott.isTrue) {
                        NewEnemy maliketh = new NewEnemy(45934, 235421);
                        if (maliketh.isTrue) {
                            NewEnemy radagon = new NewEnemy(346523, 124323324);
                            if (radagon.isTrue) {
                                System.out.println("You became elden lord!");
                            } else {
                                System.out.println("Try again!");
                            }
                        } else {
                            System.out.println("Try Again!");
                        }
                    } else {
                        System.out.println("Try Again!");
                    }
                }
            } else {
                System.out.println("Try Again!");
            }
        } else {
            System.out.println("Try Again!");
        }
    } 
}

// Add your class here! 💖
