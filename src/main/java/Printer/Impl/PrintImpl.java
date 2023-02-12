package Printer.Impl;

import Printer.Print;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrintImpl implements Print {
    @Override
    public void print(int index, int result) {

        log.info("Result is found at : {}", index);
        if(index == -1)
            log.info("result not found.");
        else
            log.info("Value of array["+index+"] is {}", result);
    }
}
