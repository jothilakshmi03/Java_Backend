package zoho;

public class Add_digit {
    public static void main(String[] args) {
        int num=39;
        int num2=517;
        System.out.println(untilSingleDigit(num));
        System.out.println(untilSingleDigit(num2));
    }
    public static int untilSingleDigit(int num) {
        if (num == 0)
            return 0;
        if (num % 9 == 0)
            return 9;
        return num%9;
    }
}
