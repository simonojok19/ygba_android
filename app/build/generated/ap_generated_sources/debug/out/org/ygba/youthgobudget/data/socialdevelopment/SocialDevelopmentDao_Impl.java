package org.ygba.youthgobudget.data.socialdevelopment;

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
public final class SocialDevelopmentDao_Impl implements SocialDevelopmentDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SocialDevelopmentQuestion> __insertionAdapterOfSocialDevelopmentQuestion;

  public SocialDevelopmentDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSocialDevelopmentQuestion = new EntityInsertionAdapter<SocialDevelopmentQuestion>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `social_dev` (`id`,`financial_year`,`date`,`district`,`village`,`parish`,`division`,`agent_name`,`tel`,`q2_com_expec`,`q2_com_received`,`q2_com_date_received`,`q2_com_date_withdrawn`,`q2_others_expected`,`q2_others_amount_received`,`q2_others_date_received`,`q2_others_date_withdrawn`,`q3_w_e_objective`,`q3_w_e_objective_reason`,`q3_w_g_1_name`,`q3_w_g_1_village`,`q3_w_g_1_m_numbers`,`q3_w_g_1_f_numbers`,`q3_w_g_1_a_received`,`q3_w_g_2_name`,`q3_w_g_2_village`,`q3_w_g_2_m_numbers`,`q3_w_g_2_f_numbers`,`q3_w_g_2_a_received`,`q3_w_g_3_name`,`q3_w_g_3_village`,`q3_w_g_3_m_numbers`,`q3_w_g_3_f_numbers`,`q3_w_g_3_a_received`,`q3_w_g_4_name`,`q3_w_g_4_village`,`q3_w_g_4_m_numbers`,`q3_w_g_4_f_numbers`,`q3_w_g_4_a_received`,`q3_w_g_5_name`,`q3_w_g_5_village`,`q3_w_g_5_m_numbers`,`q3_w_g_5_f_numbers`,`q3_w_g_5_a_received`,`q3_w_g_6_name`,`q3_w_g_6_village`,`q3_w_g_6_m_numbers`,`q3_w_g_6_f_numbers`,`q3_w_g_6_a_received`,`q3_w_g_7_name`,`q3_w_g_7_village`,`q3_w_g_7_m_numbers`,`q3_w_g_7_f_numbers`,`q3_w_g_7_a_received`,`q5_li_obj`,`q5_li_obj_reason`,`q4_y_g_1_name`,`q4_Y_g_1_village`,`q4_Y_g_1_m_numbers`,`q4_Y_g_1_f_numbers`,`q4_Y_g_1_a_received`,`q4_Y_g_2_name`,`q4_Y_g_2_village`,`q4_Y_g_2_m_numbers`,`q4_Y_g_2_f_numbers`,`q4_Y_g_2_a_received`,`q4_Y_g_3_name`,`q4_Y_g_3_village`,`q4_Y_g_3_m_numbers`,`q4_4_g_3_f_numbers`,`q4_Y_g_3_a_received`,`q4_Y_g_4_name`,`q4_Y_g_4_village`,`q4_Y_g_4_m_numbers`,`q4_Y_g_4_f_numbers`,`q4_Y_g_4_a_received`,`q4_Y_g_5_name`,`q4_Y_g_5_village`,`q4_Y_g_5_m_numbers`,`q4_Y_g_5_f_numbers`,`q4_Y_g_5_a_received`,`q4_6_g_6_name`,`q5_Y_g_6_village`,`q4_Y_g_6_m_numbers`,`Q4_Y_g_6_f_numbers`,`q4_Y_g_6_a_received`,`q4_Y_g_7_name`,`q4_Y_g_7_village`,`q4_Y_g_7_m_numbers`,`q4_Y_g_7_f_numbers`,`q4_Y_g_7_a_received`,`q5_number_m_trained`,`q5_number_f_trained`,`q6_com_g_formed`,`q7_others_challenges`,`locally_stored`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SocialDevelopmentQuestion value) {
        stmt.bindLong(1, value.getPrimaryKey());
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
        if (value.getYgbaAgentFullName() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getYgbaAgentFullName());
        }
        if (value.getYgbaTel() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getYgbaTel());
        }
        if (value.getQ2CommunityExpected() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getQ2CommunityExpected());
        }
        if (value.getQ2CommunityAmountReceived() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getQ2CommunityAmountReceived());
        }
        if (value.getQ2CommunityDateReceived() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getQ2CommunityDateReceived());
        }
        if (value.getQ2CommunityDateWithdrawn() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getQ2CommunityDateWithdrawn());
        }
        if (value.getQ2OtherExpectedAmount() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getQ2OtherExpectedAmount());
        }
        if (value.getQ2OtherAmountedReceived() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getQ2OtherAmountedReceived());
        }
        if (value.getQ2OthersDateReceived() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getQ2OthersDateReceived());
        }
        if (value.getQ2OthersDateWithdrawn() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getQ2OthersDateWithdrawn());
        }
        if (value.getQ3WomenEmpowermentObjective() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getQ3WomenEmpowermentObjective());
        }
        if (value.getQ3WomenEmpowermentObjectiveReason() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getQ3WomenEmpowermentObjectiveReason());
        }
        if (value.getQ3WomanGroup1Name() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getQ3WomanGroup1Name());
        }
        if (value.getQ3WomenGroup1Village() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getQ3WomenGroup1Village());
        }
        if (value.getQ3WomenGroup1MaleNumber() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getQ3WomenGroup1MaleNumber());
        }
        if (value.getQ3WomenGroup1FemaleNumber() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getQ3WomenGroup1FemaleNumber());
        }
        if (value.getQ3WomenGroup1AmountReceived() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getQ3WomenGroup1AmountReceived());
        }
        if (value.getQ3WomanGroup2Name() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getQ3WomanGroup2Name());
        }
        if (value.getQ3WomenGroup2Village() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getQ3WomenGroup2Village());
        }
        if (value.getQ3WomenGroup2MaleNumber() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getQ3WomenGroup2MaleNumber());
        }
        if (value.getQ3WomenGroup2FemaleNumber() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getQ3WomenGroup2FemaleNumber());
        }
        if (value.getQ3WomenGroup2AmountReceived() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getQ3WomenGroup2AmountReceived());
        }
        if (value.getQ3WomanGroup3Name() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getQ3WomanGroup3Name());
        }
        if (value.getQ3WomenGroup3Village() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getQ3WomenGroup3Village());
        }
        if (value.getQ3WomenGroup3MaleNumber() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getQ3WomenGroup3MaleNumber());
        }
        if (value.getQ3WomenGroup3FemaleNumber() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.getQ3WomenGroup3FemaleNumber());
        }
        if (value.getQ3WomenGroup3AmountReceived() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getQ3WomenGroup3AmountReceived());
        }
        if (value.getQ3WomanGroup4Name() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getQ3WomanGroup4Name());
        }
        if (value.getQ3WomenGroup4Village() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getQ3WomenGroup4Village());
        }
        if (value.getQ3WomenGroup4MaleNumber() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getQ3WomenGroup4MaleNumber());
        }
        if (value.getQ3WomenGroup4FemaleNumber() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.getQ3WomenGroup4FemaleNumber());
        }
        if (value.getQ3WomenGroup4AmountReceived() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getQ3WomenGroup4AmountReceived());
        }
        if (value.getQ3WomanGroup5Name() == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.getQ3WomanGroup5Name());
        }
        if (value.getQ3WomenGroup5Village() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getQ3WomenGroup5Village());
        }
        if (value.getQ3WomenGroup5MaleNumber() == null) {
          stmt.bindNull(42);
        } else {
          stmt.bindString(42, value.getQ3WomenGroup5MaleNumber());
        }
        if (value.getQ3WomenGroup5FemaleNumber() == null) {
          stmt.bindNull(43);
        } else {
          stmt.bindString(43, value.getQ3WomenGroup5FemaleNumber());
        }
        if (value.getQ3WomenGroup5AmountReceived() == null) {
          stmt.bindNull(44);
        } else {
          stmt.bindString(44, value.getQ3WomenGroup5AmountReceived());
        }
        if (value.getQ3WomanGroup6Name() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindString(45, value.getQ3WomanGroup6Name());
        }
        if (value.getQ3WomenGroup6Village() == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindString(46, value.getQ3WomenGroup6Village());
        }
        if (value.getQ3WomenGroup6MaleNumber() == null) {
          stmt.bindNull(47);
        } else {
          stmt.bindString(47, value.getQ3WomenGroup6MaleNumber());
        }
        if (value.getQ3WomenGroup6FemaleNumber() == null) {
          stmt.bindNull(48);
        } else {
          stmt.bindString(48, value.getQ3WomenGroup6FemaleNumber());
        }
        if (value.getQ3WomenGroup6AmountReceived() == null) {
          stmt.bindNull(49);
        } else {
          stmt.bindString(49, value.getQ3WomenGroup6AmountReceived());
        }
        if (value.getQ3WomanGroup7Name() == null) {
          stmt.bindNull(50);
        } else {
          stmt.bindString(50, value.getQ3WomanGroup7Name());
        }
        if (value.getQ3WomenGroup7Village() == null) {
          stmt.bindNull(51);
        } else {
          stmt.bindString(51, value.getQ3WomenGroup7Village());
        }
        if (value.getQ3WomenGroup7MaleNumber() == null) {
          stmt.bindNull(52);
        } else {
          stmt.bindString(52, value.getQ3WomenGroup7MaleNumber());
        }
        if (value.getQ3WomenGroup7FemaleNumber() == null) {
          stmt.bindNull(53);
        } else {
          stmt.bindString(53, value.getQ3WomenGroup7FemaleNumber());
        }
        if (value.getQ3WomenGroup7AmountReceived() == null) {
          stmt.bindNull(54);
        } else {
          stmt.bindString(54, value.getQ3WomenGroup7AmountReceived());
        }
        if (value.getQ4LivelihoodObjective() == null) {
          stmt.bindNull(55);
        } else {
          stmt.bindString(55, value.getQ4LivelihoodObjective());
        }
        if (value.getQ4LivelihoodObjectiveReason() == null) {
          stmt.bindNull(56);
        } else {
          stmt.bindString(56, value.getQ4LivelihoodObjectiveReason());
        }
        if (value.getQ4YouthGroup1Name() == null) {
          stmt.bindNull(57);
        } else {
          stmt.bindString(57, value.getQ4YouthGroup1Name());
        }
        if (value.getQ4YouthGroup1Village() == null) {
          stmt.bindNull(58);
        } else {
          stmt.bindString(58, value.getQ4YouthGroup1Village());
        }
        if (value.getQ4YouthGroup1MaleNumber() == null) {
          stmt.bindNull(59);
        } else {
          stmt.bindString(59, value.getQ4YouthGroup1MaleNumber());
        }
        if (value.getQ4YouthGroup1FemaleNumber() == null) {
          stmt.bindNull(60);
        } else {
          stmt.bindString(60, value.getQ4YouthGroup1FemaleNumber());
        }
        if (value.getQ4YouthGroup1AmountReceived() == null) {
          stmt.bindNull(61);
        } else {
          stmt.bindString(61, value.getQ4YouthGroup1AmountReceived());
        }
        if (value.getQ4YouthGroup2Name() == null) {
          stmt.bindNull(62);
        } else {
          stmt.bindString(62, value.getQ4YouthGroup2Name());
        }
        if (value.getQ4YouthGroup2Village() == null) {
          stmt.bindNull(63);
        } else {
          stmt.bindString(63, value.getQ4YouthGroup2Village());
        }
        if (value.getQ4YouthGroup2MaleNumber() == null) {
          stmt.bindNull(64);
        } else {
          stmt.bindString(64, value.getQ4YouthGroup2MaleNumber());
        }
        if (value.getQ4YouthGroup2FemaleNumber() == null) {
          stmt.bindNull(65);
        } else {
          stmt.bindString(65, value.getQ4YouthGroup2FemaleNumber());
        }
        if (value.getQ4YouthGroup2AmountReceived() == null) {
          stmt.bindNull(66);
        } else {
          stmt.bindString(66, value.getQ4YouthGroup2AmountReceived());
        }
        if (value.getQ4YouthGroup3Name() == null) {
          stmt.bindNull(67);
        } else {
          stmt.bindString(67, value.getQ4YouthGroup3Name());
        }
        if (value.getQ4YouthGroup3Village() == null) {
          stmt.bindNull(68);
        } else {
          stmt.bindString(68, value.getQ4YouthGroup3Village());
        }
        if (value.getQ4YouthGroup3MaleNumber() == null) {
          stmt.bindNull(69);
        } else {
          stmt.bindString(69, value.getQ4YouthGroup3MaleNumber());
        }
        if (value.getQ4YouthGroup3FemaleNumber() == null) {
          stmt.bindNull(70);
        } else {
          stmt.bindString(70, value.getQ4YouthGroup3FemaleNumber());
        }
        if (value.getQ4YouthGroup3AmountReceived() == null) {
          stmt.bindNull(71);
        } else {
          stmt.bindString(71, value.getQ4YouthGroup3AmountReceived());
        }
        if (value.getQ4YouthGroup4Name() == null) {
          stmt.bindNull(72);
        } else {
          stmt.bindString(72, value.getQ4YouthGroup4Name());
        }
        if (value.getQ4YouthGroup4Village() == null) {
          stmt.bindNull(73);
        } else {
          stmt.bindString(73, value.getQ4YouthGroup4Village());
        }
        if (value.getQ4YouthGroup4MaleNumber() == null) {
          stmt.bindNull(74);
        } else {
          stmt.bindString(74, value.getQ4YouthGroup4MaleNumber());
        }
        if (value.getQ4YouthGroup4FemaleNumber() == null) {
          stmt.bindNull(75);
        } else {
          stmt.bindString(75, value.getQ4YouthGroup4FemaleNumber());
        }
        if (value.getQ4YouthGroup4AmountReceived() == null) {
          stmt.bindNull(76);
        } else {
          stmt.bindString(76, value.getQ4YouthGroup4AmountReceived());
        }
        if (value.getQ4YouthGroup5Name() == null) {
          stmt.bindNull(77);
        } else {
          stmt.bindString(77, value.getQ4YouthGroup5Name());
        }
        if (value.getQ4YouthGroup5Village() == null) {
          stmt.bindNull(78);
        } else {
          stmt.bindString(78, value.getQ4YouthGroup5Village());
        }
        if (value.getQ4YouthGroup5MaleNumber() == null) {
          stmt.bindNull(79);
        } else {
          stmt.bindString(79, value.getQ4YouthGroup5MaleNumber());
        }
        if (value.getQ4YouthGroup5FemaleNumber() == null) {
          stmt.bindNull(80);
        } else {
          stmt.bindString(80, value.getQ4YouthGroup5FemaleNumber());
        }
        if (value.getQ4YouthGroup5AmountReceived() == null) {
          stmt.bindNull(81);
        } else {
          stmt.bindString(81, value.getQ4YouthGroup5AmountReceived());
        }
        if (value.getQ4YouthGroup6Name() == null) {
          stmt.bindNull(82);
        } else {
          stmt.bindString(82, value.getQ4YouthGroup6Name());
        }
        if (value.getQ4YouthGroup6Village() == null) {
          stmt.bindNull(83);
        } else {
          stmt.bindString(83, value.getQ4YouthGroup6Village());
        }
        if (value.getQ4YouthGroup6MaleNumber() == null) {
          stmt.bindNull(84);
        } else {
          stmt.bindString(84, value.getQ4YouthGroup6MaleNumber());
        }
        if (value.getQ4YouthGroup6FemaleNumber() == null) {
          stmt.bindNull(85);
        } else {
          stmt.bindString(85, value.getQ4YouthGroup6FemaleNumber());
        }
        if (value.getQ4YouthGroup6AmountReceived() == null) {
          stmt.bindNull(86);
        } else {
          stmt.bindString(86, value.getQ4YouthGroup6AmountReceived());
        }
        if (value.getQ4YouthGroup7Name() == null) {
          stmt.bindNull(87);
        } else {
          stmt.bindString(87, value.getQ4YouthGroup7Name());
        }
        if (value.getQ4YouthGroup7Village() == null) {
          stmt.bindNull(88);
        } else {
          stmt.bindString(88, value.getQ4YouthGroup7Village());
        }
        if (value.getQ4YouthGroup7MaleNumber() == null) {
          stmt.bindNull(89);
        } else {
          stmt.bindString(89, value.getQ4YouthGroup7MaleNumber());
        }
        if (value.getQ4YouthGroup7FemaleNumber() == null) {
          stmt.bindNull(90);
        } else {
          stmt.bindString(90, value.getQ4YouthGroup7FemaleNumber());
        }
        if (value.getQ4YouthGroup7AmountReceived() == null) {
          stmt.bindNull(91);
        } else {
          stmt.bindString(91, value.getQ4YouthGroup7AmountReceived());
        }
        if (value.getQ5NumberMaleTrained() == null) {
          stmt.bindNull(92);
        } else {
          stmt.bindString(92, value.getQ5NumberMaleTrained());
        }
        if (value.getQ5NumberFemaleTrained() == null) {
          stmt.bindNull(93);
        } else {
          stmt.bindString(93, value.getQ5NumberFemaleTrained());
        }
        if (value.getQ6CommunityGroupFormed() == null) {
          stmt.bindNull(94);
        } else {
          stmt.bindString(94, value.getQ6CommunityGroupFormed());
        }
        if (value.getQ7OtherChallengesObservations() == null) {
          stmt.bindNull(95);
        } else {
          stmt.bindString(95, value.getQ7OtherChallengesObservations());
        }
        final int _tmp;
        _tmp = value.isLocallyStored() ? 1 : 0;
        stmt.bindLong(96, _tmp);
      }
    };
  }

  @Override
  public void saveSocialDevelopmentQuestion(final SocialDevelopmentQuestion socialDevelopmentQuestion) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSocialDevelopmentQuestion.insert(socialDevelopmentQuestion);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<SocialDevelopmentQuestion>> getAllSocialDevelopmentQuestions() {
    final String _sql = "SELECT * FROM social_dev";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"social_dev"}, false, new Callable<List<SocialDevelopmentQuestion>>() {
      @Override
      public List<SocialDevelopmentQuestion> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPrimaryKey = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfFinancialYear = CursorUtil.getColumnIndexOrThrow(_cursor, "financial_year");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfDistrict = CursorUtil.getColumnIndexOrThrow(_cursor, "district");
          final int _cursorIndexOfVillage = CursorUtil.getColumnIndexOrThrow(_cursor, "village");
          final int _cursorIndexOfParish = CursorUtil.getColumnIndexOrThrow(_cursor, "parish");
          final int _cursorIndexOfDivision = CursorUtil.getColumnIndexOrThrow(_cursor, "division");
          final int _cursorIndexOfYgbaAgentFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "agent_name");
          final int _cursorIndexOfYgbaTel = CursorUtil.getColumnIndexOrThrow(_cursor, "tel");
          final int _cursorIndexOfQ2CommunityExpected = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_com_expec");
          final int _cursorIndexOfQ2CommunityAmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_com_received");
          final int _cursorIndexOfQ2CommunityDateReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_com_date_received");
          final int _cursorIndexOfQ2CommunityDateWithdrawn = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_com_date_withdrawn");
          final int _cursorIndexOfQ2OtherExpectedAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_others_expected");
          final int _cursorIndexOfQ2OtherAmountedReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_others_amount_received");
          final int _cursorIndexOfQ2OthersDateReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_others_date_received");
          final int _cursorIndexOfQ2OthersDateWithdrawn = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_others_date_withdrawn");
          final int _cursorIndexOfQ3WomenEmpowermentObjective = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_e_objective");
          final int _cursorIndexOfQ3WomenEmpowermentObjectiveReason = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_e_objective_reason");
          final int _cursorIndexOfQ3WomanGroup1Name = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_1_name");
          final int _cursorIndexOfQ3WomenGroup1Village = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_1_village");
          final int _cursorIndexOfQ3WomenGroup1MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_1_m_numbers");
          final int _cursorIndexOfQ3WomenGroup1FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_1_f_numbers");
          final int _cursorIndexOfQ3WomenGroup1AmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_1_a_received");
          final int _cursorIndexOfQ3WomanGroup2Name = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_2_name");
          final int _cursorIndexOfQ3WomenGroup2Village = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_2_village");
          final int _cursorIndexOfQ3WomenGroup2MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_2_m_numbers");
          final int _cursorIndexOfQ3WomenGroup2FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_2_f_numbers");
          final int _cursorIndexOfQ3WomenGroup2AmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_2_a_received");
          final int _cursorIndexOfQ3WomanGroup3Name = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_3_name");
          final int _cursorIndexOfQ3WomenGroup3Village = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_3_village");
          final int _cursorIndexOfQ3WomenGroup3MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_3_m_numbers");
          final int _cursorIndexOfQ3WomenGroup3FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_3_f_numbers");
          final int _cursorIndexOfQ3WomenGroup3AmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_3_a_received");
          final int _cursorIndexOfQ3WomanGroup4Name = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_4_name");
          final int _cursorIndexOfQ3WomenGroup4Village = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_4_village");
          final int _cursorIndexOfQ3WomenGroup4MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_4_m_numbers");
          final int _cursorIndexOfQ3WomenGroup4FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_4_f_numbers");
          final int _cursorIndexOfQ3WomenGroup4AmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_4_a_received");
          final int _cursorIndexOfQ3WomanGroup5Name = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_5_name");
          final int _cursorIndexOfQ3WomenGroup5Village = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_5_village");
          final int _cursorIndexOfQ3WomenGroup5MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_5_m_numbers");
          final int _cursorIndexOfQ3WomenGroup5FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_5_f_numbers");
          final int _cursorIndexOfQ3WomenGroup5AmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_5_a_received");
          final int _cursorIndexOfQ3WomanGroup6Name = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_6_name");
          final int _cursorIndexOfQ3WomenGroup6Village = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_6_village");
          final int _cursorIndexOfQ3WomenGroup6MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_6_m_numbers");
          final int _cursorIndexOfQ3WomenGroup6FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_6_f_numbers");
          final int _cursorIndexOfQ3WomenGroup6AmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_6_a_received");
          final int _cursorIndexOfQ3WomanGroup7Name = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_7_name");
          final int _cursorIndexOfQ3WomenGroup7Village = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_7_village");
          final int _cursorIndexOfQ3WomenGroup7MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_7_m_numbers");
          final int _cursorIndexOfQ3WomenGroup7FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_7_f_numbers");
          final int _cursorIndexOfQ3WomenGroup7AmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_w_g_7_a_received");
          final int _cursorIndexOfQ4LivelihoodObjective = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_li_obj");
          final int _cursorIndexOfQ4LivelihoodObjectiveReason = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_li_obj_reason");
          final int _cursorIndexOfQ4YouthGroup1Name = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_y_g_1_name");
          final int _cursorIndexOfQ4YouthGroup1Village = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_1_village");
          final int _cursorIndexOfQ4YouthGroup1MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_1_m_numbers");
          final int _cursorIndexOfQ4YouthGroup1FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_1_f_numbers");
          final int _cursorIndexOfQ4YouthGroup1AmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_1_a_received");
          final int _cursorIndexOfQ4YouthGroup2Name = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_2_name");
          final int _cursorIndexOfQ4YouthGroup2Village = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_2_village");
          final int _cursorIndexOfQ4YouthGroup2MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_2_m_numbers");
          final int _cursorIndexOfQ4YouthGroup2FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_2_f_numbers");
          final int _cursorIndexOfQ4YouthGroup2AmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_2_a_received");
          final int _cursorIndexOfQ4YouthGroup3Name = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_3_name");
          final int _cursorIndexOfQ4YouthGroup3Village = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_3_village");
          final int _cursorIndexOfQ4YouthGroup3MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_3_m_numbers");
          final int _cursorIndexOfQ4YouthGroup3FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_4_g_3_f_numbers");
          final int _cursorIndexOfQ4YouthGroup3AmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_3_a_received");
          final int _cursorIndexOfQ4YouthGroup4Name = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_4_name");
          final int _cursorIndexOfQ4YouthGroup4Village = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_4_village");
          final int _cursorIndexOfQ4YouthGroup4MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_4_m_numbers");
          final int _cursorIndexOfQ4YouthGroup4FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_4_f_numbers");
          final int _cursorIndexOfQ4YouthGroup4AmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_4_a_received");
          final int _cursorIndexOfQ4YouthGroup5Name = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_5_name");
          final int _cursorIndexOfQ4YouthGroup5Village = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_5_village");
          final int _cursorIndexOfQ4YouthGroup5MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_5_m_numbers");
          final int _cursorIndexOfQ4YouthGroup5FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_5_f_numbers");
          final int _cursorIndexOfQ4YouthGroup5AmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_5_a_received");
          final int _cursorIndexOfQ4YouthGroup6Name = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_6_g_6_name");
          final int _cursorIndexOfQ4YouthGroup6Village = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_Y_g_6_village");
          final int _cursorIndexOfQ4YouthGroup6MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_6_m_numbers");
          final int _cursorIndexOfQ4YouthGroup6FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "Q4_Y_g_6_f_numbers");
          final int _cursorIndexOfQ4YouthGroup6AmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_6_a_received");
          final int _cursorIndexOfQ4YouthGroup7Name = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_7_name");
          final int _cursorIndexOfQ4YouthGroup7Village = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_7_village");
          final int _cursorIndexOfQ4YouthGroup7MaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_7_m_numbers");
          final int _cursorIndexOfQ4YouthGroup7FemaleNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_7_f_numbers");
          final int _cursorIndexOfQ4YouthGroup7AmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_Y_g_7_a_received");
          final int _cursorIndexOfQ5NumberMaleTrained = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_number_m_trained");
          final int _cursorIndexOfQ5NumberFemaleTrained = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_number_f_trained");
          final int _cursorIndexOfQ6CommunityGroupFormed = CursorUtil.getColumnIndexOrThrow(_cursor, "q6_com_g_formed");
          final int _cursorIndexOfQ7OtherChallengesObservations = CursorUtil.getColumnIndexOrThrow(_cursor, "q7_others_challenges");
          final int _cursorIndexOfLocallyStored = CursorUtil.getColumnIndexOrThrow(_cursor, "locally_stored");
          final List<SocialDevelopmentQuestion> _result = new ArrayList<SocialDevelopmentQuestion>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SocialDevelopmentQuestion _item;
            final String _tmpFinancialYear;
            _tmpFinancialYear = _cursor.getString(_cursorIndexOfFinancialYear);
            final String _tmpDate;
            _tmpDate = _cursor.getString(_cursorIndexOfDate);
            final String _tmpDistrict;
            _tmpDistrict = _cursor.getString(_cursorIndexOfDistrict);
            final String _tmpVillage;
            _tmpVillage = _cursor.getString(_cursorIndexOfVillage);
            final String _tmpParish;
            _tmpParish = _cursor.getString(_cursorIndexOfParish);
            final String _tmpDivision;
            _tmpDivision = _cursor.getString(_cursorIndexOfDivision);
            final String _tmpYgbaAgentFullName;
            _tmpYgbaAgentFullName = _cursor.getString(_cursorIndexOfYgbaAgentFullName);
            final String _tmpYgbaTel;
            _tmpYgbaTel = _cursor.getString(_cursorIndexOfYgbaTel);
            final String _tmpQ2CommunityExpected;
            _tmpQ2CommunityExpected = _cursor.getString(_cursorIndexOfQ2CommunityExpected);
            final String _tmpQ2CommunityAmountReceived;
            _tmpQ2CommunityAmountReceived = _cursor.getString(_cursorIndexOfQ2CommunityAmountReceived);
            final String _tmpQ2CommunityDateReceived;
            _tmpQ2CommunityDateReceived = _cursor.getString(_cursorIndexOfQ2CommunityDateReceived);
            final String _tmpQ2CommunityDateWithdrawn;
            _tmpQ2CommunityDateWithdrawn = _cursor.getString(_cursorIndexOfQ2CommunityDateWithdrawn);
            final String _tmpQ2OtherExpectedAmount;
            _tmpQ2OtherExpectedAmount = _cursor.getString(_cursorIndexOfQ2OtherExpectedAmount);
            final String _tmpQ2OtherAmountedReceived;
            _tmpQ2OtherAmountedReceived = _cursor.getString(_cursorIndexOfQ2OtherAmountedReceived);
            final String _tmpQ2OthersDateReceived;
            _tmpQ2OthersDateReceived = _cursor.getString(_cursorIndexOfQ2OthersDateReceived);
            final String _tmpQ2OthersDateWithdrawn;
            _tmpQ2OthersDateWithdrawn = _cursor.getString(_cursorIndexOfQ2OthersDateWithdrawn);
            final String _tmpQ3WomenEmpowermentObjective;
            _tmpQ3WomenEmpowermentObjective = _cursor.getString(_cursorIndexOfQ3WomenEmpowermentObjective);
            final String _tmpQ3WomenEmpowermentObjectiveReason;
            _tmpQ3WomenEmpowermentObjectiveReason = _cursor.getString(_cursorIndexOfQ3WomenEmpowermentObjectiveReason);
            final String _tmpQ3WomanGroup1Name;
            _tmpQ3WomanGroup1Name = _cursor.getString(_cursorIndexOfQ3WomanGroup1Name);
            final String _tmpQ3WomenGroup1Village;
            _tmpQ3WomenGroup1Village = _cursor.getString(_cursorIndexOfQ3WomenGroup1Village);
            final String _tmpQ3WomenGroup1MaleNumber;
            _tmpQ3WomenGroup1MaleNumber = _cursor.getString(_cursorIndexOfQ3WomenGroup1MaleNumber);
            final String _tmpQ3WomenGroup1FemaleNumber;
            _tmpQ3WomenGroup1FemaleNumber = _cursor.getString(_cursorIndexOfQ3WomenGroup1FemaleNumber);
            final String _tmpQ3WomenGroup1AmountReceived;
            _tmpQ3WomenGroup1AmountReceived = _cursor.getString(_cursorIndexOfQ3WomenGroup1AmountReceived);
            final String _tmpQ3WomanGroup2Name;
            _tmpQ3WomanGroup2Name = _cursor.getString(_cursorIndexOfQ3WomanGroup2Name);
            final String _tmpQ3WomenGroup2Village;
            _tmpQ3WomenGroup2Village = _cursor.getString(_cursorIndexOfQ3WomenGroup2Village);
            final String _tmpQ3WomenGroup2MaleNumber;
            _tmpQ3WomenGroup2MaleNumber = _cursor.getString(_cursorIndexOfQ3WomenGroup2MaleNumber);
            final String _tmpQ3WomenGroup2FemaleNumber;
            _tmpQ3WomenGroup2FemaleNumber = _cursor.getString(_cursorIndexOfQ3WomenGroup2FemaleNumber);
            final String _tmpQ3WomenGroup2AmountReceived;
            _tmpQ3WomenGroup2AmountReceived = _cursor.getString(_cursorIndexOfQ3WomenGroup2AmountReceived);
            final String _tmpQ3WomanGroup3Name;
            _tmpQ3WomanGroup3Name = _cursor.getString(_cursorIndexOfQ3WomanGroup3Name);
            final String _tmpQ3WomenGroup3Village;
            _tmpQ3WomenGroup3Village = _cursor.getString(_cursorIndexOfQ3WomenGroup3Village);
            final String _tmpQ3WomenGroup3MaleNumber;
            _tmpQ3WomenGroup3MaleNumber = _cursor.getString(_cursorIndexOfQ3WomenGroup3MaleNumber);
            final String _tmpQ3WomenGroup3FemaleNumber;
            _tmpQ3WomenGroup3FemaleNumber = _cursor.getString(_cursorIndexOfQ3WomenGroup3FemaleNumber);
            final String _tmpQ3WomenGroup3AmountReceived;
            _tmpQ3WomenGroup3AmountReceived = _cursor.getString(_cursorIndexOfQ3WomenGroup3AmountReceived);
            final String _tmpQ3WomanGroup4Name;
            _tmpQ3WomanGroup4Name = _cursor.getString(_cursorIndexOfQ3WomanGroup4Name);
            final String _tmpQ3WomenGroup4Village;
            _tmpQ3WomenGroup4Village = _cursor.getString(_cursorIndexOfQ3WomenGroup4Village);
            final String _tmpQ3WomenGroup4MaleNumber;
            _tmpQ3WomenGroup4MaleNumber = _cursor.getString(_cursorIndexOfQ3WomenGroup4MaleNumber);
            final String _tmpQ3WomenGroup4FemaleNumber;
            _tmpQ3WomenGroup4FemaleNumber = _cursor.getString(_cursorIndexOfQ3WomenGroup4FemaleNumber);
            final String _tmpQ3WomenGroup4AmountReceived;
            _tmpQ3WomenGroup4AmountReceived = _cursor.getString(_cursorIndexOfQ3WomenGroup4AmountReceived);
            final String _tmpQ3WomanGroup5Name;
            _tmpQ3WomanGroup5Name = _cursor.getString(_cursorIndexOfQ3WomanGroup5Name);
            final String _tmpQ3WomenGroup5Village;
            _tmpQ3WomenGroup5Village = _cursor.getString(_cursorIndexOfQ3WomenGroup5Village);
            final String _tmpQ3WomenGroup5MaleNumber;
            _tmpQ3WomenGroup5MaleNumber = _cursor.getString(_cursorIndexOfQ3WomenGroup5MaleNumber);
            final String _tmpQ3WomenGroup5FemaleNumber;
            _tmpQ3WomenGroup5FemaleNumber = _cursor.getString(_cursorIndexOfQ3WomenGroup5FemaleNumber);
            final String _tmpQ3WomenGroup5AmountReceived;
            _tmpQ3WomenGroup5AmountReceived = _cursor.getString(_cursorIndexOfQ3WomenGroup5AmountReceived);
            final String _tmpQ3WomanGroup6Name;
            _tmpQ3WomanGroup6Name = _cursor.getString(_cursorIndexOfQ3WomanGroup6Name);
            final String _tmpQ3WomenGroup6Village;
            _tmpQ3WomenGroup6Village = _cursor.getString(_cursorIndexOfQ3WomenGroup6Village);
            final String _tmpQ3WomenGroup6MaleNumber;
            _tmpQ3WomenGroup6MaleNumber = _cursor.getString(_cursorIndexOfQ3WomenGroup6MaleNumber);
            final String _tmpQ3WomenGroup6FemaleNumber;
            _tmpQ3WomenGroup6FemaleNumber = _cursor.getString(_cursorIndexOfQ3WomenGroup6FemaleNumber);
            final String _tmpQ3WomenGroup6AmountReceived;
            _tmpQ3WomenGroup6AmountReceived = _cursor.getString(_cursorIndexOfQ3WomenGroup6AmountReceived);
            final String _tmpQ3WomanGroup7Name;
            _tmpQ3WomanGroup7Name = _cursor.getString(_cursorIndexOfQ3WomanGroup7Name);
            final String _tmpQ3WomenGroup7Village;
            _tmpQ3WomenGroup7Village = _cursor.getString(_cursorIndexOfQ3WomenGroup7Village);
            final String _tmpQ3WomenGroup7MaleNumber;
            _tmpQ3WomenGroup7MaleNumber = _cursor.getString(_cursorIndexOfQ3WomenGroup7MaleNumber);
            final String _tmpQ3WomenGroup7FemaleNumber;
            _tmpQ3WomenGroup7FemaleNumber = _cursor.getString(_cursorIndexOfQ3WomenGroup7FemaleNumber);
            final String _tmpQ3WomenGroup7AmountReceived;
            _tmpQ3WomenGroup7AmountReceived = _cursor.getString(_cursorIndexOfQ3WomenGroup7AmountReceived);
            final String _tmpQ4LivelihoodObjective;
            _tmpQ4LivelihoodObjective = _cursor.getString(_cursorIndexOfQ4LivelihoodObjective);
            final String _tmpQ4LivelihoodObjectiveReason;
            _tmpQ4LivelihoodObjectiveReason = _cursor.getString(_cursorIndexOfQ4LivelihoodObjectiveReason);
            final String _tmpQ4YouthGroup1Name;
            _tmpQ4YouthGroup1Name = _cursor.getString(_cursorIndexOfQ4YouthGroup1Name);
            final String _tmpQ4YouthGroup1Village;
            _tmpQ4YouthGroup1Village = _cursor.getString(_cursorIndexOfQ4YouthGroup1Village);
            final String _tmpQ4YouthGroup1MaleNumber;
            _tmpQ4YouthGroup1MaleNumber = _cursor.getString(_cursorIndexOfQ4YouthGroup1MaleNumber);
            final String _tmpQ4YouthGroup1FemaleNumber;
            _tmpQ4YouthGroup1FemaleNumber = _cursor.getString(_cursorIndexOfQ4YouthGroup1FemaleNumber);
            final String _tmpQ4YouthGroup1AmountReceived;
            _tmpQ4YouthGroup1AmountReceived = _cursor.getString(_cursorIndexOfQ4YouthGroup1AmountReceived);
            final String _tmpQ4YouthGroup2Name;
            _tmpQ4YouthGroup2Name = _cursor.getString(_cursorIndexOfQ4YouthGroup2Name);
            final String _tmpQ4YouthGroup2Village;
            _tmpQ4YouthGroup2Village = _cursor.getString(_cursorIndexOfQ4YouthGroup2Village);
            final String _tmpQ4YouthGroup2MaleNumber;
            _tmpQ4YouthGroup2MaleNumber = _cursor.getString(_cursorIndexOfQ4YouthGroup2MaleNumber);
            final String _tmpQ4YouthGroup2FemaleNumber;
            _tmpQ4YouthGroup2FemaleNumber = _cursor.getString(_cursorIndexOfQ4YouthGroup2FemaleNumber);
            final String _tmpQ4YouthGroup2AmountReceived;
            _tmpQ4YouthGroup2AmountReceived = _cursor.getString(_cursorIndexOfQ4YouthGroup2AmountReceived);
            final String _tmpQ4YouthGroup3Name;
            _tmpQ4YouthGroup3Name = _cursor.getString(_cursorIndexOfQ4YouthGroup3Name);
            final String _tmpQ4YouthGroup3Village;
            _tmpQ4YouthGroup3Village = _cursor.getString(_cursorIndexOfQ4YouthGroup3Village);
            final String _tmpQ4YouthGroup3MaleNumber;
            _tmpQ4YouthGroup3MaleNumber = _cursor.getString(_cursorIndexOfQ4YouthGroup3MaleNumber);
            final String _tmpQ4YouthGroup3FemaleNumber;
            _tmpQ4YouthGroup3FemaleNumber = _cursor.getString(_cursorIndexOfQ4YouthGroup3FemaleNumber);
            final String _tmpQ4YouthGroup3AmountReceived;
            _tmpQ4YouthGroup3AmountReceived = _cursor.getString(_cursorIndexOfQ4YouthGroup3AmountReceived);
            final String _tmpQ4YouthGroup4Name;
            _tmpQ4YouthGroup4Name = _cursor.getString(_cursorIndexOfQ4YouthGroup4Name);
            final String _tmpQ4YouthGroup4Village;
            _tmpQ4YouthGroup4Village = _cursor.getString(_cursorIndexOfQ4YouthGroup4Village);
            final String _tmpQ4YouthGroup4MaleNumber;
            _tmpQ4YouthGroup4MaleNumber = _cursor.getString(_cursorIndexOfQ4YouthGroup4MaleNumber);
            final String _tmpQ4YouthGroup4FemaleNumber;
            _tmpQ4YouthGroup4FemaleNumber = _cursor.getString(_cursorIndexOfQ4YouthGroup4FemaleNumber);
            final String _tmpQ4YouthGroup4AmountReceived;
            _tmpQ4YouthGroup4AmountReceived = _cursor.getString(_cursorIndexOfQ4YouthGroup4AmountReceived);
            final String _tmpQ4YouthGroup5Name;
            _tmpQ4YouthGroup5Name = _cursor.getString(_cursorIndexOfQ4YouthGroup5Name);
            final String _tmpQ4YouthGroup5Village;
            _tmpQ4YouthGroup5Village = _cursor.getString(_cursorIndexOfQ4YouthGroup5Village);
            final String _tmpQ4YouthGroup5MaleNumber;
            _tmpQ4YouthGroup5MaleNumber = _cursor.getString(_cursorIndexOfQ4YouthGroup5MaleNumber);
            final String _tmpQ4YouthGroup5FemaleNumber;
            _tmpQ4YouthGroup5FemaleNumber = _cursor.getString(_cursorIndexOfQ4YouthGroup5FemaleNumber);
            final String _tmpQ4YouthGroup5AmountReceived;
            _tmpQ4YouthGroup5AmountReceived = _cursor.getString(_cursorIndexOfQ4YouthGroup5AmountReceived);
            final String _tmpQ4YouthGroup6Name;
            _tmpQ4YouthGroup6Name = _cursor.getString(_cursorIndexOfQ4YouthGroup6Name);
            final String _tmpQ4YouthGroup6Village;
            _tmpQ4YouthGroup6Village = _cursor.getString(_cursorIndexOfQ4YouthGroup6Village);
            final String _tmpQ4YouthGroup6MaleNumber;
            _tmpQ4YouthGroup6MaleNumber = _cursor.getString(_cursorIndexOfQ4YouthGroup6MaleNumber);
            final String _tmpQ4YouthGroup6FemaleNumber;
            _tmpQ4YouthGroup6FemaleNumber = _cursor.getString(_cursorIndexOfQ4YouthGroup6FemaleNumber);
            final String _tmpQ4YouthGroup6AmountReceived;
            _tmpQ4YouthGroup6AmountReceived = _cursor.getString(_cursorIndexOfQ4YouthGroup6AmountReceived);
            final String _tmpQ4YouthGroup7Name;
            _tmpQ4YouthGroup7Name = _cursor.getString(_cursorIndexOfQ4YouthGroup7Name);
            final String _tmpQ4YouthGroup7Village;
            _tmpQ4YouthGroup7Village = _cursor.getString(_cursorIndexOfQ4YouthGroup7Village);
            final String _tmpQ4YouthGroup7MaleNumber;
            _tmpQ4YouthGroup7MaleNumber = _cursor.getString(_cursorIndexOfQ4YouthGroup7MaleNumber);
            final String _tmpQ4YouthGroup7FemaleNumber;
            _tmpQ4YouthGroup7FemaleNumber = _cursor.getString(_cursorIndexOfQ4YouthGroup7FemaleNumber);
            final String _tmpQ4YouthGroup7AmountReceived;
            _tmpQ4YouthGroup7AmountReceived = _cursor.getString(_cursorIndexOfQ4YouthGroup7AmountReceived);
            final String _tmpQ5NumberMaleTrained;
            _tmpQ5NumberMaleTrained = _cursor.getString(_cursorIndexOfQ5NumberMaleTrained);
            final String _tmpQ5NumberFemaleTrained;
            _tmpQ5NumberFemaleTrained = _cursor.getString(_cursorIndexOfQ5NumberFemaleTrained);
            final String _tmpQ6CommunityGroupFormed;
            _tmpQ6CommunityGroupFormed = _cursor.getString(_cursorIndexOfQ6CommunityGroupFormed);
            final String _tmpQ7OtherChallengesObservations;
            _tmpQ7OtherChallengesObservations = _cursor.getString(_cursorIndexOfQ7OtherChallengesObservations);
            _item = new SocialDevelopmentQuestion(_tmpFinancialYear,_tmpDate,_tmpDistrict,_tmpVillage,_tmpParish,_tmpDivision,_tmpYgbaAgentFullName,_tmpYgbaTel,_tmpQ2CommunityExpected,_tmpQ2CommunityAmountReceived,_tmpQ2CommunityDateReceived,_tmpQ2CommunityDateWithdrawn,_tmpQ2OtherExpectedAmount,_tmpQ2OtherAmountedReceived,_tmpQ2OthersDateReceived,_tmpQ2OthersDateWithdrawn,_tmpQ3WomenEmpowermentObjective,_tmpQ3WomenEmpowermentObjectiveReason,_tmpQ3WomanGroup1Name,_tmpQ3WomenGroup1Village,_tmpQ3WomenGroup1MaleNumber,_tmpQ3WomenGroup1FemaleNumber,_tmpQ3WomenGroup1AmountReceived,_tmpQ3WomanGroup2Name,_tmpQ3WomenGroup2Village,_tmpQ3WomenGroup2MaleNumber,_tmpQ3WomenGroup2FemaleNumber,_tmpQ3WomenGroup2AmountReceived,_tmpQ3WomanGroup3Name,_tmpQ3WomenGroup3Village,_tmpQ3WomenGroup3MaleNumber,_tmpQ3WomenGroup3FemaleNumber,_tmpQ3WomenGroup3AmountReceived,_tmpQ3WomanGroup4Name,_tmpQ3WomenGroup4Village,_tmpQ3WomenGroup4MaleNumber,_tmpQ3WomenGroup4FemaleNumber,_tmpQ3WomenGroup4AmountReceived,_tmpQ3WomanGroup5Name,_tmpQ3WomenGroup5Village,_tmpQ3WomenGroup5MaleNumber,_tmpQ3WomenGroup5FemaleNumber,_tmpQ3WomenGroup5AmountReceived,_tmpQ3WomanGroup6Name,_tmpQ3WomenGroup6Village,_tmpQ3WomenGroup6MaleNumber,_tmpQ3WomenGroup6FemaleNumber,_tmpQ3WomenGroup6AmountReceived,_tmpQ3WomanGroup7Name,_tmpQ3WomenGroup7Village,_tmpQ3WomenGroup7MaleNumber,_tmpQ3WomenGroup7FemaleNumber,_tmpQ3WomenGroup7AmountReceived,_tmpQ4LivelihoodObjective,_tmpQ4LivelihoodObjectiveReason,_tmpQ4YouthGroup1Name,_tmpQ4YouthGroup1Village,_tmpQ4YouthGroup1MaleNumber,_tmpQ4YouthGroup1FemaleNumber,_tmpQ4YouthGroup1AmountReceived,_tmpQ4YouthGroup2Name,_tmpQ4YouthGroup2Village,_tmpQ4YouthGroup2MaleNumber,_tmpQ4YouthGroup2FemaleNumber,_tmpQ4YouthGroup2AmountReceived,_tmpQ4YouthGroup3Name,_tmpQ4YouthGroup3Village,_tmpQ4YouthGroup3MaleNumber,_tmpQ4YouthGroup3FemaleNumber,_tmpQ4YouthGroup3AmountReceived,_tmpQ4YouthGroup4Name,_tmpQ4YouthGroup4Village,_tmpQ4YouthGroup4MaleNumber,_tmpQ4YouthGroup4FemaleNumber,_tmpQ4YouthGroup4AmountReceived,_tmpQ4YouthGroup5Name,_tmpQ4YouthGroup5Village,_tmpQ4YouthGroup5MaleNumber,_tmpQ4YouthGroup5FemaleNumber,_tmpQ4YouthGroup5AmountReceived,_tmpQ4YouthGroup6Name,_tmpQ4YouthGroup6Village,_tmpQ4YouthGroup6MaleNumber,_tmpQ4YouthGroup6FemaleNumber,_tmpQ4YouthGroup6AmountReceived,_tmpQ4YouthGroup7Name,_tmpQ4YouthGroup7Village,_tmpQ4YouthGroup7MaleNumber,_tmpQ4YouthGroup7FemaleNumber,_tmpQ4YouthGroup7AmountReceived,_tmpQ5NumberMaleTrained,_tmpQ5NumberFemaleTrained,_tmpQ6CommunityGroupFormed,_tmpQ7OtherChallengesObservations);
            final int _tmpPrimaryKey;
            _tmpPrimaryKey = _cursor.getInt(_cursorIndexOfPrimaryKey);
            _item.setPrimaryKey(_tmpPrimaryKey);
            final boolean _tmpLocallyStored;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfLocallyStored);
            _tmpLocallyStored = _tmp != 0;
            _item.setLocallyStored(_tmpLocallyStored);
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
}