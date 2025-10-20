package view;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

    public int displayMainMenu() {
        System.out.println("===主菜单===");
        System.out.println("1. 添加记录");
        System.out.println("2. 查看记录");
        System.out.println("3. 删除记录");
        System.out.println("4. 退出");
        System.out.print("请选择操作（1-4）：");
        return scanner.nextInt();
    }
}
