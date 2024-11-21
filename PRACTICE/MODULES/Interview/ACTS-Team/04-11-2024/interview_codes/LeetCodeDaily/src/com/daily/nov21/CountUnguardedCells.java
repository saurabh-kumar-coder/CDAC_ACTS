package com.daily.nov21;

public class CountUnguardedCells {
	public static void main(String[] args) {

		int m = 4;
		int n = 6;
		int[][] guard = { { 0, 0 }, { 1, 1 }, { 2, 3 } };
		int[][] walls = { { 0, 1 }, { 2, 2 }, { 1, 4 } };

//		int m = 3;
//		int n = 3;
//		int[][] guard = { { 1, 1 } };
//		int[][] walls = { { 0, 1 }, { 1, 0 }, { 2, 1 }, { 1, 2 } };

//		int m = 2;
//		int n = 7;
//		int[][] guard = { { 1, 5 }, { 1, 1 }, { 1, 6 }, { 0, 2 } };
//		int[][] walls = { { 0, 6 }, { 0, 3 }, { 0, 5 } };

		/*
		 * int m = 8; int n = 9; int[][] guard = { { 5, 8 }, { 5, 5 }, { 4, 6 }, { 0, 5
		 * }, { 6, 5 } }; int[][] walls = { { 4, 1 } };
		 */
		int ctr = countUnguarded(m, n, guard, walls);
		System.out.println(ctr);
	}

	public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
		char[][] gr = new char[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				gr[i][j] = '.';
			}
		}

		for (int[] guard : guards) {
			int x = guard[0];
			int y = guard[1];
			gr[x][y] = 'G';
		}

		for (int[] wall : walls) {
			int x = wall[0];
			int y = wall[1];
			gr[x][y] = 'W';
		}

		System.out.println("before");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(gr[i][j]);
			}
			System.out.println();
		}
		System.out.println("after");

		int left = 0;
		int right = 0;
		int top = 0;
		int ll = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (gr[i][j] == 'G') {
					left = i;
					right = j;
					top = i;
					ll = j;
					while (ll > 0) {
						ll--;
						if (gr[i][ll] == 'W' || gr[i][ll] == 'G') {
							break;
						} else {
							gr[i][ll] = 'E';
						}
					}
					while (top > 0) {
						top--;
						if (gr[top][j] == 'W' || gr[top][j] == 'G') {
							break;
						} else {
							gr[top][j] = 'E';
						}
					}
					while (left < m) {
						if (gr[left][j] == 'W') {
							break;
						} else {
							gr[left][j] = gr[left][j] == 'G' ? 'G' : 'E';
							left++;
						}
					}
					while (right < n) {
						if (gr[i][right] == 'W') {
							break;
						} else {
							gr[i][right] = gr[i][right] == 'G' ? 'G' : 'E';
							right++;
						}
					}
				}
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(gr[i][j]);
			}
			System.out.println();
		}
		int ctr = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (gr[i][j] == '.') {
					ctr++;
				}
			}
		}

		return ctr;
	}
}
