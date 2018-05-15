package com.example.aula7.architecture.calcular.presenter;

import com.example.aula7.architecture.calcular.interactor.MainActivityInteractor;
import com.example.aula7.architecture.calcular.view.MainActivityView;

/**
 * Created by AULA 7 on 15/05/2018.
 */

public class MainActivityPresenterImpl implements MainActivityPresenter {

    private MainActivityInteractor interactor;
    private MainActivityView view;

    public MainActivityPresenterImpl(MainActivityInteractor interactor) {
        this.interactor = interactor;

    }

    @Override
    public void showResult(String result) {

    }

    @Override
    public void showError(String error) {

    }

    @Override
    public void suma(String num1, String num2) {
        interactor.sumar(num1, num2);
    }
}
