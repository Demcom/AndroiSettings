package com.example.danielmoreno.phonesettings.settings;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.danielmoreno.phonesettings.R;
import com.example.danielmoreno.phonesettings.settings.models.SettingModel;

import java.util.ArrayList;

public class SettingsAdapter extends RecyclerView.Adapter<SettingsViewHolder> {

    private Context mContext;
    private ArrayList<SettingModel> mSettingModel;

    public SettingsAdapter(Context context, ArrayList<SettingModel> settingModels) {
        mContext = context;
        mSettingModel = settingModels;
    }

    @NonNull
    @Override
    public SettingsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View settingsViewHolder = LayoutInflater.from(mContext).inflate(R.layout.setting_item, viewGroup, false);
        return new SettingsViewHolder(settingsViewHolder);
    }

    @Override
    public void onBindViewHolder(@NonNull SettingsViewHolder settingsViewHolder, int i) {
        SettingModel settingModel = mSettingModel.get(i);
        settingsViewHolder.setTitle(settingModel.getTitle());
        settingsViewHolder.setSettingImage(settingModel.getSettingsImageId());
    }

    @Override
    public int getItemCount() {
        return mSettingModel == null ? 0 : mSettingModel.size();
    }

    /**
     * Sets the model array
     * @param mSettingModel array model to be set to the class
     */
    public void setSettingModel(ArrayList<SettingModel> mSettingModel) {
        this.mSettingModel = mSettingModel;
    }
}
