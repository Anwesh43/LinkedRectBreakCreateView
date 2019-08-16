package com.anwesh.uiprojects.linkedboxbreakcreateview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.boxbreakcreateview.BoxBreakCreateView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BoxBreakCreateView.create(this)
    }
}
