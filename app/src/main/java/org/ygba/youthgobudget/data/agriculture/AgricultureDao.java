package org.ygba.youthgobudget.data.agriculture;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface AgricultureDao {
    @Insert
    void saveAgricultureQuestion(AgricultureQuestion agricultureQuestion);

    @Query(
            "SELECT * FROM " + AgricultureConstants.TABLE_NAME
    )
    LiveData<List<AgricultureQuestion>> getAllAgricultureAnswers();
}
