package com.example.finalexam

import android.content.Context
import android.content.SharedPreferences

class SharedPref(context: Context) {
    private val sharedPref: SharedPreferences =
        context.getSharedPreferences("MySharedPref", Context.MODE_PRIVATE)
    private val editor: SharedPreferences.Editor = sharedPref.edit()

    fun saveData(dataToSave: String) = editor.putString("String1", dataToSave).commit()

    fun getData(): String? = sharedPref.getString("String1", "No Data")


    fun clearData() = editor.clear().commit()
}