package array;

import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of grand father: ");
        String grandpaName = sc.next();
        String famList[][] = {{"Luke", "Shaw"},
                {"Wayne", "Rooney"},
                {"Rooney", "Ronaldo"},
                {"Shaw", "Rooney"}};
        int i = 0, count = 0, j = 0;
        while (i < famList.length) {
            if (famList[i][1].equals(grandpaName)) {
                for (j = 0; j < famList.length; j++) {
                    if (famList[j][1].equals(famList[i][0])) {
                        count++;
                    }
                }
            }
                i++;
        }
        if(count == 0) {
            System.out.println("Grand Father name not exist in the list or " + grandpaName + " doesn't have grandchild");
        }else{
            System.out.println("The total grandchildrens:" + count);}
    }
}