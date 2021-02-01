package be;

public class TaskFour {
    public static void main(String[] args) {
        String str = "I love life love my job love whole world love everyone";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.print(word);
            System.out.print(" ");
            System.out.print((str + "\0").split(word).length - 1);
            System.out.println();
        }
    }
}

