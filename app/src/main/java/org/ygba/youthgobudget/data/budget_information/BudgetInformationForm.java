package org.ygba.youthgobudget.data.budget_information;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = BudgetInformationFormConstants.TABLE_NAME)
public class BudgetInformationForm {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = BudgetInformationFormConstants.PRIMARY_KEY)
    private int primaryKey;

    @ColumnInfo(name = BudgetInformationFormConstants.FINANCIAL_YEAR)
    private String financialYear;

    @ColumnInfo(name = BudgetInformationFormConstants.ADMINISTRATION_APPROVED_BUDGET)
    private int adminApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.ADMINISTRATION_PERCENTAGE)
    private int adminPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.FINANCE_APPROVED_BUDGET)
    private int financeApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.FINANCE_PERCENTAGE)
    private int financePercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.STATUTORY_BODIES_APPROVED_BUDGET)
    private int statutoryBodiesApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.STATUTORY_BODIES_PERCENTAGE)
    private int statutoryBodiesPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.PRODUCTION_APPROVED_BUDGET)
    private int productionApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.PRODUCTION_PERCENTAGE)
    private int productionPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.HEALTH_APPROVED_BUDGET)
    private int healthApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.HEALTH_PERCENTAGE)
    private int healthPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.EDUCATION_APPROVED_BUDGET)
    private int educationApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.EDUCATION_PERCENTAGE)
    private int educationPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.ROADS_ENGINEERING_APPROVED_BUDGET)
    private int roadEngineeringApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.ROADS_ENGINEERING_PERCENTAGE)
    private int roadEngineeringPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.WATER_APPROVED_BUDGET)
    private int waterApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.WATER_PERCENTAGE)
    private int waterPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.NATUREAL_RESOURCES_APPROVED_BUDGET)
    private int naturalApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.NATUREAL_RESOURCES_PERCENTAGE)
    private int naturalPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.COMMUNITY_APPROVED_BUDGET)
    private int communityApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.COMMUNITY_PERCENTAGE)
    private int communityPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.PLANNING_APPROVED_BUDGET)
    private int planningApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.PLANNING_PERCENTAGE)
    private int planningPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.INTERNAL_AUDIT_APPROVED_BUDGET)
    private int internalApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.INTERNAL_AUDIT_PERCENTAGE)
    private int internalPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.TRADE_APPROVED_BUDGET)
    private int tradeApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.TRADE_AUDIT_PERCENTAGE)
    private int tradePercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.TOTAL_APPROVED_BUDGET)
    private int totalApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.TOTAL_AUDIT_PERCENTAGE)
    private int totalPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.WAGE_APPROVED_BUDGET)
    private int wageApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.WAGE_AUDIT_PERCENTAGE)
    private int wagePercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.NONE_WAGE_APPROVED_BUDGET)
    private int noneWageApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.NONE_WAGE_AUDIT_PERCENTAGE)
    private int noneWagePercentage;
}
