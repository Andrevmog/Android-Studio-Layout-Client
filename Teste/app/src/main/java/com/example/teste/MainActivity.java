package com.example.teste;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView imgUser;
    private EditText editTextUser;
    private EditText editTextAno;
    private EditText editTextGender;
    private EditText editTextEmail;
    private EditText editTextPhone;
    private EditText editTextLocal;
    private EditText editTextPass;
    private EditText editTextEye;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgUser = findViewById(R.id.imgUser);
        editTextUser = findViewById(R.id.textUser);
        editTextAno = findViewById(R.id.textAno);
        editTextGender = findViewById(R.id.textGender);
        editTextEmail = findViewById(R.id.textEmail);
        editTextPhone = findViewById(R.id.textPhone);
        editTextLocal = findViewById(R.id.textGPS);
        editTextPass = findViewById(R.id.textPass);
        editTextEye = findViewById(R.id.textEye);

        editTextUser.addTextChangedListener(MaskEditUtil.mask(editTextUser, "Joshua Miller"));
        editTextAno.addTextChangedListener(MaskEditUtil.mask(editTextAno,"Informe sua idade"));
        editTextGender.addTextChangedListener(MaskEditUtil.mask(editTextGender,"Informe seu gênero"));
        editTextEmail.addTextChangedListener(MaskEditUtil.mask(editTextEmail,"joshuamiller06@gmail.com"));
        editTextPhone.addTextChangedListener(MaskEditUtil.mask(editTextPhone,"+555193104587"));
        editTextLocal.addTextChangedListener(MaskEditUtil.mask(editTextLocal,"Endereço"));
        editTextPass.addTextChangedListener(MaskEditUtil.mask(editTextPass,"0123456789"));
        editTextEye.addTextChangedListener(MaskEditUtil.mask(editTextEye,"**********"));

        imgUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Opa, estou locao!",Toast.LENGTH_LONG).show();
            }
        });


    }
}