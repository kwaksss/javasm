package carproject;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //차 객체 3개이상 만들면 못만들어 지게 하기.
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        System.out.println("자동차 프로그램 실행합니다.");
        System.out.println("운전자정보를 이름,나이,돈 순으로 입력해주세요:");
        String i = in.nextLine();
        int j = in.nextInt();
        double k = in.nextDouble();



        Driver driver1 = new Driver( i, j,k);
        System.out.println(driver1);

        Engine engine = new Engine(01,5,100);
        Engine engine2 = new Engine(02,10,200);

        Car car1 = new Car(01,"티코","gold",30.0,10.0,driver1,engine);
        Car car2 = new Car(02,"k5","white",50.0,10.0,driver1,engine2);
        Car car3 = new Car(003,"BMW 5","Black",50.0,10.0,driver1,engine2);

        Car[] cars = {car1,car2,car3};
        // 인덱스별로 한 줄씩 출력
        for (int idx = 0; idx < cars.length; idx++) {
            System.out.println((idx + 1) + ". " + cars[idx]);
        }

        System.out.println("자동차를 선택하세요: 1,2,3번차중:");
        int choice = in.nextInt();
        Car selectedCar = cars[choice-1];
        switch (choice){
            case 1:
                System.out.println("티코 ㅋㅋ");
                break;
            case 2:
                System.out.println("과학 5호기 ㄷㄷ");
                break;
            case 3:
                System.out.println("양카 wow");
                break;

        }

        boolean running = true;
        while(running){
            System.out.println("기능을 고르시오: 1.가기 2.멈춤 3.기름넣기 4.차 정보 5.나가기");
            int action = in.nextInt();

            switch(action){
                case 1:
                    System.out.println("얼마나 갈거냐:");
                    int a = in.nextInt();
                    selectedCar.go(a);

                    break;

                case 2:
                    selectedCar.brake();
                    break;

                case 3:
                    if(selectedCar.getCurrFuel() == selectedCar.getFuelSize()){
                        System.out.println("이미 만땅이야.");
                    }
                    else {
                        System.out.println("얼마치 넣을거임?:");
                        double b = in.nextDouble();
                        if(b > k){
                            System.out.println("돈이 부족합니다.");
                        }
                        selectedCar.addFuel(b);
                        break;

                    }


                case 4:
                    System.out.println("차 넘버: " + selectedCar.getSerial());
                    System.out.println("차 이름: " + selectedCar.getName());
                    System.out.println("차 색상: " + selectedCar.getColor());
                    System.out.println("연료통: " + selectedCar.getFuelSize()+ "L");
                    System.out.println("현재 연료: " + selectedCar.getCurrFuel()+ "L");
                    System.out.println("운전자: " + selectedCar.getDriver().getName() + "님");
                    System.out.println("돈: " + selectedCar.getDriver().getMoney()+"원");
                    System.out.println("파워: " + selectedCar.getEngine().getPower());
                    break;
                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("Try again.");


            }

        }
        System.out.println("Program ended.");
        in.close();











    }


}
