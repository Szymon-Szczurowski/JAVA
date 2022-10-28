package interfaceI;

public interface Browser {
    static final String ENGINE = "WebKit";

    default String getEngine(){
        return Browser.ENGINE;
    };

    public void gotoPage(String url);
    public void refreshPage();
    public void bookmarkPage();
}
