package thienle.myown;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashSet;

@RunWith(JUnit4.class)
public class NumberPlateGeneratorTest {

    @Test
    public void generateNumberPlate() {
        Long numberOfPlate = 0L;
        HashSet<String> plateSet = new HashSet<>();

        String plate;

        while (numberOfPlate < 999999) {
            plate = NumberPlateGenerator.generateNumberPlate();
            System.out.printf("[%d] %s%n", numberOfPlate, plate);

            if (!plateSet.add(plate)) {
                //  try again
                System.out.printf("Found duplication for %s. Try again.%n", plate);
                plate = NumberPlateGenerator.generateNumberPlate();
                System.out.printf("[%d] New plate: %s%n", numberOfPlate, plate);

                if (!plateSet.add(plate)) {
                    break;
                } else {
                    numberOfPlate++;
                }
            } else {
                numberOfPlate++;
            }

            System.out.println("------------DUPLICATION DETECTED----------");
            System.out.printf("Number of plate before duplication: %d%n", numberOfPlate);
            System.out.printf("The duplication plate is: %s%n", plate);
        }
    }
}