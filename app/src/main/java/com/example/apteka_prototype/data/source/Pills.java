package com.example.apteka_prototype.data.source;

import com.example.apteka_prototype.data.source.MedicineAlarm;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Pills {

    private String pillName;

    private long pillId;

    private List<MedicineAlarm> medicineAlarms = new LinkedList<MedicineAlarm>();

    public Pills(){

    }

    public Pills(String pillName, long pillId) {
        this.pillName = pillName;
        this.pillId = pillId;
    }

    public String getPillName() { return pillName; }

    public void setPillName(String pillName) { this.pillName = pillName; }

    public void addAlarm(MedicineAlarm medicineAlarm) {
        medicineAlarms.add(medicineAlarm);
        Collections.sort(medicineAlarms);
    }

    public long getPillId() {
        return pillId;
    }

    public void setPillId(long pillID) {
        this.pillId = pillID;
    }
}
