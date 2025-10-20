package model;

public class Record {
    private final String date;
    private final String type; // 收入 or 支出
    private final double amount;
    private final String note;

    public Record(String date, String type, double amount, String note) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.note = note;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getNote() {
        return note;
    }

    // getter / setter / toString
    public String toString() {
        return date + " | " + type + " | " + amount + " | " + note;
    }
}


