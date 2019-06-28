import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        System.out.println("Nhap nam =");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(year);
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisbleBy100 = year % 100 == 0;
            if (isDivisbleBy100) {
                boolean isDivibleBy400 = year % 400 == 0;
                if (isDivibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println("is leap year");
        } else {
            System.out.println("is not leap year");
        }
    }
}
