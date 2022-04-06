package fr.dc.bdw1.monapplicationandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import fr.dc.bdw1.monapplicationandroid.databinding.ActivityAdviceBinding;
import fr.dc.bdw1.monapplicationandroid.model.AdviceDrink;
import fr.dc.bdw1.monapplicationandroid.model.AdviceFruit;
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

        ui.buttonMenu.setOnClickListener(view -> redirectMenu());

        AdviceMeat meat1 = new AdviceMeat();
        meat1.name = "meat1";
        AdviceDrink drink1 = new AdviceDrink();
        drink1.name = "drink1";
        AdviceFruit fruit1 = new AdviceFruit();
        fruit1.name = "fruit1";

        switch (buttonId) {
            case R.id.buttonRedirectMeat:
                ui.textview.setText(meat1.name);
                ui.imageview1.setImageResource(R.drawable.ic_viande);
                ui.imageView2.setImageResource(R.drawable.ic_viande);
                ui.imageView3.setImageResource(R.drawable.ic_viande);
                ui.imageView4.setImageResource(R.drawable.ic_viande);
                break;
            case R.id.buttonRedirectDrink:
                ui.textview.setText(drink1.name);
                ui.imageview1.setImageResource(R.drawable.ic_boisson);
                ui.imageView2.setImageResource(R.drawable.ic_boisson);
                ui.imageView3.setImageResource(R.drawable.ic_boisson);
                ui.imageView4.setImageResource(R.drawable.ic_boisson);
                break;
            case R.id.buttonRedirectFruit:
                ui.textview.setText(fruit1.name);
                ui.imageview1.setImageResource(R.drawable.ic_fruit);
                ui.imageView2.setImageResource(R.drawable.ic_fruit);
                ui.imageView3.setImageResource(R.drawable.ic_fruit);
                ui.imageView4.setImageResource(R.drawable.ic_fruit);
                break;
            default: break;
        }
    }

    private void redirectMenu() {
        Intent i = new Intent(this, MainActivity.class);
        this.startActivity(i);
    }
}