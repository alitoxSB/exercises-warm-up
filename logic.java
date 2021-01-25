package week1_programming_challenges;

import java.util.Scanner;

public class logic {
    public static void main_menu(){
        Scanner input = new Scanner(System.in);
        int option = 0;
        int basicOption = 0;

        while(option !=3){
            uihelper.main_menu();
            option = input.nextInt();
            if (option == 1){
                uihelper.basicMenu();
                basicOption = input.nextInt();

                if(basicOption == 1){
                    basic_challenge_functions.numberFunction();
                }
                if(basicOption==2){
                    basic_challenge_functions.inverseArray();
                }
                if(basicOption==3){
                    basic_challenge_functions.averageAndMedian();
                }

            }if(option == 2) {
                advanced_challenge_functions.encryption_patron();
            }
        }

    }
}
