package praktikum.reynaldo.firebaseauthentication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentDua extends Fragment {

    //Variabel global
    View reynaldo;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Memanggil tampilan fragment
        reynaldo = inflater.inflate(R.layout.activity_fragment_dua, container, false);
        //Mengembalikan activity fragment1 untuk ditampilkan sebagai layout
        return reynaldo;
    }
}
