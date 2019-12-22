package com.example.myapplication.ui.genuses;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.View.GenusesAdapter;
import com.example.myapplication.R;
import com.example.myapplication.model.Genuses;
import com.example.myapplication.network.GetDataService;
import com.example.myapplication.network.RetrofitClientInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GenusesFragment extends Fragment {


    private GenusesAdapter adapter;
    private RecyclerView recyclerView;
    ProgressDialog progressDialog;
    private Integer id = 1;
    public static final String KeyPage = "KeyPage";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_genuses, container, false);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SetNumbPage();

    }

    private void SetNumbPage() {
        final TextView NumbPage = (TextView) getView().findViewById(R.id.PageNumb);

        Button Next = (Button) getView().findViewById(R.id.Psuiv);
        Button Back = (Button) getView().findViewById(R.id.Pprec);
        NumbPage.setText(String.format("%d",this.id));
        loadAPI();

        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id++;
                System.out.println("Onclick :"+id);
                NumbPage.setText(String.format("%d",id));
                loadAPI();
            }
        });

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (id > 1){
                    id--;
                    NumbPage.setText(String.format("%d",id));
                    loadAPI();
                }
            }
        });
    }

    private void loadAPI(){


        progressDialog = new ProgressDialog(getContext());
        progressDialog.setMessage("Harvest in process...");
        progressDialog.show();

        // Create handle for the RetrofitInstance interface
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        // Call<List<RetroPokemon>> call = service.getAllPokemons();
        System.out.println("LoadApi :"+id);

        Call<List<Genuses>> call = service.getAllGenuses(this.id);
        call.enqueue(new Callback<List<Genuses>>() {
            @Override
            public void onResponse(Call<List<Genuses>> call, Response<List<Genuses>> response) {
                // public void onResponse(Call<List<RetroPokemon>> call, Response<List<RetroPokemon>> response) {
                progressDialog.dismiss();
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<Genuses>> call, Throwable t) {
                // public void onFailure(Call<List<RetroPokemon>> call, Throwable t) {
                System.out.println("__________________________________________");
                System.out.println("error: " + t);
                progressDialog.dismiss();
                Toast.makeText(getContext(), "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //Method to generate List of data using RecyclerView with custom adapter
    private void generateDataList(final List<Genuses> list) {
        // private void generateDataList(final List<RetroPokemon> list) {
        recyclerView = getActivity().findViewById(R.id.GenusesRV);

        adapter = new GenusesAdapter(getContext(), list, new GenusesAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Genuses item) {
               loadDetails(item);
            }
        });
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void loadDetails (Genuses item) {
        GenusesDetailsFragment genusesDetailsFragment = new GenusesDetailsFragment();
        Bundle argument = new Bundle();

        argument.putString("nameG", item.getGenName());
        genusesDetailsFragment.setArguments(argument);

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.nav_host_fragment, genusesDetailsFragment);

        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}