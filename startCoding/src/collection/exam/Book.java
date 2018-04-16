package collection.exam;

public class Book implements Comparable<Book>{
	private String no       ;	
	private String name    	;	
	private String writer	;	
	private String keyword	;	
	private int    year		;	
	private String kdc		;
	
	public Book() {
		
	}
	
	public Book( String no , String name
			, String writer , String keyword
			, int year , String kdc ) {
		
		this.no      = no       ;
		this.name    = name    	;
		this.writer	 = writer	;
		this.keyword = keyword	;
		this.year	 = year		;
		this.kdc	 = kdc		;
		
	}
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getKdc() {
		return kdc;
	}
	public void setKdc(String kdc) {
		this.kdc = kdc;
	}
	
	@Override
	public String toString() {
		return 
				this.no      + " | " +
				this.name    + " | " +
				this.writer	 + " | " +
				this.keyword + " | " +
				this.year	 + " | " +
				this.kdc	;		
	}

	// 기본 정렬 방식은 year(년도별) 
	@Override
	public int compareTo(Book book) {		
		return this.year - book.getYear();
	}

}
