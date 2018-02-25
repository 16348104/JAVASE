package NCR.jbcz.接口;

import java.applet.Applet;

/**
 * Created by zb on 2018/2/25.
 */
public class StockApplet extends Applet implements StockWatcher {
    @Override
    public void valueChanged(String tickerSymbol, double newValue) {  //接口实现
        if (tickerSymbol.equals(sunTicker)) {

        } else if (tickerSymbol.equals(oracleTicker)) {

        } else if (tickerSymbol.equals(ciscoTicker)) {

        }
    }
}