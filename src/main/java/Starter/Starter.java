package Starter;

import Helper.AlgorithmHelper;
import Printer.Impl.PrintImpl;
import Printer.Print;
import Search.Impl.BinarySearch;
import Search.Impl.LinearSearch;
import Search.Search;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Starter {

    public static void main(String[] args) {
        AlgorithmHelper algorithmHelper = new AlgorithmHelper();
        Search search = getSearchAlgo(1);
        int[] array = new int[999999];
        int valueToFind = algorithmHelper.populateArray(array);
//        log.info("Array : {}", array);
        log.info("Value To Find : {}" , valueToFind);
        getSearchAlgo(1).search(array, array.length, valueToFind);
        getSearchAlgo(0).search(array, array.length, valueToFind);

    }

    public static Search getSearchAlgo(int index){
        switch (index) {
            case 0:
                return new LinearSearch();
            case 1:
                return new BinarySearch();

            default:
                return new LinearSearch();
        }
    }
}

