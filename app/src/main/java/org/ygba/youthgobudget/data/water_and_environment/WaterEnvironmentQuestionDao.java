package org.ygba.youthgobudget.data.water_and_environment;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WaterEnvironmentQuestionDao {
    @Insert
    void saveWaterEnvironmentQuestion(WaterEnvironmentQuestion waterEnvironmentQuestion);

    @Query("SELECT * FROM " + WaterEnvironmentConstants.TABLE_NAME)
    LiveData<List<WaterEnvironmentQuestion>> getAllWaterEnvironmentQuestions();
}
