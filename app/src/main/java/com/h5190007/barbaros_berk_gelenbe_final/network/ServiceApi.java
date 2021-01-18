package com.h5190007.barbaros_berk_gelenbe_final.network;

import com.h5190007.barbaros_berk_gelenbe_final.models.MiPhoneModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ServiceApi {

    @GET("MiPhonesAPI.json")
    Observable<List<MiPhoneModel>> getMiPhones();
}