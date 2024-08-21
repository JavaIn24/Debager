package Task2;

public class Main {
    public static void main(String[] args) {
        String happyNewYear = "Привет, Александр, с праздником, с Новым Годом";

        char[] happyNewYearCharArray = happyNewYear.toCharArray();

        for (int i = 0; i < happyNewYearCharArray.length; i++) {
            char a = happyNewYearCharArray[i];
            if (Character.isUpperCase(a)) {
                happyNewYearCharArray[i] = Character.toLowerCase(a);
            } else if (Character.isLowerCase(a)) {
                happyNewYearCharArray[i] = Character.toUpperCase(a);
            }
        }

        System.out.println(new String(happyNewYearCharArray));
    }
}
