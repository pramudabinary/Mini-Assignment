package lk.example.test.exception;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 1/20/22
 **/


public class NotFoundException extends RuntimeException{

    public NotFoundException(String message) {
        super(message);
    }
}
