package code.pattern._2_appearance.utils;

public class DBAppearance {
    private DbUtils dbUtils;

    public DBAppearance() {
        dbUtils = new DbUtils();
    }

    public void dealData() {
        String data = dbUtils.getDBData();
        if (data != null) {
            dbUtils.updateDBData();
        } else {
            dbUtils.addDBData();
        }
    }
}
