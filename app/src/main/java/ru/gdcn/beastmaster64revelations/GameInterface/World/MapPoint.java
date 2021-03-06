package ru.gdcn.beastmaster64revelations.GameInterface.World;

import java.io.Serializable;
import java.util.Objects;

public class MapPoint implements Serializable {

    /**
     * Класс для удобного представления координат локаций
     **/

    private final int x;
    private final int y;

    public MapPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isWithin(Object[][] arr) {

        boolean within = false;
        if (x >= 0 && x < arr[0].length)
            if (y >= 0 && y < arr.length)
                within = true;
        return within;
    }

    public MapPoint up() {
        return new MapPoint(x, y - 1);
    }

    public MapPoint left() {
        return new MapPoint(x - 1, y);
    }

    public MapPoint right() {
        return new MapPoint(x + 1, y);
    }

    public MapPoint down() {
        return new MapPoint(x, y + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MapPoint point = (MapPoint) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}
