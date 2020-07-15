package org.ygba.youthgobudget.data.water_and_environment;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = WaterEnvironmentConstants.TABLE_NAME)
public class WaterEnvironmentQuestion {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = WaterEnvironmentConstants.PRIMARY_KEY)
    private int primaryKey;

    @ColumnInfo(name = WaterEnvironmentConstants.FINANCIAL_YEAR)
    private String financialYear;

    @ColumnInfo(name = WaterEnvironmentConstants.DATE)
    private String date;

    @ColumnInfo(name = WaterEnvironmentConstants.DISTRICT)
    private String district;

    @ColumnInfo(name = WaterEnvironmentConstants.VILLAGE)
    private String village;

    @ColumnInfo(name = WaterEnvironmentConstants.PARISH)
    private String parish;

    @ColumnInfo(name = WaterEnvironmentConstants.SUB_COUNTY)
    private String sub_county;

    @ColumnInfo(name = WaterEnvironmentConstants.YGB_AGENT)
    private String agentName;

    @ColumnInfo(name = WaterEnvironmentConstants.AGENT_TEL)
    private String agentTel;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_1_OBJECTIVE_ANSWER)
    private boolean question1Objective;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_1_OBJECTIVE_REASON)
    private String question1ObjectiveReason;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_2_SANITATION)
    private String question2Water;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_3_OBJECTIVE)
    private String question3Objective;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_LONG_TEXT)
    private String question5Text;

    @ColumnInfo(name = WaterEnvironmentConstants.SUB_COUNTY_1)
    private String subCounty1;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_WATER_SOURCE_1)
    private String waterSource1;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_FUNCTIONAL_1)
    private int question5Functional1;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_NONE_FUNCTIONAL_1)
    private int question5NoneFunctional1;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_NO_WATER_SOURCE_AVAILABLE_1)
    private int question5WaterSoureAvailable1;
}
