package com.h5190007.barbaros_berk_gelenbe_final.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.h5190007.barbaros_berk_gelenbe_final.R;
import com.h5190007.barbaros_berk_gelenbe_final.models.MiPhoneModel;
import com.h5190007.barbaros_berk_gelenbe_final.utils.GlideUtil;


import java.util.List;

public class MiPhoneAdapter extends RecyclerView.Adapter<MiPhoneViewHolder> {


    List<MiPhoneModel> miPhones;
    Context context;
    OnItemClickListener listener;

    public interface OnItemClickListener {
        void onClick(int position);
    }

    public MiPhoneAdapter(List<MiPhoneModel> miPhones, Context context, OnItemClickListener listener) {
        this.miPhones = miPhones;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MiPhoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mi_phone, parent, false);
        return new MiPhoneViewHolder(itemView, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull MiPhoneViewHolder viewHolder, int position) {
        viewHolder.txtPrice.setText(miPhones.get(position).getFiyati());
        viewHolder.txtMonthYear.setText(miPhones.get(position).getDuyurulmaTarihi());
        viewHolder.txtPhoneName.setText(miPhones.get(position).getAdi());
        GlideUtil.downloadImageAndShow(context, miPhones.get(position).getKucukResimURL(), viewHolder.imgPhoneIcon);
    }


    @Override
    public int getItemCount() {
        return miPhones.size();
    }
}
