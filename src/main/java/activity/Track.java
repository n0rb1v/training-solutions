package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public Coordinate findMaximumCoordinate() {
        Coordinate max = new Coordinate(0,0);
        int index = 0;
        for (int i = 0; i < trackPoints.size(); i++) {
            if (max < trackPoints.get(i).getCoordinate()) {
                max = trackPoints.get(i).getCoordinate();
                index = i;
            }

        }
        return trackPoints.get(index).getCoordinate();
    }

    public Coordinate findMinimumCoordinate() {
        return null;
    }

    public double getDistance() {
        double result = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            result += trackPoints.get(i - 1).getDistanceFrom(trackPoints.get(i));
        }
        return result;
    }

    public double getFullDecrease() {
        double result = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation() < 0) {
                result += trackPoints.get(i - 1).getElevation() - trackPoints.get(i).getElevation();
            }
        }
        return result;
    }

    public double getFullElevation() {
        double result = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation() > 0) {
                result += trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation();
            }
        }
        return result;
    }

    public double getRectangleArea() {
        return 0;
    }


    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }
}
