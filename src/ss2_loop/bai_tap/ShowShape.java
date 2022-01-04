package ss2_loop.bai_tap;

import java.util.Scanner;

public class ShowShape {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu: ");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (bottom-left)");
            System.out.println("3. Print the square triangle (bottom-right)");
            System.out.println("4. Print the square triangle (top-left)");
            System.out.println("5. Print the square triangle (top-right)");
            System.out.println("6. Print isosceles triangle");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if ((i == 0 && (j == 0 || j == 1 || j == 2 || j == 3))
                                    || (i == 1 && (j == 0 || j == 1 || j == 2))
                                    || (i == 2 && (j == 0 || j == 1))
                                    || (i == 3 && (j == 0))) {
                                System.out.print("   ");
                            } else {
                                System.out.print("*  ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 5:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if ((i == 4 && (j == 0 || j == 1 || j == 2 || j == 3))
                                    || (i == 3 && (j == 0 || j == 1 || j == 2))
                                    || (i == 2 && (j == 0 || j == 1))
                                    || (i == 1 && (j == 0))) {
                                System.out.print("   ");
                                ;
                            } else {
                                System.out.print("*  ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
