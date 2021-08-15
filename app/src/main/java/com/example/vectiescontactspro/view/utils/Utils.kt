package com.example.vectiescontactspro.view.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.app.ActivityOptions
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Environment


class Utils{

    companion object{

        fun <T> Context.openActivity(it: Class<T>, activity: Activity, extras: Bundle.() -> Unit = {}) {
            val intent = Intent(this, it)
            intent.putExtras(Bundle().apply(extras))
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(activity).toBundle())
            }
            /*activity.overridePendingTransition(R.anim.enter_right_to_left, R.anim.exit_left_to_right)*/
        }

    }

}
