package com.example.lightsaver.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Status(
     @StringRes val stringResourceId: Int,
     @DrawableRes val imageResourceId: Int
)
