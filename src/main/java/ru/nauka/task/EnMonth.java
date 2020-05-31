package ru.nauka.task;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class EnMonth {

    public List<String> dOf(int month) {
        String nameOfMonth;
        switch (month){
            case 0: nameOfMonth="JANUARY";
            break;
            case 1: nameOfMonth="FEBRUARY";
                break;
            case 2: nameOfMonth="MARCH";
                break;
            case 3: nameOfMonth="APRIL";
                break;
            case 4: nameOfMonth="MAY";
                break;
            case 5: nameOfMonth="JUNE";
                break;
            case 6: nameOfMonth="JULY";
                break;
            case 7: nameOfMonth="AUGUST";
                break;
            case 8: nameOfMonth="SEPTEMBER";
                break;
            case 9: nameOfMonth="OCTOBER";
                break;
            case 10: nameOfMonth="NOVEMBER";
                break;
            case 11: nameOfMonth="DECEMBER";
                break;
            default: nameOfMonth="JANUARY";
        }

        Month day = Month.valueOf(nameOfMonth);
        List<String> list = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(2019, day.get_nomberOfMonth(), 0);
        SimpleDateFormat d = new SimpleDateFormat("d");
        for (int i = 0; i < day.get_days(); i++) {
            calendar.add(Calendar.DAY_OF_WEEK, 1);
            list.add(d.format(calendar.getTime()));
        }
        return list;
    }
}
