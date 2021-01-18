package com.h5190007.barbaros_berk_gelenbe_final.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MiPhoneModel {

    @SerializedName("Adi")
    @Expose
    private String adi;
    @SerializedName("Fiyati")
    @Expose
    private String fiyati;
    @SerializedName("EkranBoyutu")
    @Expose
    private String ekranBoyutu;
    @SerializedName("EkranTeknolojisi")
    @Expose
    private String ekranTeknolojisi;
    @SerializedName("Batarya")
    @Expose
    private String batarya;
    @SerializedName("Islemci")
    @Expose
    private String islemci;
    @SerializedName("Bellek")
    @Expose
    private String bellek;
    @SerializedName("Depolama")
    @Expose
    private String depolama;
    @SerializedName("AKameralar")
    @Expose
    private String aKameralar;
    @SerializedName("OKamera")
    @Expose
    private String oKamera;
    @SerializedName("DuyurulmaTarihi")
    @Expose
    private String duyurulmaTarihi;
    @SerializedName("BuyukResimURL")
    @Expose
    private String buyukResimURL;
    @SerializedName("KucukResimURL")
    @Expose
    private String kucukResimURL;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getFiyati() {
        return fiyati;
    }

    public void setFiyati(String fiyati) {
        this.fiyati = fiyati;
    }

    public String getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(String ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    public String getEkranTeknolojisi() {
        return ekranTeknolojisi;
    }

    public void setEkranTeknolojisi(String ekranTeknolojisi) {
        this.ekranTeknolojisi = ekranTeknolojisi;
    }

    public String getBatarya() {
        return batarya;
    }

    public void setBatarya(String batarya) {
        this.batarya = batarya;
    }

    public String getIslemci() {
        return islemci;
    }

    public void setIslemci(String islemci) {
        this.islemci = islemci;
    }

    public String getBellek() {
        return bellek;
    }

    public void setBellek(String bellek) {
        this.bellek = bellek;
    }

    public String getDepolama() {
        return depolama;
    }

    public void setDepolama(String depolama) {
        this.depolama = depolama;
    }

    public String getAKameralar() {
        return aKameralar;
    }

    public void setAKameralar(String aKameralar) {
        this.aKameralar = aKameralar;
    }

    public String getOKamera() {
        return oKamera;
    }

    public void setOKamera(String oKamera) {
        this.oKamera = oKamera;
    }

    public String getDuyurulmaTarihi() {
        return duyurulmaTarihi;
    }

    public void setDuyurulmaTarihi(String duyurulmaTarihi) {
        this.duyurulmaTarihi = duyurulmaTarihi;
    }

    public String getBuyukResimURL() {
        return buyukResimURL;
    }

    public void setBuyukResimURL(String buyukResimURL) {
        this.buyukResimURL = buyukResimURL;
    }

    public String getKucukResimURL() {
        return kucukResimURL;
    }

    public void setKucukResimURL(String kucukResimURL) {
        this.kucukResimURL = kucukResimURL;
    }

}
