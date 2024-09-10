package practice;

public class GenericExample {
    public static void main(String[] args) {

        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();//HomeAgency 객체속 rent()메소드
        home.turnOnLight();
    }
}
