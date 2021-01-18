package com.h5190007.barbaros_berk_gelenbe_final.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.h5190007.barbaros_berk_gelenbe_final.R;
import com.h5190007.barbaros_berk_gelenbe_final.models.MiPhoneModel;
import com.h5190007.barbaros_berk_gelenbe_final.utils.Constants;
import com.h5190007.barbaros_berk_gelenbe_final.utils.GlideUtil;
import com.h5190007.barbaros_berk_gelenbe_final.utils.ObjectUtil;

public class MiPhoneDetailActivity extends AppCompatActivity {

    ImageView imgCover;
    TextView txtTitle, txtScreenSize, txtScreenTech, txtCPU, txtRAM, txtROM, txtBattery, txtFCamera, txtBCameras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_phone_detail);
        init();
    }

    private void init() {
        String strMovedMiPhone = getIntent().getStringExtra(Constants.CLICKED_MI_PHONE_MOVED_TITLE);
        MiPhoneModel miPhoneModel = ObjectUtil.jsonStringToMiPhone(strMovedMiPhone);

        imgCover = findViewById(R.id.imgCover);
        txtTitle = findViewById(R.id.txtTitle);
        txtCPU = findViewById(R.id.txtCPU);
        txtScreenSize = findViewById(R.id.txtScreenSize);
        txtScreenTech = findViewById(R.id.txtScreenTech);
        txtRAM = findViewById(R.id.txtRAM);
        txtROM = findViewById(R.id.txtROM);
        txtBattery = findViewById(R.id.txtBattery);
        txtFCamera = findViewById(R.id.txtFCameras);
        txtBCameras = findViewById(R.id.txtBCameras);

        txtTitle.setText(miPhoneModel.getAdi());
        txtCPU.setText(miPhoneModel.getIslemci());
        txtScreenSize.setText(miPhoneModel.getEkranBoyutu());
        txtScreenTech.setText(miPhoneModel.getEkranTeknolojisi());
        txtRAM.setText(miPhoneModel.getBellek());
        txtROM.setText(miPhoneModel.getDepolama());
        txtBattery.setText(miPhoneModel.getBatarya());
        txtFCamera.setText(miPhoneModel.getOKamera());
        txtBCameras.setText(miPhoneModel.getAKameralar());

        GlideUtil.downloadImageAndShow(getApplicationContext(), miPhoneModel.getBuyukResimURL(), imgCover);

    }
}