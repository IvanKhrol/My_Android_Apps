package com.example.diary;
import java.time.LocalDateTime;

TODO: 
//может быть лучше все поля педелать в sting?

public class Field {
    String date[] = new String[3];    // date format "dd.mm.yy"
    String time[] = new String[2];    // time format "hh:mm"
    int sugar;
    int XE;
    int insulin;

//==================================================================================================================================
//                                                           Сonstructor
//==================================================================================================================================


    Field() {
        for (int i = 0; i < 2; ++i) {
            this.date[i] = "00";
            this.time[i] = "00";
        }
        this.date[2] = "00";
        this.sugar = 0;
        this.XE = 0;
        this.insulin = 0;
    }

    Field(LocalDateTime d, int sug) {
        this()
        this.date[0] = d.getDayOfMonth().toString();
        this.date[1] = d.getYear().toString();
        this.date[2] = d.getMonthValue().toString();
        this.time[0] = d.getHour().toString();
        this.time[1] = d.getMinute().toString();
        this.sugar = sug;
    }

    Field(LocalDateTime d, int sug, int ins) {
        this(d, sug)
        this.insulin = ins;
    }

    Field(LocalDateTime d, int sug, int XE) {
        this(d, sug)
        this.XE = XE;
    }

    Field(LocalDateTime d, int sug, int XE, int ins) {
        this(d, sug)
        this.XE = XE;
        this.insulin = ins;
    }

//==================================================================================================================================
//                                                              Functions
//==================================================================================================================================


    void display() {
        System.out.printf("%s.%s.%s | %s:%s | %d | %d | %d\n", date[0], date[1], date[2], time[0], time[1] sugar, XE, insulin);
    }
}


