package collections;

public class ScoreVo implements Comparable<ScoreVo>{
	private String studentName;
	private int language;
	private int math;
	private int science;
	
	public int getTotalScore() {
		return this.getLanguage() + this.getMath() + this.getScience();
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getLanguage() {
		return language;
	}
	public void setLanguage(int language) {
		this.language = language;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	@Override
	public int compareTo(ScoreVo vo) {
		int vo1Total = this.getTotalScore();
		int vo2Total = vo.getTotalScore();
		return vo2Total - vo1Total;
	}
	
	
}












