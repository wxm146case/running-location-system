package demo.domain;

import lombok.Data;

@Data
public class MedicalInfo {

    private long bfr;

    private long fmi;

    public MedicalInfo(){

    }

    public MedicalInfo(long bfr, long fmi){
        this.bfr = bfr;
        this.fmi = fmi;
    }

}
