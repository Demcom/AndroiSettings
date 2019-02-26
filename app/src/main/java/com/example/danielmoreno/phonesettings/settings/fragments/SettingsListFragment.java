package com.example.danielmoreno.phonesettings.settings.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.danielmoreno.phonesettings.R;
import com.example.danielmoreno.phonesettings.settings.SettingsAdapter;
import com.example.danielmoreno.phonesettings.settings.SettingsConfigurator;
import com.example.danielmoreno.phonesettings.settings.interfaces.SettingsListPresenter;
import com.example.danielmoreno.phonesettings.settings.interfaces.SettingsListView;
import com.example.danielmoreno.phonesettings.settings.models.SettingModel;

import java.util.ArrayList;

public class SettingsListFragment extends Fragment implements SettingsListView {

    private RecyclerView mSettingRecyclerView;
    private SettingsListPresenter mSettingsListPresenter;
    private LinearLayoutManager mLinearLayoutManager;
    private SettingsAdapter settingsAdapter;

    public SettingsListFragment() {
    }

    public static SettingsListFragment newInstance(String param1, String param2) {
        SettingsListFragment fragment = new SettingsListFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings_list, container, false);
        setupView(view);
        mSettingsListPresenter.getSettings();
        return view;
    }

    private void setupView(View view) {
        mSettingRecyclerView = view.findViewById(R.id.settings_recyclerView);
        SettingsConfigurator.configureSettingsListView(this);
        mLinearLayoutManager = new LinearLayoutManager(getContext());
        mSettingRecyclerView.setLayoutManager(mLinearLayoutManager);
        settingsAdapter = new SettingsAdapter(getContext(), null);
        mSettingRecyclerView.setAdapter(settingsAdapter);
    }

    public void setSettingsListPresenter(SettingsListPresenter mSettingsListPresenter) {
        this.mSettingsListPresenter = mSettingsListPresenter;
    }

    @Override
    public void showSettings(ArrayList<SettingModel> settingModels) {
        settingsAdapter.setSettingModel(settingModels);
        settingsAdapter.notifyDataSetChanged();
    }

    @Override
    public void showSettingsError(int message) {
        Toast.makeText(getContext(), getString(message), Toast.LENGTH_LONG).show();
    }
}
