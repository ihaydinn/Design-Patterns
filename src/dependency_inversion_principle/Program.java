package dependency_inversion_principle;

public class Program {

    public static void main(String[] args) {

        DBFinder dbFinder = new DBFinder();
        WebRender webRender = new WebRender();

        Stock stock = new Stock(dbFinder, webRender);
        stock.DisplayStockInfo("Çamaşır Makinası ");



    }

}
