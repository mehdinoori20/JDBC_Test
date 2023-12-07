import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DBConnection dataSource = new DBConnection();
        dataSource.open();

        System.out.println(dataSource.queryCategories());
        ArrayList<Category> categories = dataSource.queryCategories();
        for (Category katt: categories) {
            System.out.println(katt.toString());
        }
        dataSource.createTable();
    }
}