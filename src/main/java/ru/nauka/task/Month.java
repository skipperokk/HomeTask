package ru.nauka.task;

public enum Month {
    JANUARY(0, 31, "Январь"),
    FEBRUARY(1, 28, "Февраль"),
    MARCH(2, 31, "Март"),
    APRIL(3, 30, "Апрель"),
    MAY(4, 31, "Май"),
    JUNE(5, 30, "Июнь"),
    JULY(6, 31, "Июль"),
    AUGUST(7, 31, "Август"),
    SEPTEMBER(8, 30, "Сентябрь"),
    OCTOBER(9, 31, "Октябрь"),
    NOVEMBER(10, 30, "Ноябрь"),
    DECEMBER(11, 31, "Декабрь");

    private final int _days;
    private final String _name;
    private final int _nomberOfMonth;

    public int get_days() {
        return _days;
    }

    public int get_nomberOfMonth() {
        return _nomberOfMonth;
    }

    public String get_name() {
        return _name;
    }

    Month(int nomberOfMonth, int days, String name) {
        _nomberOfMonth = nomberOfMonth;
        _days = days;
        _name = name;
    }

    @Override
    public String toString() {
        return get_name();
    }
}
