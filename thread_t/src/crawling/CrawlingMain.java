package crawling;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

import callableThread.Task;

public class CrawlingMain {
	
	public final static String ENGINE_URL = ""; // 검색api 신청해서 받아야함.

	public static void main(String[] args) throws Exception {
		
		ExecutorService executor = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
			);

		String[] searchWords = {
			"문재인", "노무현", "안희정", "이명박", "문정인", "추미애",
			"김대중", "유승민", "문재앙", "임종석", "박원순", "이낙연"
		};
		
		List<Callable<List<News>>> taskList = makeTask(searchWords);
		
		List<Future<List<News>>> resultList = executor.invokeAll(taskList);
		
		List<News> list = new ArrayList<News>();
		
		for (Future<List<News>> news: resultList) {
			List<News> newsList = news.get();
			list.addAll(newsList);
		}
		
		printNewsList(list);
		
		executor.shutdown();

	}
	
	public static List<Callable<List<News>>> makeTask(String[] searchWords) {
		List<Callable<List<News>>> taskList = new ArrayList<Callable<List<News>>>();
		
		for(String keyword: searchWords) {
			taskList.add(new Crawling(ENGINE_URL, keyword));
		}
		
		return taskList;
	}
	
	public static void printNewsList(List<News> list) {
		for(News news: list) {
			System.out.println(news.toString());
		}
	}

}
