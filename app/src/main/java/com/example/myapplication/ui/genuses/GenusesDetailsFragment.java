package com.example.myapplication.ui.genuses;

import android.app.ProgressDialog;
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

import com.example.myapplication.MyPictureAdapter;
import com.example.myapplication.R;
import com.example.myapplication.View.SubcSecydapter;
import com.example.myapplication.View.VarietiesAdapter;
import com.example.myapplication.model.ClassD;
import com.example.myapplication.model.Division;
import com.example.myapplication.model.Family;
import com.example.myapplication.model.Genuses;
import com.example.myapplication.model.Image_;
import com.example.myapplication.model.Kingdom;
import com.example.myapplication.model.Order;
import com.example.myapplication.model.SubKingdom;
import com.example.myapplication.model.SubSpecy;
import com.example.myapplication.model.Variety;
import com.example.myapplication.network.GetDataService;
import com.example.myapplication.network.RetrofitClientInstance;
import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GenusesDetailsFragment extends Fragment {


    private MyPictureAdapter adapter;
    private VarietiesAdapter Vadapter;
    private SubcSecydapter Sadapter;



    Button Butt1, Butt2, Butt3, Butt4, Butt5, Butt6;


    private RecyclerView recyclerView;
    ProgressDialog progressDialog;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_genusesdetail, container, false);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Butt1 = (Button) getView().findViewById(R.id.GenKingdomTV);
        Butt2 = (Button) getView().findViewById(R.id.GenSBButton);
        Butt3 = (Button) getView().findViewById(R.id.GenDbutton);
        Butt4 = (Button) getView().findViewById(R.id.GenCbutton);
        Butt5 = (Button) getView().findViewById(R.id.GenObutton);
        Butt6 = (Button) getView().findViewById(R.id.GenFButton);



        LoadData();



        Butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RecyclerView visibil = (RecyclerView) getActivity().findViewById(R.id.GenVCL);
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
                RecyclerView visibil = (RecyclerView) getActivity().findViewById(R.id.GenSCL);
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
                ConstraintLayout visibil = (ConstraintLayout) getActivity().findViewById(R.id.GenDCL);
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
                ConstraintLayout visibil = (ConstraintLayout) getActivity().findViewById(R.id.GenCCL);
                if (visibil.getVisibility() == View.GONE){
                    visibil.setVisibility(View.VISIBLE);
                }
                else{
                    visibil.setVisibility(View.GONE);
                }
            }
        });

        Butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConstraintLayout visibil = (ConstraintLayout) getActivity().findViewById(R.id.GenOCL);
                if (visibil.getVisibility() == View.GONE){
                    visibil.setVisibility(View.VISIBLE);
                }
                else{
                    visibil.setVisibility(View.GONE);
                }
            }
        });

        Butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConstraintLayout visibil = (ConstraintLayout) getActivity().findViewById(R.id.GenFCL);
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
        String intent = getArguments().getString("nameG");
        Call<Genuses> call = service.getGenusesDetails(intent);

        call.enqueue(new Callback<Genuses>() {
            @Override
            public void onResponse(Call<Genuses> call, Response<Genuses> response) {
                String Name="", Slug="", KName="", KSlug="", SKName="", SKSlug="", DName="", DSlug="", CName="", CSlug="", OName="", OSlug="", FName="", FSlug="" ;
                Genuses DetailsPlant = response.body();
                Kingdom kingdom;
                SubKingdom subKingdom;
                Division division;
                ClassD classD;
                Order order;
                Family family;
                if (DetailsPlant.getKingdom() != null){
                    kingdom = DetailsPlant.getKingdom();
                }
                else
                {
                    kingdom = null;
                }
                if(DetailsPlant.getSubKingdom() != null) {
                    subKingdom = DetailsPlant.getSubKingdom();
                }
                else {
                    subKingdom = null;
                }
                if (DetailsPlant.getDivision() != null){
                    division = DetailsPlant.getDivision();
                }
                else
                {
                    division = null;
                }
                if (DetailsPlant.getClassD() == null){
                    classD = DetailsPlant.getClassD();
                }
                else
                {
                    classD = null;
                }
                if(DetailsPlant.getOrder() != null)
                {
                    order = DetailsPlant.getOrder();
                }
                else
                {
                    order = null;
                }
                if (DetailsPlant.getFamily() !=  null){
                    family = DetailsPlant.getFamily();
                }
                else
                {
                    family = null;
                }


                Name = DetailsPlant.getGenName();
                Slug = DetailsPlant.getSlug();

                if (Name != null){
                    Name = Name.substring(0, 1).toUpperCase() + Name.substring(1);
                }
                else
                {
                    Name = "Unknown";
                }
                if (Slug != null){
                    Slug = Slug.substring(0, 1).toUpperCase() + Slug.substring(1);
                }
                else
                {
                    Slug = "Unknown";
                }
                if (kingdom != null){
                    Butt1.setText("Kingdom");
                    KName ="Name\n ---\n " + kingdom.getKName().substring(0, 1).toUpperCase() + kingdom.getKName().substring(1);
                    KSlug = "Slug\n ---\n" + kingdom.getKSlug().substring(0, 1).toUpperCase() + kingdom.getKSlug().substring(1);
                    Butt1.setEnabled(true);
                }
                else {
                    Butt1.setText("Kingdom : Unknown");
                    Butt1.setEnabled(false);
                }
                if (subKingdom != null){
                    Butt2.setText("SubKingdom");
                    SKName ="Name\n ---\n " + subKingdom.getSKName().substring(0, 1).toUpperCase() + subKingdom.getSKName().substring(1);
                    SKSlug = "Slug\n ---\n" + subKingdom.getSKSlug().substring(0, 1).toUpperCase() + subKingdom.getSKSlug().substring(1);
                    Butt2.setEnabled(true);
                }
                else {
                    Butt2.setText("SubKingdom : Unknown");
                    Butt2.setEnabled(false);
                }
                if (division != null){
                    Butt3.setText("Division");
                    DName ="Name\n ---\n " + division.getDivName().substring(0, 1).toUpperCase() + division.getDivName().substring(1);
                    KSlug = "Slug\n ---\n" + division.getSlug().substring(0, 1).toUpperCase() + division.getSlug().substring(1);
                    Butt3.setEnabled(true);
                }
                else {
                    Butt3.setText("Division : Unknown");
                    Butt3.setEnabled(false);
                }
                if (classD != null){
                    Butt4.setText("Division");
                    CName ="Name\n ---\n " + classD.getCName().substring(0, 1).toUpperCase() + classD.getCName().substring(1);
                    CSlug = "Slug\n ---\n" + classD.getCSlug().substring(0, 1).toUpperCase() + classD.getCSlug().substring(1);
                    Butt4.setEnabled(true);
                }
                else {
                    Butt4.setText("Class : Unknown");
                    Butt4.setEnabled(false);
                }
                if (order != null){
                    Butt5.setText("Order");
                    OName ="Name\n ---\n " + order.getOName().substring(0, 1).toUpperCase() + order.getOName().substring(1);
                    OSlug = "Slug\n ---\n" + order.getOSlug().substring(0, 1).toUpperCase() + order.getOSlug().substring(1);
                    Butt5.setEnabled(true);
                }
                else {
                    Butt5.setText("Order : Unknown");
                    Butt5.setEnabled(false);
                }
                if (family != null){
                    Butt6.setText("Family");
                    FName ="Name\n ---\n " + family.getFName().substring(0, 1).toUpperCase() + family.getFName().substring(1);
                    FSlug = "Slug\n ---\n" + family.getFSlug().substring(0, 1).toUpperCase() + family.getFSlug().substring(1);
                    Butt6.setEnabled(true);
                }
                else {
                    Butt6.setText("Family : Unknown");
                    Butt6.setEnabled(false);
                }
                ShowDetails(Name, Slug, KName, KSlug, SKName, SKSlug, DName, DSlug, CName, CSlug, OName, OSlug, FName, FSlug);
                progressDialog.dismiss();

            }

            @Override
            public void onFailure(Call<Genuses> call, Throwable t) {

                System.out.println("__________________________________________");
                System.out.println("error: " + t);
                progressDialog.dismiss();
                Toast.makeText(getContext(), "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void ShowDetails(String name, String slug, String kName, String kSlug, String sKName, String sKSlug, String dName, String dSlug, String cName, String cSlug, String oName, String oSlug, String fName, String fSlug){
        TextView TitleDetail = getView().findViewById(R.id.GenTitleDetail);
        TextView SlugDetail = getView().findViewById(R.id.GenNTV);

        TextView KName = getView().findViewById(R.id.GenVName);
        TextView KSlug = getView().findViewById(R.id.GenCFVName);

        TextView SKName = getView().findViewById(R.id.GenSCL);
        TextView SKSlug = getView().findViewById(R.id.GenSName);

        TextView DName = getView().findViewById(R.id.GenDCL);
        TextView DSlug = getView().findViewById(R.id.GenDName);

        TextView CName = getView().findViewById(R.id.GenCCL);
        TextView CSlug = getView().findViewById(R.id.GenCName);

        TextView OName = getView().findViewById(R.id.GenOCL);
        TextView OSlug = getView().findViewById(R.id.GenOName);

        TextView FName = getView().findViewById(R.id.GenFCL);
        TextView FSlug = getView().findViewById(R.id.GenFName);


        TitleDetail.setText(name);
        SlugDetail.setText(slug);

        KName.setText(kName);
        KSlug.setText(kSlug);

        SKName.setText(sKName);
        SKSlug.setText(sKSlug);

        DName.setText(dName);
        DSlug.setText(dSlug);

        CName.setText(cName);
        CSlug.setText(cSlug);

        OName.setText(oName);
        OSlug.setText(oSlug);

        FName.setText(fName);
        FSlug.setText(fSlug);

    }
}

