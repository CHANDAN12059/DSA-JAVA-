package priorityQueue;

import java.util.PriorityQueue;

public class priorityObjects {
    
    public static class Student implements Comparable<Student>{

        String name;
        int rank;

        Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }

        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }



    }
    public static void main(String[] args) {
        
PriorityQueue<Student> p=new PriorityQueue<>();


p.add(new Student("chandan",2));
p.add(new Student("Anurag",1));
p.add(new Student("Jashan",200));
p.add(new Student("Aditya",15));



while(!p.isEmpty()){
    System.out.print(p.peek().name+" "+p.peek().rank+" ");
    p.remove();
}
    }
}
