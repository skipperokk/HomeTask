package ru.nauka.task.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR, reason = "There is no such user")
public class ThereIsNoSuchUserException extends RuntimeException {
}
