package com.example.lightsaver.data

import com.example.lightsaver.R

class DataSource(){
    fun loadStatus(): List<Status>{
        return listOf<Status>(
            Status(R.string.status1, R.drawable.person),
            Status(R.string.status2, R.drawable.icons8_sunny_48),
            Status(R.string.status3, R.drawable.icons8_sunny_48),
            Status(R.string.status2, R.drawable.person),
            Status(R.string.status1, R.drawable.icons8_sunny_48),
            Status(R.string.status3, R.drawable.person),
            Status(R.string.status1, R.drawable.icons8_sunny_48),
            Status(R.string.status2, R.drawable.person)
        )
    }
}