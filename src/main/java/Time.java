public enum Time {
    YEAR(31556926, "year"),
    DAY(86400, "day"),
    HOUR(3600, "hour"),
    MINUTE(60, "minute"),
    SECOND(1, "second");

    private int second;
    private String name;

    Time(int second, String name) {
        this.second = second;
        this.name = name;
    }

    public int getSecond() {
        return second;
    }

    public String getName() {
        return name;
    }
}
