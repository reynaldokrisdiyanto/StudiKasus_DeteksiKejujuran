package praktikum.reynaldo.firebaseauthentication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentSatu extends Fragment {

    //Variabel global
    View reynaldo;
    EditText edt1;
    TextView txtView1;
    Button btn1;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Memanggil tampilan fragment
        reynaldo = inflater.inflate(R.layout.activity_fragment_satu, container, false);

        edt1 = reynaldo.findViewById(R.id.editText1);
        txtView1 = reynaldo.findViewById(R.id.textView1);
        btn1 = reynaldo.findViewById(R.id.button1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String input = edt1.getText().toString();   //inputan sudah diambil di variabel input
                input = input.toLowerCase();    //Normalisasi (untuk menyeragamkan semuanya)
                String[]  arrayInput = input.split(" ");
                String hasil = "";

                //Perulangan untuk mencetak
                for (int i = arrayInput.length-1; i > 0; i--){
                    System.out.println(arrayInput[i]);

                    //Akan dieksekusi ketika inputan "bohong"
                    if (arrayInput[i].equals("bohong")) {
                        arrayInput[i-1] = membalik(arrayInput[i-1]);
                    }

                    hasil = arrayInput[0];
                }

                txtView1.setText(hasil);    //Memanggil variabel hasil
            }
        });

        //Mengembalikan activity fragment1 untuk ditampilkan sebagai layout
        return reynaldo;
    }

    public String membalik (String inputan ) {

        String result = "";

        //Logika Membalik
        //equals digunakan untuk inputan string
        if (inputan.equals("bohong")) {
            result = "jujur";
        }
        else
        {
            result = "bohong";
        }


        return result;
    }
}
