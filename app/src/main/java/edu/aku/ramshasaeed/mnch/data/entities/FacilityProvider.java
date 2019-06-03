package edu.aku.ramshasaeed.mnch.data.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.ramshasaeed.mnch.data.AppDatabase;

@Entity(tableName = AppDatabase.Sub_DBConnection.TABLE_FACILITY_PROVIDER)
public class FacilityProvider {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo
    private String hf_dhis = "";
    private String hf_district_code = "";
    private String hf_tehsil = "";
    private String hf_uc = "";
    private String hf_name = "";
    private String hf_name_govt = "";
    private String hf_uen_code = "";

    public FacilityProvider() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHf_dhis() {
        return hf_dhis;
    }

    public void setHf_dhis(String hf_dhis) {
        this.hf_dhis = hf_dhis;
    }

    public String getHf_district_code() {
        return hf_district_code;
    }

    public void setHf_district_code(String hf_district_code) {
        this.hf_district_code = hf_district_code;
    }

    public String getHf_tehsil() {
        return hf_tehsil;
    }

    public void setHf_tehsil(String hf_tehsil) {
        this.hf_tehsil = hf_tehsil;
    }

    public String getHf_uc() {
        return hf_uc;
    }

    public void setHf_uc(String hf_uc) {
        this.hf_uc = hf_uc;
    }

    public String getHf_name() {
        return hf_name;
    }

    public void setHf_name(String hf_name) {
        this.hf_name = hf_name;
    }

    public String getHf_name_govt() {
        return hf_name_govt;
    }

    public void setHf_name_govt(String hf_name_govt) {
        this.hf_name_govt = hf_name_govt;
    }

    public String getHf_uen_code() {
        return hf_uen_code;
    }

    public void setHf_uen_code(String hf_uen_code) {
        this.hf_uen_code = hf_uen_code;
    }

    public FacilityProvider Sync(JSONObject jsonObjectCls) throws JSONException {
        this.hf_dhis = jsonObjectCls.getString("hf_dhis");
        this.hf_district_code =jsonObjectCls.getString("hf_district_code");
        this.hf_tehsil = jsonObjectCls.getString("hf_tehsil");
        this.hf_uc = jsonObjectCls.getString("hf_uc");
        this.hf_name = jsonObjectCls.getString("hf_name");
        this.hf_name_govt = jsonObjectCls.getString("hf_name_govt");
        this.hf_uen_code = jsonObjectCls.getString("hf_uen_code");
        return this;
    }
}
