package dependency_inversion_principle;

public class WebRender implements IRenderer {
    @Override
    public void Display(String content) {
        System.out.println("<b>" + content + "<b>");
    }
}
