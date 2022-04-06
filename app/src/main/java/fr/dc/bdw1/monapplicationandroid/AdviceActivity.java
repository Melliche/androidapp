package fr.dc.bdw1.monapplicationandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import fr.dc.bdw1.monapplicationandroid.databinding.ActivityAdviceBinding;
import fr.dc.bdw1.monapplicationandroid.model.AdviceMeat;

public class AdviceActivity extends AppCompatActivity {

    public static final String NAME_CHOICE = "NAME_CHOICE";

    private ActivityAdviceBinding ui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ui = ActivityAdviceBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());

        int buttonId = this.getIntent().getIntExtra(MainActivity.KEY_BUTTON_ID, -1);

        AdviceMeat meat1 = new AdviceMeat();
        meat1.name = "eben";



        switch (buttonId) {
            case R.id.buttonRedirectMeat:
                ui.textView.setText(meat1.name);
                break;
            case R.id.buttonRedirectDrink:
                break;
            case R.id.buttonRedirectFruit:
                break;
            default: break;
        }
    }
}