package com.example.danielmoreno.phonesettings.settings;

import com.example.danielmoreno.phonesettings.R;
import com.example.danielmoreno.phonesettings.settings.interfaces.SettingsListModels;
import com.example.danielmoreno.phonesettings.settings.interfaces.SettingsListPresenter;
import com.example.danielmoreno.phonesettings.settings.interfaces.SettingsListView;
import com.example.danielmoreno.phonesettings.settings.models.SettingModel;

import java.util.ArrayList;

public class SettingsListPresenterImplementation implements SettingsListPresenter {
    private SettingsListModels mSettingsModel;
    private SettingsListView mSettingsListView;

    public SettingsListPresenterImplementation() {

    }

    /**
     * Sets the settings model to configure MVP
     *
     * @param mSettingsModel Settings Model
     */
    public void setSettingsModel(SettingsListModels mSettingsModel) {
        this.mSettingsModel = mSettingsModel;
    }

    /**
     * Sets the setting view to configure MVP
     *
     * @param mSettingsListView Settings View
     */
    public void setSettingsListView(SettingsListView mSettingsListView) {
        this.mSettingsListView = mSettingsListView;
    }

    @Override
    public void getSettings() {
        mSettingsModel.getSettingsModels();

    }

    @Override
    public void presentSettings(ArrayList<SettingModel> settingModelArrayList) {
        if (settingModelArrayList != null) {
            mSettingsListView.showSettings(settingModelArrayList);
            return;
        }
        mSettingsListView.showSettingsError(R.string.settings_error);
    }
}
