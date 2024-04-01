package com.example.day6joko;

import android.os.Parcel;
import android.os.Parcelable;

public class kopimodel {
    private String listKopi;
    private int logo;
    private String deskripsi;
    private int harga;

    public kopimodel(String listKopi, int logo, String deskripsi, int harga) {
        this.listKopi = listKopi;
        this.logo = logo;
        this.deskripsi = deskripsi;
        this.harga = harga;
    }

    protected kopimodel(Parcel in) {
        listKopi = in.readString();
        logo = in.readInt();
        deskripsi = in.readString();
        harga = in.readInt();
    }


    public String getListKopi() {
        return listKopi;
    }

    public void setListKopi(String listKopi) {
        this.listKopi = listKopi;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }


}