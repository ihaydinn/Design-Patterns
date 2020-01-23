package liskov_subtitution_principle;

public class OracleHelper extends DBHelper {
    @Override
    public void Connect() {
        System.out.println("Oracle'a Bağlan...");
    }

    @Override
    public void Query() {
        System.out.println("PL-SQL");
    }
}
