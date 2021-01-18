package com.h5190007.barbaros_berk_gelenbe_final.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.h5190007.barbaros_berk_gelenbe_final.R;
import com.h5190007.barbaros_berk_gelenbe_final.adapter.MiPhoneAdapter;
import com.h5190007.barbaros_berk_gelenbe_final.models.MiPhoneModel;
import com.h5190007.barbaros_berk_gelenbe_final.network.Service;
import com.h5190007.barbaros_berk_gelenbe_final.utils.AlertDialogUtil;
import com.h5190007.barbaros_berk_gelenbe_final.utils.Constants;
import com.h5190007.barbaros_berk_gelenbe_final.utils.NetworkUtil;
import com.h5190007.barbaros_berk_gelenbe_final.utils.ObjectUtil;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class ListActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        init();
    }

    @Override
    public void onBackPressed() {
        AlertDialogUtil.showAlertDialog(
                this, getString(R.string.alert_exit_tit), getString(R.string.alert_exit_msg), Constants.ALERT_EXIT
        );
    }

    private void init() {
        getMiPhones();
    }

    void getMiPhones() {

        new Service().getServiceApi().getMiPhones().
                subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<MiPhoneModel>>() {

                    List<MiPhoneModel> miPhones = new ArrayList<>();

                    @Override
                    public void onSubscribe(Disposable d) {
                        progressDialog = new ProgressDialog(ListActivity.this);
                        progressDialog.setTitle(getString(R.string.progress_wait_tit));
                        progressDialog.setMessage(getString(R.string.progress_wait_msg));
                        progressDialog.setCancelable(false);
                    }

                    @Override
                    public void onNext(List<MiPhoneModel> miPhoneList) {
                        progressDialog.show();
                        miPhones = miPhoneList;
                    }

                    @Override
                    public void onError(Throwable e) {
                        progressDialog.dismiss();

                    }

                    @Override
                    public void onComplete() {

                        if (miPhones.size() > 0) {
                            initRecycleView(miPhones);
                        }
                        progressDialog.dismiss();
                    }
                });
    }

    private void switchActivity(MiPhoneModel clickedMiPhone) {
        String strClickedMiPhone = ObjectUtil.miPhoneToJsonString(clickedMiPhone);
        startActivity(
                new Intent(getApplicationContext(), MiPhoneDetailActivity.class)
                .putExtra(Constants.CLICKED_MI_PHONE_MOVED_TITLE, strClickedMiPhone)
        );
    }

    private void initRecycleView(List<MiPhoneModel> miPhoneList) {
        recyclerView = findViewById(R.id.rcvMiPhones);
        MiPhoneAdapter miPhoneAdapter = new MiPhoneAdapter(miPhoneList, getApplicationContext(), new MiPhoneAdapter.OnItemClickListener() {
            @Override
            public void onClick(int position) {
                MiPhoneModel clikedMiPhone = miPhoneList.get(position);
                switchActivity(clikedMiPhone);
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(miPhoneAdapter);
    }
}