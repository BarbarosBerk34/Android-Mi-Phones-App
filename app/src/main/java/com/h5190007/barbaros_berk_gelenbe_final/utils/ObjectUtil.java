package com.h5190007.barbaros_berk_gelenbe_final.utils;

import com.google.gson.Gson;
import com.h5190007.barbaros_berk_gelenbe_final.models.MiPhoneModel;

public class ObjectUtil {

    public static String miPhoneToJsonString(MiPhoneModel miPhoneModel)
    {
        Gson gson = new Gson();
        return gson.toJson(miPhoneModel);
    }

    public static MiPhoneModel jsonStringToMiPhone(String jsonString)
    {
        Gson gson = new Gson();
        return  gson.fromJson(jsonString, MiPhoneModel.class);
    }

}
