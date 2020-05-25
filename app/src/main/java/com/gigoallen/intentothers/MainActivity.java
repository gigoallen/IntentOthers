package com.gigoallen.intentothers;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View v) {

        Intent intent = new Intent(Intent.ACTION_VIEW);

        switch (v.getId()){
            case R.id.btnEmail:
                intent.setData(Uri.parse("mailto:gigo@hk.edu.tw"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "好久不見!");
                intent.putExtra(Intent.EXTRA_TEXT, "最近好嗎?基哥");

                break;
            case R.id.btnWeb:
                intent.setData(Uri.parse("http://www.csim.hk.edu.tw/main.php"));
                break;
        }


        startActivity(intent);

    }
}
