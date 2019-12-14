package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.View.DetailsActivity;
import com.example.myapplication.model.RetroPhoto;
import com.example.myapplication.network.GetDataService;
import com.example.myapplication.network.RetrofitClientInstance;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class ViewActivity extends AppCompatActivity {


    private MyAdapter adapter;
    private RecyclerView recyclerView;
    ProgressDialog progressDialog;
    private Integer id = 1;
    public static final String KeyPage = "KeyPage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        final TextView NumbPage = findViewById(R.id.PageNumb);

        Button Next = findViewById(R.id.Psuiv);
        Button Back = findViewById(R.id.Pprec);
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


       progressDialog = new ProgressDialog(ViewActivity.this);
        progressDialog.setMessage("Harvest in process...");
        progressDialog.show();

        // Create handle for the RetrofitInstance interface
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        // Call<List<RetroPokemon>> call = service.getAllPokemons();
        System.out.println("LoadApi :"+id);

        Call<List<RetroPhoto>> call = service.getAllPhotos(this.id);
        call.enqueue(new Callback<List<RetroPhoto>>() {
            @Override
            public void onResponse(Call<List<RetroPhoto>> call, Response<List<RetroPhoto>> response) {
                // public void onResponse(Call<List<RetroPokemon>> call, Response<List<RetroPokemon>> response) {
                progressDialog.dismiss();
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<List<RetroPhoto>> call, Throwable t) {
                // public void onFailure(Call<List<RetroPokemon>> call, Throwable t) {
                System.out.println("__________________________________________");
                System.out.println("error: " + t);
                progressDialog.dismiss();
                Toast.makeText(ViewActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //Method to generate List of data using RecyclerView with custom adapter
    private void generateDataList(final List<RetroPhoto> list) {
 // private void generateDataList(final List<RetroPokemon> list) {
        recyclerView = findViewById(R.id.my_recycler_view);

        adapter = new MyAdapter(this, list, new MyAdapter.OnItemClickListener() {
                @Override
            public void onItemClick(RetroPhoto item) {
                loadDetails(item);
            }
        });
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ViewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        // put this after your definition of your recyclerview
        // input in your data mode in this example a java.util.List, adjust if necessary
        // adapter is your adapter
     /*   ItemTouchHelper.SimpleCallback simpleItemTouchCallback =
                new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
                    @Override
                    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                        return false;
                    }
                 @Override
                    public void onSwiped(RecyclerView.ViewHolder viewHolder, int swipeDir) {
                      //  list.remove(viewHolder.getAdapterPosition());
                        //adapter.notifyItemRemoved(viewHolder.getAdapterPosition());


                    }

                };
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleItemTouchCallback);
        itemTouchHelper.attachToRecyclerView(recyclerView);*/
    }

    private static final String KEY = "key";


    public void loadDetails (RetroPhoto item) {

        // Create an Intent to start the second activity
        Intent detailsIntent = new Intent(this, DetailsActivity.class);

        // Add the count to the extras for the Intent.
        detailsIntent.putExtra(KEY, item.getId());

        // Start the new activity.
        startActivity(detailsIntent);
    }
}
