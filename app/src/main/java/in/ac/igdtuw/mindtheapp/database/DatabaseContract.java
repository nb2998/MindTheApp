package in.ac.igdtuw.mindtheapp.database;

/**
 * Created by megha on 07/10/17.
 */

public interface DatabaseContract {

    String DATABASE_NAME = "PLAN";

    String TABLE_NAME_MEDICINE = "MEDICINES";
    String COLUMN_NAME_MEDICINE_ID = "MEDICINE_ID";
    String COLUMN_NAME_MEDICINE_NAME = "MEDICINE_NAME";
    String COLUMN_NAME_TIMES_IN_DAY = "TIMES_IN_DAY";
    String COLUMN_NAME_DAYS_LEFT = "DAYS_LEFT";
    String COLUMN_NAME_DAYS_TOTAL = "DAYS_TOTAL";
    String COLUMN_NAME_MEDICINES_LEFT = "MEDICINES_LEFT";
    String COLUMN_NAME_MEDICINE_DESCRIPTION = "MEDICINE_DESCRIPTION";
    String COLUMN_NAME_DISEASE = "DISEASE";

    String TABLE_NAME_TIME = "TIMES";
    String COLUMN_NAME_TIME_ID = "TIME_ID";
    String COLUMN_NAME_FOREIGN_MEDICINE_ID = "MEDICINE_ID";
    String COLUMN_NAME_TIME = "TIME";

}
