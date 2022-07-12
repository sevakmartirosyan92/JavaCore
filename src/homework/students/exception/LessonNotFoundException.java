package homework.students.exception;

public class LessonNotFoundException extends Exception {

    public LessonNotFoundException() {
    }

    public LessonNotFoundException(String message) {
        super(message);
    }
}