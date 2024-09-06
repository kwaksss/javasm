package workshop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("자동차 프로그램 실행합니다.");
        System.out.println("운전자정보를 이름,나이,돈 순으로 입력해주세요:");
        String i = in.nextLine();
        int j = in.nextInt();
        double k = in.nextDouble();



        Driver driver1 = new Driver( i, j,k);
        System.out.println(driver1);



        Car car1 = new ElectricCar(01,"modely","white",100.0,20.0,500.0);
        Car car2 = new ElectricCar(02,"ioniq5","silver",80.0,20.0,400.0);
        Car car3 = new HydrogenCar(02,"NEXO","orange",80.0,20.0,200.0);
        Car car4 = new HydrogenCar(02,"mirai","green",80.0,20.0,250.0);
        Car car5 = new EngineCar(02,"BMW5","blue",80.0,20.0);
        Car car6 = new EngineCar(02,"BENZ S","Black",80.0,20.0);

//        Car[] cars = {car1,car2,car3};
//        // 인덱스별로 한 줄씩 출력
//        for (int idx = 0; idx < cars.length; idx++) {
//            System.out.println((idx + 1) + ". " + cars[idx]);
//        }
        System.out.println("자동차 타입 골라보슈:");
        System.out.println("1. 전기차");
        System.out.println("2. 수소 차");
        System.out.println("3. 일반 차");
        int carType = in.nextInt();

        Car selectedCar = null;

        // 2. 선택한 차종에 따른 모델 선택
        switch (carType) {
            case 1:
                System.out.println("전기차 골랐습니다. 차종 선택하세요.:");
                System.out.println("1. 테슬라 모델y");
                System.out.println("2. 현대 아이오닉 5");

                int electricModel = in.nextInt();

                switch (electricModel) {
                    case 1:
                        selectedCar = new ElectricCar(01,"modely","white",100.0,20.0,500.0);
                        break;
                    case 2:
                        selectedCar = new ElectricCar(02,"ioniq5","silver",80.0,20.0,400.0);
                        break;

                    default:
                        System.out.println("Invalid model selected.");
                        break;
                }
                break;

            case 2://수소차 골랐을때
                System.out.println("수소차 골랐네 차종 골라보슈");
                System.out.println("1. 현대 넥쏘");
                System.out.println("2. 도요타 미라이");
                int hydrogenModel = in.nextInt();
                switch (hydrogenModel) {
                    case 1:
                        selectedCar = new HydrogenCar(02,"NEXO","orange",80.0,20.0,200.0);
                        break;
                    case 2:
                        selectedCar = new HydrogenCar(02,"mirai","green",80.0,20.0,250.0);
                        break;
                    default:
                        System.out.println("Invalid model selected.");
                        break;
                }
                break;

            case 3:
                System.out.println("그냥 차 골랐네 차종 ㄱㄱ:");
                System.out.println("1. 비엠5");
                System.out.println("2. 벤츠 S500");

                int engineModel = in.nextInt();
                switch (engineModel) {
                    case 1:
                        selectedCar = new EngineCar(02,"BMW5","blue",80.0,20.0);
                        break;
                    case 2:
                        selectedCar = new EngineCar(02,"BENZ S","Black",80.0,20.0);
                        break;

                    default:
                        System.out.println("Invalid model selected.");
                        break;
                }
                break;

            default:
                System.out.println("Invalid car type selected.");
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
