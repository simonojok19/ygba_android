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

    public String getQuestionANameAndGradeHealthCenter() {
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
