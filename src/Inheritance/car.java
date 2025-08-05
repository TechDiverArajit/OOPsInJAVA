package Inheritance;

public class car {

        double hp;
        int topSpeed;
        int seats;
        String brandName;

        car(){
            this.hp = -100;
            this.topSpeed = -100;
            this.seats = 4;
            this.brandName = "ford";
        }

        car(String brand , int seats){
            this.hp = -100;
            this.topSpeed = -100;
            this.seats = seats;
            this.brandName = brand;
        }

        car(double bhp ,  int topSpeed , int seats , String brandName){
            this.hp = bhp;
            this.topSpeed = topSpeed;
            this.seats = seats;
            this.brandName = brandName;
        }

        car(car c){
            this.hp = c.hp;
            this.brandName = c.brandName;
            this.seats = c.seats;
            this.topSpeed = c.topSpeed;
        }

        void printDetails(){
            System.out.println(this.hp);
            System.out.println(this.brandName);
            System.out.println(this.seats);
            System.out.println(this.topSpeed);
        }

    }

