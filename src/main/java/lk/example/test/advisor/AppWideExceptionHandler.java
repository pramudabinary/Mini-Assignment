package lk.example.test.advisor;

import lk.example.test.exception.NotFoundException;
import lk.example.test.exception.ValidateException;
import lk.example.test.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 1/20/22
 **/

@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity handleException(Exception e){
        return new ResponseEntity(new StandardResponse("500","Error",
                e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity handleNotFoundException(Exception e){
        return new ResponseEntity(new StandardResponse("404","Error",
                e.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ValidateException.class)
    public ResponseEntity handleValidateException(Exception e){
        return new ResponseEntity(new StandardResponse("400","Error",
                e.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
