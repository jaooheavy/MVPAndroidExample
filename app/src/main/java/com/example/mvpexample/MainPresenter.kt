package com.example.mvpexample

class MainPresenter(private val view: MVPMain.View): MVPMain.Presenter {
    private var model : MVPMain.Model = MainModel(this)

    override fun onClickHello() {
        view.showDialog()
        model.requestModel()
    }

    override fun requestSuccess() {
        view.dismissDialog()
    }
}