public class FinancialCalculations {
    /**
     * Calculates the future value of an investment.
     *
     * @param payment the payment amount per period
     * @param rate the interest rate per period
     * @param years the total number of periods
     * @return the future value of the investment
     */
    public static double calculateFutureValue(double payment, double rate, int years) {
        rate = rate / 100; // Assuming the rate is entered as a percentage
        int periods = years; // Assuming one period per year for simplicity
        double futureValue = payment * ((Math.pow(1 + rate, periods) - 1) / rate);
        return futureValue;
    }
}
