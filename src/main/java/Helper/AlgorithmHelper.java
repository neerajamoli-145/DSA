package Helper;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Service;

import java.util.Random;






@Slf4j
@Service
@NoArgsConstructor
public class AlgorithmHelper {

    public int populateArray(int[] array){
        Random rand = new Random();

        int desiredIndex = getIndexToFind(array.length - 1);
        int valueToFind = -1;
        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10000);
            if (i == desiredIndex)
                valueToFind = array[i];
        }
        return valueToFind;
    }

    public int getIndexToFind(int index){
        int random = RandomUtils.nextInt(index);
        return random ;
    }
}
