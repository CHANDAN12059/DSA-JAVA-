package oops.classAndConstructor;

class Student {

    String name;
    int roll;
    String password;
    int marks[]=new int[3];

    Student() {
        System.out.println("Constructor calling");
    }

    //shallow copy

    // Student(Student s1) {
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks=s1.marks;
    // }



    //deep copy

      Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
       for(int i=0;i<marks.length;i++){
        marks[i]=s1.marks[i];
       }
    }


}

public class basics1 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "chandan";
        s1.roll = 16;
        s1.password = "abc";
        s1.marks[0]=12;
        s1.marks[1]=13;
        s1.marks[2]=14;



        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[0]=20;
        s1.marks[1]=30;
        s1.marks[2]=40;
        
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
}
