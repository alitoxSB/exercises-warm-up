package week1_programming_challenges;
import java.util.*;

public class basic_challenge_functions {


    public static void numberFunction(){
        System.out.println("First challenge basic.");
        System.out.println("add two numbers or more:");

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        int number = input.nextInt();
        numberList.add(number);
        number = input.nextInt();
        numberList.add(number);
        int option = 0;

        while (option!=2){
            System.out.println("Do you want add other number?");
            System.out.println("1: Yes");
            System.out.println("2: No");
            option = input.nextInt();

            if (option == 1){
                System.out.println("Enter the other number:");
                number = input.nextInt();
                numberList.add(number);
            }else{
                System.out.println("coming out...");
            }
        }
        float number_i = 0;
        float counter = 0;

        for (int i = 0; i<numberList.size(); i++){
            number_i = number_i + numberList.get(i);
            System.out.println(numberList.get(i));
            counter = i;
        }
        counter = counter + 1;
        float average = number_i/counter;
        System.out.println("The average is: " + average);

        ArrayList<Integer> numbersOver = new ArrayList<Integer>();
        ArrayList<Integer> numbersInto = new ArrayList<Integer>();
        int numberOver = 0;
        int numberInto = 0;
        for (int i = 0; i<numberList.size(); i++){
            if(numberList.get(i)<average){
                numberInto++;
            }else{
                numberOver++;
            }
        }

        System.out.println("Numbers over average: " + numberOver);
        System.out.println("Numbers into average: " + numberInto);
    }

    public static void inverseArray(){
        Scanner input = new Scanner(System.in);
        int letterCount = 0;
        System.out.println("Write one word: ");
        String inputString = input.next();
        ArrayList<Character> arrayString = new ArrayList<>();

        for (int i=0;i<inputString.length();i++){
            arrayString.add(inputString.charAt(i));
            letterCount++;
        }
        Collections.reverse(arrayString);
        System.out.println("Your revers string is: " + arrayString);
    }
    public static void averageAndMedian(){
        Scanner input = new Scanner(System.in);
        System.out.println("This program calculate Average and Median");
        System.out.println("Write a numbers series separate by commas");
        String NumberSeries = input.next();
        String [] animalsArray = NumberSeries.split(",");
        List<String> arrayNumbers = new ArrayList<>();
        arrayNumbers = Arrays.asList(animalsArray);
        float countNumbers = 0;
        float sumNumbers = 0;
        System.out.println(arrayNumbers);

        for (int i = 0; i<arrayNumbers.size(); i++){
            float number = Integer.parseInt(arrayNumbers.get(i));
            sumNumbers = sumNumbers + number;
            countNumbers++;
        }
        System.out.println("The average is: " + sumNumbers/countNumbers);
    }
}
