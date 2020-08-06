package org.ygba.youthgobudget.data.helpers.district;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DistrictDao {
    @Insert
    void saveDistrict(District district);
    @Query(
            "SELECT * FROM " + DistrictConstants.TABLE_NAME
    )
    LiveData<List<District>> getAllDistricts();
}
