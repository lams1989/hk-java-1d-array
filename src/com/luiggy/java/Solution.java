package com.luiggy.java;

import java.util.Scanner;

public class Solution {
	public static boolean canWin(int leap, int[] game) {
		int n = game.length;
		int index = 0;
		boolean retorno = false;
		while (index < n) {
			if ((index == n - 1) || (index + leap >= n - 1)) {
				return true;
			} else if (game[index + 1] == 0) {
				index++;
			} else if (leap > 0 && game[index + leap] == 0) {
				index += leap;
			} else if (index > 0 && game[index - 1] == 0) {
				game[index] = 1;
				index--;
			} else {
				break;
			}
		}
		return retorno;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}
		scan.close();
	}

}
