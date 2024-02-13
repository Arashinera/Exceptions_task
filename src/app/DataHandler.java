package app;

public class DataHandler {

    public String handleAlreadyData(String data) {

        DataValidator validator = new DataValidator();

        try {
            return validator.validateIndicatorValue(validator.validateInputData(data));
        } catch (IllegalArgumentException | IndicatorsException e) {
            return e.getMessage();
        }
    }
}
