package code.pattern._2_adapter;

import code.pattern._2_adapter.ObjectAdapter.ObjectAdapter;
import code.pattern._2_adapter.ObjectAdapter.ObjectAdapter1;
import code.pattern._2_adapter.clazzAdapter.ClazzAdapter;
import code.pattern._2_adapter.model.HKChargerInter;

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


