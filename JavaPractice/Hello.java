package power_training;

import java.util.Arrays;

//1. Implement Comparable interface
class Student implements Comparable<Student> {
 String name;
 int id;

 public Student(String name, int id) {
     this.name = name;
     this.id = id;
 }

 // 2. Define the "Natural Order" (Sorting by ID)
 @Override
 public int compareTo(Student other) {
     // Returns negative if this.id < other.id
     // Returns zero if they are equal
     // Returns positive if this.id > other.id
     return Integer.compare(this.id, other.id);
 }

 @Override
 public String toString() {
     return name + "(" + id + ")";
 }
}

public class Hello {
 public static void main(String[] args) {
     Student[] students = {
         new Student("Charlie", 103),
         new Student("Alice", 101),
         new Student("Bob", 102)
     };

     // 3. Arrays.sort() now knows how to handle Student objects
     Arrays.sort(students);

     System.out.println("Sorted by ID (Natural Order):");
     // --- FOR-EACH LOOP IMPLEMENTATION ---
     // Syntax: for (Type variable : array)
     for (Student s : students) {
         System.out.println("- " + s); 
     } }
}
