package collections.scoreComparator;

import java.util.Comparator;

import collections.ScoreVo;

public class MathComparator implements Comparator<ScoreVo>{

	@Override
	public int compare(ScoreVo v1, ScoreVo v2) {		
		return v2.getMath() - v1.getMath();
	}

}
