public class Main {
//    public static class car{
//        int priceInUsd;
//        String brandName;
//
//        public car(int priceInUsd , String brandName ){
//            this.priceInUsd = priceInUsd;
//            this.brandName = brandName;
//        }
//    }

    public static class Student{
        int studentRoll;
        String StudentName;
        float marks;

        Student(int studentRoll , String studentName , float marks){
            this.studentRoll = studentRoll;
            this.StudentName = studentName;
            this.marks = marks;
        }

        void printAll(){
            System.out.println(this.StudentName);
            System.out.println(this.studentRoll);
            System.out.println(this.marks);
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student(9,"Kunal",74.2f);
        Student st2 = new Student(19,"Sanvi",78.9f);
        st1.printAll();
        st2.printAll();

    }
}