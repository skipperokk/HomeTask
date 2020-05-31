package ru.nauka.task.Model;

import lombok.Data;

import java.io.Serializable;
import java.util.Calendar;

@Data
public class UserCalendarId implements Serializable {
    private Calendar caldate;

    private Long user_iduser;

    public UserCalendarId(Calendar caldate, Long user_iduser) {
        this.caldate = caldate;
        this.user_iduser = user_iduser;
    }

    public UserCalendarId() {
    }
}
