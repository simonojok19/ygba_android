package org.ygba.youthgobudget.socialdevelopment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.dialogs.DatePickerActivity;

public class SocialDevelopmentActivity extends AppCompatActivity {
    private final int OTHER_DATE_WITHDRAWN_REQUEST_CODE = 1;
    private final int OTHER_DATE_RECEIVED_REQUEST_CODE = 2;
    private final int COMMUNITY_DATE_RECEIVED_REQUEST_CODE = 4;
    private final int COMMUNITY_DATE_WITHDRAWN_REQUEST_CODE = 5;
    private SocialDevelopmentActivityViewModel activityViewModel;
    private TextView socialDateTextView;
    private Spinner financialYearSpinner;
    private EditText villageTextEdit;
    private EditText parishTextEdit;
    private EditText divisionTextEdit;
    private EditText fullNameTextEdit;
    private EditText agentTelEditText;
    private EditText communityExpectedAmountEditText;
    private EditText communityReceivedAmountEditText;
    private EditText communityDateReceivedEditText;
    private EditText comDateWithdrawnEditText;
    private EditText otherExpectedAmountEditText;
    private EditText otherReceivedAmountEditText;
    private EditText otherDateReceivedEditText;
    private EditText otherDateWithdrawnEditText;
    private RadioGroup socialQn3RadioGroup;
    private EditText socialQuestion3EditText;
    private EditText sQuestion3GroupName1;
    private EditText sQuestion3GroupVillage1;
    private EditText sQuestion3GroupNumberFemales1;
    private EditText sQuestion3GroupNumberMales1;
    private EditText sQuestion3GroupAmountReceived1;
    private EditText sQuestion3GroupName2;
    private EditText sQuestion3GroupVillage2;
    private EditText sQuestion3GroupNumberFemales2;
    private EditText sQuestion3GroupNumberMales2;
    private EditText sQuestion3GroupAmountReceived2;
    private EditText sQuestion3GroupName3;
    private EditText sQuestion3GroupVillage3;
    private EditText sQuestion3GroupNumberFemales3;
    private EditText sQuestion3GroupNumberMales3;
    private EditText sQuestion3GroupAmountReceived3;
    private EditText sQuestion3GroupName4;
    private EditText sQuestion3GroupVillage4;
    private EditText sQuestion3GroupNumberFemales4;
    private EditText sQuestion3GroupNumberMales4;
    private EditText sQuestion3GroupAmountReceived4;
    private EditText sQuestion3GroupName5;
    private EditText sQuestion3GroupVillage5;
    private EditText sQuestion3GroupNumberFemales5;
    private EditText sQuestion3GroupNumberMales5;
    private EditText sQuestion3GroupAmountReceived5;
    private EditText sQuestion3GroupName6;
    private EditText sQuestion3GroupVillage6;
    private EditText sQuestion3GroupNumberFemales6;
    private EditText sQuestion3GroupNumberMales6;
    private EditText sQuestion3GroupAmountReceived6;
    private EditText sQuestion3GroupName7;
    private EditText sQuestion3GroupVillage7;
    private EditText sQuestion3GroupNumberFemales7;
    private EditText sQuestion3GroupNumberMales7;
    private EditText sQuestion3GroupAmountReceived7;
    private RadioGroup socialQn4RadioGroup;
    private EditText sQ4YouthList;

    // youth groups
    private EditText sQuestion4GroupName1;
    private EditText sQuestion4GroupVillage1;
    private EditText sQuestion4GroupNumberFemales1;
    private EditText sQuestion4GroupNumberMales1;
    private EditText sQuestion4GroupAmountReceived1;
    private EditText sQuestion4GroupName2;
    private EditText sQuestion4GroupVillage2;
    private EditText sQuestion4GroupNumberFemales2;
    private EditText sQuestion4GroupNumberMales2;
    private EditText sQuestion4GroupAmountReceived2;
    private EditText sQuestion4GroupName3;
    private EditText sQuestion4GroupVillage3;
    private EditText sQuestion4GroupNumberFemales3;
    private EditText sQuestion4GroupNumberMales3;
    private EditText sQuestion4GroupAmountReceived3;
    private EditText sQuestion4GroupName4;
    private EditText sQuestion4GroupVillage4;
    private EditText sQuestion4GroupNumberFemales4;
    private EditText sQuestion4GroupNumberMales4;
    private EditText sQuestion4GroupAmountReceived4;
    private EditText sQuestion4GroupName5;
    private EditText sQuestion4GroupVillage5;
    private EditText sQuestion4GroupNumberFemales5;
    private EditText sQuestion4GroupNumberMales5;
    private EditText sQuestion4GroupAmountReceived5;
    private EditText sQuestion4GroupName6;
    private EditText sQuestion4GroupVillage6;
    private EditText sQuestion4GroupNumberFemales6;
    private EditText sQuestion4GroupNumberMales6;
    private EditText sQuestion4GroupAmountReceived6;
    private EditText sQuestion4GroupName7;
    private EditText sQuestion4GroupVillage7;
    private EditText sQuestion4GroupNumberFemales7;
    private EditText sQuestion4GroupNumberMales7;
    private EditText sQuestion4GroupAmountReceived7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_development);
        activityViewModel = new ViewModelProvider(this).get(SocialDevelopmentActivityViewModel.class);

        initViews();

        setOnClickListeners();
    }

    private void setOnClickListeners() {
        otherDateWithdrawnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(SocialDevelopmentActivity.this, DatePickerActivity.class), OTHER_DATE_WITHDRAWN_REQUEST_CODE);
            }
        });

        otherDateReceivedEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(SocialDevelopmentActivity.this, DatePickerActivity.class), OTHER_DATE_RECEIVED_REQUEST_CODE);
            }
        });

        communityDateReceivedEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(SocialDevelopmentActivity.this, DatePickerActivity.class), COMMUNITY_DATE_RECEIVED_REQUEST_CODE);
            }
        });

        comDateWithdrawnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(SocialDevelopmentActivity.this, DatePickerActivity.class), COMMUNITY_DATE_WITHDRAWN_REQUEST_CODE);
            }
        });
    }

    private void initViews() {
        socialDateTextView = findViewById(R.id.social_date_text_view);
        financialYearSpinner = findViewById(R.id.financial_year_spinner);
        villageTextEdit = findViewById(R.id.village_text_edit);
        parishTextEdit = findViewById(R.id.parish_text_edit);
        divisionTextEdit = findViewById(R.id.division_text_edit);
        fullNameTextEdit = findViewById(R.id.ygb_agent_name_edit_view);
        agentTelEditText = findViewById(R.id.ygb_agent_tel_edit_view);
        communityExpectedAmountEditText = findViewById(R.id.community_expected_amount_edit_text);
        communityReceivedAmountEditText = findViewById(R.id.community_received_amount_edit_text);
        communityDateReceivedEditText = findViewById(R.id.community_date_received_edit_text);
        communityDateReceivedEditText.setInputType(View.AUTOFILL_TYPE_NONE);
        comDateWithdrawnEditText = findViewById(R.id.community_date_withdrawn_edit_text);
        comDateWithdrawnEditText.setInputType(View.AUTOFILL_TYPE_NONE);
        otherExpectedAmountEditText = findViewById(R.id.other_expected_amount_edit_text);
        otherReceivedAmountEditText = findViewById(R.id.other_received_amount_edit_text);
        otherDateReceivedEditText = findViewById(R.id.other_date_received_edit_text);
        otherDateReceivedEditText.setInputType(View.AUTOFILL_TYPE_NONE);
        otherDateWithdrawnEditText =  findViewById(R.id.other_date_withdrawn_edit_text);
        otherDateWithdrawnEditText.setInputType(View.AUTOFILL_TYPE_NONE);
        socialQn3RadioGroup = findViewById(R.id.social_qn_3_radio_group);
        socialQuestion3EditText = findViewById(R.id.social_q_3_women_list);
        sQuestion3GroupName1 = findViewById(R.id.social_q_3_women_group_name_1);
        sQuestion3GroupVillage1 = findViewById(R.id.social_q_3_women_group_village_1);
        sQuestion3GroupNumberFemales1 = findViewById(R.id.social_q_3_women_group_number_females_1);
        sQuestion3GroupNumberMales1 = findViewById(R.id.social_q_3_women_group_number_males_1);
        sQuestion3GroupAmountReceived1 = findViewById(R.id.social_q_3_women_group_amount_received_1);
        sQuestion3GroupName2 = findViewById(R.id.social_q_3_women_group_name_2);
        sQuestion3GroupVillage2 = findViewById(R.id.social_q_3_women_group_village_2);
        sQuestion3GroupNumberFemales2 = findViewById(R.id.social_q_3_women_group_number_females_2);
        sQuestion3GroupNumberMales2 = findViewById(R.id.social_q_3_women_group_number_males_2);
        sQuestion3GroupAmountReceived2 = findViewById(R.id.social_q_3_women_group_amount_received_2);
        sQuestion3GroupName3 = findViewById(R.id.social_q_3_women_group_name_3);
        sQuestion3GroupVillage3 = findViewById(R.id.social_q_3_women_group_village_3);
        sQuestion3GroupNumberFemales3 = findViewById(R.id.social_q_3_women_group_number_females_3);
        sQuestion3GroupNumberMales3 = findViewById(R.id.social_q_3_women_group_number_males_3);
        sQuestion3GroupAmountReceived3 = findViewById(R.id.social_q_3_women_group_amount_received_3);
        sQuestion3GroupName4 = findViewById(R.id.social_q_3_women_group_name_4);
        sQuestion3GroupVillage4 = findViewById(R.id.social_q_3_women_group_village_4);
        sQuestion3GroupNumberFemales4 = findViewById(R.id.social_q_3_women_group_number_females_4);
        sQuestion3GroupNumberMales4 = findViewById(R.id.social_q_3_women_group_number_males_4);
        sQuestion3GroupAmountReceived4 = findViewById(R.id.social_q_3_women_group_amount_received_4);
        sQuestion3GroupName5 = findViewById(R.id.social_q_3_women_group_name_5);
        sQuestion3GroupVillage5 = findViewById(R.id.social_q_3_women_group_village_5);
        sQuestion3GroupNumberFemales5 = findViewById(R.id.social_q_3_women_group_number_females_5);
        sQuestion3GroupNumberMales5 = findViewById(R.id.social_q_3_women_group_number_males_5);
        sQuestion3GroupAmountReceived5 = findViewById(R.id.social_q_3_women_group_amount_received_5);
        sQuestion3GroupName6 = findViewById(R.id.social_q_3_women_group_name_6);
        sQuestion3GroupVillage6 = findViewById(R.id.social_q_3_women_group_village_6);
        sQuestion3GroupNumberFemales6 = findViewById(R.id.social_q_3_women_group_number_females_6);
        sQuestion3GroupNumberMales6 = findViewById(R.id.social_q_3_women_group_number_males_6);
        sQuestion3GroupAmountReceived6 = findViewById(R.id.social_q_3_women_group_amount_received_6);
        sQuestion3GroupName7 = findViewById(R.id.social_q_3_women_group_name_7);
        sQuestion3GroupVillage7 = findViewById(R.id.social_q_3_women_group_village_7);
        sQuestion3GroupNumberFemales7 = findViewById(R.id.social_q_3_women_group_number_females_7);
        sQuestion3GroupNumberMales7 = findViewById(R.id.social_q_3_women_group_number_males_7);
        sQuestion3GroupAmountReceived7 = findViewById(R.id.social_q_3_women_group_amount_received_7);
        socialQn4RadioGroup = findViewById(R.id.social_qn_4_radio_group);
        sQ4YouthList = findViewById(R.id.social_q_4_youth_list);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((data != null) && (resultCode == RESULT_OK)) {
            switch (requestCode) {
                case OTHER_DATE_WITHDRAWN_REQUEST_CODE:
                    otherDateWithdrawnEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
                    return;

                case OTHER_DATE_RECEIVED_REQUEST_CODE:
                    otherDateReceivedEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
                    return;

                case COMMUNITY_DATE_RECEIVED_REQUEST_CODE:
                    communityDateReceivedEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
                    return;

                case COMMUNITY_DATE_WITHDRAWN_REQUEST_CODE:
                    comDateWithdrawnEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
                    return;

                default:
            }
        }
    }

    private String getQ3ObjectiveAnswer() {
        if (socialQn3RadioGroup.getCheckedRadioButtonId() == R.id.social_qn_3_radio_button_yes) {
            return "Yes";
        }
        return "No";
    }

    private String getQ4ObjectiveAnswer() {
        if (socialQn4RadioGroup.getCheckedRadioButtonId() == R.id.social_qn_4_radio_button_yes) {
            return "Yes";
        }
        return "No";
    }
}