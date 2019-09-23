package code.pattern.adapter;

import code.pattern.adapter.ObjectAdapter.ObjectAdapter;
import code.pattern.adapter.ObjectAdapter.ObjectAdapter1;
import code.pattern.adapter.clazzAdapter.ClazzAdapter;
import code.pattern.adapter.model.HKCharger;
import code.pattern.adapter.model.HKChargerInter;

public class Main {
    public static void main(String[] args) {
        ObjectAdapterMethodByClazz();
    }


    public static void clazzAdapterMethod(){
        HKChargerInter hkCharger = new ClazzAdapter();
        hkCharger.charge();
    }

    public static void ObjectAdapterMethodByInter(){
        HKChargerInter hkCharger = new ObjectAdapter();
        hkCharger.charge();
    }
    public static void ObjectAdapterMethodByClazz(){
        ObjectAdapter1 hkCharger = new ObjectAdapter1();
        hkCharger.charge();
    }
}


