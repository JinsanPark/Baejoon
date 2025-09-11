import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int startCash = Integer.parseInt(br.readLine());

        int jCash = startCash;
        int sCash = startCash;


        String[] inPutStockPrices = br.readLine().split(" ");

        int[] stockPrices = new int[inPutStockPrices.length];



        for (int i = 0; i < inPutStockPrices.length; i++) {
            stockPrices[i] = Integer.parseInt(inPutStockPrices[i]);
        }

        int jStockCount = 0;
        int sStockCount = 0;
        int stockRedDay = 0;
        int stockBlueDay = 0;

        for (int i = 0; i < 14; i++) {

            if ( jCash >= stockPrices[i]) {

                int jTodayBuyStockCount = jCash/stockPrices[i];
                jStockCount += jCash/stockPrices[i];
                jCash -= stockPrices[i] * jTodayBuyStockCount;

            }

            if ( i >= 1) {
                if( stockPrices[i] != stockPrices[i-1]) {

                    if ( stockPrices [i] > stockPrices[i-1]) {
                        stockRedDay++;
                        stockBlueDay = 0;
                    }

                    if ( stockPrices [i] < stockPrices[i-1]) {
                        stockBlueDay++;
                        stockRedDay = 0;
                    }
                } else if (stockPrices[i] == stockPrices[i - 1]) {
                    stockRedDay = 0;
                    stockBlueDay = 0;
                }
            }
            
            if (stockBlueDay == 3) {
                int sTodayBuyStockCount = sCash/stockPrices[i];
                sStockCount += sCash/stockPrices[i];
                sCash -= stockPrices[i] * sTodayBuyStockCount;
            }

            if (stockRedDay == 3) {

                sCash += sStockCount * stockPrices[i];
                sStockCount = 0;

            }
        }

        int jTotal = stockPrices[13] * jStockCount + jCash;
        int sTotal = stockPrices[13] * sStockCount + sCash;
        
        if (jTotal > sTotal) {
            System.out.println("BNP");
        } else if (jTotal < sTotal) {
            System.out.println("TIMING");
        } else if (jTotal == sTotal) {
            System.out.println("SAMESAME");
        }


    }
}