package service;

public class ResultTest {
    public static final String SHAMPOO_PRODUCT = "shampoo";
    public static final String KIDS_PRODUCT = "kids";

    public static String resultShampooProduct() {
        return TestDataReader.getTestData(SHAMPOO_PRODUCT);
    }

    public static String resultKidsProduct() {
        return TestDataReader.getTestData(KIDS_PRODUCT);
    }
}
