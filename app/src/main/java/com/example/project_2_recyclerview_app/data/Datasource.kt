package com.example.project_2_recyclerview_app.data

import com.example.project_2_recyclerview_app.model.App
import com.example.project_2_recyclerview_app.R

class Datasource {
    fun loadApp() : List<App> {
        return listOf(
        App(R.string.app1, R.drawable.earth),
        App(R.string.app2, R.drawable.jupiter),
        App(R.string.app3, R.drawable.mercury),
        App(R.string.app4, R.drawable.neptune),
        App(R.string.app5, R.drawable.saturn),
        App(R.string.app6, R.drawable.uranus),
        App(R.string.app7, R.drawable.venus),
        App(R.string.app8, R.drawable.mars)


            )
      }


}

