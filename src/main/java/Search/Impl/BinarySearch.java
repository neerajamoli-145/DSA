package Search.Impl;

import Printer.Impl.PrintImpl;
import Printer.Print;
import Search.Search;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class BinarySearch implements Search {
    int iterationCount = 0;
    Print printHelper = new PrintImpl();

    @Override
    public void search(int[] OGarray, int length, int valueToSearch) {
        log.info("INDEX 1 {}", OGarray[0]);
        int index = -1;
        int mid = -1;
        int[] array = OGarray.clone();
        Arrays.sort(array);
//        log.info("Array after sorting : {}", array);
        index = performBinarySearch(array,0, array.length/2, array.length, valueToSearch);
        log.info("BINARY_SEARCH ITERATION_COUNT {} and the index {}", iterationCount, index);

        printHelper.print(index, array[index]);

    }

    public int performBinarySearch(int[] array, int low, int mid, int high, int valueToFind){
//        log.info("low {} mid {} max {}", low, mid, high);
        iterationCount++;
//        log.info("checking with {}", array[mid]);

        if(low > mid  || (low == mid && array[mid] != valueToFind))
            return -1;
        else if(array[mid] == valueToFind) {
//            log.info("Return value {}", mid);
            return mid;
        }
            else
                if(array[mid] > valueToFind){
//                    log.info("going left");
                    return performBinarySearch(array, low , (low + mid)/2, mid, valueToFind );
                }
                else if(array[mid] < valueToFind) {
//                    log.info("going right");
                    return performBinarySearch(array, mid, (mid + high) / 2, high, valueToFind);
                }
                        else
                            return -1;
    }


    class Solution {
        public int[] twoSum(int[] nums, int target) {
            for(int i = 0 ; i < nums.length - 1; i ++){
                for(int j = i + 1; j < nums.length; j ++ ){
                    if(nums[i] + nums[j] == target)
                        return new int[]{i,j};
                }
            }
            return null;
        }
    }
}
