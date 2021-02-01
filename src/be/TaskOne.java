package be;

public class TaskOne {

    public static void main(String[] args) {
        System.out.println("STRING: ");
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1001);
            String str = new String(String.valueOf(array[i]));
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.println("STRINGBUILDER: ");
        int[] arrayBuilder = new int[100];
        for (int i = 0; i < arrayBuilder.length; i++) {
            arrayBuilder[i] = (int) (Math.random() * 1001);
            StringBuilder strBuilder = new StringBuilder(String.valueOf(arrayBuilder[i]));
            System.out.print(strBuilder + " ");
        }
    }
}
