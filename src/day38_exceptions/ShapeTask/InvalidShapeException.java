package day38_exceptions.ShapeTask;

public class InvalidShapeException extends RuntimeException {

    public InvalidShapeException(String message){
        super(message);
    }

}
