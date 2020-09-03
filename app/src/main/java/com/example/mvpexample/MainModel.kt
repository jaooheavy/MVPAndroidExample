package com.example.mvpexample

import android.os.Handler


class MainModel(private val presenter: MVPMain.Presenter): MVPMain.Model {
    override fun requestModel() {
        Handler().postDelayed({
            presenter.requestSuccess()
        }, 3000)
    }
}