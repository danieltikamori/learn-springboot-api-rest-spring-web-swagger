package cc.tkmr.learnspringbootapirestspringwebswagger.handler;

import jakarta.annotation.Resource;
import org.springframework.cglib.proxy.UndeclaredThrowableException;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Locale;

@RestControllerAdvice // Global exception handler
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @Resource // Inject MessageSource

    /**
     * Customize headers
     *
     * @return         HttpHeaders object with customized headers
     */
    private MessageSource messageSource; // Capture source messages of exceptions
    private HttpHeaders headers(){ // Customize headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    /**
     * A function to customize the response error message.
     *
     * @param  message    the error message to be set
     * @param  statusCode the HTTP status code to be set
     * @return           the customized response error
     */
    private ResponseError responseError(String message,HttpStatus statusCode){ // Customize response
        ResponseError responseError = new ResponseError();
        responseError.setStatus("error"); // Customize if you will
        responseError.setError(message);
        responseError.setStatusCode(statusCode.value());
        return responseError;
    }
    /**
     * A description of the entire Java function.
     *
     * @param  e       verify if it is a business exception
     * @param  request description of parameter
     * @return         description of return value
     */
    @ExceptionHandler(Exception.class) // Catch all exceptions
    private ResponseEntity<Object> handleGeneral(Exception e, WebRequest request) { // verify if it is a business exception
        if (e.getClass().isAssignableFrom(UndeclaredThrowableException.class)) {
            UndeclaredThrowableException exception = (UndeclaredThrowableException) e;
            return handleBusinessException((BusinessException) exception.getUndeclaredThrowable(), request);
        } else {
            String message = messageSource.getMessage("error.server", new Object[]{e.getMessage()}, Locale.getDefault());
            ResponseError error = responseError(message, HttpStatus.INTERNAL_SERVER_ERROR);
            return handleExceptionInternal(e, error, headers(), HttpStatus.INTERNAL_SERVER_ERROR, request);
        }
    }
    /**
     * If it is a business exception, handle it. Build a Response error.
     *
     * @param  e        description of parameter
     * @param  request  description of parameter
     * @return          description of return value
     */
    @ExceptionHandler({BusinessException.class}) // If it is a business exception, handle it. Build a Response error.
    private ResponseEntity<Object> handleBusinessException(BusinessException e, WebRequest request) {
        ResponseError error = responseError(e.getMessage(),HttpStatus.CONFLICT);
        return handleExceptionInternal(e, error, headers(), HttpStatus.CONFLICT, request);
    }
}
