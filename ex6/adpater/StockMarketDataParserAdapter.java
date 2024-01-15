
// StockMarketDataParserAdapter.java
public class StockMarketDataParserAdapter implements CSVParser {
    private StockMarketDataParser stockMarketParser;

    public StockMarketDataParserAdapter(StockMarketDataParser stockMarketParser) {
        this.stockMarketParser = stockMarketParser;
    }

    @Override
    public void parseCSV() {
        stockMarketParser.parseFromCSV();
    }
}
