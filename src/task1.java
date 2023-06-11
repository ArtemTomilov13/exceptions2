import java.util.InputMismatchException;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        processingEnteredData();
    }
    public static float floatnum() {
        System.out.println("\nВведите дробное число через запятую: ");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.println("Вы ввели:\n" + (num));
        return num;
    }
    private static float processingEnteredData() {
        try {
            floatnum();
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод!");
            processingEnteredData();
        }
        return 0;
    }
}



