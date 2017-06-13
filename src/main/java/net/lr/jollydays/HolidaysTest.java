package net.lr.jollydays;

import java.util.Set;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import de.jollyday.Holiday;
import de.jollyday.HolidayManager;
import de.jollyday.parameter.CalendarPartManagerParameter;

@Component(immediate=true)
public class HolidaysTest {

    @Activate
    public void start()  {
        HolidayManager manager = HolidayManager.getInstance(new CalendarPartManagerParameter("de", null));
        Set<Holiday> holidays = manager.getHolidays(2017);
        for (Holiday holiday : holidays) {
            System.out.println(holiday.getDate());
        }
    }
}
