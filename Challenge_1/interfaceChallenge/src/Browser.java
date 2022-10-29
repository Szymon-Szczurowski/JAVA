public interface Browser {
   final static String ENGINE = "WebKit";

   default String getEngine(){
       return Browser.ENGINE;
   }

   public void gotoPage(String url);
   public void refreshPage();
   public void bookmarkPage();



}
