package com.example.mvpexample

import android.content.Context

interface MVPMain {
    interface View{
        fun showDialog()
        fun dismissDialog()
        fun setMessageDialog(message: String)
        fun getContext():Context
    }
    interface Presenter{
        fun onClickHello()
        fun requestSuccess()
        fun getContext():Context
    }
    interface Model{
        fun requestModel()
    }
}