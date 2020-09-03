package com.example.mvpexample

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MVPMain.View {

    private var presenterMain: MVPMain.Presenter = MainPresenter(this)
    private var progressDialog = ProgressDialog(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setMessageDialog("Aguarde...")

        tvHello.setOnClickListener { presenterMain.onClickHello() }
    }

    override fun showDialog() {
        progressDialog.show()
    }

    override fun dismissDialog() {
        progressDialog.dismiss()
    }

    override fun setMessageDialog(message: String) {
        progressDialog.setMessage(message)
    }
}