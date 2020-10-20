import java.util.*;

public class TimeFormatter {

    public static String formatDuration(double sec) {
        //Checks for valid format
        if (sec < 0) {
            return "Are you a time traveler?";
        } else if (sec == 0) {
            return "now";
        }
        //Converts the seconds into their format and puts them into a list
        List<DateFormat> dateFormats = getFormat(sec);

        //Formats and returns the time values
        return formatString(dateFormats);
    }

    private static List<DateFormat> getFormat(double sec) {
        List<DateFormat> list = new LinkedList<>();

        if (sec / Time.YEAR.getSecond() >= 1.0) {
            int years = (int) Math.floor(sec / Time.YEAR.getSecond());
            list.add(new DateFormat(years, Time.YEAR.getName()));
            sec = sec % Time.YEAR.getSecond();
        }
        if (sec / Time.DAY.getSecond() >= 1.0) {
            int days = (int) Math.floor(sec / Time.DAY.getSecond());
            list.add(new DateFormat(days, Time.DAY.getName()));
            sec = sec % Time.DAY.getSecond();
        }
        if (sec / Time.HOUR.getSecond() >= 1.0) {
            int hours = (int) Math.floor(sec / Time.HOUR.getSecond());
            list.add(new DateFormat(hours, Time.HOUR.getName()));
            sec = sec % Time.HOUR.getSecond();
        }
        if (sec / Time.MINUTE.getSecond() >= 1.0) {
            int minutes = (int) Math.floor(sec / Time.MINUTE.getSecond());
            list.add(new DateFormat(minutes, Time.MINUTE.getName()));
            sec = sec % Time.MINUTE.getSecond();
        }
        if (sec > 0.0) {
            int seconds = (int) sec;
            list.add(new DateFormat(seconds, Time.SECOND.getName()));
        }

        return list;
    }

    private static String formatString(List<DateFormat> list) {
        StringBuilder format = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            DateFormat time = list.get(i);
            format.append(time.getTime());
            format.append(time.getType());
            if (list.size() == 1) {
                break;
            }

            if (i + 1 < list.size() - 1) {
                format.append(", ");
            } else if (i + 1 == list.size() - 1) {
                format.append(" and ");
            } else {
                break;
            }
        }

        return format.toString();
    }

}
