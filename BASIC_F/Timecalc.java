import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Timecalc {
    public static void main(String args[]) {
        LocalDate today = LocalDate.now();  // Initialize today with the current date

        LocalDate firstDayOfNextMonth = today.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(firstDayOfNextMonth);  // Outputs the first day of the next month

        LocalDate dateOfNextSaturday = today.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println(dateOfNextSaturday);  // Outputs the next Monday
    }
}
