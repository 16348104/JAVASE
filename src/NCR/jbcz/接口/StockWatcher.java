package NCR.jbcz.接口;

/**
 * Created by zb on 2018/2/25.
 */
public interface StockWatcher {//接口声明
    final String sunTicker = "SUNW";  //常量声明
    final String oracleTicker = "ORCL";
    final String ciscoTicker = "CSCO";

    void valueChanged(String tickerSymbol, double newValue);//方法声明

}
