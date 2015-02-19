package Database;

/**
 * Created by Jake on 18/02/2015.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {

    private  static final String DATABASE_NAME = "financeApp.db";
    private  static  final int DATABASE_VERSION =1;

    public DBHandler(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.beginTransaction();
        ExpenseDB.onCreate(db);
        IncomeDB.onCreate(db);
        db.setTransactionSuccessful();
        db.endTransaction();
    }

    @Override
    public void onOpen(SQLiteDatabase db)
    {
        if (!db.isReadOnly())
            db.execSQL("PRAGMA foreign_keys=ON;");
        super.onOpen(db);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
