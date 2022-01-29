package org.dvavoly.javacore.chapter18;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumSetDemo {
    public static void main(String[] args) {
        Set<days> workDays = EnumSet.of(
                    days.MONDAY,
                    days.TUESDAY,
                    days.WEDNESDAY,
                    days.THURSDAY,
                    days.FRIDAY);
        Iterator<days> daysIterator = workDays.iterator();
        while (daysIterator.hasNext()) {
            System.out.println(daysIterator.next());
        }
    }
}
