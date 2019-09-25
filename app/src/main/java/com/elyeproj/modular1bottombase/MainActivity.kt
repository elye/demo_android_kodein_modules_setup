package com.elyeproj.modular1bottombase

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.elyeproj.base.BaseApplication
import com.elyeproj.featureone.FeatureOneActivity
import com.elyeproj.featuretwo.FeatureTwoActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.M
import org.kodein.di.generic.instance

class MainActivity : AppCompatActivity(), KodeinAware {

    override val kodein = Kodein {
        extend(BaseApplication.kodein)
        import(mainModule)
    }

    private val appDependent: AppDependent by instance(arg = M("abc", "def"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_result.text = "I have get my dependents from\n$appDependent"

        button_one.setOnClickListener {
            startActivity(Intent(this, FeatureOneActivity::class.java))
        }

        button_two.setOnClickListener {
            startActivity(Intent(this, FeatureTwoActivity::class.java))
        }
    }
}
