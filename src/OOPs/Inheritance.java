package OOPs;

public class Inheritance {

    static class Employee{
        int id;
        int salary;
        String name;

        Employee(int emp_id , int emp_salary, String emp_name){
            this.id = emp_id;
            this.salary = emp_salary;
            this.name = emp_name;
        }

        void printDetails(){
            System.out.println(this.id);
            System.out.println(this.name);
            System.out.println(this.salary);

        }

    }

    static class Salesman extends Employee{

        int inventoryProducts;

        Salesman(int salesman_id , int salesman_salary , String salesman_name , int inventoryProducts ){
            super(salesman_id , salesman_salary , salesman_name);
            this.inventoryProducts = inventoryProducts;

        }

    }


    public static void main(String[] args) {

        Employee em1 = new Employee(01,18000,"Amal singh");
//        em1.printDetails();

        Salesman s1 = new Salesman(9,12000,"Kunal biswas",121);
        Salesman s2 = new Salesman(19,14000,"rahul saha",161);
        s1.printDetails();
        s2.printDetails();

    }
}
