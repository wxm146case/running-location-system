package demo.domain;

import lombok.Data;
import java.util.Date;

@Data
public class Location {

    enum GpsStatus{
        EXCELLENT, OK, UNRELIABLE, BAD, NOFIX, UNKNOWN;
    }

    public enum RunnerMovementType{
        STOPPED, IN_MOTION;
    }

    private UnitInfo unitInfo;
    private MedicalInfo medicalInfo;

    private double latitude;
    private double longitude;
    private String heading;
    private double gpsSpeed;
    private GpsStatus gpsStatus;
    private double odometer;
    private double totalRunningTime;
    private double totalIdleTime;
    private double totalCalorieBurnt;
    private String address;
    private Date timestamp = new Date();
    private String gearProvider;
    private RunnerMovementType runnerMovementType;
    private String serviceType;

    public Location(){
        this.unitInfo = null;
    }

    public Location(String runningID) {
        this.unitInfo = new UnitInfo(runningID);
    }

    public Location(UnitInfo unitInfo){
        this.unitInfo = unitInfo;
    }


}


