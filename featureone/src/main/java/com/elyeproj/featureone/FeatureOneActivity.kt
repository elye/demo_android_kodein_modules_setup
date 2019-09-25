package com.elyeproj.featureone

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.elyeproj.base.BaseApplication
import kotlinx.android.synthetic.main.activity_feature_one.*
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.instance

class FeatureOneActivity : AppCompatActivity(), KodeinAware {

    override val kodein = Kodein {
        extend(BaseApplication.kodein)
        import(featureOneModule)
    }

    private val featureOneDependent: FeatureOneDependent by instance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_one)
        txt_result.text = "I have get my dependents from\n$featureOneDependent\n"
    }
}
