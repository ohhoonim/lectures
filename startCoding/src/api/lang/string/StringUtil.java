package api.lang.string;

public class StringUtil {
	public static int findIndexOf(String str, char c, int num) {
		int resultIndex = 0;
		for (int i = 0; i < num; i++) {
			if (i == 0) {
				resultIndex = str.indexOf(c, resultIndex );
			} else {
				resultIndex = str.indexOf(c, resultIndex + 1 );
			}
		}
		return resultIndex;
	}
}
