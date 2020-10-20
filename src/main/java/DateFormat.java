public class DateFormat {

    private final int time;
    private final String type;


    public DateFormat(int time, String type) {
        this.time = time;
        this.type = type;
    }

    public int getTime() {
        return time;
    }

    public String getType() {
        return isPlural();
    }

    private String isPlural() {
        if (time > 1) {
            return " " + this.type + "s";
        } else {
            return " " + this.type;
        }
    }
}
