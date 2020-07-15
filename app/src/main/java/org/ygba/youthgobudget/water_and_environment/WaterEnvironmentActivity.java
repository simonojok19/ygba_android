package org.ygba.youthgobudget.water_and_environment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.utils.DynamicData;

public class WaterEnvironmentActivity extends AppCompatActivity {
    private TextView waterDateTextView;
    private Spinner waterFinancialYearSpinner;
    private EditText waterDistrictEditText;
    private EditText waterVillageEditText;
    private EditText wParishEditText;
    private EditText wDivisionET;
    private EditText wAgentFullName;
    private EditText wAgentTelNumber;
    private EditText wAgentNumberET;
    private EditText wQ1ObjectiveReasonET;
    private EditText wQ2EditText;
    private EditText wQ4EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_environment);
        initViews();
        populateViews();
    }

    private void initViews() {
        waterDateTextView = findViewById(R.id.water_date_text_view);
        waterFinancialYearSpinner = findViewById(R.id.water_financial_year_spinner);
        waterVillageEditText = findViewById(R.id.water_village_text_edit);
        waterDistrictEditText = findViewById(R.id.water_district_text_edit);
        wParishEditText = findViewById(R.id.water_parish_text_edit);
        wDivisionET = findViewById(R.id.water_division_text_edit);
        wAgentFullName = findViewById(R.id.ygb_agent_name_edit_view);
        wAgentTelNumber = findViewById(R.id.ygb_agent_tel_edit_view);
        wAgentNumberET = findViewById(R.id.ygb_agent_no_edit_view);
        wQ1ObjectiveReasonET = findViewById(R.id.water_question_1_if_no);
        wQ2EditText = findViewById(R.id.water_question_2_edit_text);
        wQ4EditText = findViewById(R.id.water_question_4_edit_text);
    }

    private void populateViews() {
        waterDateTextView.setText(DynamicData.getDate());
        // init spinner
        wAgentFullName.setText(DynamicData.getAgentName());
        wAgentTelNumber.setText(DynamicData.getTelNumber());
        wAgentNumberET.setText(DynamicData.getAgentName());
    }

    private boolean getQuestionQ1ObjectiveAnswer(){
        return ((RadioGroup) findViewById(R.id.water_question_1_radio_group)).getCheckedRadioButtonId() == R.id.water_question_1_yes;
    }
    private boolean getQuestionQ3ObjectiveAnswer(){
        return ((RadioGroup) findViewById(R.id.water_question_3_radio_group)).getCheckedRadioButtonId() == R.id.water_question_3_yes;
    }
}