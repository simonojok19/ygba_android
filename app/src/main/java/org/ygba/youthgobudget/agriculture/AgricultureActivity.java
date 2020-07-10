package org.ygba.youthgobudget.agriculture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import org.ygba.youthgobudget.R;

public class AgricultureActivity extends AppCompatActivity {
    Spinner financialYearSpinner;
    EditText villageEditText;
    EditText parishTextEdit;
    EditText divisionEditText;
    EditText agentFullNameEditText;
    EditText agentTelephoneEditText;
    EditText agentNumberEditText;
    CheckBox yesWorkerCheckBox;
    CheckBox noWorkerCheckBox;
    EditText questionReasonEditText;
    EditText extensionServiceExpectedOrReceivedEditText;
    EditText extensionServiceAmountReceivedTextEdit;
    EditText extensionServiceDateReceivedEditText;
    EditText extensionServiceDateWithdrawnEditText;
    EditText developmentExpectedOrApprovedTextEdit;
    EditText developmentAmountReceived;
    EditText developmentDateReceived;
    EditText developmentDateWithdrawn;
    EditText question21EditText;
    CheckBox question22YesCheckBox;
    CheckBox question22NoCheckBox;
    EditText question22NumberEditText;
    EditText question24NumberEditText;
    EditText question25ReasonNotMeetingEditEdit;
    EditText question32MeetingCapacity;
    EditText question24MeetingCell;
    EditText question34FemaleNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture_activity);

        financialYearSpinner = findViewById(R.id.financial_year_spinner);
        villageEditText = findViewById(R.id.village_text_edit);
        parishTextEdit = findViewById(R.id.parish_text_edit);
        divisionEditText = findViewById(R.id.division_text_edit);
        agentFullNameEditText = findViewById(R.id.ygb_agent_name_edit_view);
        agentTelephoneEditText = findViewById(R.id.ygb_agent_tel_edit_view);
        agentNumberEditText = findViewById(R.id.ygb_agent_no_edit_view);
        yesWorkerCheckBox = findViewById(R.id.yesSubCountyHasExtensionWorker);
        noWorkerCheckBox = findViewById(R.id.noSubCountyHasExtensionWorker);
        questionReasonEditText = findViewById(R.id.question_1_reason_text_edit);
        extensionServiceExpectedOrReceivedEditText = findViewById(R.id.extension_services_expected_or_approved);
        extensionServiceAmountReceivedTextEdit = findViewById(R.id.extension_services_amount_received);
        extensionServiceDateReceivedEditText = findViewById(R.id.extension_services_date_received);
        extensionServiceDateWithdrawnEditText = findViewById(R.id.extension_services_date_withdrawn);
        developmentExpectedOrApprovedTextEdit = findViewById(R.id.development_expected_or_approved);
        developmentAmountReceived = findViewById(R.id.development_amount_received);
        developmentDateReceived = findViewById(R.id.development_date_received);
        developmentDateWithdrawn = findViewById(R.id.development_date_withdrawn);
        question21EditText = findViewById(R.id.question_2_1_edit_text);
        question22YesCheckBox = findViewById(R.id.question_2_2_yes_check_box);
        question22NoCheckBox = findViewById(R.id.question_2_2_no_check_box);
        question22NumberEditText = findViewById(R.id.number_of_meeting_text_edit);
        question24NumberEditText = findViewById(R.id.demonstration_meeting_place_text_edit);
        question25ReasonNotMeetingEditEdit = findViewById(R.id.reason_for_not_conduction_meeting_text_view);
        question32MeetingCapacity = findViewById(R.id.question32MeetingCapacity);
        question24MeetingCell = findViewById(R.id.question24MeetingCell);
        question34FemaleNumber = findViewById(R.id.question34FemaleNumber);
    }
}