package fr.dc.bdw1.monapplicationandroid;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import fr.dc.bdw1.monapplicationandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public static final String KEY_BUTTON_ID = "BUTTON_ID";

    private ActivityMainBinding ui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());

        ui.buttonRedirectMeat.setOnClickListener(view -> redirectChoice(view.getId()));
        ui.buttonRedirectDrink.setOnClickListener(view -> redirectChoice(view.getId()));
        ui.buttonRedirectFruit.setOnClickListener(view -> redirectChoice(view.getId()));

    }

    /**
     *Lance une autre page et envoie l'id du bouton cliqué
     */
    private void redirectChoice(int id) {
        Intent i = new Intent(this, AdviceActivity.class);
        i.putExtra(KEY_BUTTON_ID, id);
        this.startActivity(i);
    }
}
