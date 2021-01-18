package com.h5190007.barbaros_berk_gelenbe_final.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.h5190007.barbaros_berk_gelenbe_final.R;

public class MiPhoneViewHolder extends RecyclerView.ViewHolder {

    ImageView imgPhoneIcon;
    TextView txtPhoneName, txtMonthYear, txtPrice;

    public MiPhoneViewHolder(@NonNull View cardView, MiPhoneAdapter.OnItemClickListener listener) {
        super(cardView);

        imgPhoneIcon = cardView.findViewById(R.id.imgPhoneIcon);
        txtPhoneName = cardView.findViewById(R.id.txtPhoneName);
        txtMonthYear = cardView.findViewById(R.id.txtMonthYear);
        txtPrice = cardView.findViewById(R.id.txtPrice);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(getAdapterPosition());
            }
        });

    }
}
