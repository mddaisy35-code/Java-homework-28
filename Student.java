public class Student{

  public static void main(String[] args) {

    int marks = 120;

  try {

   System.out.println("Student Marks: " + marks);

   if (marks < 0 || marks > 100) {

   throw new IllegalArgumentException(
   "Marks must be between 0 and 100");
   }

    System.out.println("Valid Marks");
    System.out.println("Marks Stored: " + marks);

 } 
   catch (IllegalArgumentException e) {

    System.out.println("Exception: " + e.getMessage());
 } 
    finally {

    System.out.println("Marks Validation Completed");

        }
    }
}