package edu.iis.mto.time;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

public class FakeClock {

    public List<DateTime> returnDates;

    public FakeClock() {
        this.returnDates = new ArrayList<>();
    }

    public void addDateToReturn(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour) {
        returnDates.add(new DateTime(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour));
    }

    public DateTime getDate() {
        return returnDates.remove(0);
    }
}
