package com.elyeproj.featuretwo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.elyeproj.base.BaseApplication
import kotlinx.android.synthetic.main.activity_feature_two.*
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.instance

class FeatureTwoActivity : AppCompatActivity(), KodeinAware {

    override val kodein = Kodein {
        extend(BaseApplication.kodein)
        import(featureTwoModule)
    }

    private val featureTwoDependent: FeatureTwoDependent by instance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_two)

        txt_result.text = "I have get my dependents from\n$featureTwoDependent"
    }
}
