package Search.Impl;

import Printer.Impl.PrintImpl;
import Printer.Print;
import Search.Search;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinearSearch implements Search {

    int iterationCount = 0;
    Print printHelper = new PrintImpl();
    @Override
    public void search(int[] array,int length, int valueToSearch) {
        log.info("INDEX 1 {}", array[0]);
        int index = -1;
        for (int i = 0; i < length; i++) {
            iterationCount++;
            if (array[i] == valueToSearch) {
                index = i;
                break;
            }
        }
        log.info("LINEAR_SEARCH ITERATIONS {}", iterationCount);
        printHelper.print(index, array[index]);
    }
}
