package xyz.schwaab.template.ui.main

import android.os.Bundle
import org.koin.androidx.fragment.android.replace

import xyz.schwaab.template.R
import xyz.schwaab.template.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace<MainFragment>(R.id.container)
                .commitNow()
        }
    }
}
