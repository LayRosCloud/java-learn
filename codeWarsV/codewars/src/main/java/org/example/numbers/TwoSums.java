package org.example.numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;

        for (int num:
             nums) {
            map.put(num, index++);
        }

        for(index = 0; index < nums.length; index++){
            int selected = nums[index];

            int searchNumber = target - selected;
            Integer searchIndex = map.get(searchNumber);
            if(searchIndex != null && searchIndex != index){
                return new int[]{index, searchIndex};
            }
        }

        return null;
    }
}
