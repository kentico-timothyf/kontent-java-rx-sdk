package kenticocloud.kenticoclouddancinggoat.util.Location;

/**
 * Created by RichardS on 25. 8. 2017.
 */

public class LocationInfo {

    private double _latitude;
    private double _longtitude;

    LocationInfo(double lattitude, double longtitude){
        _latitude = lattitude;
        _longtitude = longtitude;
    }

    public double getLattitude(){
        return _latitude;
    }

    public double getLongtitude(){
        return _longtitude;
    }
}