import java.util.DoubleSummaryStatistics;

/**
 * Created by nsp on 2015/10/25.
 */
public class ConversionContext {
    private String conversionQuestion = "";

    private String conversionResponse = "";

    private String fromConversion = "";

    private String toConversion = "";

    private double quantity;

    String[] partsOfQuestions;

    public ConversionContext(String input) {
        this.conversionQuestion = input;

        this.partsOfQuestions = getInput().split(" ");

        this.fromConversion = getCapitalized(partsOfQuestions[1]);
        this.toConversion = getLowercase(partsOfQuestions[3]);

        this.quantity = Double.valueOf(partsOfQuestions[0]);

        this.conversionResponse = partsOfQuestions[0] + " " + partsOfQuestions[1] + " equals ";

    }

    public String getFromConversion() {
        return this.fromConversion;
    }

    public String getToConversion() {
        return toConversion;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getConversionResponse() {
        return conversionResponse;
    }

    public String getInput() {
        return this.conversionQuestion;
    }

    public String getCapitalized(String wordToCapitalize) {
        wordToCapitalize = wordToCapitalize.toUpperCase();

        wordToCapitalize = Character.toUpperCase(wordToCapitalize.charAt(0)) + wordToCapitalize.substring(1);

        int lengthOfWord = wordToCapitalize.length();

        if ((wordToCapitalize.charAt(lengthOfWord - 1)) != 's') {
            wordToCapitalize = new StringBuffer(wordToCapitalize).insert(lengthOfWord, "s").toString();
        }

        return wordToCapitalize;
    }

    public String getLowercase(String wordToLowercase) {
        return wordToLowercase.toLowerCase();
    }
}
