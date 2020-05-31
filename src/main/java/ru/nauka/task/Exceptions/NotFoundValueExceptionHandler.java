package ru.nauka.task.Exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@ControllerAdvice
public class NotFoundValueExceptionHandler extends ResponseEntityExceptionHandler {
    private static final String REDIRECT_ERROR = "redirect:/error";

    @ExceptionHandler
    public String handleUserNotFound(ThereIsNoSuchUserException e, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("errorMessage", e.getMessage());
        return REDIRECT_ERROR;
    }
}
