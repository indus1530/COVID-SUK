package edu.aku.ramshasaeed.mnch.data.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

import edu.aku.ramshasaeed.mnch.data.AppDatabase;
import edu.aku.ramshasaeed.mnch.data.entities.District;
import edu.aku.ramshasaeed.mnch.data.entities.FacilityProvider;
import edu.aku.ramshasaeed.mnch.data.entities.Forms;
import edu.aku.ramshasaeed.mnch.data.entities.Users;

@Dao
public interface GetFncDAO {

    @Query("SELECT * FROM " + AppDatabase.Sub_DBConnection.TABLE_FORMS)
    List<Forms> getAll();

    @Query("SELECT * FROM " + AppDatabase.Sub_DBConnection.TABLE_FORMS + " WHERE id=:id")
    Forms getLastForm(int id);

    @Query("SELECT * FROM " + AppDatabase.Sub_DBConnection.TABLE_FORMS + " WHERE formDate LIKE :date")
    List<Forms> getTodaysForms(String date);

    @Query("SELECT * FROM " + AppDatabase.Sub_DBConnection.TABLE_FORMS + " WHERE synced = ''")
    List<Forms> getUnSyncedForms();

    @Query("SELECT * FROM " + AppDatabase.Sub_DBConnection.TABLE_DISTRICT)
    List<District> getAllDistricts();

   /* @Query("SELECT * FROM " + AppDatabase.Sub_DBConnection.TABLE_TEHSIL)
    List<Tehsil> getAllTehsils();
    @Query("SELECT * FROM " + AppDatabase.Sub_DBConnection.TABLE_UCs)
    List<UCs> getAllUCs();*/

    @Query("SELECT * FROM " + AppDatabase.Sub_DBConnection.TABLE_FORMS)
    List<Forms> getForms();

    @Query("SELECT * FROM " + AppDatabase.Sub_DBConnection.TABLE_FORMS + " WHERE synced = '' AND formType = :formType")
    List<Forms> getUnSyncedForms(String formType);

    @Query("SELECT * FROM " + AppDatabase.Sub_DBConnection.TABLE_FORMS + " WHERE formType = :formType")
    List<Forms> getForms(String formType);

    @Query("SELECT * FROM " + AppDatabase.Sub_DBConnection.TABLE_USERS + " where ROW_USERNAME=:username AND ROW_PASSWORD=:password")
    Users login(String username, String password);

    /*
    @Query("SELECT * FROM " + AppDatabase.Sub_DBConnection.TABLE_DISTRICT )
    District getDistrictRecord();

    @Query("SELECT * FROM " + AppDatabase.Sub_DBConnection.TABLE_TEHSIL + " where district_code=:district_code")
    List<Tehsil> getTehsil(String district_code);

    @Query("SELECT * FROM " + AppDatabase.Sub_DBConnection.TABLE_UCs + " where tehsil_code=:tehsil_code")
    List<UCs> getUCs(String tehsil_code);*/

    @Query("SELECT * FROM " + AppDatabase.Sub_DBConnection.TABLE_FACILITY_PROVIDER + " where hf_district_code=:hf_district_code")
    List<FacilityProvider> getFacilityProvider(String hf_district_code);

}
