package Inheritance;

public class Supercar extends car{
    int engineV;
    Supercar(){
        this.engineV = -4;
    }

    Supercar(String brand , int seats , int engineV){
        super(brand,seats);
        this.engineV = engineV;

    }

    Supercar(Supercar s){
        super(s);
        engineV = s.engineV;
    }

    Supercar(double hp , int seats , int topSpeed , String brand , int engineV){
        super(hp,seats,topSpeed,brand);
        this.engineV = engineV;
    }


    void printDetails() {
        super.printDetails();
        System.out.println(this.engineV);
    }


    public static void main(String[] args) {
        Supercar s1 = new Supercar();


//        car c1 = new car();
//        c1.printDetails();
        car c1 = new Supercar(289,2,125,"BMW",4);
        System.out.println(c1.brandName);





    }
}
