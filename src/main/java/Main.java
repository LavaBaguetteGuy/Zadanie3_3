public class Main {
    public static void main(String[] args) {
        int rozmiar = 10;
        int[][] tabliczka = new int[rozmiar][rozmiar];

        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
                tabliczka[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < tabliczka.length; i++) {
            for (int j = 0; j < tabliczka[i].length; j++) {
                System.out.print(tabliczka[i][j] + "\t");
            }
            System.out.println();
        }
    }
}