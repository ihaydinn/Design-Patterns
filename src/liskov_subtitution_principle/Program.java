package liskov_subtitution_principle;

public class Program {

    public static void main(String[] args) {
        SQLHelper sqlHelper = new SQLHelper();
        Baglan(sqlHelper);
        Sorgula(sqlHelper);

        OracleHelper oracleHelper = new OracleHelper();
        Baglan(oracleHelper);
        Sorgula(oracleHelper);
    }

    static void Baglan(DBHelper dbHelper){
        dbHelper.Connect();
    }

    static void Sorgula(DBHelper dbHelper){
        dbHelper.Query();
    }

}
