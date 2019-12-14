package com.example.myapplication.ui.home;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.MyAdapter;
import com.example.myapplication.MyPictureAdapter;
import com.example.myapplication.R;
import com.example.myapplication.View.DetailsActivity;
import com.example.myapplication.View.SubcSecydapter;
import com.example.myapplication.View.VarietiesAdapter;
import com.example.myapplication.model.Division;
import com.example.myapplication.model.Family;
import com.example.myapplication.model.Image_;
import com.example.myapplication.model.PlantDetail;
import com.example.myapplication.model.RetroPhoto;
import com.example.myapplication.model.SubSpecy;
import com.example.myapplication.model.Variety;
import com.example.myapplication.network.GetDataService;
import com.example.myapplication.network.RetrofitClientInstance;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailsFragment extends Fragment {


    private MyPictureAdapter adapter;
    private VarietiesAdapter Vadapter;
    private SubcSecydapter Sadapter;



    Button Butt1, Butt2, Butt3, Butt4;


    private RecyclerView recyclerView;
    ProgressDialog progressDialog;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_detail, container, false);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Butt1 = (Button) getView().findViewById(R.id.VarietiesTV);
        Butt2 = (Button) getView().findViewById(R.id.SSButton);
        Butt3 = (Button) getView().findViewById(R.id.Dbutton);
        Butt4 = (Button) getView().findViewById(R.id.FButton);

        LoadData();



        Butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RecyclerView visibil = (RecyclerView) getActivity().findViewById(R.id.RVVarieties);
                if (visibil.getVisibility() == View.GONE){
                    visibil.setVisibility(View.VISIBLE);
                }
                else{
                    visibil.setVisibility(View.GONE);
                }
            }
        });

        Butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RecyclerView visibil = (RecyclerView) getActivity().findViewById(R.id.SUBSTV);
                if (visibil.getVisibility() == View.GONE){
                    visibil.setVisibility(View.VISIBLE);
                }
                else{
                    visibil.setVisibility(View.GONE);
                }
            }
        });

        Butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConstraintLayout visibil = (ConstraintLayout) getActivity().findViewById(R.id.CDD);
                if (visibil.getVisibility() == View.GONE){
                    visibil.setVisibility(View.VISIBLE);
                }
                else{
                    visibil.setVisibility(View.GONE);
                }
            }
        });

        Butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConstraintLayout visibil = (ConstraintLayout) getActivity().findViewById(R.id.FCD);
                if (visibil.getVisibility() == View.GONE){
                    visibil.setVisibility(View.VISIBLE);
                }
                else{
                    visibil.setVisibility(View.GONE);
                }
            }
        });
    }

    public void LoadData(){

        progressDialog = new ProgressDialog(getContext());
        progressDialog.setMessage("Harvest in process...");
        progressDialog.show();

        // Create handle for the RetrofitInstance interface
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Integer intent = getArguments().getInt("id");
        Call<PlantDetail> call = service.getAllDetails(intent);

        call.enqueue(new Callback<PlantDetail>() {
            @Override
            public void onResponse(Call<PlantDetail> call, Response<PlantDetail> response) {
                String VarietieName, SubSpecyName, FName, DName= " ", SDName, SDCFName, FCName, FDCFName, FDName;
                PlantDetail DetailsPlant = response.body();
                Family Familys = DetailsPlant.getFamily();
                Division Divisions = DetailsPlant.getDivision();
                List<Variety> Varieties = DetailsPlant.getVarieties();
                List<SubSpecy> Subpecies = DetailsPlant.getSubSpecies();
                if (Subpecies.size() != 0){
                    SubSpecyName ="Subspecy : " + Subpecies.get(0).getCommonName();
                }
                else {
                    SubSpecyName = "Subspecy : Unknown";
                }
                if (Varieties.size() != 0){
                    VarietieName = "Varieties : " + Varieties.get(0).getStatus();
                }
                else{
                    VarietieName = "Variety : Unknown";
                }
                if (DetailsPlant.getCommonName() !=  null){
                    FName = DetailsPlant.getCommonName().substring(0, 1).toUpperCase() + DetailsPlant.getCommonName().substring(1);
                }
                else{
                    FName = "Unknown";
                }
                if ( Divisions !=  null){
                    Butt3.setEnabled(true);
                    DName = "Division";
                    SDCFName = "Common Family Name\n --- \n" + Divisions.getDivName().substring(0, 1).toUpperCase() +Divisions.getDivName().substring(1);
                    SDName = "Slug\n --- \n" + Divisions.getSlug().substring(0, 1).toUpperCase() +Divisions.getDivName().substring(1);
                }
                else{
                    Butt3.setEnabled(false);
                    DName = "Division : Unknown";
                    SDName = "Unknown";
                    SDCFName = "Unknown";
                }
                if ( Familys !=  null){
                    Butt4.setEnabled(true);
                    FCName = "Family";
                    FDCFName = "Common Family Name\n --- \n" + Familys.getDivName().substring(0, 1).toUpperCase() +Familys.getDivName().substring(1);
                    FDName = "Slug\n --- \n" + Familys.getSlug().substring(0, 1).toUpperCase() +Familys.getDivName().substring(1);
                }
                else{
                    Butt4.setEnabled(false);
                    FCName = "Family : Unknown";
                    FDCFName = "Unknown";
                    FDName = "Unknown";
                }
                //TODO : All Data
                System.out.println(VarietieName);

                List<Image_>  ImageDetail = DetailsPlant.getImages();

                String DetailsTitle = DetailsPlant.getScientificName();



                ShowDetails(ImageDetail, DetailsTitle, VarietieName, SubSpecyName, Varieties, Subpecies, FName, DName , SDName, SDCFName, FCName, FDCFName, FDName);
                progressDialog.dismiss();

            }

            @Override
            public void onFailure(Call<PlantDetail> call, Throwable t) {

                System.out.println("__________________________________________");
                System.out.println("error: " + t);
                progressDialog.dismiss();
                Toast.makeText(getContext(), "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void LoadPictures(List<Image_> ImageDetail){
        recyclerView = getActivity().findViewById(R.id.ImagesDetailsRV);
        adapter = new MyPictureAdapter(getContext(), ImageDetail, new MyPictureAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Image_ item) {

            }
        });
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void LoadSubS(List<SubSpecy> Subspecy) {
        recyclerView = getActivity().findViewById(R.id.SUBSTV);
        Sadapter = new SubcSecydapter(getContext(), Subspecy);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(Sadapter);
    }

    public void LoadVarieties(List<Variety> Varieties){
        recyclerView = getActivity().findViewById(R.id.RVVarieties);
        Vadapter = new VarietiesAdapter(getContext(), Varieties);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(Vadapter);
    }

    public void ShowDetails(List<Image_> ImageDetail, String DetailsTitle, String VName, String SName, List<Variety> Varieties, List<SubSpecy> SubSpecy, String Familyname, String DivisionName, String SDName, String SDCFName, String FCName, String FDCFName, String FDName){
        TextView TitleDetail = getView().findViewById(R.id.TitleDetail);
        TextView FamilyN = getView().findViewById(R.id.familyNTV);
        TextView DivName = getView().findViewById(R.id.Dbutton);
        ImageView DetailImage = getView().findViewById(R.id.imageDetail);

        TextView SlugName = getView().findViewById(R.id.DName);
        TextView DCFName = getView().findViewById(R.id.CFDName);

        TextView FCN = getView().findViewById(R.id.FButton);
        TextView FDCFN = getView().findViewById(R.id.FName);
        TextView FDN = getView().findViewById(R.id.CFFName);


        TextView SBName = getView().findViewById(R.id.SSButton);
        TextView SVName = getView().findViewById(R.id.VarietiesTV);

        FCN.setText(FCName);
        FDCFN.setText(FDCFName);
        FDN.setText(FDName);

        DCFName.setText(SDCFName);
        TitleDetail.setText(DetailsTitle);
        SlugName.setText(SDName);
        DivName.setText(DivisionName);
        FamilyN.setText(Familyname);
        LoadPictures(ImageDetail);
        LoadVarieties(Varieties);
        LoadSubS(SubSpecy);
        SBName.setText(SName);
        SVName.setText(VName);

        if (ImageDetail.size() == 0){
            Picasso.with(getContext()).load("https://www.artedomus.com/images/2114.jpg").into(DetailImage);

        }else{
            Image_ LoadImage = ImageDetail.get(0);
            String ImageUrl = LoadImage.getUrl();
            Picasso.Builder builder = new Picasso.Builder(getContext());
            builder.downloader(new OkHttp3Downloader(getContext()));
            Picasso picasso = builder.build();

           picasso.with(getContext())
                    .load(ImageUrl)
                    .into(DetailImage);
        //    Picasso.with(getContext()).load(ImageUrl).into(DetailImage);
        }
    }
}

