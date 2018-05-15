package com.example.aula7.architecture.calcular.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.aula7.architecture.R;
import com.example.aula7.architecture.calcular.presenter.MainActivityPresenter;
import com.example.aula7.architecture.calcular.presenter.MainActivityPresenterImpl;

public class MainActivity extends AppCompatActivity  implements MainActivityView{

    private MainActivityPresenter presenter;
    private EditText editTextNum1;
    private EditText editTextNum2;
    private TextView textViewMsg

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPresenterImpl();


    }

    public void onClickSuma (View view){

    }
}
