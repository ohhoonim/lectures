package collection.list;

public class ScoreVo {
	private String name;
	private int la;
	private int ma;
	private int sc;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setLa(int la) {
		this.la = la;
	}
	public int getLa() {
		return this.la;
	}
	
	public void setMa(int ma) {
		this.ma = ma;
	}
	public int getMa() {
		return this.ma;
	}
	
	public void setSc(int sc) {
		this.sc = sc;
	}
	public int getSc() {
		return this.sc;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb = sb.append(this.name);
		sb = sb.append(" | ");
		sb = sb.append(this.la);
		sb = sb.append(" | ");
		sb = sb.append(this.ma);
		sb = sb.append(" | ");
		sb = sb.append(this.sc);
		sb = sb.append(" | ");
		sb = sb.append(this.ma + this.sc + this.la);
		
		return sb.toString(); 
	}
}










