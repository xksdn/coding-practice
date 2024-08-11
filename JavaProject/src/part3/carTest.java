package part3;

import model.carDTO;

import java.util.Scanner;

public class carTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        carDTO car = new carDTO();

        System.out.print("자동차 일련번호: ");
        int carSn = sc.nextInt();
        sc.nextLine();  // 남아있는 newline 문자 제거

        System.out.print("자동차 이름: ");
        String carName = sc.nextLine();

        System.out.print("자동차 가격: ");
        int carPrice = sc.nextInt();
        sc.nextLine();  // 남아있는 newline 문자 제거

        System.out.print("자동차 소유자: ");
        String carOwner = sc.nextLine();

        car.carName = carName;
        car.carOwner = carOwner;
        car.carSn = carSn;
        car.carPrice = carPrice;

        carInfo(car);

        car.toString();
    }

    public static void carInfo(carDTO car) {
        System.out.println(car.carName + "\t" + car.carPrice + "\t" + car.carOwner + "\t" + car.carSn);
    }
}