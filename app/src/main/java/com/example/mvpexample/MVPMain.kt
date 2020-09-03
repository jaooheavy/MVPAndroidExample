package com.example.mvpexample

interface MVPMain {
    interface View{
        fun showDialog()
        fun dismissDialog()
        fun setMessageDialog(message: String)
    }
    interface Presenter{
        fun onClickHello()
        fun requestSuccess()
    }
    interface Model{
        fun requestModel()
    }
}