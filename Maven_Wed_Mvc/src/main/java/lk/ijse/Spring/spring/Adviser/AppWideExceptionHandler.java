package lk.ijse.Spring.spring.Adviser;

import lk.ijse.Spring.spring.Utill.ResponseUtill;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@CrossOrigin
public class AppWideExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({RuntimeException.class})
    public ResponseUtill handleMyExceptions(RuntimeException e){
        System.out.println(e.getMessage());
        return new ResponseUtill("Error",e.getMessage(),null);
    }
}
