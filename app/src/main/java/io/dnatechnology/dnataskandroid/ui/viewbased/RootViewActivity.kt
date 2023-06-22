package io.dnatechnology.dnataskandroid.ui.viewbased

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.dnatechnology.dnataskandroid.R

class RootViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_root_view)
    }
}