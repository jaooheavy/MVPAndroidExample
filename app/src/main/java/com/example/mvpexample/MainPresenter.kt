package com.example.mvpexample

import android.content.Context

class MainPresenter(private val view: MVPMain.View): MVPMain.Presenter {
    private var model : MVPMain.Model = MainModel(this)

    override fun onClickHello() {
        view.showDialog()
        model.requestModel()
    }

    override fun requestSuccess() {
        view.dismissDialog()
    }

    override fun getContext(): Context {
        return view.getContext()
    }
}