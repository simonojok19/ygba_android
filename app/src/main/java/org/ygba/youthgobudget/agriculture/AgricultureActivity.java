package org.ygba.youthgobudget.agriculture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.ygba.youthgobudget.R;

public class AgricultureActivity extends AppCompatActivity {
    Spinner financialYearSpinner;
    EditText villageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture_activity);

        financialYearSpinner = findViewById(R.id.financial_year_spinner);
        villageEditText = findViewById(R.id.village_text_edit);
    }
}