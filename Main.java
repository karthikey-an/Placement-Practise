import java.util.*;

abstract class Vehicle {
    private String model;
    private int number;

    public Vehicle(String model, int number) {
        this.model = model;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public abstract void displayDetails();
}


class Car extends Vehicle {
    private int doors;

    public Car(String model, int number, int doors) {
        super(model, number);
        this.doors = doors;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: " + getModel());
        System.out.println("Car Number: " + getNumber());
        System.out.println("Number of Doors: " + doors);
    }
}


class Bike extends Vehicle {
    public Bike(String model, int number) {
        super(model, number);
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Model: " + getModel());
        System.out.println("Bike Number: " + getNumber());
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Vehicle Type (Car/Bike): ");
        String type = sc.nextLine();

        System.out.println("Enter Vehicle Model: ");
        String model = sc.nextLine();

        System.out.println("Enter Vehicle Number: ");
        int number = sc.nextInt();

        Vehicle v = null;

        if (type.equals("Car")) {
            System.out.println("Enter number of doors: ");
            int doors = sc.nextInt();
            v = new Car(model, number, doors);
        } else if (type.equals("Bike")) {
            v = new Bike(model, number);
        } else {
            System.out.println("Invalid vehicle type.");
            sc.close();
            return;
        }

        System.out.println("\n--- Vehicle Details ---");
        v.displayDetails();
    }
}

