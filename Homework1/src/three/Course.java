public class Course {
    
    private String courseName; 
    private Instructor instructor;
    private Textbook textbook; 

    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName; 
        this.instructor = instructor;
        this.textbook = textbook; 
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName; 
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor; 
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook; 
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor; 
    }

    public Textbook getTextbook() {
        return textbook; 
    }

    public void printCourseInfo() {
        System.out.println("Name course: " + getCourseName());
        System.out.println("Name instructor: " + instructor.getFirstname() + " " + instructor.getLastName());
        System.out.println("Instructor's office: " + instructor.getOfficeNumber());
        System.out.println("Textbook: " + textbook.getTitle());
        System.out.println("Publisher: " + textbook.getPublisher());
    }
}
