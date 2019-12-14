package com.example.myapplication.network;

import com.example.myapplication.model.PlantDetail;
import com.example.myapplication.model.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GetDataService {
    String paq = "scientific_name=Bellis perennis";
    String rose = "common_name=rose";
    String desert = "common_name=Desert willow";
    @GET("/api/plants?&page_size=50&token=NjBEL3Vsb3FRMW9RZ3R6K2hRbTlkZz09")
    Call<List<RetroPhoto>> getAllPhotos(@Query("page") Integer pageNumb);

    @GET("/api/plants/{id}?token=NjBEL3Vsb3FRMW9RZ3R6K2hRbTlkZz09")

    Call<PlantDetail> getAllDetails(@Path("id") Integer id);
    // @GET("/pokemon")
    // Call<List<RetroPokemon>> getAllPokemons();
}
