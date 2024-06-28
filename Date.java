class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void display() {
        System.out.printf("%02d/%02d/%04d", day, month, year);
    }
}
