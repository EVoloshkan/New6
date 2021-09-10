import java.util.Scanner;

public class Progaramm {
    public static void main(String[] args){
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        Scanner scanner = new Scanner(System.in);
        byte a = scanner.nextByte();
        if(a == 1){
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - фунт");
            byte b = scanner.nextByte();
            System.out.println("Введите колличество");
            double c = scanner.nextDouble();
             switch (b){
                 case 1:
                     System.out.println(c + " грамм");
                     System.out.println(c*1000 + " килограмм");
                     System.out.println(c*453.59 + " фунтов");
                     break;
                 case 2:
                     System.out.println(c/1000 + " грамм");
                     System.out.println(c + " килограмм");
                     System.out.println(c/1000*453.59 + " фунтов");
                     break;
                 case 3:
                     System.out.println(c/453.59 + " грамм");
                     System.out.println(c*1000/453.59 + " килограмм");
                     System.out.println(c + " фунтов");
                     break;
                 default:
                     System.out.println("Неизвестная единица измерения");
                     break;
             }
        }
        else if (a == 2){
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            byte b = scanner.nextByte();
            System.out.println("Введите колличество");
            double c = scanner.nextDouble();
            switch (b) {
                case 1:
                    System.out.println(c + " метр");
                    System.out.println(c/1609.34 + " миля");
                    System.out.println(c/0.91 + " ярд");
                    System.out.println(c/0.305 + " фут");
                    break;
                case 2:
                    System.out.println(c*1609.34 + " метр");
                    System.out.println(c + " миля");
                    System.out.println(c*1609.34/0.91 + " ярд");
                    System.out.println(c*1609.34/0.305 + " фут");
                    break;
                case 3:
                    System.out.println(c*0.91 + " метр");
                    System.out.println(c*0.91/1609.34 + " миля");
                    System.out.println(c + " ярд");
                    System.out.println(c*0.91/0.305 + " фут");
                    break;
                case 4:
                    System.out.println(c*0.305 + " метр");
                    System.out.println(c*0.305/1609.34 + " миля");
                    System.out.println(c*0.305/0.91 + " ярд");
                    System.out.println(c + " фут");
                    break;
                default:
                    System.out.println("Неизвестная единица измерения");
                    break;
            }
        }
        else {
            System.out.println("Некорректные данные");
        }
    }
}
