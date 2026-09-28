public class gamingconsolereport {
    public static void main(String[] args) {

        // One-dimensional arrays for the names
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Each row is a city; each column is a console
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        int[] cityTotals = new int[cities.length];
        int highestTotal = 0;
        String highestCity = "";

        System.out.println("---------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-10s%n",
                "", consoles[0], consoles[1], consoles[2]);

        for (int row = 0; row < cities.length; row++) {
            System.out.printf("%-20s", cities[row].toUpperCase());

            for (int column = 0; column < consoles.length; column++) {
                System.out.printf("%-10d", sales[row][column]);
                cityTotals[row] += sales[row][column];
            }

            System.out.println();

            if (cityTotals[row] > highestTotal) {
                highestTotal = cityTotals[row];
                highestCity = cities[row];
            }
        }

        System.out.println("---------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %d%n",
                    cities[i].toUpperCase(), cityTotals[i]);
        }

        System.out.println("---------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + highestCity.toUpperCase());
    }
}
