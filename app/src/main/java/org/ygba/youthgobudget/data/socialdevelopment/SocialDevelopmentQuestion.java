package org.ygba.youthgobudget.data.socialdevelopment;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = SocialDevelopmentConstants.TABLE_NAME)
public class SocialDevelopmentQuestion {

    @ColumnInfo(name = SocialDevelopmentConstants.PRIMARY_KEY)
    @PrimaryKey(autoGenerate = true)
    private int primaryKey;

    @ColumnInfo(name = SocialDevelopmentConstants.FINANCIAL_YEAR)
    private String financialYear;

    @ColumnInfo(name = SocialDevelopmentConstants.DATE)
    private String date;

    @ColumnInfo(name = SocialDevelopmentConstants.DISTRICT)
    private String district;

    @ColumnInfo(name = SocialDevelopmentConstants.VILLAGE)
    private String village;

    @ColumnInfo(name = SocialDevelopmentConstants.PARISH)
    private String parish;

    @ColumnInfo(name = SocialDevelopmentConstants.DIVISION)
    private String division;

    @ColumnInfo(name = SocialDevelopmentConstants.AGENT_NAME)
    private String ygbaAgentFullName;

    @ColumnInfo(name = SocialDevelopmentConstants.YGBA_TEL)
    private String ygbaTel;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_COMMUNITY_EXPECTED_APPROVED)
    private String q2CommunityExpected;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_COMMUNITY_AMOUNT_RECEIVED)
    private String q2CommunityAmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_COMMUNITY_DATE_RECEIVED)
    private String q2CommunityDateReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_COMMUNITY_DATE_WITHDRAWN)
    private String q2CommunityDateWithdrawn;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_OTHER_AMOUNT_EXPECTED)
    private String q2OtherExpectedAmount;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_OTHER_AMOUNT_RECEIVED)
    private String q2OtherAmountedReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_OTHERS_DATE_RECEIVED)
    private String q2OthersDateReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_OTHERS_DAE_WITHDRAWN)
    private String q2OthersDateWithdrawn;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_EMPOWERMENT_OBJECTIVE)
    private String q3WomenEmpowermentObjective;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_EMPOWERMENT_OBJECTIVE_REASON)
    private String q3WomenEmpowermentObjectiveReason;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_1_NAME)
    private String q3WomanGroup1Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_1_VILLAGE)
    private String q3WomenGroup1Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_1_MALE_NUMBER)
    private String q3WomenGroup1MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_1_FEMALE_NUMBER)
    private String q3WomenGroup1FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_1_AMOUNT_RECEIVED)
    private String q3WomenGroup1AmountReceived;
}
