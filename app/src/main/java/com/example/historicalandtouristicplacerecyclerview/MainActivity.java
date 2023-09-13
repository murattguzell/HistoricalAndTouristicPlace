package com.example.historicalandtouristicplacerecyclerview;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.historicalandtouristicplacerecyclerview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Places> placesArrayList;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


        placesArrayList = new ArrayList<>();

        //Data

        Places azizPetrusKilisesi = new Places(getString(R.string.azizPetrusKilisesiName), getString(R.string.azizPetrusKilisesiDetails), R.drawable.azizpetruskilisesi);
        Places cennetCehennem = new Places(getString(R.string.cennetCehennemName),getString(R.string.cennetCehennemDetails), R.drawable.cennetcechennem);
        Places tasKopru = new Places(getString(R.string.taskopruName),getString(R.string.taskopruDetails), R.drawable.taskopru);
        Places kizKalesi = new Places(getString(R.string.kizKalesiName),getString(R.string.kizKalesiDetails),R.drawable.kizkalesi);
        Places aspendosTiyatrosu = new Places(getString(R.string.aspendosTiyatrosuName),getString(R.string.aspendosTiyatrosuDetails),R.drawable.aspendostiyatrosu);
        Places Kaleici = new Places(getString(R.string.kaleiciName),getString(R.string.kaleiciDetails),R.drawable.kaleici);
        Places olymposAntikKenti = new Places(getString(R.string.olymposName),getString(R.string.olymposDetails),R.drawable.olymposantikkenti);
        Places insuyuMagarasi = new Places(getString(R.string.insuyunagarasiName),getString(R.string.insuyumagarasiDetails),R.drawable.insuyumagarasi);
        Places hadrianKapisi = new Places(getString(R.string.hadirankapisiName),getString(R.string.hadirankapisiDetails),R.drawable.hadirankapisi);
        Places sumelaManastiri = new Places(getString(R.string.sumelamanstiriName),getString(R.string.sumelaManastiriDetails),R.drawable.sumelamanastiri);
        Places safranboluEvleri = new Places(getString(R.string.safranboluEvleriName),getString(R.string.safranboluEvleriDetails),R.drawable.safranboluevleri);
        Places bandirmaVapuru = new Places(getString(R.string.bandirmaVapuruName),getString(R.string.bandirmaVapuruDetails),R.drawable.bandirmavapuru);
        Places zilkale = new Places(getString(R.string.zilkaleName),getString(R.string.zilkaleDetails),R.drawable.zilkale);
        Places yaliboyuEvleri = new Places(getString(R.string.yaliBoluEvleriName),getString(R.string.yaliBoluEvleriDetails),R.drawable.yaliboyuevleri);

        placesArrayList.add(azizPetrusKilisesi);
        placesArrayList.add(cennetCehennem);
        placesArrayList.add(tasKopru);
        placesArrayList.add(kizKalesi);
        placesArrayList.add(aspendosTiyatrosu);
        placesArrayList.add(Kaleici);
        placesArrayList.add(olymposAntikKenti);
        placesArrayList.add(insuyuMagarasi);
        placesArrayList.add(hadrianKapisi);
        placesArrayList.add(sumelaManastiri);
        placesArrayList.add(safranboluEvleri);
        placesArrayList.add(bandirmaVapuru);
        placesArrayList.add(zilkale);
        placesArrayList.add(yaliboyuEvleri);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        PlacesAdapter placesAdapter = new PlacesAdapter(placesArrayList);
        binding.recyclerView.setAdapter(placesAdapter);


         /*
      //Adapter
     //ListView
     //Mapping --->>>

        ArrayAdapter arrayAdapter =  new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                placesArrayList.stream().map(places -> placesArrayList.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("Places",placesArrayList.get(position));
                startActivity(intent);
            }
        });
        */


    }
}