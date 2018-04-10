package demo.domain;


import lombok.Data;

@Data
public class UnitInfo {

    private final String runningId;
    private String bandMake;
    private String customerName;
    private String unitNumber;

    public UnitInfo(){
        this.runningId="";
    }

    public UnitInfo(String runningId){
        this.runningId = runningId;
    }

    public UnitInfo(String runningId, String bandMake, String customerName, String unitNumber){
        this.runningId=runningId;
        this.bandMake=bandMake;
        this.customerName = customerName;
        this.unitNumber = unitNumber;
    }
}
