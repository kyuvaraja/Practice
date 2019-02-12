package com.test.array;

public class FindMaxDistanceStation {

	// Complete the flatlandSpaceStations function below.
	static int flatlandSpaceStations(int n, int[] c) {
		// Initialize boolean list
		boolean hasStation[] = new boolean[n + 1];

		// Assign True to cities containing station
		for (int city = 0; city < c.length; city++) {
			hasStation[c[city]] = true;
		}

		int dist = 0;
		int maxDist = Integer.MAX_VALUE;

		for (int i = 0; i < c.length; i++) {
			maxDist = Math.min(c[i], maxDist);
		}

		for (int city = 0; city < n; city++) {
			if (hasStation[city] == true) {
				maxDist = Math.max((dist + 1) / 2, maxDist);
				dist = 0;
			} else
				dist += 1;
		}
		return Math.max(maxDist, dist);

	}
}
