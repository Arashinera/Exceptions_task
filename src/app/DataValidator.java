package app;

public class DataValidator {

    private static final int MINIMUM_INDICATOR_VALUE = 120;
    private static final int MAXIMUM_INDICATOR_VALUE = 355;
    public static final String INPUT_REGEX = "^\\d+$";
    private static final String MEASURE = "m";

    public String validateInputData(String input) throws IllegalArgumentException {
        if (!input.matches(INPUT_REGEX))
            throw new IllegalArgumentException(input + " is wrong indicator value!");
        return input;
    }

    public String validateIndicatorValue(String value) throws IndicatorsException {

        if (Integer.parseInt(value) < MINIMUM_INDICATOR_VALUE) {
            throw new IndicatorsException("Your indicator value " + value + MEASURE
                    + " is lower of " + MINIMUM_INDICATOR_VALUE + MEASURE + "! Device is not working! Please, try again...");
        } else if (Integer.parseInt(value) > MAXIMUM_INDICATOR_VALUE) {
            throw new IndicatorsException("Your indicator value " + value + MEASURE
                    + " is higher of " + MAXIMUM_INDICATOR_VALUE + MEASURE + "! Device is not working! Please, try again...");
        } else if (Integer.parseInt(value) > MINIMUM_INDICATOR_VALUE && Integer.parseInt(value) < 210) {
            return "You stay on " + value + MEASURE + " from the ground. The air is clean!";
        } else if (Integer.parseInt(value) >= 210 && Integer.parseInt(value) < 290) {
            return "You stay on " + value + MEASURE + " from the ground. The air is thin... it's still ok.";
        } else {
            return "You stay on " + value + MEASURE + " from the ground. The air is too thin..... but it's still okay!";
        }
    }
}
