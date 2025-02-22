package core;

import java.util.List;

public class Coord {

    private static final List<String> ALPHABET =
            List.of(
                    " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O",
                    "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

    public final int row;
    public final int col;

    public Coord(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public static int asInt(String row) {
        return ALPHABET.indexOf(row);
    }

    public static String asString(int row) {
        return ALPHABET.get(row);
    }

    public String getCoordString() {
        return "(" + asString(row) + ", " + col + ")";
    }

    public Coord(String rowCol) {
        String[] coords = rowCol.split("");
        this.row = asInt(coords[0]);
        this.col = Integer.parseInt(coords[1]);
    }

    public boolean isEqual(Coord other) {
        return this.col == other.col && this.row == other.row;
    }

    public Coord shiftBy(int verticalDistance, int horizontalDistance) {
        return new Coord(this.row + verticalDistance, this.col + horizontalDistance);
    }
}
