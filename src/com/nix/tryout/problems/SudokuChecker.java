package com.nix.tryout.problems;

import java.util.List;

public class SudokuChecker {

	public List<Integer> getSudokuCoords(int[][] sudoku, int x, int y) {




		return null;
	}


	public static void main(String[] arg) {
		SudokuChecker sc = new SudokuChecker();

		int[][] sudokuArray = { { 1, 2, 3}, { 1, 2, 3}, { 1, 2, 3}, {4, 5, 6}, {4, 5, 6}, {4, 5, 6}, {7, 8, 9}, {7, 8, 9}, {7, 8, 9}};
		sc.getSudokuCoords(sudokuArray, 9, 9);

		for(int i = 0; i < 3; ++i) {
			for(int j = 0; j < 3; ++j) {
				System.out.println(sudokuArray[i][j]);
			}
		}
	}
}
