package com.example.myapplication.ui.genuses;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.View.MyPictureAdapter;
import com.example.myapplication.R;
import com.example.myapplication.View.SubcSecydapter;
import com.example.myapplication.View.VarietiesAdapter;
import com.example.myapplication.model.ClassD;
import com.example.myapplication.model.Division;
import com.example.myapplication.model.Family;
import com.example.myapplication.model.Genus;
import com.example.myapplication.model.Kingdom;
import com.example.myapplication.model.Order;
import com.example.myapplication.model.SubKingdom;
import com.example.myapplication.network.GetDataService;
import com.example.myapplication.network.RetrofitClientInstance;

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
        LoadData();

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






        Butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConstraintLayout visibil = (ConstraintLayout) getActivity().findViewById(R.id.GenVCL);
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
                ConstraintLayout visibil = (ConstraintLayout) getActivity().findViewById(R.id.GenSCL);
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
        System.out.println("-------------------------------------------------------------------------------------------------------------------\n"+intent+"\n-----------------------------------------------------------------------------------------------------------\n");
        Call<List<Genus>> call = service.getGenusesDetails(intent);

        call.enqueue(new Callback<List<Genus>>() {
            @Override
            public void onResponse(Call<List<Genus>> call, Response<List<Genus>> response) {
                String Name="", Slug="", KName="", KSlug="", SKName="", SKSlug="", DName="", DSlug="", CName="", CSlug="", OName="", OSlug="", FName="", FSlug="" ;
                List<Genus> DetailsPlant = response.body();
                Kingdom kingdom;
                SubKingdom subKingdom;
                Division division;
                ClassD classD;
                Order order;
                Family family;
                if (DetailsPlant.size() != 0) {


                    if (DetailsPlant.get(0).getKingdom() != null) {
                        kingdom = DetailsPlant.get(0).getKingdom();
                    } else {
                        kingdom = null;
                    }
                    if (DetailsPlant.get(0).getSubKingdom() != null) {
                        subKingdom = DetailsPlant.get(0).getSubKingdom();
                    } else {
                        subKingdom = null;
                    }
                    if (DetailsPlant.get(0).getDivision() != null) {
                        division = DetailsPlant.get(0).getDivision();
                    } else {
                        division = null;
                    }
                    if (DetailsPlant.get(0).getClassD() == null) {
                        classD = DetailsPlant.get(0).getClassD();
                    } else {
                        classD = null;
                    }
                    if (DetailsPlant.get(0).getOrder() != null) {
                        order = DetailsPlant.get(0).getOrder();
                    } else {
                        order = null;
                    }
                    if (DetailsPlant.get(0).getFamily() != null) {
                        family = DetailsPlant.get(0).getFamily();
                    } else {
                        family = null;
                    }

                    Name = DetailsPlant.get(0).getName();
                    Slug = DetailsPlant.get(0).getSlug();

                    if (Name != null) {
                        Name = Name.substring(0, 1).toUpperCase() + Name.substring(1);
                    } else {
                        Name = "Unknown";
                    }
                    if (Slug != null) {
                        Slug = Slug.substring(0, 1).toUpperCase() + Slug.substring(1);
                    } else {
                        Slug = "Unknown";
                    }
                    if (kingdom != null) {
                        KName = kingdom.getKName();
                        Butt1.setText("Kingdom");
                        if (KName != null) {
                            KName = "Name\n---\n " + kingdom.getKName().substring(0, 1).toUpperCase() + kingdom.getKName().substring(1);
                        } else {
                            KName = "Name\n---\nUnknown";
                        }
                        KSlug = kingdom.getKSlug();
                        if (KSlug != null) {
                            KSlug = "Slug\n ---\n" + kingdom.getKSlug().substring(0, 1).toUpperCase() + kingdom.getKSlug().substring(1);
                        } else {
                            KSlug = "Slug\n---\nUnknown";
                        }
                        Butt1.setEnabled(true);
                    } else {
                        Butt1.setText("Kingdom : Unknown");
                        Butt1.setEnabled(false);
                    }
                    if (subKingdom != null) {
                        SKName = subKingdom.getSKName();
                        if (SKName != null) {
                            SKName = "Name\n---\n " + SKName.substring(0, 1).toUpperCase() + SKName.substring(1);
                        } else {
                            SKName = "Name\n---\nUnknown";
                        }
                        SKSlug = subKingdom.getSKSlug();
                        if (SKSlug != null) {
                            SKSlug = "Slug\n ---\n" + SKSlug.substring(0, 1).toUpperCase() + SKSlug.substring(1);
                        } else {
                            SKSlug = "Slug\n---\nUnknown";
                        }
                        Butt2.setText("SubKingdom");
                        Butt2.setEnabled(true);
                    } else {
                        Butt2.setText("SubKingdom : Unknown");
                        Butt2.setEnabled(false);
                    }
                    if (division != null) {
                        DName = division.getDivName();
                        if (DName != null) {
                            DName = "Name\n---\n " + DName.substring(0, 1).toUpperCase() + DName.substring(1);
                        } else {
                            DName = "Name\n---\nUnknown";
                        }
                        DSlug = division.getSlug();
                        if (DSlug != null) {
                            DSlug = "Slug\n ---\n" + DSlug.substring(0, 1).toUpperCase() + DSlug.substring(1);
                        } else {
                            DSlug = "Slug\n---\nUnknown";
                        }
                        Butt3.setText("Division");
                        Butt3.setEnabled(true);
                    } else {
                        Butt3.setText("Division : Unknown");
                        Butt3.setEnabled(false);
                    }
                    if (classD != null) {
                        CName = classD.getCName();
                        if (CName != null) {
                            CName = "Name\n---\n " + CName.substring(0, 1).toUpperCase() + CName.substring(1);
                        } else {
                            CName = "Name\n---\nUnknown";
                        }
                        CSlug = classD.getCSlug();
                        if (CSlug != null) {
                            CSlug = "Slug\n ---\n" + CSlug.substring(0, 1).toUpperCase() + CSlug.substring(1);
                        } else {
                            CSlug = "Slug\n---\nUnknown";
                        }
                        Butt4.setText("Division");
                        Butt4.setEnabled(true);
                    } else {
                        Butt4.setText("Class : Unknown");
                        Butt4.setEnabled(false);
                    }
                    if (order != null) {
                        Butt5.setText("Order");
                        OName = order.getOName();
                        if (OName != null) {
                            OName = "Name\n---\n " + OName.substring(0, 1).toUpperCase() + OName.substring(1);
                        } else {
                            OName = "Name\n---\nUnknown";
                        }
                        OSlug = order.getOSlug();
                        if (OSlug != null) {
                            OSlug = "Slug\n ---\n" + OSlug.substring(0, 1).toUpperCase() + OSlug.substring(1);
                        } else {
                            OSlug = "Slug\n---\nUnknown";
                        }
                        Butt5.setEnabled(true);
                    } else {
                        Butt5.setText("Order : Unknown");
                        Butt5.setEnabled(false);
                    }
                    if (family != null) {
                        Butt6.setText("Family");
                        FName = family.getFName();
                        if (FName != null) {
                            FName = "Name\n---\n " + FName.substring(0, 1).toUpperCase() + FName.substring(1);
                        } else {
                            FName = "Name\n---\nUnknown";
                        }
                        FSlug = family.getFSlug();
                        if (FSlug != null) {
                            FSlug = "Slug\n ---\n" + FSlug.substring(0, 1).toUpperCase() + FSlug.substring(1);
                        } else {
                            FSlug = "Slug\n---\nUnknown";
                        }
                        Butt6.setEnabled(true);
                    } else {
                        Butt6.setText("Family : Unknown");
                        Butt6.setEnabled(false);
                    }
                    ShowDetails(Name, Slug, KName, KSlug, SKName, SKSlug, DName, DSlug, CName, CSlug, OName, OSlug, FName, FSlug);
                }else {
                    Toast.makeText(getContext(), "Unable to get information...", Toast.LENGTH_SHORT).show();
                }
                progressDialog.dismiss();

            }

            @Override
            public void onFailure(Call<List<Genus>> call, Throwable t) {

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

        TextView SKName = getView().findViewById(R.id.GenSName);
        TextView SKSlug = getView().findViewById(R.id.GenCFSName);

        TextView DName = getView().findViewById(R.id.GenDName);
        TextView DSlug = getView().findViewById(R.id.GenCFDName);

        TextView CName = getView().findViewById(R.id.GenCName);
        TextView CSlug = getView().findViewById(R.id.GenCFCName);

        TextView OName = getView().findViewById(R.id.GenOName);
        TextView OSlug = getView().findViewById(R.id.GenCFOName);

        TextView FName = getView().findViewById(R.id.GenFName);
        TextView FSlug = getView().findViewById(R.id.GenCFFName);


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

