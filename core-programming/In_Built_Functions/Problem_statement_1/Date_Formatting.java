import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.of(2025, 8, 5); // Example input

        LocalDate result = inputDate.plusDays(7)
                                    .plusMonths(1)
                                    .plusYears(2)
                                    .minusWeeks(3);

        System.out.println("Original Date: " + inputDate);
        System.out.println("Modified Date: " + result);
    }
}
