package katas;

import java.util.List;

public class ClosestToZeroFinder {

	public int findClosestToZero(List<Integer> integers) {
		int closestIndex = 0;
		int diff = Integer.MAX_VALUE;
		for (int i = 0; i < integers.size(); i++) {
			int abs = Math.abs(integers.get(i));
			if (abs < diff) {
				closestIndex = i;
				diff = abs;
			} else if (abs == diff && integers.get(i) > 0 && integers.get(closestIndex) < 0) {
				// same distance to zero but positive
				closestIndex = i;
			}
		}
		return (integers.get(closestIndex));
	}
}
