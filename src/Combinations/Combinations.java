package Combinations;

public class Combinations {
	public static void main(String[] args) {
		Combinations combinations = new Combinations();
		int n = 40;
		//System.out.println("# Ladder's steps: " + n);
		//System.out.println("# Step combinations: " + combinations.countCombinations(n, 0));
		System.out.println("# Ladder's steps: " + n);
		float cacheCombinations = 0;
		System.out.println("# Step combinations: " + combinations.countNewCombinations(n, 0));
	}
	
	

	public long countCombinations(int n, int level) {
		if (n < 0) {
			return 0;
		}
		if (n == 0 && level == 0) {
			return 0;
		}
		if (n == 0 && level > 0) {
			return 1;
		}
		return countCombinations(n - 1, level + 1) + countCombinations(n - 2, level + 1)
				+ countCombinations(n - 3, level + 1);
	}
	
	
	public long countNewCombinations(int n, int level) {
		if (n < 0) {
			return 0;
		}
		if (n == 0 && level == 0) {
			return 0;
		}
		if (n == 0 && level > 0) {
			return 1;
		}
		long cacheCombinations = 0;
		cacheCombinations = countCombinations(n - 1, level + 1) + cacheCombinations;
		cacheCombinations = countCombinations(n - 2, level + 1) + cacheCombinations;
		cacheCombinations = countCombinations(n - 3, level + 1) + cacheCombinations;
		
		 return cacheCombinations;
		
	}
	
	
	
}