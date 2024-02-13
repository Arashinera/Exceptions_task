package app;

public class Main {
    public static void main(String[] args) {

        DataProvider provider = new DataProvider();
        String inputValue = provider.getUserData();

        DataHandler handler = new DataHandler();

        DataOutput output = new DataOutput();
        output.getOutput(handler.handleAlreadyData(inputValue));
    }
}
