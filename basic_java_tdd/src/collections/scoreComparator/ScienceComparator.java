package collections.scoreComparator;

import java.util.Comparator;

import collections.ScoreVo;

public class ScienceComparator implements Comparator<ScoreVo>{

	@Override
	public int compare(ScoreVo v1, ScoreVo v2) {
		return v2.getScience() - v1.getScience();
	}

}
