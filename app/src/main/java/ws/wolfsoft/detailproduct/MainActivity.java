package ws.wolfsoft.detailproduct;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
   Spinner spinner1, spinner2, spinner3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner dropdown1 = (Spinner)findViewById(R.id.spinner1);
        Spinner dropdown2 = (Spinner)findViewById(R.id.spinner2);
        Spinner dropdown3 = (Spinner)findViewById(R.id.spinner3);


        String[] items1 = new String[]{"BLACK - GOLD", "RED - GOLD", "PURPLE - GOLD"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.spinner_item, items1);
        dropdown1.setAdapter(adapter1);

        String[] items2 = new String[]{"SIZE", "8", "9", "10", "11"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, R.layout.spinner_item, items2);
        dropdown2.setAdapter(adapter2);

        String[] items3 = new String[]{"QUANTITY   1", "QUANTITY   2", "QUANTITY   3"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, R.layout.spinner_item, items3);
        dropdown3.setAdapter(adapter3);


    }
}
