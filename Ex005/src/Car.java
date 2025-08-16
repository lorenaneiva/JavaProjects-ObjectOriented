import java.util.*;

public class Car {
    private String brand, model;
    private int year;

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }
    
    public void showCar(){
        System.out.printf("Information about the car: %nBrand: %s%nModel:%s%nYear: %d%n",this.brand, this.model, this.year);
    }

    public static void startCar(List<Car> cars, Scanner sc){ /*Scanner comes from main, preventing the Car class from handling data entry*/
        System.out.printf("Choose one of the cars: %s(type1) or %s(type 2)%n", cars.get(0).brand, cars.get(1).brand);
        int choosingCar = sc.nextInt();

    if (choosingCar == 1) {
        System.out.println("To start the car, press s");
        String button = sc.next().trim();// trim() remove spaces

        if("s".equalsIgnoreCase(button)){
            System.out.printf("The %s has been start, don't forget your seatbelt, drive safely.%n", cars.get(0).brand);
        } else{
            System.out.println("invalid button, try again.");
        }

    } else if(choosingCar == 2){
      System.out.println("To start the car, press s.%n");
      String button = sc.next().trim();

        if("s".equalsIgnoreCase(button)){
                System.out.printf("The %s has been start, don't forget your seatbelt, drive safely.%n", cars.get(1).brand);
            } else{
                System.out.println("invalid button, try again.");
            }

    } else {
        System.out.println("invalid button, try again.");
    }
    }
}

