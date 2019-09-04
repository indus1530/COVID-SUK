package edu.aku.ramshasaeed.mnch.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import edu.aku.ramshasaeed.mnch.R;
import edu.aku.ramshasaeed.mnch.core.MainApp;
import edu.aku.ramshasaeed.mnch.data.entities.Forms;
import edu.aku.ramshasaeed.mnch.databinding.RsdMainBinding;

public class RsdMain extends AppCompatActivity {

    private static final String TAG = "RsdMain";
    RsdMainBinding bi;

    public static Forms fc;
    String rm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.rsd_main);
        bi.setCallback(this);
        rm = getIntent().getStringExtra("rm");
        this.setTitle(getString(R.string.routineone) + "(" + rm + ")");

        if (fc.getSA().equals(""))
            bi.form01.setEnabled(false);

        if (fc.getSB().equals(""))
            bi.form02.setEnabled(false);

        if (fc.getSC().equals(""))
            bi.form03.setEnabled(false);

        if (fc.getSD().equals(""))
            bi.form04.setEnabled(false);

        if (fc.getSE().equals(""))
            bi.form05.setEnabled(false);

        if (fc.getSF().equals(""))
            bi.form06.setEnabled(false);

    }


    public void openForm(View v) {
        OpenFormFunc(v.getId());
    }

    public void BtnContinue() {

        if (!bi.form01.isEnabled()
                && !bi.form02.isEnabled()
                && !bi.form03.isEnabled()
                && !bi.form04.isEnabled()
                && !bi.form05.isEnabled()
                && !bi.form06.isEnabled()) {
            finish();
            startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
        } else {
            Toast.makeText(this, "Sections still in Pending!", Toast.LENGTH_SHORT).show();
        }
    }


    public void BtnEnd() {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));

    }

    private void OpenFormFunc(int id) {
        Intent oF = new Intent();
        if (!MainApp.userName.equals("0000")) {
            switch (id) {
                case R.id.form01:
                    oF = new Intent(RsdMain.this, Rsd01.class).putExtra("rm", rm);
                    break;
                case R.id.form02:
                    oF = new Intent(RsdMain.this, Rsd02.class).putExtra("rm", rm);
                    break;
                case R.id.form03:
                    oF = new Intent(RsdMain.this, Rsd03.class).putExtra("rm", rm);
                    break;
                case R.id.form04:
                    oF = new Intent(RsdMain.this, Rsd04.class).putExtra("rm", rm);
                    break;
                case R.id.form05:
                    oF = new Intent(RsdMain.this, Rsd05.class).putExtra("rm", rm);
                    break;
                case R.id.form06:
                    oF = new Intent(RsdMain.this, Rsd06.class).putExtra("rm", rm);
                    break;
            }
            finish();
            startActivity(oF);
        } else {
            Toast.makeText(getApplicationContext(), "Please login Again!", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "You can't go back", Toast.LENGTH_SHORT).show();
    }

}
