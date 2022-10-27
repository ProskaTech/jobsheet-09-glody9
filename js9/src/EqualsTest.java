//Created by 21343077_Glody Syah Rabbynawa
public class EqualsTest {
    public static void main(String[] args) {
        String str1, str2;
        str1 = "Free the bound periodicals.";
        str2 = str1;

        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);
        System.out.println("Same Object? " + (str1 == str2));

        str2 = new String(str1);
        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);
        System.out.println("Same Object? " + (str1 == str2));

        System.out.println("Same Value? " + str1.equals(str2));
    }
}
