package dependency_inversion_principle;

public class Stock {

    private IFinder iFinder;
    private IRenderer iRenderer;

    public Stock(IFinder iFinder, IRenderer iRenderer) {
        this.iFinder = iFinder;
        this.iRenderer = iRenderer;
    }

    public void DisplayStockInfo(String name){
        iRenderer.Display(iFinder.Find(name));
    }

}
