package ru.nkotkin;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class ArrayMatrixTest {

	@Test
	public void whenAdd2DArrayThenGetRotateArrayOnRight() {
		int[][] values = {{0, 1}, {2, 3}};
		int[][] result = {{2, 0}, {3, 1}};
		ArrayMatrix.doRotate(values);
		assertThat(result, is(values));
	}
	@Test
	public void whenAdd3DArrayWithLeftRotateThenGetRotateArrayOnLeft() {
		int[][] values = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] result = {{3, 6, 9}, {2, 5, 8}, {1, 4, 7}};
		ArrayMatrix.doRotate(values, true);
		assertThat(result, is(values));
	}
}