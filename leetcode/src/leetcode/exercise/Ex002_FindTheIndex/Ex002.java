package leetcode.exercise.Ex002_FindTheIndex;

public class Ex002 {

	public static void main(String[] args) {
		System.out.println(strStr("leetcode", "leeto"));
	}

	public static int strStr(String haystack, String needle) {
		int index = haystack.indexOf(needle);
		return index;
	}

}
