package dependency_inversion_principle;

public class DBFinder implements IFinder {
    @Override
    public String Find(String name) {
        return name + "ürün veritabanında bulundu!";
    }
}
