package numberBaseBall;

public class ScoreVo implements Comparable<ScoreVo>{
	private String name;
	private int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public int compareTo(ScoreVo vo) {
		return this.score - vo.getScore();
	}
	@Override
	public String toString() {
		return this.name + ":" + this.score;
	}
	
	
}
