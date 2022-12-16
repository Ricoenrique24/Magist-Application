package com.example.projectakhir.API;

import com.example.projectakhir.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface APIRequestData {
    @GET("coba.php")
    Call<ResponseModel> selectData();

    @FormUrlEncoded
    @POST("tambah.php")
    Call<ResponseModel> createData(
            @Field("nama") String nama,
            @Field("harga_beli") Integer harga_beli,
            @Field("harga_jual") Integer harga_jual,
            @Field("jumlah") Integer jumlah,
            @Field("unit") String unit
    );
}
