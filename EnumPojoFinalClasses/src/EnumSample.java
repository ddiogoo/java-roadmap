public enum EnumSample {
    MONDAY(101, "1st day of the week"),
    TUESDAY(102, "2st day of the week"),
    WEDNESDAY(103, "3st day of the week"),
    THURSDAY(104, "4st day of the week"),
    FRIDAY(105, "5st day of the week"),
    SATURDAY(106, "its 1st weekoff"),
    SUNDAY(107, "its 2st weekoff");

    private int val;
    private String comment;

    EnumSample(int val, String comment) {
        this.val = val;
        this.comment = comment;
    }

    public int getVal() {
        return val;
    }

    public String getComment() {
        return comment;
    }

    public static EnumSample getEnumFromValue(int value) {
        for (EnumSample enumSample : EnumSample.values()) {
            if (enumSample.getVal() == value)
                return enumSample;
        }
        return null;
    }
}
