import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        emptyString();
    }
    public static String emptyString() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        if(str.isEmpty())
            throw new IllegalArgumentException("Пустые строки вводить нельзя!");
        else
            System.out.println(str);
        return str;
    }
}
