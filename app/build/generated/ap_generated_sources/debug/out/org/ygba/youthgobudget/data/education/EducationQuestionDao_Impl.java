package org.ygba.youthgobudget.data.education;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class EducationQuestionDao_Impl implements EducationQuestionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<EducationQuestion> __insertionAdapterOfEducationQuestion;

  public EducationQuestionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEducationQuestion = new EntityInsertionAdapter<EducationQuestion>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `educ_table` (`primary_key`,`financial_year`,`date`,`district`,`village`,`parish`,`division`,`full_names`,`tel`,`question_1_answer`,`question_2_school_name`,`question_2_male_teachers`,`question_2_fe_male`,`male_pwds_teachers_q2`,`female_pwd_teachers_q2`,`teachers_total`,`question_2_male_PupilEnrollment`,`question_2_fe_male_PupilEnrollment`,`male_pwds_PupilEnrollment_q2`,`female_pwd_PupilEnrollment_q2`,`PupilEnrollment_toatl`,`num_p7_male_q2`,`q2_n_7_female`,`q_2_n_m_pwd`,`q_2_f_p_7_pwd`,`question_2_total_p7`,`q2_n_d_o_male`,`q_2_n_drop_female`,`pwd_2_male_drop_out`,`pwd_2_female_dropout_2`,`total_dropout_q2`,`question_2_drop_out_reasons_if_any`,`question_3_capital_grants_approved`,`question_3_capital_grant_released_budget`,`questions_3_date_received_capital`,`question_3_date_withdrawn_capital`,`question_3_sfg_approved_budget`,`question_3_sfg_budget_received`,`question_3_date_received_sfg`,`question_3_sfg_date_withdrawn`,`question_3_1_information_notice_board_displayed`,`question_3_displayed_head_teacher_office`,`question_3_1_information_staff_room`,`question_3_2_information_not_displayed`,`question_3_2_statement_period`,`question_grade_1_male_number`,`question_grade_2_male_number`,`question_grade_3_male_number`,`question_grade_4_male_number`,`question_grade_1_female_number`,`question_grade_2_female_number`,`question_grade_3_female_number`,`question_grade_4_female_number`,`question_4_1_current_performance`,`question_4_2_attribute_reason`,`question_5_toilet_blocks`,`question_5_toilet_stances`,`question_5_male_stances_pupil`,`question_5_toilet_female_stances_pupil`,`question_5_toilet_male_stances_teacher`,`question_5_toilet_female_number_stance_teacher`,`question_5_mixed_stances_number_toilet`,`question_5_toilet_function`,`question_5_toilet_none_functional`,`question_5_number_blocks_latrine`,`question_5_number_latrine_stances`,`question_5_latrine_number_instances_male_pupil`,`question_5_number_stances_female_stances_female`,`question_5_number_stances_male_teachers`,`question_5_number_stances_female_teachers`,`question_5_latrine_mixed_teachers`,`question_5_latrine_functional`,`question_5_latrine_none_functional`,`question_5_vip_latrine_num_ber_blocks`,`quest_ion_5_vip_latrine_number_stances`,`question_5_vip_nu_mber_latrine_male_pupil_stances`,`question_5_vip_num_ber_stance_pupil_female`,`question_5_vip_number_stances_ma_le_teacher`,`question_5_vip_number_stances_female_teacher_p`,`question_5_vip_numbe_r_stances_mixed_teachers`,`question_5_latr_ine_functional`,`question_5_latrine_none_functional_vip`,`question_5_female_changing_block_number`,`question_5_female_changing_block_stances  `,`question_5_female_changing_female_stances`,`question_5_female_changing_room_female_teacher`,`question_5_female_changing_mixed_teachers`,`question_5_female_changing_room_functioal`,`question_question_5_female_changing_none_functional`,`question_5_uirinals_for_boys_block_number`,`question_urinals_number_stances`,`question_5_urinals_for_boys_number_stances_teachers`,`question_5_urinals_for_boys_mixed_teachers`,`question_5_urinals_for_boys_functional`,`question_5_urinals_for_boys_none_functional`,`question_5_boys_satnces`,`QUESTION_5_1_TOILET_ACCESSIBLE`,`QUESTION_5_3_FUNCTIONAL_OBJECTIVE`,`QUESTION_5_3_FUNCTIONAL_WATER_POINT_REASON_IF_NO`,`QUESTION_6_1_PERMANENT_CLASS_ROOM`,`QUESTION_6_1_NUMBER_OF_DESK`,`QUESTION_6_3_PUPIL_DESK_RATIO`,`QUESTION_7_0_NUMBER_MALE_TEACHER_ENROLLED`,`QUESTION_7_0_NUMBER_OF_FEMALE_TEACHER_ENROLLED`,`QUESTION_7_0_NUMBER_OF_TEACHER_PAYROLL`,`QUESTION_7_0_NUMBER_OF_TEACHERS_PRESENT`,`QUESTION_7_0_NUMBER_TEACHERS_PRESENT_FEMALE`,`QUESTION_7_1_TEACHER_PUPIL_RATIO`,`QUESTION_7_2_SENIOR_WOMAN_TEACHER`,`_SWT_OFFER_SUPPORT)\n"
                + "`,`QUESTION_8_0_HOW_OFTEN_INSPECTOR_VISIT_SCHOOL`,`QUESTION_8_2_LAST_TIME_INSPECTOR_VISIT`,`QUESTION_8_3_SCHOOL_HAVE_SCHOOL_MANAGEMENT_COMMITTEE`,`QUESTION_8_4_HOW_OFTEN_SMC_MEET`,`QUESTION_8_5_IS_SMC_TRAINED`,`QUESTION_8_OBERSAVATIONS_OR_CHALLENGES`,`QUESTION_8_IS_STORED_LOCALLY`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EducationQuestion value) {
        stmt.bindLong(1, value.getId());
        if (value.getFinancialYear() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFinancialYear());
        }
        if (value.getDate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDate());
        }
        if (value.getDistrict() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDistrict());
        }
        if (value.getVillage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getVillage());
        }
        if (value.getParish() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getParish());
        }
        if (value.getDivision() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDivision());
        }
        if (value.getFullNames() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getFullNames());
        }
        if (value.getTel() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTel());
        }
        if (value.getQuestion1Answer() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getQuestion1Answer());
        }
        if (value.getQuestion2SchoolName() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getQuestion2SchoolName());
        }
        stmt.bindLong(12, value.getQuestion2MaleTeachers());
        stmt.bindLong(13, value.getQuestion2FeMaleTeachers());
        stmt.bindLong(14, value.getQuestion2MalePWDTeachers());
        stmt.bindLong(15, value.getQuestion2FemalePWDTeachers());
        stmt.bindLong(16, value.getQuestion2TeachersTotal());
        stmt.bindLong(17, value.getQuestion2MalePupilEnrollment());
        stmt.bindLong(18, value.getQuestion2FeMalePupilEnrollment());
        stmt.bindLong(19, value.getQuestion2MalePWDPupilEnrollment());
        stmt.bindLong(20, value.getQuestion2FemalePWDPupilEnrollment());
        stmt.bindLong(21, value.getQuestion2PupilEnrollmentTotal());
        stmt.bindLong(22, value.getQuestion2NumberP7Male());
        stmt.bindLong(23, value.getQuestion2NumberP7FeMale());
        stmt.bindLong(24, value.getQuestion2NumberP7MalePWD());
        stmt.bindLong(25, value.getQuestion2NumberP7FeMalePWD());
        stmt.bindLong(26, value.getQuestion2NumberP7Total());
        stmt.bindLong(27, value.getQuestion2NumberDropoutMale());
        stmt.bindLong(28, value.getQuestion2NumberDropOutFemale());
        stmt.bindLong(29, value.getQuestion2NumberDropoutMalePWD());
        stmt.bindLong(30, value.getQuestion2NumberDropOutFemalePWD());
        stmt.bindLong(31, value.getQuestion2NumberDropOutTotal());
        if (value.getQuestion2DropOutReasonIfAny() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getQuestion2DropOutReasonIfAny());
        }
        stmt.bindLong(33, value.getQuestion3capitalGrantApprovedBudget());
        stmt.bindLong(34, value.getQuestion3CapitalGrantReleaseBudget());
        if (value.getQuestion3CapitalReceivedDate() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getQuestion3CapitalReceivedDate());
        }
        if (value.getQuestion3CapitalDateWithdrawn() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getQuestion3CapitalDateWithdrawn());
        }
        stmt.bindLong(37, value.getQuestion3SFGApprovedBudgetEditText());
        stmt.bindLong(38, value.getQuestion3SFGBudgetReceived());
        if (value.getQuestion3SFGDateReceived() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getQuestion3SFGDateReceived());
        }
        if (value.getQuestion3SFGDateWithdrawn() == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.getQuestion3SFGDateWithdrawn());
        }
        final int _tmp;
        _tmp = value.isQuestion31InformationNoticeBoardDisplayed() ? 1 : 0;
        stmt.bindLong(41, _tmp);
        final int _tmp_1;
        _tmp_1 = value.isQuestion3InformationHeadTeacherOfficeDisplayed() ? 1 : 0;
        stmt.bindLong(42, _tmp_1);
        final int _tmp_2;
        _tmp_2 = value.isQuestion31InformationStaffRoomDisplayed() ? 1 : 0;
        stmt.bindLong(43, _tmp_2);
        final int _tmp_3;
        _tmp_3 = value.isQuestion31InformationNoteDisplayed() ? 1 : 0;
        stmt.bindLong(44, _tmp_3);
        if (value.getQuestion32StatementPeriod() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindString(45, value.getQuestion32StatementPeriod());
        }
        stmt.bindLong(46, value.getQuestion4Grade1MaleNumber());
        stmt.bindLong(47, value.getQuestion4Grade2MaleNumber());
        stmt.bindLong(48, value.getQuestion4Grade3MaleNumber());
        stmt.bindLong(49, value.getQuestion4Grade4MaleNumber());
        stmt.bindLong(50, value.getQuestion4Grade1FemaleNumber());
        stmt.bindLong(51, value.getQuestion4Grade2FemaleNumber());
        stmt.bindLong(52, value.getQuestion4Grade3FemaleNumber());
        stmt.bindLong(53, value.getQuestion4Grade4FemaleNumber());
        if (value.getQuestion41CurrentTermPerformance() == null) {
          stmt.bindNull(54);
        } else {
          stmt.bindString(54, value.getQuestion41CurrentTermPerformance());
        }
        if (value.getQuestion42ReasonAttribute() == null) {
          stmt.bindNull(55);
        } else {
          stmt.bindString(55, value.getQuestion42ReasonAttribute());
        }
        stmt.bindLong(56, value.getQuestion5ToiletNumberBlocks());
        stmt.bindLong(57, value.getQuestion5ToiletNumberStances());
        stmt.bindLong(58, value.getQuestion5ToiletNumberMaleStancesPupil());
        stmt.bindLong(59, value.getQuestion5ToiletNumberFemaleStancesPupil());
        stmt.bindLong(60, value.getQuestion5ToiletNumberMaleStancesTeacher());
        stmt.bindLong(61, value.getQuestion5ToiletNumberStancesFemaleTeachers());
        stmt.bindLong(62, value.getQuestion5ToiletNumberStancesMixed());
        stmt.bindLong(63, value.getQuestion5ToiletFunctional());
        stmt.bindLong(64, value.getQuestion5ToiletNoneFunctional());
        stmt.bindLong(65, value.getQuestion5LatrineNumberBlocks());
        stmt.bindLong(66, value.getQuestion5LatrineNumberStances());
        stmt.bindLong(67, value.getQuestion5LatrineNumberStanceMalePupil());
        stmt.bindLong(68, value.getQuestion5LatrineNumberStanceFemalePupil());
        stmt.bindLong(69, value.getQuestion5LatrineNumberStancesMaleTeachers());
        stmt.bindLong(70, value.getQuestion5LatrineNumberStancesFemaleTeachers());
        stmt.bindLong(71, value.getQuestion5LatrineMixedTeachers());
        stmt.bindLong(72, value.getQuestion5LatrineFunctional());
        stmt.bindLong(73, value.getQuestion5LatrineNoneFunctional());
        stmt.bindLong(74, value.getQuestion5VIPLatrineNumberBlocks());
        stmt.bindLong(75, value.getQuestion5VIPLatrineNumberStances());
        stmt.bindLong(76, value.getQuestion5VIPLatrineNumberStancesMalePupil());
        stmt.bindLong(77, value.getQuestion5VIPLatrineNumberStancesFemalePupil());
        stmt.bindLong(78, value.getQuestion5VIPLatrineNumberStancesMaleTeacher());
        stmt.bindLong(79, value.getQuestion5VIPLatrineNumberStancesFemaleTeachers());
        stmt.bindLong(80, value.getQuestion5VIPLatrineNumberStancesMixedTeachers());
        stmt.bindLong(81, value.getQuestion5VIPLatrineFunction());
        stmt.bindLong(82, value.getQuestion5VIPNoneFunctional());
        stmt.bindLong(83, value.getQuestion5FemaleChangingRoomBlockNumber());
        stmt.bindLong(84, value.getQuestion5FemaleChangingRoomStanceNumber());
        stmt.bindLong(85, value.getQuestion5FemaleChangingRoomFemaleStances());
        stmt.bindLong(86, value.getQuestion5FemaleChangingRoomFemaleTeacher());
        stmt.bindLong(87, value.getQuestion5FemaleChangingRoomMixedTeacher());
        stmt.bindLong(88, value.getQuestion5FemaleChangingRoomFunctional());
        stmt.bindLong(89, value.getQuestion5FemaleChangingRoomNoneFunctional());
        stmt.bindLong(90, value.getQuestion5UrinalsForBoysBlockNumber());
        stmt.bindLong(91, value.getQuestion5UrinalsForBoysNumberStances());
        stmt.bindLong(92, value.getQuestion5UrinalsForBoysNumberStancesTeacher());
        stmt.bindLong(93, value.getQuestion5UrinalsForBoysMixedTeachers());
        stmt.bindLong(94, value.getQuestion5UrinalsForBoysTeacherFunctional());
        stmt.bindLong(95, value.getQuestion5UrinalsForBoysNoneFunctional());
        stmt.bindLong(96, value.getQuestion5UrinalsForBoysStancesPupil());
        final int _tmp_4;
        _tmp_4 = value.isQ5SchoolToiletAccessible() ? 1 : 0;
        stmt.bindLong(97, _tmp_4);
        final int _tmp_5;
        _tmp_5 = value.isQ5FunctionalWaterPoint() ? 1 : 0;
        stmt.bindLong(98, _tmp_5);
        if (value.getQ5FunctionalWaterPointReasonIfNo() == null) {
          stmt.bindNull(99);
        } else {
          stmt.bindString(99, value.getQ5FunctionalWaterPointReasonIfNo());
        }
        stmt.bindLong(100, value.getQuestion61NumberPermanentClassRooms());
        stmt.bindLong(101, value.getQuestion62NumberOfDeskInSchool());
        if (value.getQuestion63PupilDeskRatio() == null) {
          stmt.bindNull(102);
        } else {
          stmt.bindString(102, value.getQuestion63PupilDeskRatio());
        }
        stmt.bindLong(103, value.getQuestion70NumberOfMaleTeacherEnrolled());
        stmt.bindLong(104, value.getQuestion70NumberOfFemaleTeacherEnrolled());
        stmt.bindLong(105, value.getQuestion70NumberOfTeachersOnPayroll());
        stmt.bindLong(106, value.getQuestion70NumberOfTeachersPresentMale());
        stmt.bindLong(107, value.getQuestion70NumberOfFemaleTeacherPresent());
        if (value.getQuestion71TeacherPupilRatio() == null) {
          stmt.bindNull(108);
        } else {
          stmt.bindString(108, value.getQuestion71TeacherPupilRatio());
        }
        final int _tmp_6;
        _tmp_6 = value.isQuestion72SeniorWomanTeacherYesNo() ? 1 : 0;
        stmt.bindLong(109, _tmp_6);
        if (value.getQuestion73SWFOfferSupportHow() == null) {
          stmt.bindNull(110);
        } else {
          stmt.bindString(110, value.getQuestion73SWFOfferSupportHow());
        }
        if (value.getQuestion8HowOftenSchoolInspectorVisit() == null) {
          stmt.bindNull(111);
        } else {
          stmt.bindString(111, value.getQuestion8HowOftenSchoolInspectorVisit());
        }
        if (value.getQuestion82LastTimeInspectorVisit() == null) {
          stmt.bindNull(112);
        } else {
          stmt.bindString(112, value.getQuestion82LastTimeInspectorVisit());
        }
        final int _tmp_7;
        _tmp_7 = value.isQuestion83SchoolHaveSchoolManagementCommittee() ? 1 : 0;
        stmt.bindLong(113, _tmp_7);
        if (value.getQuestion84HowOftenSMCMeet() == null) {
          stmt.bindNull(114);
        } else {
          stmt.bindString(114, value.getQuestion84HowOftenSMCMeet());
        }
        if (value.getQuestion85IsSMCTrained() == null) {
          stmt.bindNull(115);
        } else {
          stmt.bindString(115, value.getQuestion85IsSMCTrained());
        }
        if (value.getQuestion8ObservationsOrChallenges() == null) {
          stmt.bindNull(116);
        } else {
          stmt.bindString(116, value.getQuestion8ObservationsOrChallenges());
        }
        final int _tmp_8;
        _tmp_8 = value.isStoredLocally() ? 1 : 0;
        stmt.bindLong(117, _tmp_8);
      }
    };
  }

  @Override
  public void saveEducationQuestion(final EducationQuestion educationQuestion) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfEducationQuestion.insert(educationQuestion);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<EducationQuestion>> getAllEducationQuestions() {
    final String _sql = "SELECT * FROM educ_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"educ_table"}, false, new Callable<List<EducationQuestion>>() {
      @Override
      public List<EducationQuestion> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "primary_key");
          final int _cursorIndexOfFinancialYear = CursorUtil.getColumnIndexOrThrow(_cursor, "financial_year");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfDistrict = CursorUtil.getColumnIndexOrThrow(_cursor, "district");
          final int _cursorIndexOfVillage = CursorUtil.getColumnIndexOrThrow(_cursor, "village");
          final int _cursorIndexOfParish = CursorUtil.getColumnIndexOrThrow(_cursor, "parish");
          final int _cursorIndexOfDivision = CursorUtil.getColumnIndexOrThrow(_cursor, "division");
          final int _cursorIndexOfFullNames = CursorUtil.getColumnIndexOrThrow(_cursor, "full_names");
          final int _cursorIndexOfTel = CursorUtil.getColumnIndexOrThrow(_cursor, "tel");
          final int _cursorIndexOfQuestion1Answer = CursorUtil.getColumnIndexOrThrow(_cursor, "question_1_answer");
          final int _cursorIndexOfQuestion2SchoolName = CursorUtil.getColumnIndexOrThrow(_cursor, "question_2_school_name");
          final int _cursorIndexOfQuestion2MaleTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "question_2_male_teachers");
          final int _cursorIndexOfQuestion2FeMaleTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "question_2_fe_male");
          final int _cursorIndexOfQuestion2MalePWDTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "male_pwds_teachers_q2");
          final int _cursorIndexOfQuestion2FemalePWDTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "female_pwd_teachers_q2");
          final int _cursorIndexOfQuestion2TeachersTotal = CursorUtil.getColumnIndexOrThrow(_cursor, "teachers_total");
          final int _cursorIndexOfQuestion2MalePupilEnrollment = CursorUtil.getColumnIndexOrThrow(_cursor, "question_2_male_PupilEnrollment");
          final int _cursorIndexOfQuestion2FeMalePupilEnrollment = CursorUtil.getColumnIndexOrThrow(_cursor, "question_2_fe_male_PupilEnrollment");
          final int _cursorIndexOfQuestion2MalePWDPupilEnrollment = CursorUtil.getColumnIndexOrThrow(_cursor, "male_pwds_PupilEnrollment_q2");
          final int _cursorIndexOfQuestion2FemalePWDPupilEnrollment = CursorUtil.getColumnIndexOrThrow(_cursor, "female_pwd_PupilEnrollment_q2");
          final int _cursorIndexOfQuestion2PupilEnrollmentTotal = CursorUtil.getColumnIndexOrThrow(_cursor, "PupilEnrollment_toatl");
          final int _cursorIndexOfQuestion2NumberP7Male = CursorUtil.getColumnIndexOrThrow(_cursor, "num_p7_male_q2");
          final int _cursorIndexOfQuestion2NumberP7FeMale = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_n_7_female");
          final int _cursorIndexOfQuestion2NumberP7MalePWD = CursorUtil.getColumnIndexOrThrow(_cursor, "q_2_n_m_pwd");
          final int _cursorIndexOfQuestion2NumberP7FeMalePWD = CursorUtil.getColumnIndexOrThrow(_cursor, "q_2_f_p_7_pwd");
          final int _cursorIndexOfQuestion2NumberP7Total = CursorUtil.getColumnIndexOrThrow(_cursor, "question_2_total_p7");
          final int _cursorIndexOfQuestion2NumberDropoutMale = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_n_d_o_male");
          final int _cursorIndexOfQuestion2NumberDropOutFemale = CursorUtil.getColumnIndexOrThrow(_cursor, "q_2_n_drop_female");
          final int _cursorIndexOfQuestion2NumberDropoutMalePWD = CursorUtil.getColumnIndexOrThrow(_cursor, "pwd_2_male_drop_out");
          final int _cursorIndexOfQuestion2NumberDropOutFemalePWD = CursorUtil.getColumnIndexOrThrow(_cursor, "pwd_2_female_dropout_2");
          final int _cursorIndexOfQuestion2NumberDropOutTotal = CursorUtil.getColumnIndexOrThrow(_cursor, "total_dropout_q2");
          final int _cursorIndexOfQuestion2DropOutReasonIfAny = CursorUtil.getColumnIndexOrThrow(_cursor, "question_2_drop_out_reasons_if_any");
          final int _cursorIndexOfQuestion3capitalGrantApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_capital_grants_approved");
          final int _cursorIndexOfQuestion3CapitalGrantReleaseBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_capital_grant_released_budget");
          final int _cursorIndexOfQuestion3CapitalReceivedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "questions_3_date_received_capital");
          final int _cursorIndexOfQuestion3CapitalDateWithdrawn = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_date_withdrawn_capital");
          final int _cursorIndexOfQuestion3SFGApprovedBudgetEditText = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_sfg_approved_budget");
          final int _cursorIndexOfQuestion3SFGBudgetReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_sfg_budget_received");
          final int _cursorIndexOfQuestion3SFGDateReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_date_received_sfg");
          final int _cursorIndexOfQuestion3SFGDateWithdrawn = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_sfg_date_withdrawn");
          final int _cursorIndexOfQuestion31InformationNoticeBoardDisplayed = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_1_information_notice_board_displayed");
          final int _cursorIndexOfQuestion3InformationHeadTeacherOfficeDisplayed = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_displayed_head_teacher_office");
          final int _cursorIndexOfQuestion31InformationStaffRoomDisplayed = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_1_information_staff_room");
          final int _cursorIndexOfQuestion31InformationNoteDisplayed = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_2_information_not_displayed");
          final int _cursorIndexOfQuestion32StatementPeriod = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_2_statement_period");
          final int _cursorIndexOfQuestion4Grade1MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_grade_1_male_number");
          final int _cursorIndexOfQuestion4Grade2MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_grade_2_male_number");
          final int _cursorIndexOfQuestion4Grade3MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_grade_3_male_number");
          final int _cursorIndexOfQuestion4Grade4MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_grade_4_male_number");
          final int _cursorIndexOfQuestion4Grade1FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_grade_1_female_number");
          final int _cursorIndexOfQuestion4Grade2FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_grade_2_female_number");
          final int _cursorIndexOfQuestion4Grade3FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_grade_3_female_number");
          final int _cursorIndexOfQuestion4Grade4FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_grade_4_female_number");
          final int _cursorIndexOfQuestion41CurrentTermPerformance = CursorUtil.getColumnIndexOrThrow(_cursor, "question_4_1_current_performance");
          final int _cursorIndexOfQuestion42ReasonAttribute = CursorUtil.getColumnIndexOrThrow(_cursor, "question_4_2_attribute_reason");
          final int _cursorIndexOfQuestion5ToiletNumberBlocks = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_toilet_blocks");
          final int _cursorIndexOfQuestion5ToiletNumberStances = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_toilet_stances");
          final int _cursorIndexOfQuestion5ToiletNumberMaleStancesPupil = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_male_stances_pupil");
          final int _cursorIndexOfQuestion5ToiletNumberFemaleStancesPupil = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_toilet_female_stances_pupil");
          final int _cursorIndexOfQuestion5ToiletNumberMaleStancesTeacher = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_toilet_male_stances_teacher");
          final int _cursorIndexOfQuestion5ToiletNumberStancesFemaleTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_toilet_female_number_stance_teacher");
          final int _cursorIndexOfQuestion5ToiletNumberStancesMixed = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_mixed_stances_number_toilet");
          final int _cursorIndexOfQuestion5ToiletFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_toilet_function");
          final int _cursorIndexOfQuestion5ToiletNoneFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_toilet_none_functional");
          final int _cursorIndexOfQuestion5LatrineNumberBlocks = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_number_blocks_latrine");
          final int _cursorIndexOfQuestion5LatrineNumberStances = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_number_latrine_stances");
          final int _cursorIndexOfQuestion5LatrineNumberStanceMalePupil = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_latrine_number_instances_male_pupil");
          final int _cursorIndexOfQuestion5LatrineNumberStanceFemalePupil = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_number_stances_female_stances_female");
          final int _cursorIndexOfQuestion5LatrineNumberStancesMaleTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_number_stances_male_teachers");
          final int _cursorIndexOfQuestion5LatrineNumberStancesFemaleTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_number_stances_female_teachers");
          final int _cursorIndexOfQuestion5LatrineMixedTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_latrine_mixed_teachers");
          final int _cursorIndexOfQuestion5LatrineFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_latrine_functional");
          final int _cursorIndexOfQuestion5LatrineNoneFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_latrine_none_functional");
          final int _cursorIndexOfQuestion5VIPLatrineNumberBlocks = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_vip_latrine_num_ber_blocks");
          final int _cursorIndexOfQuestion5VIPLatrineNumberStances = CursorUtil.getColumnIndexOrThrow(_cursor, "quest_ion_5_vip_latrine_number_stances");
          final int _cursorIndexOfQuestion5VIPLatrineNumberStancesMalePupil = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_vip_nu_mber_latrine_male_pupil_stances");
          final int _cursorIndexOfQuestion5VIPLatrineNumberStancesFemalePupil = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_vip_num_ber_stance_pupil_female");
          final int _cursorIndexOfQuestion5VIPLatrineNumberStancesMaleTeacher = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_vip_number_stances_ma_le_teacher");
          final int _cursorIndexOfQuestion5VIPLatrineNumberStancesFemaleTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_vip_number_stances_female_teacher_p");
          final int _cursorIndexOfQuestion5VIPLatrineNumberStancesMixedTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_vip_numbe_r_stances_mixed_teachers");
          final int _cursorIndexOfQuestion5VIPLatrineFunction = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_latr_ine_functional");
          final int _cursorIndexOfQuestion5VIPNoneFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_latrine_none_functional_vip");
          final int _cursorIndexOfQuestion5FemaleChangingRoomBlockNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_female_changing_block_number");
          final int _cursorIndexOfQuestion5FemaleChangingRoomStanceNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_female_changing_block_stances  ");
          final int _cursorIndexOfQuestion5FemaleChangingRoomFemaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_female_changing_female_stances");
          final int _cursorIndexOfQuestion5FemaleChangingRoomFemaleTeacher = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_female_changing_room_female_teacher");
          final int _cursorIndexOfQuestion5FemaleChangingRoomMixedTeacher = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_female_changing_mixed_teachers");
          final int _cursorIndexOfQuestion5FemaleChangingRoomFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_female_changing_room_functioal");
          final int _cursorIndexOfQuestion5FemaleChangingRoomNoneFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "question_question_5_female_changing_none_functional");
          final int _cursorIndexOfQuestion5UrinalsForBoysBlockNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_uirinals_for_boys_block_number");
          final int _cursorIndexOfQuestion5UrinalsForBoysNumberStances = CursorUtil.getColumnIndexOrThrow(_cursor, "question_urinals_number_stances");
          final int _cursorIndexOfQuestion5UrinalsForBoysNumberStancesTeacher = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_urinals_for_boys_number_stances_teachers");
          final int _cursorIndexOfQuestion5UrinalsForBoysMixedTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_urinals_for_boys_mixed_teachers");
          final int _cursorIndexOfQuestion5UrinalsForBoysTeacherFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_urinals_for_boys_functional");
          final int _cursorIndexOfQuestion5UrinalsForBoysNoneFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_urinals_for_boys_none_functional");
          final int _cursorIndexOfQuestion5UrinalsForBoysStancesPupil = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_boys_satnces");
          final int _cursorIndexOfQ5SchoolToiletAccessible = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_5_1_TOILET_ACCESSIBLE");
          final int _cursorIndexOfQ5FunctionalWaterPoint = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_5_3_FUNCTIONAL_OBJECTIVE");
          final int _cursorIndexOfQ5FunctionalWaterPointReasonIfNo = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_5_3_FUNCTIONAL_WATER_POINT_REASON_IF_NO");
          final int _cursorIndexOfQuestion61NumberPermanentClassRooms = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_6_1_PERMANENT_CLASS_ROOM");
          final int _cursorIndexOfQuestion62NumberOfDeskInSchool = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_6_1_NUMBER_OF_DESK");
          final int _cursorIndexOfQuestion63PupilDeskRatio = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_6_3_PUPIL_DESK_RATIO");
          final int _cursorIndexOfQuestion70NumberOfMaleTeacherEnrolled = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_0_NUMBER_MALE_TEACHER_ENROLLED");
          final int _cursorIndexOfQuestion70NumberOfFemaleTeacherEnrolled = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_0_NUMBER_OF_FEMALE_TEACHER_ENROLLED");
          final int _cursorIndexOfQuestion70NumberOfTeachersOnPayroll = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_0_NUMBER_OF_TEACHER_PAYROLL");
          final int _cursorIndexOfQuestion70NumberOfTeachersPresentMale = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_0_NUMBER_OF_TEACHERS_PRESENT");
          final int _cursorIndexOfQuestion70NumberOfFemaleTeacherPresent = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_0_NUMBER_TEACHERS_PRESENT_FEMALE");
          final int _cursorIndexOfQuestion71TeacherPupilRatio = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_1_TEACHER_PUPIL_RATIO");
          final int _cursorIndexOfQuestion72SeniorWomanTeacherYesNo = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_2_SENIOR_WOMAN_TEACHER");
          final int _cursorIndexOfQuestion73SWFOfferSupportHow = CursorUtil.getColumnIndexOrThrow(_cursor, "_SWT_OFFER_SUPPORT)\n");
          final int _cursorIndexOfQuestion8HowOftenSchoolInspectorVisit = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_8_0_HOW_OFTEN_INSPECTOR_VISIT_SCHOOL");
          final int _cursorIndexOfQuestion82LastTimeInspectorVisit = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_8_2_LAST_TIME_INSPECTOR_VISIT");
          final int _cursorIndexOfQuestion83SchoolHaveSchoolManagementCommittee = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_8_3_SCHOOL_HAVE_SCHOOL_MANAGEMENT_COMMITTEE");
          final int _cursorIndexOfQuestion84HowOftenSMCMeet = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_8_4_HOW_OFTEN_SMC_MEET");
          final int _cursorIndexOfQuestion85IsSMCTrained = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_8_5_IS_SMC_TRAINED");
          final int _cursorIndexOfQuestion8ObservationsOrChallenges = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_8_OBERSAVATIONS_OR_CHALLENGES");
          final int _cursorIndexOfIsStoredLocally = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_8_IS_STORED_LOCALLY");
          final List<EducationQuestion> _result = new ArrayList<EducationQuestion>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EducationQuestion _item;
            _item = new EducationQuestion();
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpFinancialYear;
            _tmpFinancialYear = _cursor.getString(_cursorIndexOfFinancialYear);
            _item.setFinancialYear(_tmpFinancialYear);
            final String _tmpDate;
            _tmpDate = _cursor.getString(_cursorIndexOfDate);
            _item.setDate(_tmpDate);
            final String _tmpDistrict;
            _tmpDistrict = _cursor.getString(_cursorIndexOfDistrict);
            _item.setDistrict(_tmpDistrict);
            final String _tmpVillage;
            _tmpVillage = _cursor.getString(_cursorIndexOfVillage);
            _item.setVillage(_tmpVillage);
            final String _tmpParish;
            _tmpParish = _cursor.getString(_cursorIndexOfParish);
            _item.setParish(_tmpParish);
            final String _tmpDivision;
            _tmpDivision = _cursor.getString(_cursorIndexOfDivision);
            _item.setDivision(_tmpDivision);
            final String _tmpFullNames;
            _tmpFullNames = _cursor.getString(_cursorIndexOfFullNames);
            _item.setFullNames(_tmpFullNames);
            final String _tmpTel;
            _tmpTel = _cursor.getString(_cursorIndexOfTel);
            _item.setTel(_tmpTel);
            final String _tmpQuestion1Answer;
            _tmpQuestion1Answer = _cursor.getString(_cursorIndexOfQuestion1Answer);
            _item.setQuestion1Answer(_tmpQuestion1Answer);
            final String _tmpQuestion2SchoolName;
            _tmpQuestion2SchoolName = _cursor.getString(_cursorIndexOfQuestion2SchoolName);
            _item.setQuestion2SchoolName(_tmpQuestion2SchoolName);
            final int _tmpQuestion2MaleTeachers;
            _tmpQuestion2MaleTeachers = _cursor.getInt(_cursorIndexOfQuestion2MaleTeachers);
            _item.setQuestion2MaleTeachers(_tmpQuestion2MaleTeachers);
            final int _tmpQuestion2FeMaleTeachers;
            _tmpQuestion2FeMaleTeachers = _cursor.getInt(_cursorIndexOfQuestion2FeMaleTeachers);
            _item.setQuestion2FeMaleTeachers(_tmpQuestion2FeMaleTeachers);
            final int _tmpQuestion2MalePWDTeachers;
            _tmpQuestion2MalePWDTeachers = _cursor.getInt(_cursorIndexOfQuestion2MalePWDTeachers);
            _item.setQuestion2MalePWDTeachers(_tmpQuestion2MalePWDTeachers);
            final int _tmpQuestion2FemalePWDTeachers;
            _tmpQuestion2FemalePWDTeachers = _cursor.getInt(_cursorIndexOfQuestion2FemalePWDTeachers);
            _item.setQuestion2FemalePWDTeachers(_tmpQuestion2FemalePWDTeachers);
            final int _tmpQuestion2TeachersTotal;
            _tmpQuestion2TeachersTotal = _cursor.getInt(_cursorIndexOfQuestion2TeachersTotal);
            _item.setQuestion2TeachersTotal(_tmpQuestion2TeachersTotal);
            final int _tmpQuestion2MalePupilEnrollment;
            _tmpQuestion2MalePupilEnrollment = _cursor.getInt(_cursorIndexOfQuestion2MalePupilEnrollment);
            _item.setQuestion2MalePupilEnrollment(_tmpQuestion2MalePupilEnrollment);
            final int _tmpQuestion2FeMalePupilEnrollment;
            _tmpQuestion2FeMalePupilEnrollment = _cursor.getInt(_cursorIndexOfQuestion2FeMalePupilEnrollment);
            _item.setQuestion2FeMalePupilEnrollment(_tmpQuestion2FeMalePupilEnrollment);
            final int _tmpQuestion2MalePWDPupilEnrollment;
            _tmpQuestion2MalePWDPupilEnrollment = _cursor.getInt(_cursorIndexOfQuestion2MalePWDPupilEnrollment);
            _item.setQuestion2MalePWDPupilEnrollment(_tmpQuestion2MalePWDPupilEnrollment);
            final int _tmpQuestion2FemalePWDPupilEnrollment;
            _tmpQuestion2FemalePWDPupilEnrollment = _cursor.getInt(_cursorIndexOfQuestion2FemalePWDPupilEnrollment);
            _item.setQuestion2FemalePWDPupilEnrollment(_tmpQuestion2FemalePWDPupilEnrollment);
            final int _tmpQuestion2PupilEnrollmentTotal;
            _tmpQuestion2PupilEnrollmentTotal = _cursor.getInt(_cursorIndexOfQuestion2PupilEnrollmentTotal);
            _item.setQuestion2PupilEnrollmentTotal(_tmpQuestion2PupilEnrollmentTotal);
            final int _tmpQuestion2NumberP7Male;
            _tmpQuestion2NumberP7Male = _cursor.getInt(_cursorIndexOfQuestion2NumberP7Male);
            _item.setQuestion2NumberP7Male(_tmpQuestion2NumberP7Male);
            final int _tmpQuestion2NumberP7FeMale;
            _tmpQuestion2NumberP7FeMale = _cursor.getInt(_cursorIndexOfQuestion2NumberP7FeMale);
            _item.setQuestion2NumberP7FeMale(_tmpQuestion2NumberP7FeMale);
            final int _tmpQuestion2NumberP7MalePWD;
            _tmpQuestion2NumberP7MalePWD = _cursor.getInt(_cursorIndexOfQuestion2NumberP7MalePWD);
            _item.setQuestion2NumberP7MalePWD(_tmpQuestion2NumberP7MalePWD);
            final int _tmpQuestion2NumberP7FeMalePWD;
            _tmpQuestion2NumberP7FeMalePWD = _cursor.getInt(_cursorIndexOfQuestion2NumberP7FeMalePWD);
            _item.setQuestion2NumberP7FeMalePWD(_tmpQuestion2NumberP7FeMalePWD);
            final int _tmpQuestion2NumberP7Total;
            _tmpQuestion2NumberP7Total = _cursor.getInt(_cursorIndexOfQuestion2NumberP7Total);
            _item.setQuestion2NumberP7Total(_tmpQuestion2NumberP7Total);
            final int _tmpQuestion2NumberDropoutMale;
            _tmpQuestion2NumberDropoutMale = _cursor.getInt(_cursorIndexOfQuestion2NumberDropoutMale);
            _item.setQuestion2NumberDropoutMale(_tmpQuestion2NumberDropoutMale);
            final int _tmpQuestion2NumberDropOutFemale;
            _tmpQuestion2NumberDropOutFemale = _cursor.getInt(_cursorIndexOfQuestion2NumberDropOutFemale);
            _item.setQuestion2NumberDropOutFemale(_tmpQuestion2NumberDropOutFemale);
            final int _tmpQuestion2NumberDropoutMalePWD;
            _tmpQuestion2NumberDropoutMalePWD = _cursor.getInt(_cursorIndexOfQuestion2NumberDropoutMalePWD);
            _item.setQuestion2NumberDropoutMalePWD(_tmpQuestion2NumberDropoutMalePWD);
            final int _tmpQuestion2NumberDropOutFemalePWD;
            _tmpQuestion2NumberDropOutFemalePWD = _cursor.getInt(_cursorIndexOfQuestion2NumberDropOutFemalePWD);
            _item.setQuestion2NumberDropOutFemalePWD(_tmpQuestion2NumberDropOutFemalePWD);
            final int _tmpQuestion2NumberDropOutTotal;
            _tmpQuestion2NumberDropOutTotal = _cursor.getInt(_cursorIndexOfQuestion2NumberDropOutTotal);
            _item.setQuestion2NumberDropOutTotal(_tmpQuestion2NumberDropOutTotal);
            final String _tmpQuestion2DropOutReasonIfAny;
            _tmpQuestion2DropOutReasonIfAny = _cursor.getString(_cursorIndexOfQuestion2DropOutReasonIfAny);
            _item.setQuestion2DropOutReasonIfAny(_tmpQuestion2DropOutReasonIfAny);
            final int _tmpQuestion3capitalGrantApprovedBudget;
            _tmpQuestion3capitalGrantApprovedBudget = _cursor.getInt(_cursorIndexOfQuestion3capitalGrantApprovedBudget);
            _item.setQuestion3capitalGrantApprovedBudget(_tmpQuestion3capitalGrantApprovedBudget);
            final int _tmpQuestion3CapitalGrantReleaseBudget;
            _tmpQuestion3CapitalGrantReleaseBudget = _cursor.getInt(_cursorIndexOfQuestion3CapitalGrantReleaseBudget);
            _item.setQuestion3CapitalGrantReleaseBudget(_tmpQuestion3CapitalGrantReleaseBudget);
            final String _tmpQuestion3CapitalReceivedDate;
            _tmpQuestion3CapitalReceivedDate = _cursor.getString(_cursorIndexOfQuestion3CapitalReceivedDate);
            _item.setQuestion3CapitalReceivedDate(_tmpQuestion3CapitalReceivedDate);
            final String _tmpQuestion3CapitalDateWithdrawn;
            _tmpQuestion3CapitalDateWithdrawn = _cursor.getString(_cursorIndexOfQuestion3CapitalDateWithdrawn);
            _item.setQuestion3CapitalDateWithdrawn(_tmpQuestion3CapitalDateWithdrawn);
            final int _tmpQuestion3SFGApprovedBudgetEditText;
            _tmpQuestion3SFGApprovedBudgetEditText = _cursor.getInt(_cursorIndexOfQuestion3SFGApprovedBudgetEditText);
            _item.setQuestion3SFGApprovedBudgetEditText(_tmpQuestion3SFGApprovedBudgetEditText);
            final int _tmpQuestion3SFGBudgetReceived;
            _tmpQuestion3SFGBudgetReceived = _cursor.getInt(_cursorIndexOfQuestion3SFGBudgetReceived);
            _item.setQuestion3SFGBudgetReceived(_tmpQuestion3SFGBudgetReceived);
            final String _tmpQuestion3SFGDateReceived;
            _tmpQuestion3SFGDateReceived = _cursor.getString(_cursorIndexOfQuestion3SFGDateReceived);
            _item.setQuestion3SFGDateReceived(_tmpQuestion3SFGDateReceived);
            final String _tmpQuestion3SFGDateWithdrawn;
            _tmpQuestion3SFGDateWithdrawn = _cursor.getString(_cursorIndexOfQuestion3SFGDateWithdrawn);
            _item.setQuestion3SFGDateWithdrawn(_tmpQuestion3SFGDateWithdrawn);
            final boolean _tmpQuestion31InformationNoticeBoardDisplayed;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfQuestion31InformationNoticeBoardDisplayed);
            _tmpQuestion31InformationNoticeBoardDisplayed = _tmp != 0;
            _item.setQuestion31InformationNoticeBoardDisplayed(_tmpQuestion31InformationNoticeBoardDisplayed);
            final boolean _tmpQuestion3InformationHeadTeacherOfficeDisplayed;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfQuestion3InformationHeadTeacherOfficeDisplayed);
            _tmpQuestion3InformationHeadTeacherOfficeDisplayed = _tmp_1 != 0;
            _item.setQuestion3InformationHeadTeacherOfficeDisplayed(_tmpQuestion3InformationHeadTeacherOfficeDisplayed);
            final boolean _tmpQuestion31InformationStaffRoomDisplayed;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfQuestion31InformationStaffRoomDisplayed);
            _tmpQuestion31InformationStaffRoomDisplayed = _tmp_2 != 0;
            _item.setQuestion31InformationStaffRoomDisplayed(_tmpQuestion31InformationStaffRoomDisplayed);
            final boolean _tmpQuestion31InformationNoteDisplayed;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfQuestion31InformationNoteDisplayed);
            _tmpQuestion31InformationNoteDisplayed = _tmp_3 != 0;
            _item.setQuestion31InformationNoteDisplayed(_tmpQuestion31InformationNoteDisplayed);
            final String _tmpQuestion32StatementPeriod;
            _tmpQuestion32StatementPeriod = _cursor.getString(_cursorIndexOfQuestion32StatementPeriod);
            _item.setQuestion32StatementPeriod(_tmpQuestion32StatementPeriod);
            final int _tmpQuestion4Grade1MaleNumber;
            _tmpQuestion4Grade1MaleNumber = _cursor.getInt(_cursorIndexOfQuestion4Grade1MaleNumber);
            _item.setQuestion4Grade1MaleNumber(_tmpQuestion4Grade1MaleNumber);
            final int _tmpQuestion4Grade2MaleNumber;
            _tmpQuestion4Grade2MaleNumber = _cursor.getInt(_cursorIndexOfQuestion4Grade2MaleNumber);
            _item.setQuestion4Grade2MaleNumber(_tmpQuestion4Grade2MaleNumber);
            final int _tmpQuestion4Grade3MaleNumber;
            _tmpQuestion4Grade3MaleNumber = _cursor.getInt(_cursorIndexOfQuestion4Grade3MaleNumber);
            _item.setQuestion4Grade3MaleNumber(_tmpQuestion4Grade3MaleNumber);
            final int _tmpQuestion4Grade4MaleNumber;
            _tmpQuestion4Grade4MaleNumber = _cursor.getInt(_cursorIndexOfQuestion4Grade4MaleNumber);
            _item.setQuestion4Grade4MaleNumber(_tmpQuestion4Grade4MaleNumber);
            final int _tmpQuestion4Grade1FemaleNumber;
            _tmpQuestion4Grade1FemaleNumber = _cursor.getInt(_cursorIndexOfQuestion4Grade1FemaleNumber);
            _item.setQuestion4Grade1FemaleNumber(_tmpQuestion4Grade1FemaleNumber);
            final int _tmpQuestion4Grade2FemaleNumber;
            _tmpQuestion4Grade2FemaleNumber = _cursor.getInt(_cursorIndexOfQuestion4Grade2FemaleNumber);
            _item.setQuestion4Grade2FemaleNumber(_tmpQuestion4Grade2FemaleNumber);
            final int _tmpQuestion4Grade3FemaleNumber;
            _tmpQuestion4Grade3FemaleNumber = _cursor.getInt(_cursorIndexOfQuestion4Grade3FemaleNumber);
            _item.setQuestion4Grade3FemaleNumber(_tmpQuestion4Grade3FemaleNumber);
            final int _tmpQuestion4Grade4FemaleNumber;
            _tmpQuestion4Grade4FemaleNumber = _cursor.getInt(_cursorIndexOfQuestion4Grade4FemaleNumber);
            _item.setQuestion4Grade4FemaleNumber(_tmpQuestion4Grade4FemaleNumber);
            final String _tmpQuestion41CurrentTermPerformance;
            _tmpQuestion41CurrentTermPerformance = _cursor.getString(_cursorIndexOfQuestion41CurrentTermPerformance);
            _item.setQuestion41CurrentTermPerformance(_tmpQuestion41CurrentTermPerformance);
            final String _tmpQuestion42ReasonAttribute;
            _tmpQuestion42ReasonAttribute = _cursor.getString(_cursorIndexOfQuestion42ReasonAttribute);
            _item.setQuestion42ReasonAttribute(_tmpQuestion42ReasonAttribute);
            final int _tmpQuestion5ToiletNumberBlocks;
            _tmpQuestion5ToiletNumberBlocks = _cursor.getInt(_cursorIndexOfQuestion5ToiletNumberBlocks);
            _item.setQuestion5ToiletNumberBlocks(_tmpQuestion5ToiletNumberBlocks);
            final int _tmpQuestion5ToiletNumberStances;
            _tmpQuestion5ToiletNumberStances = _cursor.getInt(_cursorIndexOfQuestion5ToiletNumberStances);
            _item.setQuestion5ToiletNumberStances(_tmpQuestion5ToiletNumberStances);
            final int _tmpQuestion5ToiletNumberMaleStancesPupil;
            _tmpQuestion5ToiletNumberMaleStancesPupil = _cursor.getInt(_cursorIndexOfQuestion5ToiletNumberMaleStancesPupil);
            _item.setQuestion5ToiletNumberMaleStancesPupil(_tmpQuestion5ToiletNumberMaleStancesPupil);
            final int _tmpQuestion5ToiletNumberFemaleStancesPupil;
            _tmpQuestion5ToiletNumberFemaleStancesPupil = _cursor.getInt(_cursorIndexOfQuestion5ToiletNumberFemaleStancesPupil);
            _item.setQuestion5ToiletNumberFemaleStancesPupil(_tmpQuestion5ToiletNumberFemaleStancesPupil);
            final int _tmpQuestion5ToiletNumberMaleStancesTeacher;
            _tmpQuestion5ToiletNumberMaleStancesTeacher = _cursor.getInt(_cursorIndexOfQuestion5ToiletNumberMaleStancesTeacher);
            _item.setQuestion5ToiletNumberMaleStancesTeacher(_tmpQuestion5ToiletNumberMaleStancesTeacher);
            final int _tmpQuestion5ToiletNumberStancesFemaleTeachers;
            _tmpQuestion5ToiletNumberStancesFemaleTeachers = _cursor.getInt(_cursorIndexOfQuestion5ToiletNumberStancesFemaleTeachers);
            _item.setQuestion5ToiletNumberStancesFemaleTeachers(_tmpQuestion5ToiletNumberStancesFemaleTeachers);
            final int _tmpQuestion5ToiletNumberStancesMixed;
            _tmpQuestion5ToiletNumberStancesMixed = _cursor.getInt(_cursorIndexOfQuestion5ToiletNumberStancesMixed);
            _item.setQuestion5ToiletNumberStancesMixed(_tmpQuestion5ToiletNumberStancesMixed);
            final int _tmpQuestion5ToiletFunctional;
            _tmpQuestion5ToiletFunctional = _cursor.getInt(_cursorIndexOfQuestion5ToiletFunctional);
            _item.setQuestion5ToiletFunctional(_tmpQuestion5ToiletFunctional);
            final int _tmpQuestion5ToiletNoneFunctional;
            _tmpQuestion5ToiletNoneFunctional = _cursor.getInt(_cursorIndexOfQuestion5ToiletNoneFunctional);
            _item.setQuestion5ToiletNoneFunctional(_tmpQuestion5ToiletNoneFunctional);
            final int _tmpQuestion5LatrineNumberBlocks;
            _tmpQuestion5LatrineNumberBlocks = _cursor.getInt(_cursorIndexOfQuestion5LatrineNumberBlocks);
            _item.setQuestion5LatrineNumberBlocks(_tmpQuestion5LatrineNumberBlocks);
            final int _tmpQuestion5LatrineNumberStances;
            _tmpQuestion5LatrineNumberStances = _cursor.getInt(_cursorIndexOfQuestion5LatrineNumberStances);
            _item.setQuestion5LatrineNumberStances(_tmpQuestion5LatrineNumberStances);
            final int _tmpQuestion5LatrineNumberStanceMalePupil;
            _tmpQuestion5LatrineNumberStanceMalePupil = _cursor.getInt(_cursorIndexOfQuestion5LatrineNumberStanceMalePupil);
            _item.setQuestion5LatrineNumberStanceMalePupil(_tmpQuestion5LatrineNumberStanceMalePupil);
            final int _tmpQuestion5LatrineNumberStanceFemalePupil;
            _tmpQuestion5LatrineNumberStanceFemalePupil = _cursor.getInt(_cursorIndexOfQuestion5LatrineNumberStanceFemalePupil);
            _item.setQuestion5LatrineNumberStanceFemalePupil(_tmpQuestion5LatrineNumberStanceFemalePupil);
            final int _tmpQuestion5LatrineNumberStancesMaleTeachers;
            _tmpQuestion5LatrineNumberStancesMaleTeachers = _cursor.getInt(_cursorIndexOfQuestion5LatrineNumberStancesMaleTeachers);
            _item.setQuestion5LatrineNumberStancesMaleTeachers(_tmpQuestion5LatrineNumberStancesMaleTeachers);
            final int _tmpQuestion5LatrineNumberStancesFemaleTeachers;
            _tmpQuestion5LatrineNumberStancesFemaleTeachers = _cursor.getInt(_cursorIndexOfQuestion5LatrineNumberStancesFemaleTeachers);
            _item.setQuestion5LatrineNumberStancesFemaleTeachers(_tmpQuestion5LatrineNumberStancesFemaleTeachers);
            final int _tmpQuestion5LatrineMixedTeachers;
            _tmpQuestion5LatrineMixedTeachers = _cursor.getInt(_cursorIndexOfQuestion5LatrineMixedTeachers);
            _item.setQuestion5LatrineMixedTeachers(_tmpQuestion5LatrineMixedTeachers);
            final int _tmpQuestion5LatrineFunctional;
            _tmpQuestion5LatrineFunctional = _cursor.getInt(_cursorIndexOfQuestion5LatrineFunctional);
            _item.setQuestion5LatrineFunctional(_tmpQuestion5LatrineFunctional);
            final int _tmpQuestion5LatrineNoneFunctional;
            _tmpQuestion5LatrineNoneFunctional = _cursor.getInt(_cursorIndexOfQuestion5LatrineNoneFunctional);
            _item.setQuestion5LatrineNoneFunctional(_tmpQuestion5LatrineNoneFunctional);
            final int _tmpQuestion5VIPLatrineNumberBlocks;
            _tmpQuestion5VIPLatrineNumberBlocks = _cursor.getInt(_cursorIndexOfQuestion5VIPLatrineNumberBlocks);
            _item.setQuestion5VIPLatrineNumberBlocks(_tmpQuestion5VIPLatrineNumberBlocks);
            final int _tmpQuestion5VIPLatrineNumberStances;
            _tmpQuestion5VIPLatrineNumberStances = _cursor.getInt(_cursorIndexOfQuestion5VIPLatrineNumberStances);
            _item.setQuestion5VIPLatrineNumberStances(_tmpQuestion5VIPLatrineNumberStances);
            final int _tmpQuestion5VIPLatrineNumberStancesMalePupil;
            _tmpQuestion5VIPLatrineNumberStancesMalePupil = _cursor.getInt(_cursorIndexOfQuestion5VIPLatrineNumberStancesMalePupil);
            _item.setQuestion5VIPLatrineNumberStancesMalePupil(_tmpQuestion5VIPLatrineNumberStancesMalePupil);
            final int _tmpQuestion5VIPLatrineNumberStancesFemalePupil;
            _tmpQuestion5VIPLatrineNumberStancesFemalePupil = _cursor.getInt(_cursorIndexOfQuestion5VIPLatrineNumberStancesFemalePupil);
            _item.setQuestion5VIPLatrineNumberStancesFemalePupil(_tmpQuestion5VIPLatrineNumberStancesFemalePupil);
            final int _tmpQuestion5VIPLatrineNumberStancesMaleTeacher;
            _tmpQuestion5VIPLatrineNumberStancesMaleTeacher = _cursor.getInt(_cursorIndexOfQuestion5VIPLatrineNumberStancesMaleTeacher);
            _item.setQuestion5VIPLatrineNumberStancesMaleTeacher(_tmpQuestion5VIPLatrineNumberStancesMaleTeacher);
            final int _tmpQuestion5VIPLatrineNumberStancesFemaleTeachers;
            _tmpQuestion5VIPLatrineNumberStancesFemaleTeachers = _cursor.getInt(_cursorIndexOfQuestion5VIPLatrineNumberStancesFemaleTeachers);
            _item.setQuestion5VIPLatrineNumberStancesFemaleTeachers(_tmpQuestion5VIPLatrineNumberStancesFemaleTeachers);
            final int _tmpQuestion5VIPLatrineNumberStancesMixedTeachers;
            _tmpQuestion5VIPLatrineNumberStancesMixedTeachers = _cursor.getInt(_cursorIndexOfQuestion5VIPLatrineNumberStancesMixedTeachers);
            _item.setQuestion5VIPLatrineNumberStancesMixedTeachers(_tmpQuestion5VIPLatrineNumberStancesMixedTeachers);
            final int _tmpQuestion5VIPLatrineFunction;
            _tmpQuestion5VIPLatrineFunction = _cursor.getInt(_cursorIndexOfQuestion5VIPLatrineFunction);
            _item.setQuestion5VIPLatrineFunction(_tmpQuestion5VIPLatrineFunction);
            final int _tmpQuestion5VIPNoneFunctional;
            _tmpQuestion5VIPNoneFunctional = _cursor.getInt(_cursorIndexOfQuestion5VIPNoneFunctional);
            _item.setQuestion5VIPNoneFunctional(_tmpQuestion5VIPNoneFunctional);
            final int _tmpQuestion5FemaleChangingRoomBlockNumber;
            _tmpQuestion5FemaleChangingRoomBlockNumber = _cursor.getInt(_cursorIndexOfQuestion5FemaleChangingRoomBlockNumber);
            _item.setQuestion5FemaleChangingRoomBlockNumber(_tmpQuestion5FemaleChangingRoomBlockNumber);
            final int _tmpQuestion5FemaleChangingRoomStanceNumber;
            _tmpQuestion5FemaleChangingRoomStanceNumber = _cursor.getInt(_cursorIndexOfQuestion5FemaleChangingRoomStanceNumber);
            _item.setQuestion5FemaleChangingRoomStanceNumber(_tmpQuestion5FemaleChangingRoomStanceNumber);
            final int _tmpQuestion5FemaleChangingRoomFemaleStances;
            _tmpQuestion5FemaleChangingRoomFemaleStances = _cursor.getInt(_cursorIndexOfQuestion5FemaleChangingRoomFemaleStances);
            _item.setQuestion5FemaleChangingRoomFemaleStances(_tmpQuestion5FemaleChangingRoomFemaleStances);
            final int _tmpQuestion5FemaleChangingRoomFemaleTeacher;
            _tmpQuestion5FemaleChangingRoomFemaleTeacher = _cursor.getInt(_cursorIndexOfQuestion5FemaleChangingRoomFemaleTeacher);
            _item.setQuestion5FemaleChangingRoomFemaleTeacher(_tmpQuestion5FemaleChangingRoomFemaleTeacher);
            final int _tmpQuestion5FemaleChangingRoomMixedTeacher;
            _tmpQuestion5FemaleChangingRoomMixedTeacher = _cursor.getInt(_cursorIndexOfQuestion5FemaleChangingRoomMixedTeacher);
            _item.setQuestion5FemaleChangingRoomMixedTeacher(_tmpQuestion5FemaleChangingRoomMixedTeacher);
            final int _tmpQuestion5FemaleChangingRoomFunctional;
            _tmpQuestion5FemaleChangingRoomFunctional = _cursor.getInt(_cursorIndexOfQuestion5FemaleChangingRoomFunctional);
            _item.setQuestion5FemaleChangingRoomFunctional(_tmpQuestion5FemaleChangingRoomFunctional);
            final int _tmpQuestion5FemaleChangingRoomNoneFunctional;
            _tmpQuestion5FemaleChangingRoomNoneFunctional = _cursor.getInt(_cursorIndexOfQuestion5FemaleChangingRoomNoneFunctional);
            _item.setQuestion5FemaleChangingRoomNoneFunctional(_tmpQuestion5FemaleChangingRoomNoneFunctional);
            final int _tmpQuestion5UrinalsForBoysBlockNumber;
            _tmpQuestion5UrinalsForBoysBlockNumber = _cursor.getInt(_cursorIndexOfQuestion5UrinalsForBoysBlockNumber);
            _item.setQuestion5UrinalsForBoysBlockNumber(_tmpQuestion5UrinalsForBoysBlockNumber);
            final int _tmpQuestion5UrinalsForBoysNumberStances;
            _tmpQuestion5UrinalsForBoysNumberStances = _cursor.getInt(_cursorIndexOfQuestion5UrinalsForBoysNumberStances);
            _item.setQuestion5UrinalsForBoysNumberStances(_tmpQuestion5UrinalsForBoysNumberStances);
            final int _tmpQuestion5UrinalsForBoysNumberStancesTeacher;
            _tmpQuestion5UrinalsForBoysNumberStancesTeacher = _cursor.getInt(_cursorIndexOfQuestion5UrinalsForBoysNumberStancesTeacher);
            _item.setQuestion5UrinalsForBoysNumberStancesTeacher(_tmpQuestion5UrinalsForBoysNumberStancesTeacher);
            final int _tmpQuestion5UrinalsForBoysMixedTeachers;
            _tmpQuestion5UrinalsForBoysMixedTeachers = _cursor.getInt(_cursorIndexOfQuestion5UrinalsForBoysMixedTeachers);
            _item.setQuestion5UrinalsForBoysMixedTeachers(_tmpQuestion5UrinalsForBoysMixedTeachers);
            final int _tmpQuestion5UrinalsForBoysTeacherFunctional;
            _tmpQuestion5UrinalsForBoysTeacherFunctional = _cursor.getInt(_cursorIndexOfQuestion5UrinalsForBoysTeacherFunctional);
            _item.setQuestion5UrinalsForBoysTeacherFunctional(_tmpQuestion5UrinalsForBoysTeacherFunctional);
            final int _tmpQuestion5UrinalsForBoysNoneFunctional;
            _tmpQuestion5UrinalsForBoysNoneFunctional = _cursor.getInt(_cursorIndexOfQuestion5UrinalsForBoysNoneFunctional);
            _item.setQuestion5UrinalsForBoysNoneFunctional(_tmpQuestion5UrinalsForBoysNoneFunctional);
            final int _tmpQuestion5UrinalsForBoysStancesPupil;
            _tmpQuestion5UrinalsForBoysStancesPupil = _cursor.getInt(_cursorIndexOfQuestion5UrinalsForBoysStancesPupil);
            _item.setQuestion5UrinalsForBoysStancesPupil(_tmpQuestion5UrinalsForBoysStancesPupil);
            final boolean _tmpQ5SchoolToiletAccessible;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfQ5SchoolToiletAccessible);
            _tmpQ5SchoolToiletAccessible = _tmp_4 != 0;
            _item.setQ5SchoolToiletAccessible(_tmpQ5SchoolToiletAccessible);
            final boolean _tmpQ5FunctionalWaterPoint;
            final int _tmp_5;
            _tmp_5 = _cursor.getInt(_cursorIndexOfQ5FunctionalWaterPoint);
            _tmpQ5FunctionalWaterPoint = _tmp_5 != 0;
            _item.setQ5FunctionalWaterPoint(_tmpQ5FunctionalWaterPoint);
            final String _tmpQ5FunctionalWaterPointReasonIfNo;
            _tmpQ5FunctionalWaterPointReasonIfNo = _cursor.getString(_cursorIndexOfQ5FunctionalWaterPointReasonIfNo);
            _item.setQ5FunctionalWaterPointReasonIfNo(_tmpQ5FunctionalWaterPointReasonIfNo);
            final int _tmpQuestion61NumberPermanentClassRooms;
            _tmpQuestion61NumberPermanentClassRooms = _cursor.getInt(_cursorIndexOfQuestion61NumberPermanentClassRooms);
            _item.setQuestion61NumberPermanentClassRooms(_tmpQuestion61NumberPermanentClassRooms);
            final int _tmpQuestion62NumberOfDeskInSchool;
            _tmpQuestion62NumberOfDeskInSchool = _cursor.getInt(_cursorIndexOfQuestion62NumberOfDeskInSchool);
            _item.setQuestion62NumberOfDeskInSchool(_tmpQuestion62NumberOfDeskInSchool);
            final String _tmpQuestion63PupilDeskRatio;
            _tmpQuestion63PupilDeskRatio = _cursor.getString(_cursorIndexOfQuestion63PupilDeskRatio);
            _item.setQuestion63PupilDeskRatio(_tmpQuestion63PupilDeskRatio);
            final int _tmpQuestion70NumberOfMaleTeacherEnrolled;
            _tmpQuestion70NumberOfMaleTeacherEnrolled = _cursor.getInt(_cursorIndexOfQuestion70NumberOfMaleTeacherEnrolled);
            _item.setQuestion70NumberOfMaleTeacherEnrolled(_tmpQuestion70NumberOfMaleTeacherEnrolled);
            final int _tmpQuestion70NumberOfFemaleTeacherEnrolled;
            _tmpQuestion70NumberOfFemaleTeacherEnrolled = _cursor.getInt(_cursorIndexOfQuestion70NumberOfFemaleTeacherEnrolled);
            _item.setQuestion70NumberOfFemaleTeacherEnrolled(_tmpQuestion70NumberOfFemaleTeacherEnrolled);
            final int _tmpQuestion70NumberOfTeachersOnPayroll;
            _tmpQuestion70NumberOfTeachersOnPayroll = _cursor.getInt(_cursorIndexOfQuestion70NumberOfTeachersOnPayroll);
            _item.setQuestion70NumberOfTeachersOnPayroll(_tmpQuestion70NumberOfTeachersOnPayroll);
            final int _tmpQuestion70NumberOfTeachersPresentMale;
            _tmpQuestion70NumberOfTeachersPresentMale = _cursor.getInt(_cursorIndexOfQuestion70NumberOfTeachersPresentMale);
            _item.setQuestion70NumberOfTeachersPresentMale(_tmpQuestion70NumberOfTeachersPresentMale);
            final int _tmpQuestion70NumberOfFemaleTeacherPresent;
            _tmpQuestion70NumberOfFemaleTeacherPresent = _cursor.getInt(_cursorIndexOfQuestion70NumberOfFemaleTeacherPresent);
            _item.setQuestion70NumberOfFemaleTeacherPresent(_tmpQuestion70NumberOfFemaleTeacherPresent);
            final String _tmpQuestion71TeacherPupilRatio;
            _tmpQuestion71TeacherPupilRatio = _cursor.getString(_cursorIndexOfQuestion71TeacherPupilRatio);
            _item.setQuestion71TeacherPupilRatio(_tmpQuestion71TeacherPupilRatio);
            final boolean _tmpQuestion72SeniorWomanTeacherYesNo;
            final int _tmp_6;
            _tmp_6 = _cursor.getInt(_cursorIndexOfQuestion72SeniorWomanTeacherYesNo);
            _tmpQuestion72SeniorWomanTeacherYesNo = _tmp_6 != 0;
            _item.setQuestion72SeniorWomanTeacherYesNo(_tmpQuestion72SeniorWomanTeacherYesNo);
            final String _tmpQuestion73SWFOfferSupportHow;
            _tmpQuestion73SWFOfferSupportHow = _cursor.getString(_cursorIndexOfQuestion73SWFOfferSupportHow);
            _item.setQuestion73SWFOfferSupportHow(_tmpQuestion73SWFOfferSupportHow);
            final String _tmpQuestion8HowOftenSchoolInspectorVisit;
            _tmpQuestion8HowOftenSchoolInspectorVisit = _cursor.getString(_cursorIndexOfQuestion8HowOftenSchoolInspectorVisit);
            _item.setQuestion8HowOftenSchoolInspectorVisit(_tmpQuestion8HowOftenSchoolInspectorVisit);
            final String _tmpQuestion82LastTimeInspectorVisit;
            _tmpQuestion82LastTimeInspectorVisit = _cursor.getString(_cursorIndexOfQuestion82LastTimeInspectorVisit);
            _item.setQuestion82LastTimeInspectorVisit(_tmpQuestion82LastTimeInspectorVisit);
            final boolean _tmpQuestion83SchoolHaveSchoolManagementCommittee;
            final int _tmp_7;
            _tmp_7 = _cursor.getInt(_cursorIndexOfQuestion83SchoolHaveSchoolManagementCommittee);
            _tmpQuestion83SchoolHaveSchoolManagementCommittee = _tmp_7 != 0;
            _item.setQuestion83SchoolHaveSchoolManagementCommittee(_tmpQuestion83SchoolHaveSchoolManagementCommittee);
            final String _tmpQuestion84HowOftenSMCMeet;
            _tmpQuestion84HowOftenSMCMeet = _cursor.getString(_cursorIndexOfQuestion84HowOftenSMCMeet);
            _item.setQuestion84HowOftenSMCMeet(_tmpQuestion84HowOftenSMCMeet);
            final String _tmpQuestion85IsSMCTrained;
            _tmpQuestion85IsSMCTrained = _cursor.getString(_cursorIndexOfQuestion85IsSMCTrained);
            _item.setQuestion85IsSMCTrained(_tmpQuestion85IsSMCTrained);
            final String _tmpQuestion8ObservationsOrChallenges;
            _tmpQuestion8ObservationsOrChallenges = _cursor.getString(_cursorIndexOfQuestion8ObservationsOrChallenges);
            _item.setQuestion8ObservationsOrChallenges(_tmpQuestion8ObservationsOrChallenges);
            final boolean _tmpIsStoredLocally;
            final int _tmp_8;
            _tmp_8 = _cursor.getInt(_cursorIndexOfIsStoredLocally);
            _tmpIsStoredLocally = _tmp_8 != 0;
            _item.setStoredLocally(_tmpIsStoredLocally);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<EducationQuestion> getEducationQuestionForBackUp(final boolean isStoredLocally) {
    final String _sql = "SELECT * FROM educ_table WHERE QUESTION_8_IS_STORED_LOCALLY =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final int _tmp;
    _tmp = isStoredLocally ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "primary_key");
      final int _cursorIndexOfFinancialYear = CursorUtil.getColumnIndexOrThrow(_cursor, "financial_year");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfDistrict = CursorUtil.getColumnIndexOrThrow(_cursor, "district");
      final int _cursorIndexOfVillage = CursorUtil.getColumnIndexOrThrow(_cursor, "village");
      final int _cursorIndexOfParish = CursorUtil.getColumnIndexOrThrow(_cursor, "parish");
      final int _cursorIndexOfDivision = CursorUtil.getColumnIndexOrThrow(_cursor, "division");
      final int _cursorIndexOfFullNames = CursorUtil.getColumnIndexOrThrow(_cursor, "full_names");
      final int _cursorIndexOfTel = CursorUtil.getColumnIndexOrThrow(_cursor, "tel");
      final int _cursorIndexOfQuestion1Answer = CursorUtil.getColumnIndexOrThrow(_cursor, "question_1_answer");
      final int _cursorIndexOfQuestion2SchoolName = CursorUtil.getColumnIndexOrThrow(_cursor, "question_2_school_name");
      final int _cursorIndexOfQuestion2MaleTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "question_2_male_teachers");
      final int _cursorIndexOfQuestion2FeMaleTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "question_2_fe_male");
      final int _cursorIndexOfQuestion2MalePWDTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "male_pwds_teachers_q2");
      final int _cursorIndexOfQuestion2FemalePWDTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "female_pwd_teachers_q2");
      final int _cursorIndexOfQuestion2TeachersTotal = CursorUtil.getColumnIndexOrThrow(_cursor, "teachers_total");
      final int _cursorIndexOfQuestion2MalePupilEnrollment = CursorUtil.getColumnIndexOrThrow(_cursor, "question_2_male_PupilEnrollment");
      final int _cursorIndexOfQuestion2FeMalePupilEnrollment = CursorUtil.getColumnIndexOrThrow(_cursor, "question_2_fe_male_PupilEnrollment");
      final int _cursorIndexOfQuestion2MalePWDPupilEnrollment = CursorUtil.getColumnIndexOrThrow(_cursor, "male_pwds_PupilEnrollment_q2");
      final int _cursorIndexOfQuestion2FemalePWDPupilEnrollment = CursorUtil.getColumnIndexOrThrow(_cursor, "female_pwd_PupilEnrollment_q2");
      final int _cursorIndexOfQuestion2PupilEnrollmentTotal = CursorUtil.getColumnIndexOrThrow(_cursor, "PupilEnrollment_toatl");
      final int _cursorIndexOfQuestion2NumberP7Male = CursorUtil.getColumnIndexOrThrow(_cursor, "num_p7_male_q2");
      final int _cursorIndexOfQuestion2NumberP7FeMale = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_n_7_female");
      final int _cursorIndexOfQuestion2NumberP7MalePWD = CursorUtil.getColumnIndexOrThrow(_cursor, "q_2_n_m_pwd");
      final int _cursorIndexOfQuestion2NumberP7FeMalePWD = CursorUtil.getColumnIndexOrThrow(_cursor, "q_2_f_p_7_pwd");
      final int _cursorIndexOfQuestion2NumberP7Total = CursorUtil.getColumnIndexOrThrow(_cursor, "question_2_total_p7");
      final int _cursorIndexOfQuestion2NumberDropoutMale = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_n_d_o_male");
      final int _cursorIndexOfQuestion2NumberDropOutFemale = CursorUtil.getColumnIndexOrThrow(_cursor, "q_2_n_drop_female");
      final int _cursorIndexOfQuestion2NumberDropoutMalePWD = CursorUtil.getColumnIndexOrThrow(_cursor, "pwd_2_male_drop_out");
      final int _cursorIndexOfQuestion2NumberDropOutFemalePWD = CursorUtil.getColumnIndexOrThrow(_cursor, "pwd_2_female_dropout_2");
      final int _cursorIndexOfQuestion2NumberDropOutTotal = CursorUtil.getColumnIndexOrThrow(_cursor, "total_dropout_q2");
      final int _cursorIndexOfQuestion2DropOutReasonIfAny = CursorUtil.getColumnIndexOrThrow(_cursor, "question_2_drop_out_reasons_if_any");
      final int _cursorIndexOfQuestion3capitalGrantApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_capital_grants_approved");
      final int _cursorIndexOfQuestion3CapitalGrantReleaseBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_capital_grant_released_budget");
      final int _cursorIndexOfQuestion3CapitalReceivedDate = CursorUtil.getColumnIndexOrThrow(_cursor, "questions_3_date_received_capital");
      final int _cursorIndexOfQuestion3CapitalDateWithdrawn = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_date_withdrawn_capital");
      final int _cursorIndexOfQuestion3SFGApprovedBudgetEditText = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_sfg_approved_budget");
      final int _cursorIndexOfQuestion3SFGBudgetReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_sfg_budget_received");
      final int _cursorIndexOfQuestion3SFGDateReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_date_received_sfg");
      final int _cursorIndexOfQuestion3SFGDateWithdrawn = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_sfg_date_withdrawn");
      final int _cursorIndexOfQuestion31InformationNoticeBoardDisplayed = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_1_information_notice_board_displayed");
      final int _cursorIndexOfQuestion3InformationHeadTeacherOfficeDisplayed = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_displayed_head_teacher_office");
      final int _cursorIndexOfQuestion31InformationStaffRoomDisplayed = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_1_information_staff_room");
      final int _cursorIndexOfQuestion31InformationNoteDisplayed = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_2_information_not_displayed");
      final int _cursorIndexOfQuestion32StatementPeriod = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_2_statement_period");
      final int _cursorIndexOfQuestion4Grade1MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_grade_1_male_number");
      final int _cursorIndexOfQuestion4Grade2MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_grade_2_male_number");
      final int _cursorIndexOfQuestion4Grade3MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_grade_3_male_number");
      final int _cursorIndexOfQuestion4Grade4MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_grade_4_male_number");
      final int _cursorIndexOfQuestion4Grade1FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_grade_1_female_number");
      final int _cursorIndexOfQuestion4Grade2FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_grade_2_female_number");
      final int _cursorIndexOfQuestion4Grade3FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_grade_3_female_number");
      final int _cursorIndexOfQuestion4Grade4FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_grade_4_female_number");
      final int _cursorIndexOfQuestion41CurrentTermPerformance = CursorUtil.getColumnIndexOrThrow(_cursor, "question_4_1_current_performance");
      final int _cursorIndexOfQuestion42ReasonAttribute = CursorUtil.getColumnIndexOrThrow(_cursor, "question_4_2_attribute_reason");
      final int _cursorIndexOfQuestion5ToiletNumberBlocks = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_toilet_blocks");
      final int _cursorIndexOfQuestion5ToiletNumberStances = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_toilet_stances");
      final int _cursorIndexOfQuestion5ToiletNumberMaleStancesPupil = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_male_stances_pupil");
      final int _cursorIndexOfQuestion5ToiletNumberFemaleStancesPupil = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_toilet_female_stances_pupil");
      final int _cursorIndexOfQuestion5ToiletNumberMaleStancesTeacher = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_toilet_male_stances_teacher");
      final int _cursorIndexOfQuestion5ToiletNumberStancesFemaleTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_toilet_female_number_stance_teacher");
      final int _cursorIndexOfQuestion5ToiletNumberStancesMixed = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_mixed_stances_number_toilet");
      final int _cursorIndexOfQuestion5ToiletFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_toilet_function");
      final int _cursorIndexOfQuestion5ToiletNoneFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_toilet_none_functional");
      final int _cursorIndexOfQuestion5LatrineNumberBlocks = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_number_blocks_latrine");
      final int _cursorIndexOfQuestion5LatrineNumberStances = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_number_latrine_stances");
      final int _cursorIndexOfQuestion5LatrineNumberStanceMalePupil = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_latrine_number_instances_male_pupil");
      final int _cursorIndexOfQuestion5LatrineNumberStanceFemalePupil = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_number_stances_female_stances_female");
      final int _cursorIndexOfQuestion5LatrineNumberStancesMaleTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_number_stances_male_teachers");
      final int _cursorIndexOfQuestion5LatrineNumberStancesFemaleTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_number_stances_female_teachers");
      final int _cursorIndexOfQuestion5LatrineMixedTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_latrine_mixed_teachers");
      final int _cursorIndexOfQuestion5LatrineFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_latrine_functional");
      final int _cursorIndexOfQuestion5LatrineNoneFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_latrine_none_functional");
      final int _cursorIndexOfQuestion5VIPLatrineNumberBlocks = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_vip_latrine_num_ber_blocks");
      final int _cursorIndexOfQuestion5VIPLatrineNumberStances = CursorUtil.getColumnIndexOrThrow(_cursor, "quest_ion_5_vip_latrine_number_stances");
      final int _cursorIndexOfQuestion5VIPLatrineNumberStancesMalePupil = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_vip_nu_mber_latrine_male_pupil_stances");
      final int _cursorIndexOfQuestion5VIPLatrineNumberStancesFemalePupil = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_vip_num_ber_stance_pupil_female");
      final int _cursorIndexOfQuestion5VIPLatrineNumberStancesMaleTeacher = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_vip_number_stances_ma_le_teacher");
      final int _cursorIndexOfQuestion5VIPLatrineNumberStancesFemaleTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_vip_number_stances_female_teacher_p");
      final int _cursorIndexOfQuestion5VIPLatrineNumberStancesMixedTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_vip_numbe_r_stances_mixed_teachers");
      final int _cursorIndexOfQuestion5VIPLatrineFunction = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_latr_ine_functional");
      final int _cursorIndexOfQuestion5VIPNoneFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_latrine_none_functional_vip");
      final int _cursorIndexOfQuestion5FemaleChangingRoomBlockNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_female_changing_block_number");
      final int _cursorIndexOfQuestion5FemaleChangingRoomStanceNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_female_changing_block_stances  ");
      final int _cursorIndexOfQuestion5FemaleChangingRoomFemaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_female_changing_female_stances");
      final int _cursorIndexOfQuestion5FemaleChangingRoomFemaleTeacher = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_female_changing_room_female_teacher");
      final int _cursorIndexOfQuestion5FemaleChangingRoomMixedTeacher = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_female_changing_mixed_teachers");
      final int _cursorIndexOfQuestion5FemaleChangingRoomFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_female_changing_room_functioal");
      final int _cursorIndexOfQuestion5FemaleChangingRoomNoneFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "question_question_5_female_changing_none_functional");
      final int _cursorIndexOfQuestion5UrinalsForBoysBlockNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_uirinals_for_boys_block_number");
      final int _cursorIndexOfQuestion5UrinalsForBoysNumberStances = CursorUtil.getColumnIndexOrThrow(_cursor, "question_urinals_number_stances");
      final int _cursorIndexOfQuestion5UrinalsForBoysNumberStancesTeacher = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_urinals_for_boys_number_stances_teachers");
      final int _cursorIndexOfQuestion5UrinalsForBoysMixedTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_urinals_for_boys_mixed_teachers");
      final int _cursorIndexOfQuestion5UrinalsForBoysTeacherFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_urinals_for_boys_functional");
      final int _cursorIndexOfQuestion5UrinalsForBoysNoneFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_urinals_for_boys_none_functional");
      final int _cursorIndexOfQuestion5UrinalsForBoysStancesPupil = CursorUtil.getColumnIndexOrThrow(_cursor, "question_5_boys_satnces");
      final int _cursorIndexOfQ5SchoolToiletAccessible = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_5_1_TOILET_ACCESSIBLE");
      final int _cursorIndexOfQ5FunctionalWaterPoint = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_5_3_FUNCTIONAL_OBJECTIVE");
      final int _cursorIndexOfQ5FunctionalWaterPointReasonIfNo = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_5_3_FUNCTIONAL_WATER_POINT_REASON_IF_NO");
      final int _cursorIndexOfQuestion61NumberPermanentClassRooms = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_6_1_PERMANENT_CLASS_ROOM");
      final int _cursorIndexOfQuestion62NumberOfDeskInSchool = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_6_1_NUMBER_OF_DESK");
      final int _cursorIndexOfQuestion63PupilDeskRatio = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_6_3_PUPIL_DESK_RATIO");
      final int _cursorIndexOfQuestion70NumberOfMaleTeacherEnrolled = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_0_NUMBER_MALE_TEACHER_ENROLLED");
      final int _cursorIndexOfQuestion70NumberOfFemaleTeacherEnrolled = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_0_NUMBER_OF_FEMALE_TEACHER_ENROLLED");
      final int _cursorIndexOfQuestion70NumberOfTeachersOnPayroll = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_0_NUMBER_OF_TEACHER_PAYROLL");
      final int _cursorIndexOfQuestion70NumberOfTeachersPresentMale = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_0_NUMBER_OF_TEACHERS_PRESENT");
      final int _cursorIndexOfQuestion70NumberOfFemaleTeacherPresent = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_0_NUMBER_TEACHERS_PRESENT_FEMALE");
      final int _cursorIndexOfQuestion71TeacherPupilRatio = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_1_TEACHER_PUPIL_RATIO");
      final int _cursorIndexOfQuestion72SeniorWomanTeacherYesNo = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_2_SENIOR_WOMAN_TEACHER");
      final int _cursorIndexOfQuestion73SWFOfferSupportHow = CursorUtil.getColumnIndexOrThrow(_cursor, "_SWT_OFFER_SUPPORT)\n");
      final int _cursorIndexOfQuestion8HowOftenSchoolInspectorVisit = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_8_0_HOW_OFTEN_INSPECTOR_VISIT_SCHOOL");
      final int _cursorIndexOfQuestion82LastTimeInspectorVisit = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_8_2_LAST_TIME_INSPECTOR_VISIT");
      final int _cursorIndexOfQuestion83SchoolHaveSchoolManagementCommittee = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_8_3_SCHOOL_HAVE_SCHOOL_MANAGEMENT_COMMITTEE");
      final int _cursorIndexOfQuestion84HowOftenSMCMeet = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_8_4_HOW_OFTEN_SMC_MEET");
      final int _cursorIndexOfQuestion85IsSMCTrained = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_8_5_IS_SMC_TRAINED");
      final int _cursorIndexOfQuestion8ObservationsOrChallenges = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_8_OBERSAVATIONS_OR_CHALLENGES");
      final int _cursorIndexOfIsStoredLocally = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_8_IS_STORED_LOCALLY");
      final List<EducationQuestion> _result = new ArrayList<EducationQuestion>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final EducationQuestion _item;
        _item = new EducationQuestion();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpFinancialYear;
        _tmpFinancialYear = _cursor.getString(_cursorIndexOfFinancialYear);
        _item.setFinancialYear(_tmpFinancialYear);
        final String _tmpDate;
        _tmpDate = _cursor.getString(_cursorIndexOfDate);
        _item.setDate(_tmpDate);
        final String _tmpDistrict;
        _tmpDistrict = _cursor.getString(_cursorIndexOfDistrict);
        _item.setDistrict(_tmpDistrict);
        final String _tmpVillage;
        _tmpVillage = _cursor.getString(_cursorIndexOfVillage);
        _item.setVillage(_tmpVillage);
        final String _tmpParish;
        _tmpParish = _cursor.getString(_cursorIndexOfParish);
        _item.setParish(_tmpParish);
        final String _tmpDivision;
        _tmpDivision = _cursor.getString(_cursorIndexOfDivision);
        _item.setDivision(_tmpDivision);
        final String _tmpFullNames;
        _tmpFullNames = _cursor.getString(_cursorIndexOfFullNames);
        _item.setFullNames(_tmpFullNames);
        final String _tmpTel;
        _tmpTel = _cursor.getString(_cursorIndexOfTel);
        _item.setTel(_tmpTel);
        final String _tmpQuestion1Answer;
        _tmpQuestion1Answer = _cursor.getString(_cursorIndexOfQuestion1Answer);
        _item.setQuestion1Answer(_tmpQuestion1Answer);
        final String _tmpQuestion2SchoolName;
        _tmpQuestion2SchoolName = _cursor.getString(_cursorIndexOfQuestion2SchoolName);
        _item.setQuestion2SchoolName(_tmpQuestion2SchoolName);
        final int _tmpQuestion2MaleTeachers;
        _tmpQuestion2MaleTeachers = _cursor.getInt(_cursorIndexOfQuestion2MaleTeachers);
        _item.setQuestion2MaleTeachers(_tmpQuestion2MaleTeachers);
        final int _tmpQuestion2FeMaleTeachers;
        _tmpQuestion2FeMaleTeachers = _cursor.getInt(_cursorIndexOfQuestion2FeMaleTeachers);
        _item.setQuestion2FeMaleTeachers(_tmpQuestion2FeMaleTeachers);
        final int _tmpQuestion2MalePWDTeachers;
        _tmpQuestion2MalePWDTeachers = _cursor.getInt(_cursorIndexOfQuestion2MalePWDTeachers);
        _item.setQuestion2MalePWDTeachers(_tmpQuestion2MalePWDTeachers);
        final int _tmpQuestion2FemalePWDTeachers;
        _tmpQuestion2FemalePWDTeachers = _cursor.getInt(_cursorIndexOfQuestion2FemalePWDTeachers);
        _item.setQuestion2FemalePWDTeachers(_tmpQuestion2FemalePWDTeachers);
        final int _tmpQuestion2TeachersTotal;
        _tmpQuestion2TeachersTotal = _cursor.getInt(_cursorIndexOfQuestion2TeachersTotal);
        _item.setQuestion2TeachersTotal(_tmpQuestion2TeachersTotal);
        final int _tmpQuestion2MalePupilEnrollment;
        _tmpQuestion2MalePupilEnrollment = _cursor.getInt(_cursorIndexOfQuestion2MalePupilEnrollment);
        _item.setQuestion2MalePupilEnrollment(_tmpQuestion2MalePupilEnrollment);
        final int _tmpQuestion2FeMalePupilEnrollment;
        _tmpQuestion2FeMalePupilEnrollment = _cursor.getInt(_cursorIndexOfQuestion2FeMalePupilEnrollment);
        _item.setQuestion2FeMalePupilEnrollment(_tmpQuestion2FeMalePupilEnrollment);
        final int _tmpQuestion2MalePWDPupilEnrollment;
        _tmpQuestion2MalePWDPupilEnrollment = _cursor.getInt(_cursorIndexOfQuestion2MalePWDPupilEnrollment);
        _item.setQuestion2MalePWDPupilEnrollment(_tmpQuestion2MalePWDPupilEnrollment);
        final int _tmpQuestion2FemalePWDPupilEnrollment;
        _tmpQuestion2FemalePWDPupilEnrollment = _cursor.getInt(_cursorIndexOfQuestion2FemalePWDPupilEnrollment);
        _item.setQuestion2FemalePWDPupilEnrollment(_tmpQuestion2FemalePWDPupilEnrollment);
        final int _tmpQuestion2PupilEnrollmentTotal;
        _tmpQuestion2PupilEnrollmentTotal = _cursor.getInt(_cursorIndexOfQuestion2PupilEnrollmentTotal);
        _item.setQuestion2PupilEnrollmentTotal(_tmpQuestion2PupilEnrollmentTotal);
        final int _tmpQuestion2NumberP7Male;
        _tmpQuestion2NumberP7Male = _cursor.getInt(_cursorIndexOfQuestion2NumberP7Male);
        _item.setQuestion2NumberP7Male(_tmpQuestion2NumberP7Male);
        final int _tmpQuestion2NumberP7FeMale;
        _tmpQuestion2NumberP7FeMale = _cursor.getInt(_cursorIndexOfQuestion2NumberP7FeMale);
        _item.setQuestion2NumberP7FeMale(_tmpQuestion2NumberP7FeMale);
        final int _tmpQuestion2NumberP7MalePWD;
        _tmpQuestion2NumberP7MalePWD = _cursor.getInt(_cursorIndexOfQuestion2NumberP7MalePWD);
        _item.setQuestion2NumberP7MalePWD(_tmpQuestion2NumberP7MalePWD);
        final int _tmpQuestion2NumberP7FeMalePWD;
        _tmpQuestion2NumberP7FeMalePWD = _cursor.getInt(_cursorIndexOfQuestion2NumberP7FeMalePWD);
        _item.setQuestion2NumberP7FeMalePWD(_tmpQuestion2NumberP7FeMalePWD);
        final int _tmpQuestion2NumberP7Total;
        _tmpQuestion2NumberP7Total = _cursor.getInt(_cursorIndexOfQuestion2NumberP7Total);
        _item.setQuestion2NumberP7Total(_tmpQuestion2NumberP7Total);
        final int _tmpQuestion2NumberDropoutMale;
        _tmpQuestion2NumberDropoutMale = _cursor.getInt(_cursorIndexOfQuestion2NumberDropoutMale);
        _item.setQuestion2NumberDropoutMale(_tmpQuestion2NumberDropoutMale);
        final int _tmpQuestion2NumberDropOutFemale;
        _tmpQuestion2NumberDropOutFemale = _cursor.getInt(_cursorIndexOfQuestion2NumberDropOutFemale);
        _item.setQuestion2NumberDropOutFemale(_tmpQuestion2NumberDropOutFemale);
        final int _tmpQuestion2NumberDropoutMalePWD;
        _tmpQuestion2NumberDropoutMalePWD = _cursor.getInt(_cursorIndexOfQuestion2NumberDropoutMalePWD);
        _item.setQuestion2NumberDropoutMalePWD(_tmpQuestion2NumberDropoutMalePWD);
        final int _tmpQuestion2NumberDropOutFemalePWD;
        _tmpQuestion2NumberDropOutFemalePWD = _cursor.getInt(_cursorIndexOfQuestion2NumberDropOutFemalePWD);
        _item.setQuestion2NumberDropOutFemalePWD(_tmpQuestion2NumberDropOutFemalePWD);
        final int _tmpQuestion2NumberDropOutTotal;
        _tmpQuestion2NumberDropOutTotal = _cursor.getInt(_cursorIndexOfQuestion2NumberDropOutTotal);
        _item.setQuestion2NumberDropOutTotal(_tmpQuestion2NumberDropOutTotal);
        final String _tmpQuestion2DropOutReasonIfAny;
        _tmpQuestion2DropOutReasonIfAny = _cursor.getString(_cursorIndexOfQuestion2DropOutReasonIfAny);
        _item.setQuestion2DropOutReasonIfAny(_tmpQuestion2DropOutReasonIfAny);
        final int _tmpQuestion3capitalGrantApprovedBudget;
        _tmpQuestion3capitalGrantApprovedBudget = _cursor.getInt(_cursorIndexOfQuestion3capitalGrantApprovedBudget);
        _item.setQuestion3capitalGrantApprovedBudget(_tmpQuestion3capitalGrantApprovedBudget);
        final int _tmpQuestion3CapitalGrantReleaseBudget;
        _tmpQuestion3CapitalGrantReleaseBudget = _cursor.getInt(_cursorIndexOfQuestion3CapitalGrantReleaseBudget);
        _item.setQuestion3CapitalGrantReleaseBudget(_tmpQuestion3CapitalGrantReleaseBudget);
        final String _tmpQuestion3CapitalReceivedDate;
        _tmpQuestion3CapitalReceivedDate = _cursor.getString(_cursorIndexOfQuestion3CapitalReceivedDate);
        _item.setQuestion3CapitalReceivedDate(_tmpQuestion3CapitalReceivedDate);
        final String _tmpQuestion3CapitalDateWithdrawn;
        _tmpQuestion3CapitalDateWithdrawn = _cursor.getString(_cursorIndexOfQuestion3CapitalDateWithdrawn);
        _item.setQuestion3CapitalDateWithdrawn(_tmpQuestion3CapitalDateWithdrawn);
        final int _tmpQuestion3SFGApprovedBudgetEditText;
        _tmpQuestion3SFGApprovedBudgetEditText = _cursor.getInt(_cursorIndexOfQuestion3SFGApprovedBudgetEditText);
        _item.setQuestion3SFGApprovedBudgetEditText(_tmpQuestion3SFGApprovedBudgetEditText);
        final int _tmpQuestion3SFGBudgetReceived;
        _tmpQuestion3SFGBudgetReceived = _cursor.getInt(_cursorIndexOfQuestion3SFGBudgetReceived);
        _item.setQuestion3SFGBudgetReceived(_tmpQuestion3SFGBudgetReceived);
        final String _tmpQuestion3SFGDateReceived;
        _tmpQuestion3SFGDateReceived = _cursor.getString(_cursorIndexOfQuestion3SFGDateReceived);
        _item.setQuestion3SFGDateReceived(_tmpQuestion3SFGDateReceived);
        final String _tmpQuestion3SFGDateWithdrawn;
        _tmpQuestion3SFGDateWithdrawn = _cursor.getString(_cursorIndexOfQuestion3SFGDateWithdrawn);
        _item.setQuestion3SFGDateWithdrawn(_tmpQuestion3SFGDateWithdrawn);
        final boolean _tmpQuestion31InformationNoticeBoardDisplayed;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfQuestion31InformationNoticeBoardDisplayed);
        _tmpQuestion31InformationNoticeBoardDisplayed = _tmp_1 != 0;
        _item.setQuestion31InformationNoticeBoardDisplayed(_tmpQuestion31InformationNoticeBoardDisplayed);
        final boolean _tmpQuestion3InformationHeadTeacherOfficeDisplayed;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfQuestion3InformationHeadTeacherOfficeDisplayed);
        _tmpQuestion3InformationHeadTeacherOfficeDisplayed = _tmp_2 != 0;
        _item.setQuestion3InformationHeadTeacherOfficeDisplayed(_tmpQuestion3InformationHeadTeacherOfficeDisplayed);
        final boolean _tmpQuestion31InformationStaffRoomDisplayed;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfQuestion31InformationStaffRoomDisplayed);
        _tmpQuestion31InformationStaffRoomDisplayed = _tmp_3 != 0;
        _item.setQuestion31InformationStaffRoomDisplayed(_tmpQuestion31InformationStaffRoomDisplayed);
        final boolean _tmpQuestion31InformationNoteDisplayed;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfQuestion31InformationNoteDisplayed);
        _tmpQuestion31InformationNoteDisplayed = _tmp_4 != 0;
        _item.setQuestion31InformationNoteDisplayed(_tmpQuestion31InformationNoteDisplayed);
        final String _tmpQuestion32StatementPeriod;
        _tmpQuestion32StatementPeriod = _cursor.getString(_cursorIndexOfQuestion32StatementPeriod);
        _item.setQuestion32StatementPeriod(_tmpQuestion32StatementPeriod);
        final int _tmpQuestion4Grade1MaleNumber;
        _tmpQuestion4Grade1MaleNumber = _cursor.getInt(_cursorIndexOfQuestion4Grade1MaleNumber);
        _item.setQuestion4Grade1MaleNumber(_tmpQuestion4Grade1MaleNumber);
        final int _tmpQuestion4Grade2MaleNumber;
        _tmpQuestion4Grade2MaleNumber = _cursor.getInt(_cursorIndexOfQuestion4Grade2MaleNumber);
        _item.setQuestion4Grade2MaleNumber(_tmpQuestion4Grade2MaleNumber);
        final int _tmpQuestion4Grade3MaleNumber;
        _tmpQuestion4Grade3MaleNumber = _cursor.getInt(_cursorIndexOfQuestion4Grade3MaleNumber);
        _item.setQuestion4Grade3MaleNumber(_tmpQuestion4Grade3MaleNumber);
        final int _tmpQuestion4Grade4MaleNumber;
        _tmpQuestion4Grade4MaleNumber = _cursor.getInt(_cursorIndexOfQuestion4Grade4MaleNumber);
        _item.setQuestion4Grade4MaleNumber(_tmpQuestion4Grade4MaleNumber);
        final int _tmpQuestion4Grade1FemaleNumber;
        _tmpQuestion4Grade1FemaleNumber = _cursor.getInt(_cursorIndexOfQuestion4Grade1FemaleNumber);
        _item.setQuestion4Grade1FemaleNumber(_tmpQuestion4Grade1FemaleNumber);
        final int _tmpQuestion4Grade2FemaleNumber;
        _tmpQuestion4Grade2FemaleNumber = _cursor.getInt(_cursorIndexOfQuestion4Grade2FemaleNumber);
        _item.setQuestion4Grade2FemaleNumber(_tmpQuestion4Grade2FemaleNumber);
        final int _tmpQuestion4Grade3FemaleNumber;
        _tmpQuestion4Grade3FemaleNumber = _cursor.getInt(_cursorIndexOfQuestion4Grade3FemaleNumber);
        _item.setQuestion4Grade3FemaleNumber(_tmpQuestion4Grade3FemaleNumber);
        final int _tmpQuestion4Grade4FemaleNumber;
        _tmpQuestion4Grade4FemaleNumber = _cursor.getInt(_cursorIndexOfQuestion4Grade4FemaleNumber);
        _item.setQuestion4Grade4FemaleNumber(_tmpQuestion4Grade4FemaleNumber);
        final String _tmpQuestion41CurrentTermPerformance;
        _tmpQuestion41CurrentTermPerformance = _cursor.getString(_cursorIndexOfQuestion41CurrentTermPerformance);
        _item.setQuestion41CurrentTermPerformance(_tmpQuestion41CurrentTermPerformance);
        final String _tmpQuestion42ReasonAttribute;
        _tmpQuestion42ReasonAttribute = _cursor.getString(_cursorIndexOfQuestion42ReasonAttribute);
        _item.setQuestion42ReasonAttribute(_tmpQuestion42ReasonAttribute);
        final int _tmpQuestion5ToiletNumberBlocks;
        _tmpQuestion5ToiletNumberBlocks = _cursor.getInt(_cursorIndexOfQuestion5ToiletNumberBlocks);
        _item.setQuestion5ToiletNumberBlocks(_tmpQuestion5ToiletNumberBlocks);
        final int _tmpQuestion5ToiletNumberStances;
        _tmpQuestion5ToiletNumberStances = _cursor.getInt(_cursorIndexOfQuestion5ToiletNumberStances);
        _item.setQuestion5ToiletNumberStances(_tmpQuestion5ToiletNumberStances);
        final int _tmpQuestion5ToiletNumberMaleStancesPupil;
        _tmpQuestion5ToiletNumberMaleStancesPupil = _cursor.getInt(_cursorIndexOfQuestion5ToiletNumberMaleStancesPupil);
        _item.setQuestion5ToiletNumberMaleStancesPupil(_tmpQuestion5ToiletNumberMaleStancesPupil);
        final int _tmpQuestion5ToiletNumberFemaleStancesPupil;
        _tmpQuestion5ToiletNumberFemaleStancesPupil = _cursor.getInt(_cursorIndexOfQuestion5ToiletNumberFemaleStancesPupil);
        _item.setQuestion5ToiletNumberFemaleStancesPupil(_tmpQuestion5ToiletNumberFemaleStancesPupil);
        final int _tmpQuestion5ToiletNumberMaleStancesTeacher;
        _tmpQuestion5ToiletNumberMaleStancesTeacher = _cursor.getInt(_cursorIndexOfQuestion5ToiletNumberMaleStancesTeacher);
        _item.setQuestion5ToiletNumberMaleStancesTeacher(_tmpQuestion5ToiletNumberMaleStancesTeacher);
        final int _tmpQuestion5ToiletNumberStancesFemaleTeachers;
        _tmpQuestion5ToiletNumberStancesFemaleTeachers = _cursor.getInt(_cursorIndexOfQuestion5ToiletNumberStancesFemaleTeachers);
        _item.setQuestion5ToiletNumberStancesFemaleTeachers(_tmpQuestion5ToiletNumberStancesFemaleTeachers);
        final int _tmpQuestion5ToiletNumberStancesMixed;
        _tmpQuestion5ToiletNumberStancesMixed = _cursor.getInt(_cursorIndexOfQuestion5ToiletNumberStancesMixed);
        _item.setQuestion5ToiletNumberStancesMixed(_tmpQuestion5ToiletNumberStancesMixed);
        final int _tmpQuestion5ToiletFunctional;
        _tmpQuestion5ToiletFunctional = _cursor.getInt(_cursorIndexOfQuestion5ToiletFunctional);
        _item.setQuestion5ToiletFunctional(_tmpQuestion5ToiletFunctional);
        final int _tmpQuestion5ToiletNoneFunctional;
        _tmpQuestion5ToiletNoneFunctional = _cursor.getInt(_cursorIndexOfQuestion5ToiletNoneFunctional);
        _item.setQuestion5ToiletNoneFunctional(_tmpQuestion5ToiletNoneFunctional);
        final int _tmpQuestion5LatrineNumberBlocks;
        _tmpQuestion5LatrineNumberBlocks = _cursor.getInt(_cursorIndexOfQuestion5LatrineNumberBlocks);
        _item.setQuestion5LatrineNumberBlocks(_tmpQuestion5LatrineNumberBlocks);
        final int _tmpQuestion5LatrineNumberStances;
        _tmpQuestion5LatrineNumberStances = _cursor.getInt(_cursorIndexOfQuestion5LatrineNumberStances);
        _item.setQuestion5LatrineNumberStances(_tmpQuestion5LatrineNumberStances);
        final int _tmpQuestion5LatrineNumberStanceMalePupil;
        _tmpQuestion5LatrineNumberStanceMalePupil = _cursor.getInt(_cursorIndexOfQuestion5LatrineNumberStanceMalePupil);
        _item.setQuestion5LatrineNumberStanceMalePupil(_tmpQuestion5LatrineNumberStanceMalePupil);
        final int _tmpQuestion5LatrineNumberStanceFemalePupil;
        _tmpQuestion5LatrineNumberStanceFemalePupil = _cursor.getInt(_cursorIndexOfQuestion5LatrineNumberStanceFemalePupil);
        _item.setQuestion5LatrineNumberStanceFemalePupil(_tmpQuestion5LatrineNumberStanceFemalePupil);
        final int _tmpQuestion5LatrineNumberStancesMaleTeachers;
        _tmpQuestion5LatrineNumberStancesMaleTeachers = _cursor.getInt(_cursorIndexOfQuestion5LatrineNumberStancesMaleTeachers);
        _item.setQuestion5LatrineNumberStancesMaleTeachers(_tmpQuestion5LatrineNumberStancesMaleTeachers);
        final int _tmpQuestion5LatrineNumberStancesFemaleTeachers;
        _tmpQuestion5LatrineNumberStancesFemaleTeachers = _cursor.getInt(_cursorIndexOfQuestion5LatrineNumberStancesFemaleTeachers);
        _item.setQuestion5LatrineNumberStancesFemaleTeachers(_tmpQuestion5LatrineNumberStancesFemaleTeachers);
        final int _tmpQuestion5LatrineMixedTeachers;
        _tmpQuestion5LatrineMixedTeachers = _cursor.getInt(_cursorIndexOfQuestion5LatrineMixedTeachers);
        _item.setQuestion5LatrineMixedTeachers(_tmpQuestion5LatrineMixedTeachers);
        final int _tmpQuestion5LatrineFunctional;
        _tmpQuestion5LatrineFunctional = _cursor.getInt(_cursorIndexOfQuestion5LatrineFunctional);
        _item.setQuestion5LatrineFunctional(_tmpQuestion5LatrineFunctional);
        final int _tmpQuestion5LatrineNoneFunctional;
        _tmpQuestion5LatrineNoneFunctional = _cursor.getInt(_cursorIndexOfQuestion5LatrineNoneFunctional);
        _item.setQuestion5LatrineNoneFunctional(_tmpQuestion5LatrineNoneFunctional);
        final int _tmpQuestion5VIPLatrineNumberBlocks;
        _tmpQuestion5VIPLatrineNumberBlocks = _cursor.getInt(_cursorIndexOfQuestion5VIPLatrineNumberBlocks);
        _item.setQuestion5VIPLatrineNumberBlocks(_tmpQuestion5VIPLatrineNumberBlocks);
        final int _tmpQuestion5VIPLatrineNumberStances;
        _tmpQuestion5VIPLatrineNumberStances = _cursor.getInt(_cursorIndexOfQuestion5VIPLatrineNumberStances);
        _item.setQuestion5VIPLatrineNumberStances(_tmpQuestion5VIPLatrineNumberStances);
        final int _tmpQuestion5VIPLatrineNumberStancesMalePupil;
        _tmpQuestion5VIPLatrineNumberStancesMalePupil = _cursor.getInt(_cursorIndexOfQuestion5VIPLatrineNumberStancesMalePupil);
        _item.setQuestion5VIPLatrineNumberStancesMalePupil(_tmpQuestion5VIPLatrineNumberStancesMalePupil);
        final int _tmpQuestion5VIPLatrineNumberStancesFemalePupil;
        _tmpQuestion5VIPLatrineNumberStancesFemalePupil = _cursor.getInt(_cursorIndexOfQuestion5VIPLatrineNumberStancesFemalePupil);
        _item.setQuestion5VIPLatrineNumberStancesFemalePupil(_tmpQuestion5VIPLatrineNumberStancesFemalePupil);
        final int _tmpQuestion5VIPLatrineNumberStancesMaleTeacher;
        _tmpQuestion5VIPLatrineNumberStancesMaleTeacher = _cursor.getInt(_cursorIndexOfQuestion5VIPLatrineNumberStancesMaleTeacher);
        _item.setQuestion5VIPLatrineNumberStancesMaleTeacher(_tmpQuestion5VIPLatrineNumberStancesMaleTeacher);
        final int _tmpQuestion5VIPLatrineNumberStancesFemaleTeachers;
        _tmpQuestion5VIPLatrineNumberStancesFemaleTeachers = _cursor.getInt(_cursorIndexOfQuestion5VIPLatrineNumberStancesFemaleTeachers);
        _item.setQuestion5VIPLatrineNumberStancesFemaleTeachers(_tmpQuestion5VIPLatrineNumberStancesFemaleTeachers);
        final int _tmpQuestion5VIPLatrineNumberStancesMixedTeachers;
        _tmpQuestion5VIPLatrineNumberStancesMixedTeachers = _cursor.getInt(_cursorIndexOfQuestion5VIPLatrineNumberStancesMixedTeachers);
        _item.setQuestion5VIPLatrineNumberStancesMixedTeachers(_tmpQuestion5VIPLatrineNumberStancesMixedTeachers);
        final int _tmpQuestion5VIPLatrineFunction;
        _tmpQuestion5VIPLatrineFunction = _cursor.getInt(_cursorIndexOfQuestion5VIPLatrineFunction);
        _item.setQuestion5VIPLatrineFunction(_tmpQuestion5VIPLatrineFunction);
        final int _tmpQuestion5VIPNoneFunctional;
        _tmpQuestion5VIPNoneFunctional = _cursor.getInt(_cursorIndexOfQuestion5VIPNoneFunctional);
        _item.setQuestion5VIPNoneFunctional(_tmpQuestion5VIPNoneFunctional);
        final int _tmpQuestion5FemaleChangingRoomBlockNumber;
        _tmpQuestion5FemaleChangingRoomBlockNumber = _cursor.getInt(_cursorIndexOfQuestion5FemaleChangingRoomBlockNumber);
        _item.setQuestion5FemaleChangingRoomBlockNumber(_tmpQuestion5FemaleChangingRoomBlockNumber);
        final int _tmpQuestion5FemaleChangingRoomStanceNumber;
        _tmpQuestion5FemaleChangingRoomStanceNumber = _cursor.getInt(_cursorIndexOfQuestion5FemaleChangingRoomStanceNumber);
        _item.setQuestion5FemaleChangingRoomStanceNumber(_tmpQuestion5FemaleChangingRoomStanceNumber);
        final int _tmpQuestion5FemaleChangingRoomFemaleStances;
        _tmpQuestion5FemaleChangingRoomFemaleStances = _cursor.getInt(_cursorIndexOfQuestion5FemaleChangingRoomFemaleStances);
        _item.setQuestion5FemaleChangingRoomFemaleStances(_tmpQuestion5FemaleChangingRoomFemaleStances);
        final int _tmpQuestion5FemaleChangingRoomFemaleTeacher;
        _tmpQuestion5FemaleChangingRoomFemaleTeacher = _cursor.getInt(_cursorIndexOfQuestion5FemaleChangingRoomFemaleTeacher);
        _item.setQuestion5FemaleChangingRoomFemaleTeacher(_tmpQuestion5FemaleChangingRoomFemaleTeacher);
        final int _tmpQuestion5FemaleChangingRoomMixedTeacher;
        _tmpQuestion5FemaleChangingRoomMixedTeacher = _cursor.getInt(_cursorIndexOfQuestion5FemaleChangingRoomMixedTeacher);
        _item.setQuestion5FemaleChangingRoomMixedTeacher(_tmpQuestion5FemaleChangingRoomMixedTeacher);
        final int _tmpQuestion5FemaleChangingRoomFunctional;
        _tmpQuestion5FemaleChangingRoomFunctional = _cursor.getInt(_cursorIndexOfQuestion5FemaleChangingRoomFunctional);
        _item.setQuestion5FemaleChangingRoomFunctional(_tmpQuestion5FemaleChangingRoomFunctional);
        final int _tmpQuestion5FemaleChangingRoomNoneFunctional;
        _tmpQuestion5FemaleChangingRoomNoneFunctional = _cursor.getInt(_cursorIndexOfQuestion5FemaleChangingRoomNoneFunctional);
        _item.setQuestion5FemaleChangingRoomNoneFunctional(_tmpQuestion5FemaleChangingRoomNoneFunctional);
        final int _tmpQuestion5UrinalsForBoysBlockNumber;
        _tmpQuestion5UrinalsForBoysBlockNumber = _cursor.getInt(_cursorIndexOfQuestion5UrinalsForBoysBlockNumber);
        _item.setQuestion5UrinalsForBoysBlockNumber(_tmpQuestion5UrinalsForBoysBlockNumber);
        final int _tmpQuestion5UrinalsForBoysNumberStances;
        _tmpQuestion5UrinalsForBoysNumberStances = _cursor.getInt(_cursorIndexOfQuestion5UrinalsForBoysNumberStances);
        _item.setQuestion5UrinalsForBoysNumberStances(_tmpQuestion5UrinalsForBoysNumberStances);
        final int _tmpQuestion5UrinalsForBoysNumberStancesTeacher;
        _tmpQuestion5UrinalsForBoysNumberStancesTeacher = _cursor.getInt(_cursorIndexOfQuestion5UrinalsForBoysNumberStancesTeacher);
        _item.setQuestion5UrinalsForBoysNumberStancesTeacher(_tmpQuestion5UrinalsForBoysNumberStancesTeacher);
        final int _tmpQuestion5UrinalsForBoysMixedTeachers;
        _tmpQuestion5UrinalsForBoysMixedTeachers = _cursor.getInt(_cursorIndexOfQuestion5UrinalsForBoysMixedTeachers);
        _item.setQuestion5UrinalsForBoysMixedTeachers(_tmpQuestion5UrinalsForBoysMixedTeachers);
        final int _tmpQuestion5UrinalsForBoysTeacherFunctional;
        _tmpQuestion5UrinalsForBoysTeacherFunctional = _cursor.getInt(_cursorIndexOfQuestion5UrinalsForBoysTeacherFunctional);
        _item.setQuestion5UrinalsForBoysTeacherFunctional(_tmpQuestion5UrinalsForBoysTeacherFunctional);
        final int _tmpQuestion5UrinalsForBoysNoneFunctional;
        _tmpQuestion5UrinalsForBoysNoneFunctional = _cursor.getInt(_cursorIndexOfQuestion5UrinalsForBoysNoneFunctional);
        _item.setQuestion5UrinalsForBoysNoneFunctional(_tmpQuestion5UrinalsForBoysNoneFunctional);
        final int _tmpQuestion5UrinalsForBoysStancesPupil;
        _tmpQuestion5UrinalsForBoysStancesPupil = _cursor.getInt(_cursorIndexOfQuestion5UrinalsForBoysStancesPupil);
        _item.setQuestion5UrinalsForBoysStancesPupil(_tmpQuestion5UrinalsForBoysStancesPupil);
        final boolean _tmpQ5SchoolToiletAccessible;
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfQ5SchoolToiletAccessible);
        _tmpQ5SchoolToiletAccessible = _tmp_5 != 0;
        _item.setQ5SchoolToiletAccessible(_tmpQ5SchoolToiletAccessible);
        final boolean _tmpQ5FunctionalWaterPoint;
        final int _tmp_6;
        _tmp_6 = _cursor.getInt(_cursorIndexOfQ5FunctionalWaterPoint);
        _tmpQ5FunctionalWaterPoint = _tmp_6 != 0;
        _item.setQ5FunctionalWaterPoint(_tmpQ5FunctionalWaterPoint);
        final String _tmpQ5FunctionalWaterPointReasonIfNo;
        _tmpQ5FunctionalWaterPointReasonIfNo = _cursor.getString(_cursorIndexOfQ5FunctionalWaterPointReasonIfNo);
        _item.setQ5FunctionalWaterPointReasonIfNo(_tmpQ5FunctionalWaterPointReasonIfNo);
        final int _tmpQuestion61NumberPermanentClassRooms;
        _tmpQuestion61NumberPermanentClassRooms = _cursor.getInt(_cursorIndexOfQuestion61NumberPermanentClassRooms);
        _item.setQuestion61NumberPermanentClassRooms(_tmpQuestion61NumberPermanentClassRooms);
        final int _tmpQuestion62NumberOfDeskInSchool;
        _tmpQuestion62NumberOfDeskInSchool = _cursor.getInt(_cursorIndexOfQuestion62NumberOfDeskInSchool);
        _item.setQuestion62NumberOfDeskInSchool(_tmpQuestion62NumberOfDeskInSchool);
        final String _tmpQuestion63PupilDeskRatio;
        _tmpQuestion63PupilDeskRatio = _cursor.getString(_cursorIndexOfQuestion63PupilDeskRatio);
        _item.setQuestion63PupilDeskRatio(_tmpQuestion63PupilDeskRatio);
        final int _tmpQuestion70NumberOfMaleTeacherEnrolled;
        _tmpQuestion70NumberOfMaleTeacherEnrolled = _cursor.getInt(_cursorIndexOfQuestion70NumberOfMaleTeacherEnrolled);
        _item.setQuestion70NumberOfMaleTeacherEnrolled(_tmpQuestion70NumberOfMaleTeacherEnrolled);
        final int _tmpQuestion70NumberOfFemaleTeacherEnrolled;
        _tmpQuestion70NumberOfFemaleTeacherEnrolled = _cursor.getInt(_cursorIndexOfQuestion70NumberOfFemaleTeacherEnrolled);
        _item.setQuestion70NumberOfFemaleTeacherEnrolled(_tmpQuestion70NumberOfFemaleTeacherEnrolled);
        final int _tmpQuestion70NumberOfTeachersOnPayroll;
        _tmpQuestion70NumberOfTeachersOnPayroll = _cursor.getInt(_cursorIndexOfQuestion70NumberOfTeachersOnPayroll);
        _item.setQuestion70NumberOfTeachersOnPayroll(_tmpQuestion70NumberOfTeachersOnPayroll);
        final int _tmpQuestion70NumberOfTeachersPresentMale;
        _tmpQuestion70NumberOfTeachersPresentMale = _cursor.getInt(_cursorIndexOfQuestion70NumberOfTeachersPresentMale);
        _item.setQuestion70NumberOfTeachersPresentMale(_tmpQuestion70NumberOfTeachersPresentMale);
        final int _tmpQuestion70NumberOfFemaleTeacherPresent;
        _tmpQuestion70NumberOfFemaleTeacherPresent = _cursor.getInt(_cursorIndexOfQuestion70NumberOfFemaleTeacherPresent);
        _item.setQuestion70NumberOfFemaleTeacherPresent(_tmpQuestion70NumberOfFemaleTeacherPresent);
        final String _tmpQuestion71TeacherPupilRatio;
        _tmpQuestion71TeacherPupilRatio = _cursor.getString(_cursorIndexOfQuestion71TeacherPupilRatio);
        _item.setQuestion71TeacherPupilRatio(_tmpQuestion71TeacherPupilRatio);
        final boolean _tmpQuestion72SeniorWomanTeacherYesNo;
        final int _tmp_7;
        _tmp_7 = _cursor.getInt(_cursorIndexOfQuestion72SeniorWomanTeacherYesNo);
        _tmpQuestion72SeniorWomanTeacherYesNo = _tmp_7 != 0;
        _item.setQuestion72SeniorWomanTeacherYesNo(_tmpQuestion72SeniorWomanTeacherYesNo);
        final String _tmpQuestion73SWFOfferSupportHow;
        _tmpQuestion73SWFOfferSupportHow = _cursor.getString(_cursorIndexOfQuestion73SWFOfferSupportHow);
        _item.setQuestion73SWFOfferSupportHow(_tmpQuestion73SWFOfferSupportHow);
        final String _tmpQuestion8HowOftenSchoolInspectorVisit;
        _tmpQuestion8HowOftenSchoolInspectorVisit = _cursor.getString(_cursorIndexOfQuestion8HowOftenSchoolInspectorVisit);
        _item.setQuestion8HowOftenSchoolInspectorVisit(_tmpQuestion8HowOftenSchoolInspectorVisit);
        final String _tmpQuestion82LastTimeInspectorVisit;
        _tmpQuestion82LastTimeInspectorVisit = _cursor.getString(_cursorIndexOfQuestion82LastTimeInspectorVisit);
        _item.setQuestion82LastTimeInspectorVisit(_tmpQuestion82LastTimeInspectorVisit);
        final boolean _tmpQuestion83SchoolHaveSchoolManagementCommittee;
        final int _tmp_8;
        _tmp_8 = _cursor.getInt(_cursorIndexOfQuestion83SchoolHaveSchoolManagementCommittee);
        _tmpQuestion83SchoolHaveSchoolManagementCommittee = _tmp_8 != 0;
        _item.setQuestion83SchoolHaveSchoolManagementCommittee(_tmpQuestion83SchoolHaveSchoolManagementCommittee);
        final String _tmpQuestion84HowOftenSMCMeet;
        _tmpQuestion84HowOftenSMCMeet = _cursor.getString(_cursorIndexOfQuestion84HowOftenSMCMeet);
        _item.setQuestion84HowOftenSMCMeet(_tmpQuestion84HowOftenSMCMeet);
        final String _tmpQuestion85IsSMCTrained;
        _tmpQuestion85IsSMCTrained = _cursor.getString(_cursorIndexOfQuestion85IsSMCTrained);
        _item.setQuestion85IsSMCTrained(_tmpQuestion85IsSMCTrained);
        final String _tmpQuestion8ObservationsOrChallenges;
        _tmpQuestion8ObservationsOrChallenges = _cursor.getString(_cursorIndexOfQuestion8ObservationsOrChallenges);
        _item.setQuestion8ObservationsOrChallenges(_tmpQuestion8ObservationsOrChallenges);
        final boolean _tmpIsStoredLocally;
        final int _tmp_9;
        _tmp_9 = _cursor.getInt(_cursorIndexOfIsStoredLocally);
        _tmpIsStoredLocally = _tmp_9 != 0;
        _item.setStoredLocally(_tmpIsStoredLocally);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
