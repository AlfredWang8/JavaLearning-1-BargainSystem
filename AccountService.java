package service;
import model.Record;
import java.util.List;
import java.util.ArrayList;

public class AccountService {
    private List<Record> records = new ArrayList<>();
    public void addRecord(Record record) {
        // 这里可以添加记录到数据库或文件的逻辑
        System.out.println("添加记录: " + record.getDate() + ", " + record.getAmount() + ", " + record.getNote());
        records.add(record);
    }
    public void viewRecords() {
        // 这里可以从数据库或文件读取记录的逻辑
        System.out.println("查看所有记录");
        if(records.isEmpty()) {
            System.out.println("没有记录。");
        } else {
            for (Record record : records) {
                System.out.println(record);
            }
        }
    }

    public void DeleteRecord(int id) {
        // 这里可以删除指定ID的记录的逻辑
        System.out.println("删除记录ID: " + id);
        if (id >= 0 && id < records.size()) {
            records.remove(id);
            System.out.println("记录已删除。");
        } else {
            System.out.println("记录ID无效。");
        }
    }

    public List<Record> getRecords() {
        return records;
    }
}
