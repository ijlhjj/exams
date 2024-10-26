#include "exams1.h"

vector<int> twoSum(vector<int>& nums, int target) {
	unordered_map<int, int> valueIndex;

	for (int i = 0; i < nums.size(); ++i) {
		int diff = target - nums[i];

		if (valueIndex.contains(diff))
			return { valueIndex[diff], i };

		valueIndex[nums[i]] = i;
	}

	return {};
}
