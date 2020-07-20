package org.ygba.youthgobudget.data.education;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = EducationQuestionConstants.TABLE_NAME)
public class EducationQuestion {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = EducationQuestionConstants.PRIMARY_KEY)
    private int id;

    @ColumnInfo(name = EducationQuestionConstants.FINANCIAL_YEAR)
    private String financialYear;

    @ColumnInfo(name = EducationQuestionConstants.DATE)
    private String date;

    @ColumnInfo(name = EducationQuestionConstants.DISTRICT)
    private String district;

    @ColumnInfo(name = EducationQuestionConstants.VILLAGE)
    private String village;

    @ColumnInfo(name = EducationQuestionConstants.PARISH)
    private String parish;

    @ColumnInfo(name = EducationQuestionConstants.DIVISION)
    private String division;

    @ColumnInfo(name = EducationQuestionConstants.FULL_NAME)
    private String fullNames;

    @ColumnInfo(name = EducationQuestionConstants.TEL)
    private String tel;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_1_ANSWER)
    private String question1Answer;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_SCHOOL_NAME)
    private String question2SchoolName;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_MALE_TEACHERS)
    private int question2MaleTeachers;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_FEMALE_TEACHERS)
    private int question2FeMaleTeachers;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_MALE_PWDS_TEACHERS)
    private int question2MalePWDTeachers;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_FEMALE_PWDS_TEACHERS)
    private int question2FemalePWDTeachers;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_TEACHERS_TOTAL)
    private int question2TeachersTotal;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_PupilEnrollment_MALE)
    private int question2MalePupilEnrollment;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_FEMALE_PupilEnrollment)
    private int question2FeMalePupilEnrollment;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_MALE_PWDS_TEACHERSTEACHERS)
    private int question2MalePWDPupilEnrollment;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_FEMALE_PWDS_PupilEnrollment)
    private int question2FemalePWDPupilEnrollment;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_PupilEnrollment_TOTAL)
    private int question2PupilEnrollmentTotal;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_P7_MALE)
    private int question2NumberP7Male;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_P7_FEMALE)
    private int question2NumberP7FeMale;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_P7_MALE_PWD)
    private int question2NumberP7MalePWD;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_P7_FEMALE_PWD)
    private int question2NumberP7FeMalePWD;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_TOTAL)
    private int question2NumberP7Total;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_DROPOUT_MALE)
    private int question2NumberDropoutMale;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_DROPOUT_FEMALE)
    private int question2NumberDropOutFemale;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_DROPOUT_MALE_PWD)
    private int question2NumberDropoutMalePWD;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_DROPOUT_FEMALE_PWD)
    private int question2NumberDropOutFemalePWD;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_DROPOUT_TOTAL)
    private int question2NumberDropOutTotal;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_DROPOUT_REASONS_IF_ANY)
    private String question2DropOutReasonIfAny;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_CAPITAL_GRANT_APPROVED_BUDGET)
    private int question3capitalGrantApprovedBudget;

    public int getQuestion3CapitalGrantReleaseBudget() {
        return question3CapitalGrantReleaseBudget;
    }

    public void setQuestion3CapitalGrantReleaseBudget(int question3CapitalGrantReleaseBudget) {
        this.question3CapitalGrantReleaseBudget = question3CapitalGrantReleaseBudget;
    }

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_CAPITAL_GRANT_RELEASED_BUDGET)
    private int question3CapitalGrantReleaseBudget;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_CAPITAL_BUDGET_DATE_RECEIVED)
    private String question3CapitalReceivedDate;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_CAPITAL_GRANT_DATE_WITHDRAWN)
    private String question3CapitalDateWithdrawn;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_SFG_APPROVED_BUDGET)
    private int question3SFGApprovedBudgetEditText;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_SFG_BUDGET_RECEIVED)
    private int question3SFGBudgetReceived;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_SFG_DATE_RECIEVED)
    private String question3SFGDateReceived;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_SFG_DATE_WITHDRAWN)
    private String question3SFGDateWithdrawn;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_INFROMATION_NOTICE_BOARD_DISPLAYED)
    private boolean question31InformationNoticeBoardDisplayed;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_INFORMATION_HEAD_TEACHER_OFFICE_DISPLAYED)
    private boolean question3InformationHeadTeacherOfficeDisplayed;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_INFROMATION_STAFF_ROOM_DISPLAYED)
    private boolean question31InformationStaffRoomDisplayed;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_INFORMATION_NOT_DISPLAYED)
    private boolean question31InformationNoteDisplayed;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_STATEMENT_PERIOD)
    private String question32StatementPeriod;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_GRADE_1_MALE_NUMBER)
    private int question4Grade1MaleNumber;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_GRADE_2_MALE_NUMBER)
    private int question4Grade2MaleNumber;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_GRADE_3_MALE_NUMBER)
    private int question4Grade3MaleNumber;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_GRADE_4_MALE_NUMBER)
    private int question4Grade4MaleNumber;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_GRADE_1_FEMALE_NUMBER)
    private int question4Grade1FemaleNumber;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_GRADE_2_FEMALE_NUMBER)
    private int question4Grade2FemaleNumber;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_GRADE_3_FEMALE_NUMBER)
    private int question4Grade3FemaleNumber;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_GRADE_4_FEMALE_NUMBER)
    private int question4Grade4FemaleNumber;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_1_CURRENT_TERMS_PERFORMANCE)
    private String question41CurrentTermPerformance;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_2_REASON_ATTRIBUTE)
    private String question42ReasonAttribute;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_TOILET_NUMBER_OF_BLOCKS)
    private int question5ToiletNumberBlocks;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_TOILET_NUMBER_OF_STANCES)
    private int question5ToiletNumberStances;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_TOILET_NUMBER_MALE_STANCES_PUPIL)
    private int question5ToiletNumberMaleStancesPupil;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_TOILET_NUMBER_FEMALE_STANCSES_PUPIL)
    private int question5ToiletNumberFemaleStancesPupil;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_TOILET_NUMBER_MALE_STANCES_TEACHER)
    private  int question5ToiletNumberMaleStancesTeacher;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_TOILET_NUMBER_FEMALE_STANCES_TEACHER)
    private int question5ToiletNumberStancesFemaleTeachers;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_TOILET_NUMBER_MIXED_STANCES)
    private int question5ToiletNumberStancesMixed;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_TOILET_FUNCTIONAL)
    private int question5ToiletFunctional;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_TOILET_NON_FUNCTIONAL)
    private int question5ToiletNoneFunctional;



    public static class Builder {
        private final EducationQuestion INSTANCE;
        public Builder() {
            INSTANCE = new EducationQuestion();
        }

        public EducationQuestion build() {
            return INSTANCE;
        }

        public Builder setFinancialYear(String financialYear) {
            INSTANCE.setFinancialYear(financialYear);
            return this;
        }

        public Builder setDate(String textValue) {
            INSTANCE.setDate(textValue);
            return this;
        }

        public Builder setDistrict(String textValue) {
            INSTANCE.setDistrict(textValue);
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

        public Builder setDivision(String textValue) {
            INSTANCE.setDivision(textValue);
            return this;
        }

        public Builder setAgentNames(String textValue) {
            INSTANCE.setFullNames(textValue);
            return this;
        }

        public Builder setTelephone(String textValue) {
            INSTANCE.setTel(textValue);
            return this;
        }

        public Builder setQuestion1Answer(String textValue) {
            INSTANCE.setQuestion1Answer(textValue);
            return this;
        }

        public Builder setQuestion2SchoolName(String textValue) {
            INSTANCE.setQuestion2SchoolName(textValue);
            return this;
        }

        public Builder setQ2MaleTeachers(int integerValue) {
            INSTANCE.setQuestion2MaleTeachers(integerValue);
            return this;
        }
        public Builder setQ2FeMaleTeachers(int integerValue) {
            INSTANCE.setQuestion2FeMaleTeachers(integerValue);
            return this;
        }

        public Builder setQ2MalePWDTeachers(int integerValue) {
            INSTANCE.setQuestion2MalePWDTeachers(integerValue);
            return this;
        }

        public Builder setQ2FemalePWDSTeachers(int integerValue) {
            return this;
        }

        public Builder setQ2TeachersTotal(int integerValue) {
            INSTANCE.setQuestion2TeachersTotal(integerValue);
            return this;
        }

        public Builder setQ2PupilEnrollmentTeachers(int integerValue) {
            INSTANCE.setQuestion2MalePupilEnrollment(integerValue);
            return this;
        }

        public Builder setQ2FeMalePupilEnrollment(int integerValue) {
            INSTANCE.setQuestion2FeMalePupilEnrollment(integerValue);
            return this;
        }

        public Builder setQ2MalePWDPupilEnrollment(int integerValue) {
            INSTANCE.setQuestion2MalePWDPupilEnrollment(integerValue);
            return this;
        }

        public Builder setQ2FemalePWDSPupilEnrollment(int integerValue) {
            INSTANCE.setQuestion2FemalePWDPupilEnrollment(integerValue);
            return this;
        }

        public Builder setQ2PupilEnrollmentTotal(int integerValue) {
            INSTANCE.setQuestion2PupilEnrollmentTotal(integerValue);
            return this;
        }

        public Builder setNumberP7Male(int integerValue) {
            INSTANCE.setQuestion2NumberP7Male(integerValue);
            return this;
        }

        public Builder setQuestionNumberP7FeMale(int integerValue) {
            INSTANCE.setQuestion2NumberP7FeMale(integerValue);
            return this;
        }

        public Builder setQuestion2NumberP7MalePWD(int integerValue) {
            INSTANCE.setQuestion2NumberP7MalePWD(integerValue);
            return this;
        }

        public Builder setQuestion2NumberP7FemalePWD(int textValue) {
            INSTANCE.setQuestion2NumberP7FeMalePWD(textValue);
            return this;
        }

        public Builder setQuestion2NumberP7Total(int integerValue) {
            INSTANCE.setQuestion2NumberP7Total(integerValue);
            return this;
        }

        public Builder setQuestion2NumberDropOutMale(int integerValue) {
            INSTANCE.setQuestion2NumberDropoutMale(integerValue);
            return this;
        }

        public Builder setQuestion2NumberDropOutFemale(int integerValue) {
            INSTANCE.setQuestion2NumberDropOutFemale(integerValue);
            return this;
        }

        public Builder setQuestion2NumberDropOutMalePWD(int integerValue) {
            INSTANCE.setQuestion2NumberDropoutMalePWD(integerValue);
            return this;
        }

        public Builder setQuestion2NumberDropOutFemalePWD(int integerValue) {
            INSTANCE.setQuestion2NumberDropOutFemalePWD(integerValue);
            return this;
        }

        public Builder setQuestion2NumberDropOutTotal(int integerValue) {
            INSTANCE.setQuestion2NumberDropOutTotal(integerValue);
            return this;
        }

        public Builder setQuestion2DropOutReasonIfAny(String textValue) {
            INSTANCE.setQuestion2DropOutReasonIfAny(textValue);
            return this;
        }

        public Builder setQ3CapitalGrantApprovedBudget(int integerValue) {
            INSTANCE.setQuestion3capitalGrantApprovedBudget(integerValue);
            return this;
        }

        public Builder setQ3CapitalGrantReleasedBudget(int integerValue) {
            INSTANCE.setQuestion3CapitalGrantReleaseBudget(integerValue);
            return this;
        }

        public Builder setQ3CapitalGrantDateReceived(String textValue) {
            INSTANCE.setQuestion3CapitalReceivedDate(textValue);
            return this;
        }

        public Builder setQ3CapitalGrantDateWithdrawn(String textValue) {
            INSTANCE.setQuestion3CapitalDateWithdrawn(textValue);
            return this;
        }

        public Builder setQ3SFGApprovedBudget(int integerValue) {
            INSTANCE.setQuestion3SFGApprovedBudgetEditText(integerValue);
            return this;
        }

        public Builder setQ3SFGBudgetReleased(int integerValue) {
            INSTANCE.setQuestion3SFGBudgetReceived(integerValue);
            return this;
        }

        public Builder setQ3SFGReceivedDate(String textValue) {
            INSTANCE.setQuestion3SFGDateReceived(textValue);
            return this;
        }

        public Builder setQ3SFGDateWithdrawn(String textValue) {
            INSTANCE.setQuestion3SFGDateWithdrawn(textValue);
            return this;
        }

        public Builder setQ3IsInformationNoticeBoardDisplayed(boolean budgetInformationDisplayedInSchoolNoticeBoard) {
            INSTANCE.setQuestion31InformationNoticeBoardDisplayed(budgetInformationDisplayedInSchoolNoticeBoard);
            return this;
        }

        public Builder setQ3IsInformationHeaderTeacherOfficeDisplayed(boolean budgetInformationHeadTeacherOfficeDisplayed) {
            INSTANCE.setQuestion3InformationHeadTeacherOfficeDisplayed(budgetInformationHeadTeacherOfficeDisplayed);
            return this;
        }

        public Builder setQ3IsInformationStaffRoomDisplayed(boolean budgetInformationStaffRoomDisplayed) {
            INSTANCE.setQuestion31InformationStaffRoomDisplayed(budgetInformationStaffRoomDisplayed);
            return this;
        }

        public Builder setQ3IsBudgetInformationNotDisplayed(boolean budgetInformationNotDisplayed) {
            INSTANCE.setQuestion31InformationNoteDisplayed(budgetInformationNotDisplayed);
            return this;
        }

        public Builder setQ32PeriodStatement(String textValue) {
            INSTANCE.setQuestion32StatementPeriod(textValue);
            return this;
        }

        public Builder setQ4Grade1MaleNumber(int integerValue) {
            INSTANCE.setQuestion4Grade1MaleNumber(integerValue);
            return this;
        }

        public Builder setQ4Grade2MaleNumber(int integerValue) {
            INSTANCE.setQuestion4Grade2MaleNumber(integerValue);
            return this;
        }

        public Builder setQ4Grade3MaleNumber(int integerValue) {
            INSTANCE.setQuestion4Grade3MaleNumber(integerValue);
            return this;
        }

        public Builder setQ4Grade4MaleNumber(int integerValue) {
            INSTANCE.setQuestion4Grade4MaleNumber(integerValue);
            return this;
        }

        public Builder setQ4Grade1FemaleNumber(int integerValue) {
            INSTANCE.setQuestion4Grade1FemaleNumber(integerValue);
            return this;
        }

        public Builder setQ4Grade2FemaleNumber(int integerValue) {
            INSTANCE.setQuestion4Grade2FemaleNumber(integerValue);
            return this;
        }

        public Builder setQ4Grade3FemaleNumber(int integerValue) {
            INSTANCE.setQuestion4Grade3FemaleNumber(integerValue);
            return this;
        }

        public Builder setQ4Grade4FemaleNumber(int integerValue) {
            INSTANCE.setQuestion4Grade4FemaleNumber(integerValue);
            return this;
        }

        public Builder setQ41ObjectiveCurrentTermPerformance(String question41ObjectiveAnswer) {
            INSTANCE.setQuestion41CurrentTermPerformance(question41ObjectiveAnswer);
            return this;
        }

        public Builder setQ42AttributeReasonAnswer(String textValue) {
            INSTANCE.setQuestion42ReasonAttribute(textValue);
            return this;
        }

        public Builder setQ5BlocksToiletNumber(int integerValue) {
            INSTANCE.setQuestion5ToiletNumberBlocks(integerValue);
            return this;
        }

        public Builder setQ5ToiletNumberOfStances(int integerValue) {
            INSTANCE.setQuestion5ToiletNumberStances(integerValue);
            return this;
        }

        public Builder setQ5ToiletNumberOfMaleStancesPupil(int integerValue) {
            INSTANCE.setQuestion5ToiletNumberMaleStancesPupil(integerValue);
            return this;
        }

        public Builder setQ55ToiletNumberOfFemaleStancesPupil(int integerValue) {
            INSTANCE.setQuestion5ToiletNumberFemaleStancesPupil(integerValue);
            return this;
        }

        public Builder setQ5ToiletNumberOfMaleStancesTeacher(int integerValue) {
            INSTANCE.setQuestion5ToiletNumberMaleStancesTeacher(integerValue);
            return this;
        }

        public Builder setQ5ToiletNumberOfFemaleStancesTeacher(int integerValue) {
            INSTANCE.setQuestion5ToiletNumberStancesFemaleTeachers(integerValue);
            return this;
        }

        public Builder setQ5ToiletNumberOfMixedStances(int integerValue) {
            INSTANCE.setQuestion5ToiletNumberStancesMixed(integerValue);
            return this;
        }

        public Builder setQ5ToiletFunctional(int integerValue) {
            INSTANCE.setQuestion5ToiletFunctional(integerValue);
            return this;
        }

        public Builder setQ5ToiletNonFuctional(int integerValue) {
            INSTANCE.setQuestion5ToiletNoneFunctional(integerValue);
            return this;
        }
    }

    public int getQuestion5ToiletNoneFunctional() {
        return question5ToiletNoneFunctional;
    }

    public void setQuestion5ToiletNoneFunctional(int question5ToiletNoneFunctional) {
        this.question5ToiletNoneFunctional = question5ToiletNoneFunctional;
    }

    public int getQuestion5ToiletFunctional() {
        return question5ToiletFunctional;
    }

    public void setQuestion5ToiletFunctional(int question5ToiletFunctional) {
        this.question5ToiletFunctional = question5ToiletFunctional;
    }

    public int getQuestion5ToiletNumberStancesMixed() {
        return question5ToiletNumberStancesMixed;
    }

    public void setQuestion5ToiletNumberStancesMixed(int question5ToiletNumberStancesMixed) {
        this.question5ToiletNumberStancesMixed = question5ToiletNumberStancesMixed;
    }

    public int getQuestion5ToiletNumberStancesFemaleTeachers() {
        return question5ToiletNumberStancesFemaleTeachers;
    }

    public void setQuestion5ToiletNumberStancesFemaleTeachers(int question5ToiletNumberStancesFemaleTeachers) {
        this.question5ToiletNumberStancesFemaleTeachers = question5ToiletNumberStancesFemaleTeachers;
    }

    public int getQuestion5ToiletNumberMaleStancesTeacher() {
        return question5ToiletNumberMaleStancesTeacher;
    }

    public void setQuestion5ToiletNumberMaleStancesTeacher(int question5ToiletNumberMaleStancesTeacher) {
        this.question5ToiletNumberMaleStancesTeacher = question5ToiletNumberMaleStancesTeacher;
    }

    public int getQuestion5ToiletNumberFemaleStancesPupil() {
        return question5ToiletNumberFemaleStancesPupil;
    }

    public void setQuestion5ToiletNumberFemaleStancesPupil(int question5ToiletNumberFemaleStancesPupil) {
        this.question5ToiletNumberFemaleStancesPupil = question5ToiletNumberFemaleStancesPupil;
    }

    @Ignore
    private EducationQuestion() {
    }

    public int getQuestion5ToiletNumberMaleStancesPupil() {
        return question5ToiletNumberMaleStancesPupil;
    }

    public void setQuestion5ToiletNumberMaleStancesPupil(int question5ToiletNumberMaleStancesPupil) {
        this.question5ToiletNumberMaleStancesPupil = question5ToiletNumberMaleStancesPupil;
    }

    public int getQuestion5ToiletNumberStances() {
        return question5ToiletNumberStances;
    }

    public void setQuestion5ToiletNumberStances(int question5ToiletNumberStances) {
        this.question5ToiletNumberStances = question5ToiletNumberStances;
    }

    public int getQuestion5ToiletNumberBlocks() {
        return question5ToiletNumberBlocks;
    }

    public void setQuestion5ToiletNumberBlocks(int question5ToiletNumberBlocks) {
        this.question5ToiletNumberBlocks = question5ToiletNumberBlocks;
    }

    public String getQuestion42ReasonAttribute() {
        return question42ReasonAttribute;
    }

    public void setQuestion42ReasonAttribute(String question42ReasonAttribute) {
        this.question42ReasonAttribute = question42ReasonAttribute;
    }

    public String getQuestion41CurrentTermPerformance() {
        return question41CurrentTermPerformance;
    }

    public void setQuestion41CurrentTermPerformance(String question41CurrentTermPerformance) {
        this.question41CurrentTermPerformance = question41CurrentTermPerformance;
    }

    public int getQuestion4Grade4FemaleNumber() {
        return question4Grade4FemaleNumber;
    }

    public void setQuestion4Grade4FemaleNumber(int question4Grade4FemaleNumber) {
        this.question4Grade4FemaleNumber = question4Grade4FemaleNumber;
    }

    public int getQuestion4Grade3FemaleNumber() {
        return question4Grade3FemaleNumber;
    }

    public void setQuestion4Grade3FemaleNumber(int question4Grade3FemaleNumber) {
        this.question4Grade3FemaleNumber = question4Grade3FemaleNumber;
    }

    public int getQuestion4Grade2FemaleNumber() {
        return question4Grade2FemaleNumber;
    }

    public void setQuestion4Grade2FemaleNumber(int question4Grade2FemaleNumber) {
        this.question4Grade2FemaleNumber = question4Grade2FemaleNumber;
    }

    public int getQuestion4Grade1FemaleNumber() {
        return question4Grade1FemaleNumber;
    }

    public void setQuestion4Grade1FemaleNumber(int question4Grade1FemaleNumber) {
        this.question4Grade1FemaleNumber = question4Grade1FemaleNumber;
    }

    public int getQuestion4Grade4MaleNumber() {
        return question4Grade4MaleNumber;
    }

    public void setQuestion4Grade4MaleNumber(int question4Grade4MaleNumber) {
        this.question4Grade4MaleNumber = question4Grade4MaleNumber;
    }

    public int getQuestion4Grade3MaleNumber() {
        return question4Grade3MaleNumber;
    }

    public void setQuestion4Grade3MaleNumber(int question4Grade3MaleNumber) {
        this.question4Grade3MaleNumber = question4Grade3MaleNumber;
    }

    public int getQuestion4Grade2MaleNumber() {
        return question4Grade2MaleNumber;
    }

    public void setQuestion4Grade2MaleNumber(int question4Grade2MaleNumber) {
        this.question4Grade2MaleNumber = question4Grade2MaleNumber;
    }

    public int getQuestion4Grade1MaleNumber() {
        return question4Grade1MaleNumber;
    }

    public void setQuestion4Grade1MaleNumber(int question4Grade1MaleNumber) {
        this.question4Grade1MaleNumber = question4Grade1MaleNumber;
    }

    public String getQuestion32StatementPeriod() {
        return question32StatementPeriod;
    }

    public void setQuestion32StatementPeriod(String question32StatementPeriod) {
        this.question32StatementPeriod = question32StatementPeriod;
    }

    public boolean isQuestion31InformationNoteDisplayed() {
        return question31InformationNoteDisplayed;
    }

    public void setQuestion31InformationNoteDisplayed(boolean question31InformationNoteDisplayed) {
        this.question31InformationNoteDisplayed = question31InformationNoteDisplayed;
    }

    public boolean isQuestion31InformationStaffRoomDisplayed() {
        return question31InformationStaffRoomDisplayed;
    }

    public void setQuestion31InformationStaffRoomDisplayed(boolean question31InformationStaffRoomDisplayed) {
        this.question31InformationStaffRoomDisplayed = question31InformationStaffRoomDisplayed;
    }

    public boolean isQuestion3InformationHeadTeacherOfficeDisplayed() {
        return question3InformationHeadTeacherOfficeDisplayed;
    }

    public void setQuestion3InformationHeadTeacherOfficeDisplayed(boolean question3InformationHeadTeacherOfficeDisplayed) {
        this.question3InformationHeadTeacherOfficeDisplayed = question3InformationHeadTeacherOfficeDisplayed;
    }

    public boolean isQuestion31InformationNoticeBoardDisplayed() {
        return question31InformationNoticeBoardDisplayed;
    }

    public void setQuestion31InformationNoticeBoardDisplayed(boolean question31InformationNoticeBoardDisplayed) {
        this.question31InformationNoticeBoardDisplayed = question31InformationNoticeBoardDisplayed;
    }

    public String getQuestion3SFGDateWithdrawn() {
        return question3SFGDateWithdrawn;
    }

    public void setQuestion3SFGDateWithdrawn(String question3SFGDateWithdrawn) {
        this.question3SFGDateWithdrawn = question3SFGDateWithdrawn;
    }

    public String getQuestion3SFGDateReceived() {
        return question3SFGDateReceived;
    }

    public void setQuestion3SFGDateReceived(String question3SFGDateReceived) {
        this.question3SFGDateReceived = question3SFGDateReceived;
    }

    public int getQuestion3SFGBudgetReceived() {
        return question3SFGBudgetReceived;
    }

    public void setQuestion3SFGBudgetReceived(int question3SFGBudgetReceived) {
        this.question3SFGBudgetReceived = question3SFGBudgetReceived;
    }

    public int getQuestion3SFGApprovedBudgetEditText() {
        return question3SFGApprovedBudgetEditText;
    }

    public void setQuestion3SFGApprovedBudgetEditText(int question3SFGApprovedBudgetEditText) {
        this.question3SFGApprovedBudgetEditText = question3SFGApprovedBudgetEditText;
    }

    public String getQuestion3CapitalDateWithdrawn() {
        return question3CapitalDateWithdrawn;
    }

    public void setQuestion3CapitalDateWithdrawn(String question3CapitalDateWithdrawn) {
        this.question3CapitalDateWithdrawn = question3CapitalDateWithdrawn;
    }

    public String getQuestion3CapitalReceivedDate() {
        return question3CapitalReceivedDate;
    }

    public void setQuestion3CapitalReceivedDate(String question3CapitalReceivedDate) {
        this.question3CapitalReceivedDate = question3CapitalReceivedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(String financialYear) {
        this.financialYear = financialYear;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getFullNames() {
        return fullNames;
    }

    public void setFullNames(String fullNames) {
        this.fullNames = fullNames;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getQuestion1Answer() {
        return question1Answer;
    }

    public void setQuestion1Answer(String question1Answer) {
        this.question1Answer = question1Answer;
    }

    public String getQuestion2SchoolName() {
        return question2SchoolName;
    }

    public void setQuestion2SchoolName(String question2SchoolName) {
        this.question2SchoolName = question2SchoolName;
    }

    public int getQuestion2MaleTeachers() {
        return question2MaleTeachers;
    }

    public void setQuestion2MaleTeachers(int question2MaleTeachers) {
        this.question2MaleTeachers = question2MaleTeachers;
    }

    public int getQuestion2FeMaleTeachers() {
        return question2FeMaleTeachers;
    }

    public void setQuestion2FeMaleTeachers(int question2FeMaleTeachers) {
        this.question2FeMaleTeachers = question2FeMaleTeachers;
    }

    public int getQuestion2MalePWDTeachers() {
        return question2MalePWDTeachers;
    }

    public void setQuestion2MalePWDTeachers(int question2MalePWDTeachers) {
        this.question2MalePWDTeachers = question2MalePWDTeachers;
    }

    public int getQuestion2FemalePWDTeachers() {
        return question2FemalePWDTeachers;
    }

    public void setQuestion2FemalePWDTeachers(int question2FemalePWDTeachers) {
        this.question2FemalePWDTeachers = question2FemalePWDTeachers;
    }

    public int getQuestion2TeachersTotal() {
        return question2TeachersTotal;
    }

    public void setQuestion2TeachersTotal(int question2TeachersTotal) {
        this.question2TeachersTotal = question2TeachersTotal;
    }

    public int getQuestion2MalePupilEnrollment() {
        return question2MalePupilEnrollment;
    }

    public void setQuestion2MalePupilEnrollment(int question2MalePupilEnrollment) {
        this.question2MalePupilEnrollment = question2MalePupilEnrollment;
    }

    public int getQuestion2FeMalePupilEnrollment() {
        return question2FeMalePupilEnrollment;
    }

    public void setQuestion2FeMalePupilEnrollment(int question2FeMalePupilEnrollment) {
        this.question2FeMalePupilEnrollment = question2FeMalePupilEnrollment;
    }

    public int getQuestion2MalePWDPupilEnrollment() {
        return question2MalePWDPupilEnrollment;
    }

    public void setQuestion2MalePWDPupilEnrollment(int question2MalePWDPupilEnrollment) {
        this.question2MalePWDPupilEnrollment = question2MalePWDPupilEnrollment;
    }

    public int getQuestion2FemalePWDPupilEnrollment() {
        return question2FemalePWDPupilEnrollment;
    }

    public void setQuestion2FemalePWDPupilEnrollment(int question2FemalePWDPupilEnrollment) {
        this.question2FemalePWDPupilEnrollment = question2FemalePWDPupilEnrollment;
    }

    public int getQuestion2PupilEnrollmentTotal() {
        return question2PupilEnrollmentTotal;
    }

    public void setQuestion2PupilEnrollmentTotal(int question2PupilEnrollmentTotal) {
        this.question2PupilEnrollmentTotal = question2PupilEnrollmentTotal;
    }

    public int getQuestion2NumberP7Male() {
        return question2NumberP7Male;
    }

    public void setQuestion2NumberP7Male(int question2NumberP7Male) {
        this.question2NumberP7Male = question2NumberP7Male;
    }

    public int getQuestion2NumberP7FeMale() {
        return question2NumberP7FeMale;
    }

    public void setQuestion2NumberP7FeMale(int question2NumberP7FeMale) {
        this.question2NumberP7FeMale = question2NumberP7FeMale;
    }

    public int getQuestion2NumberP7MalePWD() {
        return question2NumberP7MalePWD;
    }

    public void setQuestion2NumberP7MalePWD(int question2NumberP7MalePWD) {
        this.question2NumberP7MalePWD = question2NumberP7MalePWD;
    }

    public int getQuestion2NumberP7FeMalePWD() {
        return question2NumberP7FeMalePWD;
    }

    public void setQuestion2NumberP7FeMalePWD(int question2NumberP7FeMalePWD) {
        this.question2NumberP7FeMalePWD = question2NumberP7FeMalePWD;
    }

    public int getQuestion2NumberP7Total() {
        return question2NumberP7Total;
    }

    public void setQuestion2NumberP7Total(int question2NumberP7Total) {
        this.question2NumberP7Total = question2NumberP7Total;
    }

    public int getQuestion2NumberDropoutMale() {
        return question2NumberDropoutMale;
    }

    public void setQuestion2NumberDropoutMale(int question2NumberDropoutMale) {
        this.question2NumberDropoutMale = question2NumberDropoutMale;
    }

    public int getQuestion2NumberDropOutFemale() {
        return question2NumberDropOutFemale;
    }

    public void setQuestion2NumberDropOutFemale(int question2NumberDropOutFemale) {
        this.question2NumberDropOutFemale = question2NumberDropOutFemale;
    }

    public int getQuestion2NumberDropoutMalePWD() {
        return question2NumberDropoutMalePWD;
    }

    public void setQuestion2NumberDropoutMalePWD(int question2NumberDropoutMalePWD) {
        this.question2NumberDropoutMalePWD = question2NumberDropoutMalePWD;
    }

    public int getQuestion2NumberDropOutFemalePWD() {
        return question2NumberDropOutFemalePWD;
    }

    public void setQuestion2NumberDropOutFemalePWD(int question2NumberDropOutFemalePWD) {
        this.question2NumberDropOutFemalePWD = question2NumberDropOutFemalePWD;
    }

    public int getQuestion2NumberDropOutTotal() {
        return question2NumberDropOutTotal;
    }

    public void setQuestion2NumberDropOutTotal(int question2NumberDropOutTotal) {
        this.question2NumberDropOutTotal = question2NumberDropOutTotal;
    }

    public String getQuestion2DropOutReasonIfAny() {
        return question2DropOutReasonIfAny;
    }

    public void setQuestion2DropOutReasonIfAny(String question2DropOutReasonIfAny) {
        this.question2DropOutReasonIfAny = question2DropOutReasonIfAny;
    }

    public int getQuestion3capitalGrantApprovedBudget() {
        return question3capitalGrantApprovedBudget;
    }

    public void setQuestion3capitalGrantApprovedBudget(int question3capitalGrantApprovedBudget) {
        this.question3capitalGrantApprovedBudget = question3capitalGrantApprovedBudget;
    }
}
