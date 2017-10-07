package thienle.myown;

import org.junit.Test;

class NumberPlateGeneratorTest {
    @Test
    void generateNumberPlate() {
        Long numberOfPlate = 0L;

        while (numberOfPlate < 999999999) {
            System.out.println(NumberPlateGenerator.generateNumberPlate());
            numberOfPlate++;
        }
    }

}