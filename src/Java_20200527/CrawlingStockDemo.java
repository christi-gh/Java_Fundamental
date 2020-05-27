package Java_20200527;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingStockDemo {
	public static void main(String[] args) {
		String url = "https://finance.naver.com/item/sise_day.nhn?code=005930";
		
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("날짜\t"+"\t종가\t"+"전일비\t"+"시가\t"+"고가\t"+"저가\t"+"거래량\n");
		Elements trElements = doc.select(".type2 tr");
		

		for(int i=0; i<trElements.size(); i++) {
			if(i==0 || i==1 || i==7 ||i ==8||i==9 ||i==15) continue;
			
			Element trElement = trElements.get(i);
			String date = trElement.child(0).text();
			String close = trElement.child(1).text();
			String dayBeforeRatio = trElement.child(2).text();
			String open = trElement.child(3).text();
			String high = trElement.child(4).text();
			String low = trElement.child(5).text();
			String volume = trElement.child(6).text();
			System.out.println(date+"\t"+close+"\t"+dayBeforeRatio+"\t"+open+"\t"+high+"\t"+low+"\t"+volume+"\n");
			
		}
	} 

}
