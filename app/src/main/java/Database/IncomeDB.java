package Database;

/**
 * Created by Jake on 18/02/2015.
 */
import android.database.sqlite.SQLiteDatabase;

public class IncomeDB {
    //Declaration of table name and columns
    public static final String TABLE_NAME = "income";
    public static final String AMOUNT = "amount";
    public static final String SOURCE = "source";

    //SQL database creation statement
    private static final String DATABASE_CREATE;

    static {
        DATABASE_CREATE = "CREATE TABLE"
                + TABLE_NAME
                + "("
                + AMOUNT + "REAL NOT NULL, "
                + SOURCE + " TEXT"
                + ");";
    }

    public static void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);
    }

    public static void onUpgrade(SQLiteDatabase database, int oldVersion,int newVersion) {
        database.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(database);
    }

}
