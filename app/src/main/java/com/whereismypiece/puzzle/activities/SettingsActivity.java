package com.whereismypiece.puzzle.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.SeekBar;

import com.whereismypiece.puzzle.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SettingsActivity extends AppCompatActivity {

    @Nullable
    @BindView(R.id.sbRow)
    SeekBar sbRow;
    @Nullable
    @BindView(R.id.sbColumns)
    SeekBar sbColumns;
    @Nullable
    @BindView(R.id.btnPurchase)
    Button btnPurchase;

    private int currentRows;
    private int currentColumns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_settings);
        ButterKnife.bind(this);
        
        initView();
    }

    private void initView() {

    }
}