package dependency_inversion_principle;

public class WSFinder implements IFinder {
    @Override
    public String Find(String name) {
        return name + "isimli ürün Web Servis aracılığı ile bulundu!";
    }
}
