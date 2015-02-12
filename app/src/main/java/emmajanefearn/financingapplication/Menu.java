package emmajanefearn.financingapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Menu extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //Declare Buttons
        Button button = (Button) findViewById(R.id.button);
        Button button6 = (Button) findViewById(R.id.button6);

        //On click of a buttons listener
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", String.valueOf(v.getId()));
                Log.d("TAG", String.valueOf(R.id.button));
                switch (v.getId()) {
                    case R.id.button:
                        Log.d("TAG", "Button 1");
                        Intent intent = new Intent(Menu.this, Overview.class);
                        startActivity(intent);
                        break;
                    case R.id.button6:
                        Log.d("TAG", "Button 2");
                        Intent intent2 = new Intent(Menu.this, LogExpenditure.class);
                        startActivity(intent2);
                        break;
                }
            }
        };

        //Set their listener for some reason idk
        button.setOnClickListener(listener);
        button6.setOnClickListener(listener);
    }
       /* public void onClick(View v){
            Log.d("TAG", String.valueOf(v.getId()));
            Log.d("TAG", String.valueOf(R.id.button));
            switch (v.getId()) {
                case R.id.button:
                    Log.d("TAG", "test");
                    Intent intent = new Intent(Menu.this, Overview.class);
                    Log.d("TAG", "hello");
                    startActivity(intent);
                    Log.d("TAG", "world");
                    break;
                case R.id.button6:
                    Intent intent2 = new Intent(Menu.this, LogExpenditure.class);
                    startActivity(intent2);
                    break;
                }
    }*/
}

