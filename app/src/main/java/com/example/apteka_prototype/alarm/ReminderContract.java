package com.example.apteka_prototype.alarm;


import com.example.apteka_prototype.BasePresenter;
import com.example.apteka_prototype.BaseView;
import com.example.apteka_prototype.data.source.MedicineAlarm;


public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);


    }
}
