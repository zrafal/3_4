public class Main {
    public static void main(String[] args) {
        // Pętla zewnętrzna iteruje po wierszach
        for (int i = 1; i <= 5; i++) {
            // Pętla wewnętrzna iteruje po kolumnach
            for (int j = 1; j <= 5; j++) {
                // Warunki wypisywania odpowiednich znaków
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Dwa spacje dla pustego miejsca
                }
            }
            // Przejście do nowej linii po zakończeniu każdego wiersza
            System.out.println();
        }
    }
}