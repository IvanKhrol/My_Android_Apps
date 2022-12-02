package com.example.diary;
import java.time.LocalDate;

public class Field {
    LocalDate date;
    int time;
    int sugar;
    int XE;
    int insulin;

    Field () {
        date  = LocalDate.of(0, 0, 0);
        sugar = 0;
        XE = 0;
        insulin = 0;
    }

    Field (LocalDate d, int sug) {
        date  = d;
        sugar = s;
    }

    Field (LocalDate d, int sug, int ins) {
        date  = d;
        sugar = s;
        insulin = ins;
    }

    Field (LocalDate d, int sug, int XE, int ins) {
        date  = d;
        sugar = s;
        this.XE = XE;
        insulin = ins;
    }

}

