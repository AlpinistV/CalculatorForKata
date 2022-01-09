package KalculatorForKata;
import java.util.Scanner;


public class Main  {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите выражение, например: \"2+2\" или \"VI/II\"");
        try{
            while (true){
                Calculator calculator = new Calculator();
                Scanner scanner = new Scanner(System.in);
                calculator.setSt1(scanner.nextLine());
                calculator.setNumbers(calculator.getSt1().split("[+-/*]"));
                String result =  calculator.CalcVersions(calculator.version1(),calculator.version2());
                System.out.println(result);
            }
        }
        catch (Exception e){
            System.out.println("Ошибка ввода");
        }

    }
}




