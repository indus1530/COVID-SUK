package edu.aku.ramshasaeed.mnch.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutionException;

import edu.aku.ramshasaeed.mnch.R;
import edu.aku.ramshasaeed.mnch.RMOperations.crudOperations;
import edu.aku.ramshasaeed.mnch.core.MainApp;
import edu.aku.ramshasaeed.mnch.data.DAO.FormsDAO;
import edu.aku.ramshasaeed.mnch.data.entities.Forms;
import edu.aku.ramshasaeed.mnch.databinding.ActivityRsdBinding;
import edu.aku.ramshasaeed.mnch.validation.validatorClass;

import static edu.aku.ramshasaeed.mnch.activities.LoginActivity.db;
import static edu.aku.ramshasaeed.mnch.activities.RSDInfoActivity.fc;

public class RSDActivity extends AppCompatActivity {
    //Routine Service Delivery
    ActivityRsdBinding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_rsd);
        bi.setCallback(this);
        this.setTitle(getString(R.string.routineone));
        EventsCall();




    }

    void EventsCall() {

        bi.rs2299.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b && bi.rs2297.isChecked()) {
                    bi.rs2297.setChecked(false);
                }
                if (b) {
                    bi.rs22.setVisibility(View.GONE);
                    bi.rs22.setText(null);
                } else {
                    bi.rs22.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.rs2297.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b && bi.rs2299.isChecked()) {
                    bi.rs2299.setChecked(false);
                }
                if (b) {
                    bi.rs22.setVisibility(View.GONE);
                    bi.rs22.setText(null);
                } else {
                    bi.rs22.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.rs3599.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b && bi.rs3597.isChecked()) {
                    bi.rs3597.setChecked(false);
                }
                if (b) {
                    bi.rs35.setVisibility(View.GONE);
                    bi.rs35.setText(null);
                } else {
                    bi.rs35.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.rs3597.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b && bi.rs3599.isChecked()) {
                    bi.rs3599.setChecked(false);
                }
                if (b) {
                    bi.rs35.setVisibility(View.GONE);
                    bi.rs35.setText(null);
                } else {
                    bi.rs35.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.rs3699.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b && bi.rs3697.isChecked()) {
                    bi.rs3697.setChecked(false);
                }
                if (b) {
                    bi.rs36.setVisibility(View.GONE);
                    bi.rs36.setText(null);
                } else {
                    bi.rs36.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.rs3697.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b && bi.rs3699.isChecked()) {
                    bi.rs3699.setChecked(false);
                }
                if (b) {
                    bi.rs36.setVisibility(View.GONE);
                    bi.rs36.setText(null);
                } else {
                    bi.rs36.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.rs3799.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b && bi.rs3797.isChecked()) {
                    bi.rs3797.setChecked(false);
                }
                if (b) {
                    bi.rs37.setVisibility(View.GONE);
                    bi.rs37.setText(null);
                } else {
                    bi.rs37.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.rs3797.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b && bi.rs3799.isChecked()) {
                    bi.rs3799.setChecked(false);
                }
                if (b) {
                    bi.rs37.setVisibility(View.GONE);
                    bi.rs37.setText(null);
                } else {
                    bi.rs37.setVisibility(View.VISIBLE);
                }
            }
        });
        bi.rs3899.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b && bi.rs3897.isChecked()) {
                    bi.rs3897.setChecked(false);
                }
                if (b) {
                    bi.rs38.setVisibility(View.GONE);
                    bi.rs38.setText(null);
                } else {
                    bi.rs38.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.rs3897.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b && bi.rs3899.isChecked()) {
                    bi.rs3899.setChecked(false);
                }
                if (b) {
                    bi.rs38.setVisibility(View.GONE);
                    bi.rs38.setText(null);
                } else {
                    bi.rs38.setVisibility(View.VISIBLE);
                }
            }
        });
        bi.rs3999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b && bi.rs3997.isChecked()) {
                    bi.rs3997.setChecked(false);
                }
                if (b) {
                    bi.rs39.setVisibility(View.GONE);
                    bi.rs39.setText(null);
                } else {
                    bi.rs39.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.rs3997.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b && bi.rs3999.isChecked()) {
                    bi.rs3999.setChecked(false);
                }
                if (b) {
                    bi.rs39.setVisibility(View.GONE);
                    bi.rs39.setText(null);
                } else {
                    bi.rs39.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.rs4099.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b && bi.rs4097.isChecked()) {
                    bi.rs4097.setChecked(false);
                }
                if (b) {
                    bi.rs40.setVisibility(View.GONE);
                    bi.rs40.setText(null);
                } else {
                    bi.rs40.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.rs4097.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b && bi.rs4099.isChecked()) {
                    bi.rs4099.setChecked(false);
                }
                if (b) {
                    bi.rs40.setVisibility(View.GONE);
                    bi.rs40.setText(null);
                } else {
                    bi.rs40.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    public void BtnContinue() {
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Ending Section", Toast.LENGTH_SHORT).show();
                MainApp.endActivity(this, this, EndingActivity.class, true, RSDInfoActivity.fc);

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void BtnEnd() {
        MainApp.endActivity(this, this, EndingActivity.class, false, RSDInfoActivity.fc);

    }

    private boolean UpdateDB() {

        try {

            Long longID = new crudOperations(db, RSDInfoActivity.fc).execute(FormsDAO.class.getName(), "formsDao", "updateForm").get();
            return longID == 1;

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        return false;

    }

    public boolean formValidation() {

        if (!bi.rs0199.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.rs01, getString(R.string.rs01))) {
                return false;
            }
        }

        if (!bi.rs0299.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.rs02, getString(R.string.rs02))) {
                return false;
            }
        }


        if (!bi.rs0399.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs03, getString(R.string.rs03))) {
                return false;
            }
        }

        if (!bi.rs0499.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs04, getString(R.string.rs04))) {
                return false;
            }
        }
        if (!bi.rs0599.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs05, getString(R.string.rs05))) {
                return false;
            }
        }
        if (!bi.rs0699.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs06, getString(R.string.rs06))) {
                return false;
            }
        }
        if (!bi.rs0799.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs07, getString(R.string.rs07))) {
                return false;
            }
        }
        if (!bi.rs0899.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs08, getString(R.string.rs08))) {
                return false;
            }
        }
        if (!bi.rs0999.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs09, getString(R.string.rs09))) {
                return false;
            }
        }
        if (!bi.rs1099.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs10, getString(R.string.rs10))) {
                return false;
            }
        }
        if (!bi.rs1199.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs11, getString(R.string.rs11))) {
                return false;
            }
        }
        if (!bi.rs1299.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs12, getString(R.string.rs12))) {
                return false;
            }
        }
        if (!bi.rs1399.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs13, getString(R.string.rs13))) {
                return false;
            }
        }
        if (!bi.rs1499.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs14, getString(R.string.rs14))) {
                return false;
            }
        }
        if (!bi.rs1599.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs15, getString(R.string.rs15))) {
                return false;
            }
        }
        if (!bi.rs1699.isChecked()) {


            if (!validatorClass.EmptyTextBox(this, bi.rs16, getString(R.string.rs16))) {
                return false;
            }
        }
        if (!bi.rs1799.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs17, getString(R.string.rs17))) {
                return false;
            }
        }
        if (!bi.rs1899.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs18, getString(R.string.rs18))) {
                return false;
            }
        }
        if (!bi.rs1999.isChecked()) {


            if (!validatorClass.EmptyTextBox(this, bi.rs19, getString(R.string.rs19))) {
                return false;
            }
        }
        if (!bi.rs2099.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs10, getString(R.string.rs20))) {
                return false;
            }
        }
        if (!bi.rs2199.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs21, getString(R.string.rs21))) {
                return false;
            }
        }
        if (!bi.rs2299.isChecked() && !bi.rs2297.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.rs22, getString(R.string.rs22))) {
                return false;
            }
        }
        if (!bi.rs2399.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs23, getString(R.string.rs23))) {
                return false;
            }
        }
        if (!bi.rs2499.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs24, getString(R.string.rs24))) {
                return false;
            }
        }
        if (!bi.rs2599.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs25, getString(R.string.rs25))) {
                return false;
            }
        }
        if (!bi.rs2699.isChecked()) {


            if (!validatorClass.EmptyTextBox(this, bi.rs26, getString(R.string.rs26))) {
                return false;
            }
        }
        if (!bi.rs2799.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs27, getString(R.string.rs27))) {
                return false;
            }
        }
        if (!bi.rs2899.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs28, getString(R.string.rs28))) {
                return false;
            }
        }
        if (!bi.rs2999.isChecked()) {


            if (!validatorClass.EmptyTextBox(this, bi.rs29, getString(R.string.rs29))) {
                return false;
            }
        }
        if (!bi.rs3099.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs30, getString(R.string.rs30))) {
                return false;
            }
        }
        if (!bi.rs3199.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs31, getString(R.string.rs31))) {
                return false;
            }
        }
        if (!bi.rs3299.isChecked()) {


            if (!validatorClass.EmptyTextBox(this, bi.rs32, getString(R.string.rs32))) {
                return false;
            }
        }
        if (!bi.rs3399.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs33, getString(R.string.rs33))) {
                return false;
            }
        }
        if (!bi.rs3499.isChecked()) {


            if (!validatorClass.EmptyTextBox(this, bi.rs34, getString(R.string.rs34))) {
                return false;
            }
        }
        if (!bi.rs3599.isChecked() && !bi.rs3597.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.rs35, getString(R.string.rs35))) {
                return false;
            }
        }
        if (!bi.rs3699.isChecked() && !bi.rs3697.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs36, getString(R.string.rs36))) {
                return false;
            }
        }
        if (!bi.rs3799.isChecked()  && !bi.rs3797.isChecked()) {


            if (!validatorClass.EmptyTextBox(this, bi.rs37, getString(R.string.rs37))) {
                return false;
            }
        }
        if (!bi.rs3899.isChecked()  && !bi.rs3897.isChecked()) {


            if (!validatorClass.EmptyTextBox(this, bi.rs38, getString(R.string.rs38))) {
                return false;
            }
        }
        if (!bi.rs3999.isChecked()  && !bi.rs3997.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs39, getString(R.string.rs39))) {
                return false;
            }
        }
        if (!bi.rs4099.isChecked()  && !bi.rs4097.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.rs40, getString(R.string.rs40))) {
                return false;
            }
        }
        if (!validatorClass.EmptyTextBox(this, bi.rsrem, getString(R.string.rsrem))) {
            return false;
        }


        return true;
    }

    private void SaveDraft() throws JSONException {

        JSONObject f01 = new JSONObject();
        f01.put("rs01", bi.rs0199.isChecked() ? "Mi" : bi.rs01.getText().toString());
        f01.put("rs02", bi.rs0299.isChecked() ? "Mi" : bi.rs02.getText().toString());
        f01.put("rs03", bi.rs0399.isChecked() ? "Mi" : bi.rs03.getText().toString());
        f01.put("rs04", bi.rs0499.isChecked() ? "Mi" : bi.rs04.getText().toString());
        f01.put("rs05", bi.rs0599.isChecked() ? "Mi" : bi.rs05.getText().toString());
        f01.put("rs06", bi.rs0699.isChecked() ? "Mi" : bi.rs06.getText().toString());
        f01.put("rs07", bi.rs0799.isChecked() ? "Mi" : bi.rs07.getText().toString());
        f01.put("rs08", bi.rs0899.isChecked() ? "Mi" : bi.rs08.getText().toString());
        f01.put("rs09", bi.rs0999.isChecked() ? "Mi" : bi.rs09.getText().toString());
        f01.put("rs10", bi.rs1099.isChecked() ? "Mi" : bi.rs10.getText().toString());
        f01.put("rs11", bi.rs1199.isChecked() ? "Mi" : bi.rs11.getText().toString());
        f01.put("rs12", bi.rs1299.isChecked() ? "Mi" : bi.rs12.getText().toString());
        f01.put("rs13", bi.rs1399.isChecked() ? "Mi" : bi.rs13.getText().toString());
        f01.put("rs14", bi.rs1499.isChecked() ? "Mi" : bi.rs14.getText().toString());
        f01.put("rs15", bi.rs1599.isChecked() ? "Mi" : bi.rs15.getText().toString());
        f01.put("rs16", bi.rs1699.isChecked() ? "Mi" : bi.rs16.getText().toString());
        f01.put("rs17", bi.rs1799.isChecked() ? "Mi" : bi.rs17.getText().toString());
        f01.put("rs18", bi.rs1899.isChecked() ? "Mi" : bi.rs18.getText().toString());
        f01.put("rs19", bi.rs1999.isChecked() ? "Mi" : bi.rs19.getText().toString());
        f01.put("rs20", bi.rs2099.isChecked() ? "Mi" : bi.rs20.getText().toString());

        f01.put("rs21", bi.rs2199.isChecked() ? "Mi" : bi.rs21.getText().toString());
        f01.put("rs22", bi.rs2299.isChecked() ? "Mi" : bi.rs2297.isChecked() ? "NA" : bi.rs22.getText().toString());
        f01.put("rs23", bi.rs2399.isChecked() ? "Mi" : bi.rs23.getText().toString());
        f01.put("rs24", bi.rs2499.isChecked() ? "Mi" : bi.rs24.getText().toString());
        f01.put("rs25", bi.rs2599.isChecked() ? "Mi" : bi.rs25.getText().toString());
        f01.put("rs26", bi.rs2699.isChecked() ? "Mi" : bi.rs26.getText().toString());
        f01.put("rs27", bi.rs2799.isChecked() ? "Mi" : bi.rs27.getText().toString());
        f01.put("rs28", bi.rs2899.isChecked() ? "Mi" : bi.rs28.getText().toString());
        f01.put("rs29", bi.rs2999.isChecked() ? "Mi" : bi.rs29.getText().toString());
        f01.put("rs30", bi.rs3099.isChecked() ? "Mi" : bi.rs30.getText().toString());
        f01.put("rs31", bi.rs3199.isChecked() ? "Mi" : bi.rs31.getText().toString());
        f01.put("rs32", bi.rs3299.isChecked() ? "Mi" : bi.rs32.getText().toString());
        f01.put("rs33", bi.rs3399.isChecked() ? "Mi" : bi.rs33.getText().toString());
        f01.put("rs34", bi.rs3499.isChecked() ? "Mi" : bi.rs34.getText().toString());
        f01.put("rs35", bi.rs3599.isChecked() ? "Mi" : bi.rs3597.isChecked() ? "NA" : bi.rs35.getText().toString());
        f01.put("rs36", bi.rs3699.isChecked() ? "Mi" : bi.rs3697.isChecked() ? "NA" : bi.rs36.getText().toString());
        f01.put("rs37", bi.rs3799.isChecked() ? "Mi" : bi.rs3797.isChecked() ? "NA" : bi.rs37.getText().toString());
        f01.put("rs38", bi.rs3899.isChecked() ? "Mi" : bi.rs3897.isChecked() ? "NA" : bi.rs38.getText().toString());
        f01.put("rs39", bi.rs3999.isChecked() ? "Mi" : bi.rs3997.isChecked() ? "NA" : bi.rs39.getText().toString());
        f01.put("rs40", bi.rs4099.isChecked() ? "Mi" : bi.rs4097.isChecked() ? "NA" : bi.rs40.getText().toString());

        f01.put("rsrem", bi.rsrem.getText().toString());

        fc.setSrsd(String.valueOf(f01));

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "You can't go back", Toast.LENGTH_SHORT).show();
    }

}
