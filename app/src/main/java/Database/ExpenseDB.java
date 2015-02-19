package Database;

/**
 * Created by Jake on 19/02/2015.
 */
import android.database.sqlite.SQLiteDatabase;

public class ExpenseDB {
    public static final String TABLE_NAME = "expense";
    public static final String _ID = "_ID";
    public static final String AMOUNT = "amount";
    public static final String CATEGORY = "category";
    public static final String PAYEE = "payee";

    // Database creation sql statement
    private static final String DATABASE_CREATE;

    static {
        DATABASE_CREATE = "CREATE TABLE"
                + TABLE_NAME
                + "("
                + _ID + "INTEGER PRIMARY KEY, "
                + AMOUNT + " REAL NOT NULL, "
                + CATEGORY + " TEXT NOT NULL, "
                + PAYEE + "TEXT, "
                + ")";
    }

    public static void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);
    }

    public static void onUpgrade(SQLiteDatabase database, int oldVersion,int newVersion) {
        database.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(database);
    }
}
