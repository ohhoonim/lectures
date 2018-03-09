package collections.scoreComparator;

import java.util.Comparator;

import collections.ScoreVo;

public class TotalComparator implements Comparator<ScoreVo> {

	@Override
	public int compare(ScoreVo vo1, ScoreVo vo2) {
		int vo1Total = vo1.getLanguage() + vo1.getMath() + vo1.getScience();
		int vo2Total = vo2.getLanguage() + vo2.getMath() + vo2.getScience();
		return vo2Total - vo1Total;
	}


}
