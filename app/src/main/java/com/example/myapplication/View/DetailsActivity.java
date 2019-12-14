package com.example.myapplication.View;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.MainActivity;
import com.example.myapplication.MyAdapter;
import com.example.myapplication.MyPictureAdapter;
import com.example.myapplication.R;
import com.example.myapplication.ViewActivity;
import com.example.myapplication.model.Division;
import com.example.myapplication.model.Image_;
import com.example.myapplication.model.PlantDetail;
import com.example.myapplication.model.RetroPhoto;
import com.example.myapplication.model.SubSpecy;
import com.example.myapplication.model.Variety;
import com.example.myapplication.network.GetDataService;
import com.example.myapplication.network.RetrofitClientInstance;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class DetailsActivity extends AppCompatActivity {


    private static final String KEY = "key";
    private MyPictureAdapter adapter;
    private VarietiesAdapter Vadapter;
    private SubcSecydapter Sadapter;


    private RecyclerView recyclerView;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        progressDialog = new ProgressDialog(DetailsActivity.this);
        progressDialog.setMessage("Harvest in process...");
        progressDialog.show();

        // Create handle for the RetrofitInstance interface
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);

        Call<PlantDetail> call = service.getAllDetails(getIntent().getIntExtra(KEY, 0));

        call.enqueue(new Callback<PlantDetail>() {
            @Override
            public void onResponse(Call<PlantDetail> call, Response<PlantDetail> response) {
                String VarietieName, SubSpecyName, FName, DName= " ", SDName, SDCFName;
                PlantDetail DetailsPlant = response.body();

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
                    DName = "Division";
                  SDCFName = "Common Family Name\n --- \n" + Divisions.getDivName().substring(0, 1).toUpperCase() +Divisions.getDivName().substring(1);
                    SDName = "Slug\n --- \n" + Divisions.getSlug().substring(0, 1).toUpperCase() +Divisions.getDivName().substring(1);
                }
                else{
                    DName = "Division : Unknown";
                    SDName = "Unknown";
                    SDCFName = "Unknown";
                }
                //TODO : All Data
                System.out.println(VarietieName);

                List<Image_>  ImageDetail = DetailsPlant.getImages();

                String DetailsTitle = DetailsPlant.getScientificName();



                ShowDetails(ImageDetail, DetailsTitle, VarietieName, SubSpecyName, Varieties, Subpecies, FName, DName , SDName, SDCFName);
                progressDialog.dismiss();

            }

            @Override
            public void onFailure(Call<PlantDetail> call, Throwable t) {

               System.out.println("__________________________________________");
                System.out.println("error: " + t);
                progressDialog.dismiss();
                Toast.makeText(DetailsActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void LoadPictures(List<Image_> ImageDetail){
        recyclerView = findViewById(R.id.ImagesDetailsRV);
       adapter = new MyPictureAdapter(this, ImageDetail, new MyPictureAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Image_ item) {

            }
        });
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void LoadSubS(List<SubSpecy> Subspecy) {
        recyclerView = findViewById(R.id.SUBSTV);
        Sadapter = new SubcSecydapter(this, Subspecy);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(Sadapter);
    }

    public void LoadVarieties(List<Variety> Varieties){
        recyclerView = findViewById(R.id.RVVarieties);
        Vadapter = new VarietiesAdapter(this, Varieties);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(Vadapter);
    }

    public void ShowDetails(List<Image_> ImageDetail, String DetailsTitle, String VName, String SName, List<Variety> Varieties, List<SubSpecy> SubSpecy, String Familyname, String DivisionName, String SDName, String SDCFName){
        TextView TitleDetail = findViewById(R.id.TitleDetail);
        TextView FamilyN = findViewById(R.id.familyNTV);
        TextView DivName = findViewById(R.id.Dbutton);
        ImageView DetailImage = findViewById(R.id.imageDetail);

        TextView SlugName = findViewById(R.id.DName);
        TextView DCFName = findViewById(R.id.CFDName);


        TextView SBName = findViewById(R.id.SSButton);
        TextView SVName = findViewById(R.id.VarietiesTV);
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
            Picasso.with(this).load("https://www.artedomus.com/images/2114.jpg").into(DetailImage);

        }else{
            Image_ LoadImage = ImageDetail.get(0);
            String ImageUrl = LoadImage.getUrl();
            Picasso.with(this).load(ImageUrl).into(DetailImage);
        }
    }

    public void ClickButt(View view){
        RecyclerView visibil = (RecyclerView) findViewById(R.id.RVVarieties);
        if (visibil.getVisibility() == View.GONE){
            visibil.setVisibility(View.VISIBLE);
        }
        else{
            visibil.setVisibility(View.GONE);
        }

    }

    public void ClickButt2(View view){
        RecyclerView visibil = (RecyclerView) findViewById(R.id.SUBSTV);
        if (visibil.getVisibility() == View.GONE){
            visibil.setVisibility(View.VISIBLE);
        }
        else{
            visibil.setVisibility(View.GONE);
        }
    }
    public void ClickButt3(View view){
        ConstraintLayout visibil = (ConstraintLayout) findViewById(R.id.CDD);
        if (visibil.getVisibility() == View.GONE){
            visibil.setVisibility(View.VISIBLE);
        }
        else{
            visibil.setVisibility(View.GONE);
        }
    }
}
