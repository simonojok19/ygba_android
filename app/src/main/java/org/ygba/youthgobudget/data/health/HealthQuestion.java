package org.ygba.youthgobudget.data.health;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = HealthQuestionConstants.TABLE_NAME)
public class HealthQuestion {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = HealthQuestionConstants.PRIMARY_KEY)
    private int primaryKey;

    @ColumnInfo(name = HealthQuestionConstants.FINANCIAL_YEAR)
    private String financialYear;

    @ColumnInfo(name = HealthQuestionConstants.FINANCIAL_QUARTER)
    private String financialYearQuarter;

    @ColumnInfo(name = HealthQuestionConstants.DATE)
    private String data;

    @ColumnInfo(name = HealthQuestionConstants.DISTRICT_NAME)
    private String district;

    @ColumnInfo(name = HealthQuestionConstants.VILLAGE_NAME)
    private String village;

    @ColumnInfo(name = HealthQuestionConstants.PARISH_NAME)
    private String parish;

    @ColumnInfo(name = HealthQuestionConstants.TOWN_COUNCIL)
    private String townCouncil;

    @ColumnInfo(name = HealthQuestionConstants.NAME_MONITOR_AGENT)
    private String nameMonitorAgent;

    @ColumnInfo(name = HealthQuestionConstants.TEL_NUMBER)
    private String telNumber;

    @ColumnInfo(name = HealthQuestionConstants.NAME_AND_GRADE_HEALTH_CENTER)
    private String questionANameAndGradeHealthCenter;

    @ColumnInfo(name = HealthQuestionConstants.NUMBER_OUT_PATIENTS_QUESTION_B)
    private int questionBOutPatientOPDAttendance;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_C_IN_PATIENT)
    private int questionCInPatientAttendance;

    @ColumnInfo(name = HealthQuestionConstants.QUESYION_1_RECURRENT_APPROVED_BUDGET)
    private int question1RecurrentApprovedBudget;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_1_RECURRENT_BUDGET_RECIEVED)
    private int question1RecurrentBudgetReleased;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_1_RECURRENT_DATE_RECIEVED)
    private String question1RecurrentDateReceived;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_1_RECURRENT_DATE_WITHDRAWN)
    private String question1RecurrentDateWithdrawn;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_1_DEVELOPMENT_APPROVED_BUDGET)
    private int question1DevelopmentApprovedBudget;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_1_DEVELOPMENT_RELEASED_BUDGET)
    private int question1DevelopmentReleasedBudget;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_1_DEVELOMENT_DATE_RECIEVED)
    private String question1DevelopmentDateReceived;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_1_DEVELOPMENT_DATE_WITHDRAWN)
    private String question1DevelopmentDateWithdrawn;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_1_1_DISPLAY_AREA)
    private String question11DisplayBudgetInformation;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_1_2_DISPLAY_INFORMATION_RELATES)
    private String question12BudgetInformationRelates;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_MATERNITY_YES_NO)
    private boolean question2MaternityYesNo;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_GENERAL_WARD_YES_NO)
    private boolean question2GeneralWardYesNo;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_DELIVERY_YES_NO)
    private boolean question2DeliveryBedsYesNo;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_FAMILY_PLANNING_YES_NO)
    private boolean question2FamilyPlanningServicesYesNo;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_HIV_TESTING_AND_TREACTMENT)
    private boolean question2HIVCounsellingTestingAndTreatmentYesNo;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_PMTCT)
    private boolean question2PMTCTYesNo;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_IMMUNIZATION_YES_NO)
    private boolean question2ImmunizationYesNo;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_YOUTH_FRIENDLY_CORNERS_YES_NO)
    private boolean question2YouthFriendlyCornersYesNo;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_HEP_B_YES_NO)
    private boolean question2Vaccination4HEPBYesNo;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_1_CATEGORY_LIVE_NUMBER)
    private int question21CategoryLiveNumberDeliveries;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_1_CATEGORY_STILL_NUMBER)
    private int question21CategoryStillNumberDeliveries;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_2_NUMBER_CHILDREN_IMMUNIZED)
    private int question22ChildrenImmunized;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_TOILET_NUMBER_BLOCKS)
    private int question3ToiletNumberBlocks;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_TOILET_NUMBER_INSTANCES)
    private int question3ToiletNumberInstances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_PATIENT_NUMBER_MALE_STANCES)
    private int question3PatientToiletNumberMaleStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_PATIENT_NUMBER_STANCES)
    private int question3PatientToiletNumberFemaleStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_HEALTH_STAFF_NUMBER_MALE_STANCES)
    private int question3HealthStaffNumberToiletMaleStance;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_HEALTH_STAFF_NUMBER_FEMALE_STANCES)
    private int question3HealthStaffNumberToiletFemaleStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_HEALTH_MIXED_NUMBER_STANCES)
    private int question3HealthStaffNumberToiletMixedStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_4_TOILET_NUMBER_FUNCTIONAL)
    private int question3ToiletFunctionalNumber;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_TOILET_NONE_FUNCTION_NUMBER)
    private int question3ToiletNonFunctionNumber;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_NUMBER_BLOCKS)
    private int question3LatrineNumberBlocks;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_NUMBER_STANCES)
    private int question3LatrineNumberStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_NUMBER_MALE_STANCES)
    private int question3LatrineNumberMaleStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_NUMBER_FEMALE_STANCES)
    private int question3LatrineNumberFemaleStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_PATIENTS_NUMBER_MALE_STANCES)
    private int question3LatrineNumberPatientMaleStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_STAFF_NUMBER_MALE_STANCES)
    private int question3LatrineNumberStaffMaleStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_STAFF_NUMBER_FEMALE_STANCES)
    private int question3LatrineNumberStaffFemaleStance;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_NUMBER_STAFF_MIXED_STANCES)
    private int question3LatrineNumberStaffMixedStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_NUMBER_NON_FUNCTIONAL)
    private int question3LatrineNumberFunctional;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_NUMBER_NONE_FUNCTIONAL)
    private int question3LatrineNoneFunctional;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_FCM_NUMBER_BLOCKS)
    private int question3FCRNumberBlock;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_FCM_NUMBER_STANCES)
    private int question3FCRNumberStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_FEM_NUMBER_FEMALE_STANCES)
    private int question3FCRNumberFemaleStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_FCM_STAFF_NUMBER_STANCES)
    private int question3FCRNumberStaffFemaleStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_FCR_STAFF_MIXED_STANCES)
    private int question3FCRNumberStaffMixedStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_FCR_FUNCTION)
    private int question3FCRNumberFunctionalStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_FCR_NONE_FUNCTION)
    private int question3FCRNumberNoneFunction;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_FCR_REASON_PWD_FRIENDLY)
    private String question32HealthFacilityToiletReasonFacilities;


    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_1_HEALTH_FACILITY_FACILITIES)
    private boolean question31HealthFacilityToiletFacilities;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_NUMBER_OF_BORE_HOLE)
    private int question4NumberOfBoreHole;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_NUMBER_OF_BORE_HOLE_FUNCTIONAL)
    private int question4NumberOfBoreHoleFunctional;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_NUMBER_OF_BORE_HOLE_NONE_FUNCTIONAL)
    private int question4NumberOfBoreHoleNoneFunctional;

    private HealthQuestion() {}

    public static class Builder {
        private final HealthQuestion INSTANCE;

        public Builder() {
            INSTANCE = new HealthQuestion();
        }

        public HealthQuestion build() {
            return INSTANCE;
        }

        public Builder setFinancialYear(String financialYear) {
            INSTANCE.setFinancialYear(financialYear);
            return this;
        }

        public Builder setFinancialYearQuarter(String quarter) {
            INSTANCE.setFinancialYearQuarter(quarter);
            return this;
        }

        public Builder setDate(String textValue) {
            INSTANCE.setData(textValue);
            return this;
        }

        public Builder setDistrict(String district_name) {
            INSTANCE.setDistrict(district_name);
            return this;
        }

        public Builder setVillage(String textValue) {
            INSTANCE.setVillage(textValue);
            return this;
        }

        public Builder setParish(String textValue) {
            INSTANCE.setParish(textValue);
            return this;
        }

        public Builder setSubCountyDivision(String textValue) {
            INSTANCE.setTownCouncil(textValue);
            return this;
        }

        public Builder setNameMonitorAgent(String textValue) {
            INSTANCE.setNameMonitorAgent(textValue);
            return this;
        }

        public Builder setTelNumber(String textValue) {
            INSTANCE.setTelNumber(textValue);
            return this;
        }

        public Builder setNameAndGradeHealthCenter(String textValue) {
            INSTANCE.setQuestionANameAndGradeHealthCenter(textValue);
            return this;
        }

        public Builder setQuestionBOutPatientOPD(int integerValue) {
            INSTANCE.setQuestionBOutPatientOPDAttendance(integerValue);
            return this;
        }

        public Builder setQuestionCInPatientAttendance(int integerValue) {
            INSTANCE.setQuestionCInPatientAttendance(integerValue);
            return this;
        }

        public Builder setQuestion1RecurrentApprovedBudget(int integerValue) {
            INSTANCE.setQuestion1RecurrentApprovedBudget(integerValue);
            return this;
        }

        public Builder setQuestion1RecurrentBudgetReleased(int integerValue) {
            INSTANCE.setQuestion1RecurrentBudgetReleased(integerValue);
            return this;
        }

        public Builder setQuestion1RecurrentDateReceived(String textValue) {
            INSTANCE.setQuestion1RecurrentDateReceived(textValue);
            return this;
        }

        public Builder setQuestion1RecurrentDateWithdrawn(String textValue) {
            INSTANCE.setQuestion1RecurrentDateWithdrawn(textValue);
            return this;
        }

        public Builder setQuestion1DevelopmentApprovedBudget(int integerValue) {
            INSTANCE.setQuestion1DevelopmentApprovedBudget(integerValue);
            return this;
        }

        public Builder setQuestion1DevelopmentReleasedBudget(int integerValue) {
            INSTANCE.setQuestion1DevelopmentReleasedBudget(integerValue);
            return this;
        }

        public Builder setQuestion1DevelopmentDateReceived(String textValue) {
            INSTANCE.setQuestion1DevelopmentDateReceived(textValue);
            return this;
        }

        public Builder setQuestion1DevelopmentDateWithdrawn(String textValue) {
            INSTANCE.setQuestion1DevelopmentDateWithdrawn(textValue);
            return this;
        }

        public Builder setQuestion11DisplayBudgetInformation(String display_area) {
            INSTANCE.setQuestion11DisplayBudgetInformation(display_area);
            return this;
        }

        public Builder setQuestion12BudgetInformationRelates(String textValue) {
            INSTANCE.setQuestion12BudgetInformationRelates(textValue);
            return this;
        }

        public Builder setQuestion2MaternityYesNo(boolean question2MaternityWardObjective) {
            INSTANCE.setQuestion2MaternityYesNo(question2MaternityWardObjective);
            return this;
        }

        public Builder setQuestion2GeneralWardYesNo(boolean question2GeneralWardObjective) {
            INSTANCE.setQuestion2GeneralWardYesNo(question2GeneralWardObjective);
            return this;
        }

        public Builder setQuestion2DeliveryBedsYesNo(boolean question2DeliveryBedsObjective) {
            INSTANCE.setQuestion2DeliveryBedsYesNo(question2DeliveryBedsObjective);
            return this;
        }

        public Builder setQuestion2FamilyPlanningServicesYesNo(boolean question2FamilyPlanningServicesObjective) {
            INSTANCE.setQuestion2FamilyPlanningServicesYesNo(question2FamilyPlanningServicesObjective);
            return this;
        }

        public Builder setQuestion2HIVCounsellingTestingAndTreatmentYesNo(boolean question2HIVCounsellingTestingObjective) {
            INSTANCE.setQuestion2HIVCounsellingTestingAndTreatmentYesNo(question2HIVCounsellingTestingObjective);
            return this;
        }

        public Builder setQuestion2PMTCTYesNo(boolean question2PMTCTObjective) {
            INSTANCE.setQuestion2PMTCTYesNo(question2PMTCTObjective);
            return this;
        }

        public Builder setQuestion2ImmunizationYesNo(boolean question2ImmunizationObjective) {
            INSTANCE.setQuestion2ImmunizationYesNo(question2ImmunizationObjective);
            return this;
        }

        public Builder setQuestion2YouthFriendlyCornersYesNo(boolean question2YouthFriendlyCornersObjective) {
            INSTANCE.setQuestion2YouthFriendlyCornersYesNo(question2YouthFriendlyCornersObjective);
            return this;
        }

        public Builder setQuestion2Vaccination4HEPBYesNo(boolean question2VaccinationHEPBObjective) {
            INSTANCE.setQuestion2Vaccination4HEPBYesNo(question2VaccinationHEPBObjective);
            return this;
        }

        public Builder setQuestion21CategoryLiveNumberDeliveries(int integerValue) {
            INSTANCE.setQuestion21CategoryLiveNumberDeliveries(integerValue);
            return this;
        }

        public Builder setQuestion21CategoryStillNumberDeliveries(int integerValue) {
            INSTANCE.setQuestion21CategoryStillNumberDeliveries(integerValue);
            return this;
        }

        public Builder setQuestion22ChildrenImmunized(int integerValue) {
            INSTANCE.setQuestion22ChildrenImmunized(integerValue);
            return this;
        }

        public Builder setQuestion3ToiletNumberBlocks(int integerValue) {
            INSTANCE.setQuestion3ToiletNumberBlocks(integerValue);
            return this;
        }

        public Builder setQuestion3ToiletNumberInstances(int integerValue) {
            INSTANCE.setQuestion3ToiletNumberInstances(integerValue);
            return this;
        }

        public Builder setQuestion3PatientToiletNumberMaleStances(int integerValue) {
            INSTANCE.setQuestion3PatientToiletNumberMaleStances(integerValue);
            return this;
        }

        public Builder setQuestion3PatientToiletNumberFemaleStances(int integerValue) {
            INSTANCE.setQuestion3PatientToiletNumberFemaleStances(integerValue);
            return this;
        }

        public Builder setQuestion3HealthStaffNumberToiletMaleStance(int integerValue) {
            INSTANCE.setQuestion3HealthStaffNumberToiletMaleStance(integerValue);
            return this;
        }

        public Builder setQuestion3HealthStaffNumberToiletFemaleStances(int integerValue) {
            INSTANCE.setQuestion3HealthStaffNumberToiletFemaleStances(integerValue);
            return this;
        }

        public Builder setQuestion3HealthStaffNumberToiletMixedStances(int integerValue) {
            INSTANCE.setQuestion3HealthStaffNumberToiletMixedStances(integerValue);
            return this;
        }

        public Builder setQuestion3ToiletFunctionalNumber(int integerValue) {
            INSTANCE.setQuestion3ToiletFunctionalNumber(integerValue);
            return this;
        }

        public Builder setQuestion3ToiletNonFunctionNumber(int integerValue) {
            INSTANCE.setQuestion3ToiletNonFunctionNumber(integerValue);
            return this;
        }

        public Builder setQuestion3LatrineNumberBlocks(int integerValue) {
            INSTANCE.setQuestion3LatrineNumberBlocks(integerValue);
            return this;
        }

        public Builder setQuestion3LatrineNumberStances(int integerValue) {
            INSTANCE.setQuestion3LatrineNumberStances(integerValue);
            return this;
        }

        public Builder setQuestion3LatrineNumberMaleStances(int integerValue) {
            INSTANCE.setQuestion3LatrineNumberMaleStances(integerValue);
            return this;
        }

        public Builder setQuestion3LatrineNumberFemaleStances(int integerValue) {
            INSTANCE.setQuestion3LatrineNumberFemaleStances(integerValue);
            return this;
        }

        public Builder setQuestion3LatrineNumberPatientMaleStances(int i) {
            INSTANCE.setQuestion3LatrineNumberPatientMaleStances(i);
            return this;
        }

        public Builder setQuestion3LatrineNumberStaffMaleStances(int integerValue) {
            INSTANCE.setQuestion3LatrineNumberStaffMaleStances(integerValue);
            return this;
        }

        public Builder setQuestion3LatrineNumberStaffFemaleStance(int integerValue) {
            INSTANCE.setQuestion3LatrineNumberStaffFemaleStance(integerValue);
            return this;
        }

        public Builder setQuestion3LatrineNumberStaffMixedStances(int integerValue) {
            INSTANCE.setQuestion3LatrineNumberStaffMixedStances(integerValue);
            return this;
        }

        public Builder setQuestion3LatrineNumberNumberFunctional(int integerValue) {
            INSTANCE.setQuestion3LatrineNumberFunctional(integerValue);
            return this;
        }

        public Builder setQuestion3LatrineNoneFunctional(int integerValue) {
            INSTANCE.setQuestion3LatrineNoneFunctional(integerValue);
            return this;
        }

        public Builder setQuestion3FCRNumberBlock(int integerValue) {
            INSTANCE.setQuestion3FCRNumberBlock(integerValue);
            return this;
        }

        public Builder setQuestion3FCRNumberStances(int integerValue) {
            INSTANCE.setQuestion3FCRNumberStances(integerValue);
            return this;
        }

        public Builder setQuestion3FCRNumberFemaleStances(int integerValue) {
            INSTANCE.setQuestion3FCRNumberFemaleStances(integerValue);
            return this;
        }

        public Builder setQuestion3FCRNumberStaffFemaleStances(int integerValue) {
            INSTANCE.setQuestion3FCRNumberStaffFemaleStances(integerValue);
            return this;
        }

        public Builder setQuestion3FCRNumberStaffMixedStances(int integerValue) {
            INSTANCE.setQuestion3FCRNumberStaffMixedStances(integerValue);
            return this;
        }

        public Builder setQuestion3FCRNumberFunctionalStances(int integerValue) {
            INSTANCE.setQuestion3FCRNumberFunctionalStances(integerValue);
            return this;
        }

        public Builder setQuestion3FCRNumberNoneFunction(int integerValue) {
            INSTANCE.setQuestion3FCRNumberNoneFunction(integerValue);
            return this;
        }

        public Builder setQuestion31HealthFacilityToiletFacilities(boolean question31ToiletObjective) {
            INSTANCE.setQuestion31HealthFacilityToiletFacilities(question31ToiletObjective);
            return this;
        }

        public Builder setQuestion32HealthFacilityToiletReasonFacilities(String reasons) {
            INSTANCE.setQuestion32HealthFacilityToiletReasonFacilities(reasons);
            return this;
        }

        public Builder setQuestion4NumberOfBoreHole(int integerValue) {
            INSTANCE.setQuestion4NumberOfBoreHole(integerValue);
            return this;
        }

        public Builder setQuestion4NumberOfBoreHoleFunctional(int integerValue) {
            INSTANCE.setQuestion4NumberOfBoreHoleFunctional(integerValue);
            return this;
        }

        public Builder setQuestion4NumberOfBoreHoleNoneFunctional(int integerValue) {
            INSTANCE.setQuestion4NumberOfBoreHoleNoneFunctional(integerValue);
            return this;
        }
    }

    public int getQuestion4NumberOfBoreHoleNoneFunctional() {
        return question4NumberOfBoreHoleNoneFunctional;
    }

    public void setQuestion4NumberOfBoreHoleNoneFunctional(int question4NumberOfBoreHoleNoneFunctional) {
        this.question4NumberOfBoreHoleNoneFunctional = question4NumberOfBoreHoleNoneFunctional;
    }

    public int getQuestion4NumberOfBoreHoleFunctional() {
        return question4NumberOfBoreHoleFunctional;
    }

    public void setQuestion4NumberOfBoreHoleFunctional(int question4NumberOfBoreHoleFunctional) {
        this.question4NumberOfBoreHoleFunctional = question4NumberOfBoreHoleFunctional;
    }

    public int getQuestion4NumberOfBoreHole() {
        return question4NumberOfBoreHole;
    }

    public void setQuestion4NumberOfBoreHole(int question4NumberOfBoreHole) {
        this.question4NumberOfBoreHole = question4NumberOfBoreHole;
    }

    public String getQuestion32HealthFacilityToiletReasonFacilities() {
        return question32HealthFacilityToiletReasonFacilities;
    }

    public void setQuestion32HealthFacilityToiletReasonFacilities(String question32HealthFacilityToiletReasonFacilities) {
        this.question32HealthFacilityToiletReasonFacilities = question32HealthFacilityToiletReasonFacilities;
    }

    public boolean isQuestion31HealthFacilityToiletFacilities() {
        return question31HealthFacilityToiletFacilities;
    }

    public void setQuestion31HealthFacilityToiletFacilities(boolean question31HealthFacilityToiletFacilities) {
        this.question31HealthFacilityToiletFacilities = question31HealthFacilityToiletFacilities;
    }

    public int getQuestion3FCRNumberNoneFunction() {
        return question3FCRNumberNoneFunction;
    }

    public void setQuestion3FCRNumberNoneFunction(int question3FCRNumberNoneFunction) {
        this.question3FCRNumberNoneFunction = question3FCRNumberNoneFunction;
    }

    public int getQuestion3FCRNumberFunctionalStances() {
        return question3FCRNumberFunctionalStances;
    }

    public void setQuestion3FCRNumberFunctionalStances(int question3FCRNumberFunctionalStances) {
        this.question3FCRNumberFunctionalStances = question3FCRNumberFunctionalStances;
    }

    public int getQuestion3FCRNumberStaffMixedStances() {
        return question3FCRNumberStaffMixedStances;
    }

    public void setQuestion3FCRNumberStaffMixedStances(int question3FCRNumberStaffMixedStances) {
        this.question3FCRNumberStaffMixedStances = question3FCRNumberStaffMixedStances;
    }

    public int getQuestion3FCRNumberStaffFemaleStances() {
        return question3FCRNumberStaffFemaleStances;
    }

    public void setQuestion3FCRNumberStaffFemaleStances(int question3FCRNumberStaffFemaleStances) {
        this.question3FCRNumberStaffFemaleStances = question3FCRNumberStaffFemaleStances;
    }

    public int getQuestion3FCRNumberFemaleStances() {
        return question3FCRNumberFemaleStances;
    }

    public void setQuestion3FCRNumberFemaleStances(int question3FCRNumberFemaleStances) {
        this.question3FCRNumberFemaleStances = question3FCRNumberFemaleStances;
    }

    public int getQuestion3FCRNumberStances() {
        return question3FCRNumberStances;
    }

    public void setQuestion3FCRNumberStances(int question3FCRNumberStances) {
        this.question3FCRNumberStances = question3FCRNumberStances;
    }

    public int getQuestion3FCRNumberBlock() {
        return question3FCRNumberBlock;
    }

    public void setQuestion3FCRNumberBlock(int question3FCRNumberBlock) {
        this.question3FCRNumberBlock = question3FCRNumberBlock;
    }

    public int getQuestion3LatrineNoneFunctional() {
        return question3LatrineNoneFunctional;
    }

    public void setQuestion3LatrineNoneFunctional(int question3LatrineNoneFunctional) {
        this.question3LatrineNoneFunctional = question3LatrineNoneFunctional;
    }

    public int getQuestion3LatrineNumberFunctional() {
        return question3LatrineNumberFunctional;
    }

    public void setQuestion3LatrineNumberFunctional(int question3LatrineNumberFunctional) {
        this.question3LatrineNumberFunctional = question3LatrineNumberFunctional;
    }

    public int getQuestion3LatrineNumberStaffMixedStances() {
        return question3LatrineNumberStaffMixedStances;
    }

    public void setQuestion3LatrineNumberStaffMixedStances(int question3LatrineNumberStaffMixedStances) {
        this.question3LatrineNumberStaffMixedStances = question3LatrineNumberStaffMixedStances;
    }

    public int getQuestion3LatrineNumberStaffFemaleStance() {
        return question3LatrineNumberStaffFemaleStance;
    }

    public void setQuestion3LatrineNumberStaffFemaleStance(int question3LatrineNumberStaffFemaleStance) {
        this.question3LatrineNumberStaffFemaleStance = question3LatrineNumberStaffFemaleStance;
    }

    public int getQuestion3LatrineNumberStaffMaleStances() {
        return question3LatrineNumberStaffMaleStances;
    }

    public void setQuestion3LatrineNumberStaffMaleStances(int question3LatrineNumberStaffMaleStances) {
        this.question3LatrineNumberStaffMaleStances = question3LatrineNumberStaffMaleStances;
    }

    public int getQuestion3LatrineNumberPatientMaleStances() {
        return question3LatrineNumberPatientMaleStances;
    }

    public void setQuestion3LatrineNumberPatientMaleStances(int question3LatrineNumberPatientMaleStances) {
        this.question3LatrineNumberPatientMaleStances = question3LatrineNumberPatientMaleStances;
    }

    public int getQuestion3LatrineNumberFemaleStances() {
        return question3LatrineNumberFemaleStances;
    }

    public void setQuestion3LatrineNumberFemaleStances(int question3LatrineNumberFemaleStances) {
        this.question3LatrineNumberFemaleStances = question3LatrineNumberFemaleStances;
    }

    public int getQuestion3LatrineNumberMaleStances() {
        return question3LatrineNumberMaleStances;
    }

    public void setQuestion3LatrineNumberMaleStances(int question3LatrineNumberMaleStances) {
        this.question3LatrineNumberMaleStances = question3LatrineNumberMaleStances;
    }

    public int getQuestion3LatrineNumberStances() {
        return question3LatrineNumberStances;
    }

    public void setQuestion3LatrineNumberStances(int question3LatrineNumberStances) {
        this.question3LatrineNumberStances = question3LatrineNumberStances;
    }

    public int getQuestion3LatrineNumberBlocks() {
        return question3LatrineNumberBlocks;
    }

    public void setQuestion3LatrineNumberBlocks(int question3LatrineNumberBlocks) {
        this.question3LatrineNumberBlocks = question3LatrineNumberBlocks;
    }

    public int getQuestion3ToiletNonFunctionNumber() {
        return question3ToiletNonFunctionNumber;
    }

    public void setQuestion3ToiletNonFunctionNumber(int question3ToiletNonFunctionNumber) {
        this.question3ToiletNonFunctionNumber = question3ToiletNonFunctionNumber;
    }

    public int getQuestion3ToiletFunctionalNumber() {
        return question3ToiletFunctionalNumber;
    }

    public void setQuestion3ToiletFunctionalNumber(int question3ToiletFunctionalNumber) {
        this.question3ToiletFunctionalNumber = question3ToiletFunctionalNumber;
    }

    public int getQuestion3HealthStaffNumberToiletMixedStances() {
        return question3HealthStaffNumberToiletMixedStances;
    }

    public void setQuestion3HealthStaffNumberToiletMixedStances(int question3HealthStaffNumberToiletMixedStances) {
        this.question3HealthStaffNumberToiletMixedStances = question3HealthStaffNumberToiletMixedStances;
    }

    public int getQuestion3HealthStaffNumberToiletFemaleStances() {
        return question3HealthStaffNumberToiletFemaleStances;
    }

    public void setQuestion3HealthStaffNumberToiletFemaleStances(int question3HealthStaffNumberToiletFemaleStances) {
        this.question3HealthStaffNumberToiletFemaleStances = question3HealthStaffNumberToiletFemaleStances;
    }

    public int getQuestion3HealthStaffNumberToiletMaleStance() {
        return question3HealthStaffNumberToiletMaleStance;
    }

    public void setQuestion3HealthStaffNumberToiletMaleStance(int qestion3HealthStaffNumberToiletMaleStance) {
        this.question3HealthStaffNumberToiletMaleStance = qestion3HealthStaffNumberToiletMaleStance;
    }

    public int getQuestion3PatientToiletNumberFemaleStances() {
        return question3PatientToiletNumberFemaleStances;
    }

    public void setQuestion3PatientToiletNumberFemaleStances(int question3PatientToiletNumberFemaleStances) {
        this.question3PatientToiletNumberFemaleStances = question3PatientToiletNumberFemaleStances;
    }

    public int getQuestion3PatientToiletNumberMaleStances() {
        return question3PatientToiletNumberMaleStances;
    }

    public void setQuestion3PatientToiletNumberMaleStances(int question3PatientToiletNumberMaleStances) {
        this.question3PatientToiletNumberMaleStances = question3PatientToiletNumberMaleStances;
    }

    public int getQuestion3ToiletNumberInstances() {
        return question3ToiletNumberInstances;
    }

    public void setQuestion3ToiletNumberInstances(int question3ToiletNumberInstances) {
        this.question3ToiletNumberInstances = question3ToiletNumberInstances;
    }

    public int getQuestion3ToiletNumberBlocks() {
        return question3ToiletNumberBlocks;
    }

    public void setQuestion3ToiletNumberBlocks(int question3ToiletNumberBlocks) {
        this.question3ToiletNumberBlocks = question3ToiletNumberBlocks;
    }

    public int getQuestion22ChildrenImmunized() {
        return question22ChildrenImmunized;
    }

    public void setQuestion22ChildrenImmunized(int question22ChildrenImmunized) {
        this.question22ChildrenImmunized = question22ChildrenImmunized;
    }

    public int getQuestion21CategoryStillNumberDeliveries() {
        return question21CategoryStillNumberDeliveries;
    }

    public void setQuestion21CategoryStillNumberDeliveries(int question21CategoryStillNumberDeliveries) {
        this.question21CategoryStillNumberDeliveries = question21CategoryStillNumberDeliveries;
    }

    public int getQuestion21CategoryLiveNumberDeliveries() {
        return question21CategoryLiveNumberDeliveries;
    }

    public void setQuestion21CategoryLiveNumberDeliveries(int question21CategoryLiveNumberDeliveries) {
        this.question21CategoryLiveNumberDeliveries = question21CategoryLiveNumberDeliveries;
    }

    public boolean isQuestion2Vaccination4HEPBYesNo() {
        return question2Vaccination4HEPBYesNo;
    }

    public void setQuestion2Vaccination4HEPBYesNo(boolean question2Vaccination4HEPBYesNo) {
        this.question2Vaccination4HEPBYesNo = question2Vaccination4HEPBYesNo;
    }

    public boolean isQuestion2YouthFriendlyCornersYesNo() {
        return question2YouthFriendlyCornersYesNo;
    }

    public void setQuestion2YouthFriendlyCornersYesNo(boolean question2YouthFriendlyCornersYesNo) {
        this.question2YouthFriendlyCornersYesNo = question2YouthFriendlyCornersYesNo;
    }

    public boolean isQuestion2ImmunizationYesNo() {
        return question2ImmunizationYesNo;
    }

    public void setQuestion2ImmunizationYesNo(boolean question2ImmunizationYesNo) {
        this.question2ImmunizationYesNo = question2ImmunizationYesNo;
    }

    public boolean isQuestion2PMTCTYesNo() {
        return question2PMTCTYesNo;
    }

    public void setQuestion2PMTCTYesNo(boolean question2PMTCTYesNo) {
        this.question2PMTCTYesNo = question2PMTCTYesNo;
    }

    public boolean isQuestion2HIVCounsellingTestingAndTreatmentYesNo() {
        return question2HIVCounsellingTestingAndTreatmentYesNo;
    }

    public void setQuestion2HIVCounsellingTestingAndTreatmentYesNo(boolean question2HIVCounsellingTestingAndTreatmentYesNo) {
        this.question2HIVCounsellingTestingAndTreatmentYesNo = question2HIVCounsellingTestingAndTreatmentYesNo;
    }

    public boolean isQuestion2FamilyPlanningServicesYesNo() {
        return question2FamilyPlanningServicesYesNo;
    }

    public void setQuestion2FamilyPlanningServicesYesNo(boolean question2FamilyPlanningServicesYesNo) {
        this.question2FamilyPlanningServicesYesNo = question2FamilyPlanningServicesYesNo;
    }

    public boolean isQuestion2DeliveryBedsYesNo() {
        return question2DeliveryBedsYesNo;
    }

    public void setQuestion2DeliveryBedsYesNo(boolean question2DeliveryBedsYesNo) {
        this.question2DeliveryBedsYesNo = question2DeliveryBedsYesNo;
    }

    public boolean isQuestion2GeneralWardYesNo() {
        return question2GeneralWardYesNo;
    }

    public void setQuestion2GeneralWardYesNo(boolean question2GeneralWardYesNo) {
        this.question2GeneralWardYesNo = question2GeneralWardYesNo;
    }

    public String getQuestionANameAndGradeHealthCenter() {
        return questionANameAndGradeHealthCenter;
    }

    public boolean isQuestion2MaternityYesNo() {
        return question2MaternityYesNo;
    }

    public void setQuestion2MaternityYesNo(boolean question2MaternityYesNo) {
        this.question2MaternityYesNo = question2MaternityYesNo;
    }

    public String getQuestion12BudgetInformationRelates() {
        return question12BudgetInformationRelates;
    }

    public void setQuestion12BudgetInformationRelates(String question12BudgetInformationRelates) {
        this.question12BudgetInformationRelates = question12BudgetInformationRelates;
    }

    public String getQuestion11DisplayBudgetInformation() {
        return question11DisplayBudgetInformation;
    }

    public void setQuestion11DisplayBudgetInformation(String question11DisplayBudgetInformation) {
        this.question11DisplayBudgetInformation = question11DisplayBudgetInformation;
    }

    public String getQuestion1DevelopmentDateWithdrawn() {
        return question1DevelopmentDateWithdrawn;
    }

    public void setQuestion1DevelopmentDateWithdrawn(String question1DevelopmentDateWithdrawn) {
        this.question1DevelopmentDateWithdrawn = question1DevelopmentDateWithdrawn;
    }

    public String getQuestion1DevelopmentDateReceived() {
        return question1DevelopmentDateReceived;
    }

    public void setQuestion1DevelopmentDateReceived(String question1DevelopmentDateReceived) {
        this.question1DevelopmentDateReceived = question1DevelopmentDateReceived;
    }

    public int getQuestion1DevelopmentReleasedBudget() {
        return question1DevelopmentReleasedBudget;
    }

    public void setQuestion1DevelopmentReleasedBudget(int question1DevelopmentReleasedBudget) {
        this.question1DevelopmentReleasedBudget = question1DevelopmentReleasedBudget;
    }

    public int getQuestion1DevelopmentApprovedBudget() {
        return question1DevelopmentApprovedBudget;
    }

    public void setQuestion1DevelopmentApprovedBudget(int question1DevelopmentApprovedBudget) {
        this.question1DevelopmentApprovedBudget = question1DevelopmentApprovedBudget;
    }

    public String getQuestion1RecurrentDateWithdrawn() {
        return question1RecurrentDateWithdrawn;
    }

    public void setQuestion1RecurrentDateWithdrawn(String question1RecurrentDateWithdrawn) {
        this.question1RecurrentDateWithdrawn = question1RecurrentDateWithdrawn;
    }

    public String getQuestion1RecurrentDateReceived() {
        return question1RecurrentDateReceived;
    }

    public void setQuestion1RecurrentDateReceived(String question1RecurrentDateReceived) {
        this.question1RecurrentDateReceived = question1RecurrentDateReceived;
    }

    public int getQuestion1RecurrentBudgetReleased() {
        return question1RecurrentBudgetReleased;
    }

    public void setQuestion1RecurrentBudgetReleased(int question1RecurrentBudgetReleased) {
        this.question1RecurrentBudgetReleased = question1RecurrentBudgetReleased;
    }

    public int getQuestion1RecurrentApprovedBudget() {
        return question1RecurrentApprovedBudget;
    }

    public void setQuestion1RecurrentApprovedBudget(int question1RecurrentApprovedBudget) {
        this.question1RecurrentApprovedBudget = question1RecurrentApprovedBudget;
    }

    public int getQuestionCInPatientAttendance() {
        return questionCInPatientAttendance;
    }

    public void setQuestionCInPatientAttendance(int questionCInPatientAttendance) {
        this.questionCInPatientAttendance = questionCInPatientAttendance;
    }

    public int getQuestionBOutPatientOPDAttendance() {
        return questionBOutPatientOPDAttendance;
    }

    public void setQuestionBOutPatientOPDAttendance(int questionBOutPatientOPDAttendance) {
        this.questionBOutPatientOPDAttendance = questionBOutPatientOPDAttendance;
    }

    public String getQuestionANameHealthCenter() {
        return questionANameAndGradeHealthCenter;
    }

    public void setQuestionANameAndGradeHealthCenter(String questionANameAndGradeHealthCenter) {
        this.questionANameAndGradeHealthCenter = questionANameAndGradeHealthCenter;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getNameMonitorAgent() {
        return nameMonitorAgent;
    }

    public void setNameMonitorAgent(String nameMonitorAgent) {
        this.nameMonitorAgent = nameMonitorAgent;
    }

    public String getTownCouncil() {
        return townCouncil;
    }

    public void setTownCouncil(String townCouncil) {
        this.townCouncil = townCouncil;
    }

    public int getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(int primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(String financialYear) {
        this.financialYear = financialYear;
    }

    public String getFinancialYearQuarter() {
        return financialYearQuarter;
    }

    public void setFinancialYearQuarter(String financialYearQuarter) {
        this.financialYearQuarter = financialYearQuarter;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getParish() {
        return parish;
    }

    public void setParish(String parish) {
        this.parish = parish;
    }
}
