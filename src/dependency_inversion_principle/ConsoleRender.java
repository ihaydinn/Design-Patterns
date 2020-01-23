package dependency_inversion_principle;

public class ConsoleRender implements IRenderer {
    @Override
    public void Display(String content) {
        System.out.println(content);
    }
}
