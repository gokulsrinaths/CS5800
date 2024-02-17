public class Aggregation {
    public static void main(String[] args) {
        Instructor instructorOne = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbookOne = new Textbook("Clean Code", "Robert C Martin", "Prentice Hall");
        Course courseOne = new Course("Advanced Software Engineering", instructorOne, textbookOne);
        
        Instructor instructorTwo = new Instructor("Dave", "Johannsen", "3-302");
        Textbook textbookTwo = new Textbook("Computer Organization and Design", "David A. Patterson", "John L. Hennessy");
        Course courseTwo = new Course("Advanced Computer Architecture", instructorTwo, textbookTwo);


        courseOne.printCourseInfo();
        System.out.println(""); 
        courseTwo.printCourseInfo();

}
}
