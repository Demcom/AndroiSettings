package com.example.danielmoreno.phonesettings.settings;

import com.example.danielmoreno.phonesettings.R;
import com.example.danielmoreno.phonesettings.settings.interfaces.SettingsListModels;
import com.example.danielmoreno.phonesettings.settings.interfaces.SettingsListPresenter;
import com.example.danielmoreno.phonesettings.settings.models.SettingModel;

import java.util.ArrayList;

public class SettingsListModelImplementation implements SettingsListModels {

    private static String[] SETTINGS_NAMES_ARRAY = {
            "Internet & Devices",
            "Screen Brightness",
            "Volume & Ringtone",
            "Home Screen",
            "Customize Phone",
            "Android Settings"
    };

    private static int[] SETTINGS_IMAGES_RESOURCE_ARRAY = {
            R.drawable.ic_volume,
            R.drawable.ic_brightness,
            R.drawable.ic_volume,
            R.drawable.ic_home,
            R.drawable.ic_mode_edit,
            R.drawable.ic_android
    };

    private SettingsListPresenter mSettingsListPresenter;

    public SettingsListModelImplementation() {

    }

    /**
     * Sets the presenter for MVP
     *
     * @param mSettingsListPresenter Settings Presenter
     */
    public void setSettingsListPresenter(SettingsListPresenter mSettingsListPresenter) {
        this.mSettingsListPresenter = mSettingsListPresenter;
    }

    @Override
    public void getSettingsModels() {
        if (SETTINGS_IMAGES_RESOURCE_ARRAY.length != SETTINGS_NAMES_ARRAY.length) {
            mSettingsListPresenter.presentSettings(null);
        }
        ArrayList<SettingModel> settingModelArrayList = new ArrayList<>();
        for (int index = 0; index < SETTINGS_IMAGES_RESOURCE_ARRAY.length; index++) {
            SettingModel settingModel = new SettingModel(SETTINGS_NAMES_ARRAY[index], SETTINGS_IMAGES_RESOURCE_ARRAY[index]);
            settingModelArrayList.add(settingModel);
        }
        mSettingsListPresenter.presentSettings(settingModelArrayList);

    }
}
