import java.util.Scanner;

public class PowerNumberCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı giriniz : ");
        int number = scanner.nextInt(); //üssü alınacak rakam girdisi alınıyor.

        System.out.print("Üssü giriniz : ");
        int power = scanner.nextInt(); //üs yazılacak rakam  girdisi alınıyor.

        int result = power(number,power); //recursive metodu çağırıyoruz sonuç için

        System.out.println(number +  " ^ " + power + " = " + result); //Ekrana sonucu yazdıran blok

    }

    private static int power (int number,int power){
        if (power == 0) return 1; //power 0 a eşitlendiğinde 1 e dön yani eğer üs 0 olursa her zaman sonuç 1 çıkacaktır

        return number * power (number,power-1); //Buradaki mantık sayı her kendisiyle çarpıldığında power -1 düşecek
                                                      //Örnek olarak 2 ^ 3 sayı 2*2 olduğunda 3-1 2*2 olduğunda 2-1 2*2 olduğunda 1-1 sonucunda 2 kendisiyle 3 kere çarpıldı.
    }

}
