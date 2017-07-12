package io.mrarm.irc.setup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import io.mrarm.irc.R;

public class BackupActivity extends SetupActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backup);
        findViewById(R.id.create).setOnClickListener((View v) -> {
            Intent intent = new Intent(BackupActivity.this, BackupPasswordActivity.class);
            startNextActivity(intent);
        });
    }

}
