package thienle.myown;

import nl.flotsam.xeger.Xeger;

import org.apache.commons.lang3.StringUtils;

public class NumberPlateGenerator {
    public static final String NUMBER_PLATE_REGEX = "[0-9]{2}[A-Z][0-9] - [0-9]{3}\\.[0-9]{2}";

    private NumberPlateGenerator() {
        // prevent manual instantiation
    }

    /**
     * Generate a string base on regular expression. Using library from
     * {@link https://code.google.com/archive/p/xeger/}. Note: xeger only
     * support a subset of regular expression. Visit their site for more
     * information.
     *
     * @param regExp
     *            a regular expression that xeger can understand.
     * @return String that matches the <code>regExp</code>. Return empty string
     *         if <code>regExp</code> is empty.
     */
    public static String generate(String regExp) {
        if (StringUtils.isEmpty(regExp))
            return "";

        Xeger generator = new Xeger(regExp);

        return generator.generate();
    }

    /**
     * Generate a car's number plate that matches format
     * <code>99X9 - 999.99</code>.
     *
     * @return A number plate that matches above format.
     */
    public static String generateNumberPlate() {
        return generate(NUMBER_PLATE_REGEX);
    }
}
