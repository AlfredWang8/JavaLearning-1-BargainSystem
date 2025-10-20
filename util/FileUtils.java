package util;
import java.io.File;
import model.Record;
import java.util.*;

public class FileUtils {
    private static final String FILE_PATH = "data/records.txt";

    public static void saveRecords(List<Record> records) {
        try (java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter(FILE_PATH))) {
            for (Record record : records) {
                writer.write(record.getDate() + "," + record.getType() + "," + record.getAmount() + "," + record.getNote());
                writer.newLine();
            }
        } catch (java.io.IOException e) {
            System.out.println("保存记录时出错: " + e.getMessage());
        }
    }

    public static List<Record> getRecords() {
        List<Record> records = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return records; // 文件不存在，返回空列表
        }
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String date = parts[0];
                    String type = parts[1];
                    double amount = Double.parseDouble(parts[2]);
                    String note = parts[3];
                    records.add(new Record(date, type, amount, note));
                }
            }
        } catch (java.io.IOException e) {
            System.out.println("读取记录时出错: " + e.getMessage());
        }
        return records;
    }
}

