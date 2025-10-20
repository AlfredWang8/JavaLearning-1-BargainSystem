import model.Record;
import java.util.Scanner;
import service.AccountService;
import view.Menu;
import util.FileUtils;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        AccountService account = new AccountService();
        account.getRecords().addAll(FileUtils.getRecords());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int choice = menu.displayMainMenu();
            switch (choice) {
                case 1:
                    System.out.print("输入日期 (YYYY-MM-DD): ");
                    String date = scanner.next();
                    System.out.print("输入类型 (收入/支出): ");
                    String type = scanner.next();
                    System.out.print("输入金额: ");
                    double amount = scanner.nextDouble();
                    System.out.print("输入备注: ");
                    String note = scanner.next();
                    Record record = new Record(date, type, amount, note);
                    account.addRecord(record);
                    FileUtils.saveRecords(account.getRecords());
                    break;
                case 2:
                    account.viewRecords();
                    break;
                case 3:
                    System.out.print("输入要删除的记录ID: ");
                    int id = scanner.nextInt();
                    account.DeleteRecord(id);
                    FileUtils.saveRecords(account.getRecords());
                    break;
                case 4:
                    System.out.println("退出程序。");
                    scanner.close();
                    return;
                default:
                    System.out.println("无效选择，请重试。");
            }
        }
    }
}
