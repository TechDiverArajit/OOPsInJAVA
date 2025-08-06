package Inheritance;

public  class TypesOfInheritance {

    static class worker{
        int id;
        String name;

        worker(int id, String name){
            this.id = id;
            this.name = name;
        }

        void printDetails(){
            System.out.println(this.id);
            System.out.println(this.name);
        }

    }

    //single inheritance
    static class employee extends worker{
        int salary;
        employee( int empid , String empName ,int empSalary ){
            super(empid,empName);
            this.salary = empSalary;
        }

        @Override
        void printDetails() {
            super.printDetails();
            System.out.println(this.salary);
        }
    }

    //multilevel inheritance

      static class salesman extends employee{
        int inventory;
        salesman(int salesman_id , int salesman_salary , String salesman_name,  int inventory){
            super(salesman_id,salesman_name,salesman_salary);
            this.inventory = inventory;
        }

          @Override
          void printDetails() {
              super.printDetails();
              System.out.println(this.inventory);
          }
      }

      //hierarchical inheritance - where one parent class has more than one derived classes
      static class SDE extends employee{
        String skill;
        SDE(int id , int salary , String name, String skill){
            super(id,name,salary);
            this.skill = skill;
        }
      }



    public static void main(String[] args) {

        salesman s1 = new salesman(02,12000,"Abhinash",2);
        s1.printDetails();


    }
}
