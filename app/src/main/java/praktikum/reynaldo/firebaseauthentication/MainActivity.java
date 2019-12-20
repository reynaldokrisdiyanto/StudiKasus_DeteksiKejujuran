package praktikum.reynaldo.firebaseauthentication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frame1, new FragmentSatu());    //Untuk menempelkan masing - masing fragment pada frame di main activity
        ft.add(R.id.frame2, new FragmentDua());
        ft.commit();
    }
}
