package net.lr.jollydays;

import java.util.Set;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import de.jollyday.Holiday;
import de.jollyday.HolidayCalendar;
import de.jollyday.HolidayManager;

@Component(immediate=true)
public class HolidaysTest {

    @Activate
    public void start()  {
        Thread.currentThread().setContextClassLoader(HolidayManager.class.getClassLoader());
        HolidayManager manager = HolidayManager.getInstance(HolidayCalendar.GERMANY);
        Set<Holiday> holidays = manager.getHolidays(2017);
        for (Holiday holiday : holidays) {
            System.out.println(holiday.getDate());
        }
    }
}
