package org.ygba.youthgobudget.agriculture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.data.agriculture.AgricultureQuestion;
import org.ygba.youthgobudget.utils.DynamicData;

import java.util.List;

public class AgricultureActivity extends AppCompatActivity implements  AdapterView.OnItemSelectedListener{
    RadioGroup question1RadioGroup;
    Spinner financialYearSpinner;
    EditText villageEditText;
    EditText parishTextEdit;
    EditText divisionEditText;
    EditText agentFullNameEditText;
    EditText agentTelephoneEditText;
    EditText agentNumberEditText;
    EditText question1ReasonEditText;
    EditText extensionServiceExpectedOrReceivedEditText;
    EditText extensionServiceAmountReceivedTextEdit;
    EditText extensionServiceDateReceivedEditText;
    EditText extensionServiceDateWithdrawnEditText;
    EditText developmentExpectedOrApprovedTextEdit;
    EditText developmentAmountReceived;
    EditText developmentDateReceived;
    EditText developmentDateWithdrawn;
    EditText question21EditText;
    RadioGroup question22RadioGroup;
    EditText question22NumberEditText;
    EditText question24NumberEditText;
    EditText question25ReasonNotMeetingEditEdit;
    EditText question32MeetingCapacity;
    EditText question24MeetingCell;
    EditText question34FemaleNumber;
    EditText question34MaleNumber;
    EditText question35Reason;
    CheckBox question41NoCheckBox;
    CheckBox question41YesCheckBox;
    EditText question42Plant1;
    EditText question42Date1;
    EditText question42Male1;
    EditText question42Female1;
    EditText question42Village1;
    EditText question42Village2;
    EditText question42Female2;
    EditText question42Male2;
    EditText question42Date2;
    EditText question42Plant2;
    EditText question42Plant3;
    EditText question42Date3;
    EditText question42Male3;
    EditText question42Female3;
    EditText question42Village3;
    EditText question42Plant4;
    EditText question42Date4;
    EditText question42Male4;
    EditText question42Female4;
    EditText question42Village4;
    EditText question42Village5;
    EditText question42Female5;
    EditText question42Male5;
    EditText question42Date5;
    EditText question42Plant5;
    EditText question43Reason;
    EditText question43AnyReason;
    CardView saveFormData;
    AgricultureActivityViewModel activityViewModel;
    private final String[] financialYears = {"I", "II", "III", "IV", "V", "VI", "VII"};
    private String selectedFinancialYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture_activity);
         activityViewModel = new ViewModelProvider(this).get(AgricultureActivityViewModel.class);
        initViews();

        saveFormData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveAgricultureQuestion(view);
            }
        });

        activityViewModel.getAllAgricultureQuestions().observe(this, new Observer<List<AgricultureQuestion>>() {
            @Override
            public void onChanged(List<AgricultureQuestion> agricultureQuestions) {
                if (agricultureQuestions != null ) {
                    Toast.makeText(AgricultureActivity.this, "Found Questions: " + String.valueOf(agricultureQuestions.size()), Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void saveAgricultureQuestion(View view) {
        AgricultureQuestion agricultureQuestion = new AgricultureQuestion(
                selectedFinancialYear,
                DynamicData.getDate(),
                villageEditText.getText().toString(),
                parishTextEdit.getText().toString(),
                parishTextEdit.getText().toString(),
                agentFullNameEditText.getText().toString(),
                agentTelephoneEditText.getText().toString(),
                agentNumberEditText.getText().toString(),
                getQuestion1RadioAnswer(),
                question1ReasonEditText.getText().toString(),
                extensionServiceExpectedOrReceivedEditText.getText().toString(),
                extensionServiceAmountReceivedTextEdit.getText().toString(),
                extensionServiceDateReceivedEditText.getText().toString(),
                extensionServiceDateWithdrawnEditText.getText().toString(),
                developmentExpectedOrApprovedTextEdit.getText().toString(),
                developmentAmountReceived.getText().toString(),
                extensionServiceDateReceivedEditText.getText().toString(),
                developmentDateWithdrawn.getText().toString(),
                question21EditText.getText().toString(),
                getQuestion22RadioAnswer(),
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null
        );
    }

    private String getQuestion1RadioAnswer() {
        if (question1RadioGroup.getCheckedRadioButtonId() == R.id.question1Yes) {
            return "Yes";
        }
        return "No";
    }

    private String getQuestion22RadioAnswer() {
        if (question1RadioGroup.getCheckedRadioButtonId() == R.id.question22Yes) {
            return "Yes";
        }
        return "No";
    }

    private void initViews() {
        financialYearSpinner = findViewById(R.id.financial_year_spinner);
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, financialYears);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        financialYearSpinner.setAdapter(aa);
        villageEditText = findViewById(R.id.village_text_edit);
        parishTextEdit = findViewById(R.id.parish_text_edit);
        divisionEditText = findViewById(R.id.division_text_edit);
        agentFullNameEditText = findViewById(R.id.ygb_agent_name_edit_view);
        agentTelephoneEditText = findViewById(R.id.ygb_agent_tel_edit_view);
        agentNumberEditText = findViewById(R.id.ygb_agent_no_edit_view);
        question1RadioGroup = findViewById(R.id.question1RadioGroup);
        question1ReasonEditText = findViewById(R.id.question_1_reason_text_edit);
        extensionServiceExpectedOrReceivedEditText = findViewById(R.id.q2extension_services_expected_or_approved);
        extensionServiceAmountReceivedTextEdit = findViewById(R.id.q2extension_services_amount_received);
        extensionServiceDateReceivedEditText = findViewById(R.id.q2extension_services_date_received);
        extensionServiceDateWithdrawnEditText = findViewById(R.id.extension_services_date_withdrawn);
        developmentExpectedOrApprovedTextEdit = findViewById(R.id.development_expected_or_approved);
        developmentAmountReceived = findViewById(R.id.development_amount_received);
        developmentDateReceived = findViewById(R.id.development_date_received);
        developmentDateWithdrawn = findViewById(R.id.development_date_withdrawn);
        question21EditText = findViewById(R.id.question_2_1_edit_text);
        question22NumberEditText = findViewById(R.id.number_of_meeting_text_edit);
        question22RadioGroup = findViewById(R.id.question22RadioGroup);
        question24NumberEditText = findViewById(R.id.demonstration_meeting_place_text_edit);
        question25ReasonNotMeetingEditEdit = findViewById(R.id.reason_for_not_conduction_meeting_text_view);
        question32MeetingCapacity = findViewById(R.id.question32MeetingCapacity);
        question24MeetingCell = findViewById(R.id.question24MeetingCell);
        question34FemaleNumber = findViewById(R.id.question34FemaleNumber);
        question34MaleNumber = findViewById(R.id.question34MaleNumber);
        question35Reason = findViewById(R.id.question35Reason);
        question41NoCheckBox = findViewById(R.id.question41NoCheckBox);
        question41YesCheckBox = findViewById(R.id.question41YesCheckBox);
        question42Plant1 = findViewById(R.id.question42Plant1);
        question42Date1 = findViewById(R.id.question42Date1);
        question42Male1 = findViewById(R.id.question42Male1);
        question42Female1 = findViewById(R.id.question42Female1);
        question42Village1 = findViewById(R.id.question42Village1);
        question42Village2 = findViewById(R.id.question42Village2);
        question42Female2 = findViewById(R.id.question42Female2);
        question42Male2 = findViewById(R.id.question42Male2);
        question42Date2 = findViewById(R.id.question42Date2);
        question42Plant2 = findViewById(R.id.question42Plant2);
        question42Plant3 = findViewById(R.id.question42Plant3);
        question42Date3 = findViewById(R.id.question42Date3);
        question42Male3 = findViewById(R.id.question42Male3);
        question42Female3 = findViewById(R.id.question42Female3);
        question42Village3 = findViewById(R.id.question42Village3);
        question42Plant4 = findViewById(R.id.question42Plant4);
        question42Date4 = findViewById(R.id.question42Date4);
        question42Male4 = findViewById(R.id.question42Male4);
        question42Female4 = findViewById(R.id.question42Female4);
        question42Village4 = findViewById(R.id.question42Village4);
        question42Village5 = findViewById(R.id.question42Village5);
        question42Female5 = findViewById(R.id.question42Female5);
        question42Male5 = findViewById(R.id.question42Male5);
        question42Date5 = findViewById(R.id.question42Date5);
        question42Plant5 =  findViewById(R.id.question42Plant5);
        question43Reason = findViewById(R.id.question43Reason);
        question43AnyReason =  findViewById(R.id.question43AnyReason);
        saveFormData = findViewById(R.id.saved_form_data);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        selectedFinancialYear = financialYears[position];
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        selectedFinancialYear = "";
    }
}