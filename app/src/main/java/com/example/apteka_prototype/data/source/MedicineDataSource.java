package com.example.apteka_prototype.data.source;

import java.util.List;


public interface MedicineDataSource {

    interface LoadMedicineCallbacks {

        void onMedicineLoaded(List<MedicineAlarm> medicineAlarmList);

        void onDataNotAvailable();
    }

    interface GetTaskCallback {

        void onTaskLoaded(MedicineAlarm medicineAlarm);

        void onDataNotAvailable();
    }


    void getMedicineAlarmById(long id, GetTaskCallback callback);

    void saveMedicine(MedicineAlarm medicineAlarm, Pills pills);

    void getMedicineListByDay(int day, LoadMedicineCallbacks callbacks);

    boolean medicineExits(String pillName);

    List<Long> tempIds();

    void deleteAlarm(long alarmId);

    List<MedicineAlarm> getMedicineByPillName(String pillName);

    List<MedicineAlarm> getAllAlarms(String pillName);

    Pills getPillsByName(String pillName);

    long savePills(Pills pills);


}
