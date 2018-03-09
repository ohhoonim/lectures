package collections;

public class Book {
	private String 등록번호;
	private String 도서명;
	private String 저자;
	private String 키워드;
	private String 발행년도;
	private String KDC분류기호;

	public Book(String 등록번호, String 도서명, String 저자, String 키워드, String 발행년도, String KDC분류기호) {
		this.등록번호 = 등록번호;
		this.도서명 = 도서명;
		this.저자 = 저자;
		this.키워드 = 키워드;
		this.발행년도 = 발행년도;
		this.KDC분류기호 = KDC분류기호;

	}

	public String get등록번호() {
		return 등록번호;
	}

	public void set등록번호(String 등록번호) {
		this.등록번호 = 등록번호;
	}

	public String get도서명() {
		return 도서명;
	}

	public void set도서명(String 도서명) {
		this.도서명 = 도서명;
	}

	public String get저자() {
		return 저자;
	}

	public void set저자(String 저자) {
		this.저자 = 저자;
	}

	public String get키워드() {
		return 키워드;
	}

	public void set키워드(String 키워드) {
		this.키워드 = 키워드;
	}

	public String get발행년도() {
		return 발행년도;
	}

	public void set발행년도(String 발행년도) {
		this.발행년도 = 발행년도;
	}

	public String getKDC분류기호() {
		return KDC분류기호;
	}

	public void setKDC분류기호(String kDC분류기호) {
		KDC분류기호 = kDC분류기호;
	}

	public String toString() {
		return this.등록번호 + ", " 
				+ this.도서명 + ", " 
				+ this.저자 + ", " 
				+ this.키워드 + ", " 
				+ this.발행년도 + ", " 
				+ this.KDC분류기호;

	}
}
