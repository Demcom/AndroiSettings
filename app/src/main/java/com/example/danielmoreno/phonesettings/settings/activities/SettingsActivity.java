package com.example.danielmoreno.phonesettings.settings.activities;
import android.os.Bundle;

import com.example.danielmoreno.phonesettings.common.BaseActivity;
import com.example.danielmoreno.phonesettings.R;

public class SettingsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        configureView();
    }

    /**
     * Configures the view
     */
    private void configureView() {
        setActivityTitle(getString(R.string.app_name));
        setActionTitle(getString(R.string.options));
        setActionImage(R.drawable.ic_more);
    }
}
