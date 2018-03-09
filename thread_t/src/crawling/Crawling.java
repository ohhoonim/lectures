package crawling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

import javax.net.ssl.HttpsURLConnection;

public class Crawling implements Callable<List<News>> {

	public final static String SAVE_FOLDER = "D:\\temp";
	private String searchUrl ;
	private String searchWord ;
	
	public Crawling (String url, String word) {
		this.searchUrl = url;
		this.searchWord = word;
	}
	
	
	@Override
	public List<News> call() throws Exception {
		// TODO	우선은 URL 호출한 것을 파일로 저장하는 것 까지만 구현
		// 차후 api 신청해서 받는 결과를 저장하는 로직으로 변경
		// json 형태가 될 듯.
		List<News> list = new ArrayList<News>();
		
		URL url = new URL(this.searchUrl+searchWord);
		URLConnection conn = url.openConnection();
		conn.addRequestProperty("User-Agent", "Mozilla/4.0");
		
		InputStream urlInput = conn.getInputStream();
		InputStreamReader isr = new InputStreamReader(urlInput, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		
		
		FileOutputStream fos = new FileOutputStream(SAVE_FOLDER + "\\" + this.makeFileName());
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
				
		String line = "";
		while((line = br.readLine()) != null) {
			bw.write(line);
		}
		
		br.close();
		bw.close();
		
		return list;
	}
	
	private String makeFileName() {
		Date today = new Date();
		return this.searchWord + "_" + today.getTime() + ".html";
	}

}
