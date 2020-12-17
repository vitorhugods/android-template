package xyz.schwaab.template.ui.main

import android.os.Bundle
import xyz.schwaab.template.ui.main.MainFragment

import xyz.schwaab.template.R
import xyz.schwaab.template.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }
}
