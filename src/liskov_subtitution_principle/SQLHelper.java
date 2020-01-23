package liskov_subtitution_principle;

public class SQLHelper extends DBHelper {

    @Override
    public void Connect() {
        System.out.println("SQL'e Bağlan...");
    }

    @Override
    public void Query() {
        System.out.println("T-SQL");
    }
}
