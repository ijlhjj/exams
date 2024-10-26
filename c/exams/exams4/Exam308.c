/* 308-构造相同颜色的正方形
 *
 */

#include <stdbool.h>
#include <assert.h>

bool check(char** grid, int i, int j, int gridSize) {
	//当前元素值，grid[i][j] 要么是 'W' ，要么是 'B' 
	char c = grid[i][j];
	int count = 1;

	//下侧元素
	if (grid[i + 1][j] == c)
		count++;

	//右侧元素
	if (grid[i][j + 1] == c)
		count++;

	//右下元素
	if (grid[i + 1][j + 1] == c)
		count++;

	//统计结果只要不是 w:2,b:2 ，其他都符合题意要求
	return count != 2;
}

bool canMakeSquare(char** grid, int gridSize, int* gridColSize) {
	//遍历矩阵，判断以当前元素作为左上角的 2 x 2 正方形是否符合题意，行列的上限下标都是 gridSize - 1
	for (int i = 0; i < gridSize - 1; i++)
	{
		//题意是二维 3 x 3 的矩阵，此处不使用 gridColSize 了
		for (int j = 0; j < gridSize - 1; j++)
		{
			if (check(grid, i, j, gridSize))
				return true;
		}
	}

	//矩阵遍历完没有符合题意的正方形，返回false
	return false;
}
