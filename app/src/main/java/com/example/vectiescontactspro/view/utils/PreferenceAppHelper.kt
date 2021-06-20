package com.example.vectiescontactspro.view.utils

import android.content.Context
import android.content.SharedPreferences

class PreferenceAppHelper(context: Context) {


    var PRIVATE_MODE = 0
    val PREF_NAME = "vecties"
    val BEARER_TOKEN = "bearer_token"
    val USER_ID = "user_id"
    val USER_EMAIL = "user_email"
    val USER_TYPE = "user_type"
    val IS_LOGIN = "islogin"
    val IS_FIRST_TIME = "isfirsttime"
    val USER_PASSWORD = "password"
    val USER_NAME = "user_name"
    val USER_PROFILE = "user_profile"
    val SOTRAGE_PERMISSION = "storage_permission"
    val CAMERA_PERMISSION = "camera_permission"
    val AUDIO_PERMISSION = "record_audio_permission"
    val FCM_TOKEN = "fcm_token"
    val CURRENT_THEME = "current_theme"
    val CURRENT_PRIMARY_COLOR = "current_primary_color"
    val CURRENT_PRIMARY_DARK_COLOR = "current_primary_dark_color"
    val CURRENT_ACCENT_COLOR = "current_accent_color"
    val CYAN_THEME = "cyan"
    val MAIN_LOGO = "main_logo"
    val WATERMARK_ICON = "watermark_icon"
    val CREATE_COMMUNITY_POST_PERMISSION = "create_community_post_permission"
    val COMMUNITY_POST_PERMISSION = "community_post_permission"
    val ECOMMERCE_STORE_PERMISSION = "e_commerce_store"
    val ANNOUNCEMENT_PERMISSION = "announcement"
    val CHANGE_PASSWORD_PERMISSION = "change_password"
    val LOGIN_BACKGROUND = "login_background"
    val BRAND_INFO_COMPLETE = "brand_info_complete"



    val mSharedPreferences: SharedPreferences = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE)

    private fun setStringInPrefs(key: String, value: String) {
        val editor = mSharedPreferences!!.edit()
        editor.putString(key, value)
        editor.apply()
    }

    private fun setIntInPrefs(key: String, value: Int) {
        val editor = mSharedPreferences!!.edit()
        editor.putInt(key, value)
        editor.apply()
    }

    fun clearAllData() {
        val editor = mSharedPreferences!!.edit()
        editor.clear()
        editor.apply()
    }


    fun setBearerToken(status: String) {
        setStringInPrefs(BEARER_TOKEN, status)
    }

    fun getBearerToken(): String? {
        return mSharedPreferences!!.getString(BEARER_TOKEN, "")
    }

    fun setIsFirstTime(status: String) {
        setStringInPrefs(IS_FIRST_TIME, status)
    }

    fun getIsFirstTime(): String? {
        return mSharedPreferences!!.getString(IS_FIRST_TIME, "0")
    }


    fun setFCMToken(status: String) {
        setStringInPrefs(FCM_TOKEN, status)
    }

    fun getFCMToken(): String? {
        return mSharedPreferences!!.getString(FCM_TOKEN, "")
    }
    fun setStoragePermission(status: String) {
        setStringInPrefs(SOTRAGE_PERMISSION, status)
    }

    fun getStoragePermission(): String? {
        return mSharedPreferences!!.getString(SOTRAGE_PERMISSION, "0")
    }
    fun setCameraPermission(status: String) {
        setStringInPrefs(CAMERA_PERMISSION, status)
    }

    fun getCameraPermission(): String? {
        return mSharedPreferences!!.getString(CAMERA_PERMISSION, "0")
    }
    fun setAudioPermission(status: String) {
        setStringInPrefs(AUDIO_PERMISSION, status)
    }

    fun getAudioPermission(): String? {
        return mSharedPreferences!!.getString(AUDIO_PERMISSION, "0")
    }

    fun setUserId(status: String) {
        setStringInPrefs(USER_ID, status)
    }

    fun getUserType(): String? {
        return mSharedPreferences!!.getString(USER_TYPE, "")
    }
    fun setUserType(status: String) {
        setStringInPrefs(USER_TYPE, status)
    }

    fun getUserId(): String? {
        return mSharedPreferences!!.getString(USER_ID, "")
    }
    fun setIsLogin(status: String) {
        setStringInPrefs(IS_LOGIN, status)
    }

    fun getIsLogin(): String? {
        return mSharedPreferences!!.getString(IS_LOGIN, "0")
    }
    fun setUserPassword(status: String) {
        setStringInPrefs(USER_PASSWORD, status)
    }

    fun getUserPassword(): String? {
        return mSharedPreferences!!.getString(USER_PASSWORD, "")
    }

    fun setUserEmail(status: String) {
        setStringInPrefs(USER_EMAIL, status)
    }

    fun getUserEmail(): String? {
        return mSharedPreferences!!.getString(USER_EMAIL, "")
    }

    fun setCurrentTheme(status: String) {
        setStringInPrefs(CURRENT_THEME, status)
    }
    //default theme is set here
    fun getCurrentTheme(): String? {
        return mSharedPreferences!!.getString(CURRENT_THEME, CYAN_THEME)
    }

    //primary color
    fun setCurrentPrimaryColor(status: String) {
        setStringInPrefs(CURRENT_PRIMARY_COLOR, status)
    }
    //default theme is set here
    fun getCurrentPrimaryColor(): String? {
        return mSharedPreferences!!.getString(CURRENT_PRIMARY_COLOR, "#00b0f0")
    }
    //primary dark color
    fun setCurrentPrimaryDarkColor(status: String) {
        setStringInPrefs(CURRENT_PRIMARY_DARK_COLOR, status)
    }
    //default theme is set here
    fun getCurrentPrimaryDarkColor(): String? {
        return mSharedPreferences!!.getString(CURRENT_PRIMARY_DARK_COLOR, "#0f8fc6")
    }

    //Accent color
    fun setCurrentAccentColor(status: String) {
        setStringInPrefs(CURRENT_ACCENT_COLOR, status)
    }
    //default theme is set here
    fun getCurrentAccentColor(): String? {
        return mSharedPreferences!!.getString(CURRENT_ACCENT_COLOR, "#0f8fc6")
    }

    fun setUserName(status: String) {
        setStringInPrefs(USER_NAME, status)
    }

    fun getUserName(): String? {
        return mSharedPreferences!!.getString(USER_NAME, "")
    }

    fun setUserProfile(status: String) {
        setStringInPrefs(USER_PROFILE, status)
    }

    fun getUserProfile(): String? {
        return mSharedPreferences!!.getString(USER_PROFILE, "")
    }

    fun setMainLogo(status: String) {
        setStringInPrefs(MAIN_LOGO, status)
    }

    fun getMainLogo(): String? {
        return mSharedPreferences!!.getString(MAIN_LOGO, "0")
    }

    fun setWatermarkIcon(status: String) {
        setStringInPrefs(WATERMARK_ICON, status)
    }

    fun getWatermarkIcon(): String? {
        return mSharedPreferences!!.getString(WATERMARK_ICON, "0")
    }

    fun setCreateCommunityPostPermission(status: String) {
        setStringInPrefs(CREATE_COMMUNITY_POST_PERMISSION, status)
    }

    fun getCreateCommunityPostPermission(): String? {
        return mSharedPreferences!!.getString(CREATE_COMMUNITY_POST_PERMISSION, "0")
    }

    fun setCommunityPostPermission(status: String) {
        setStringInPrefs(COMMUNITY_POST_PERMISSION, status)
    }

    fun getCommunityPostPermission(): String? {
        return mSharedPreferences!!.getString(COMMUNITY_POST_PERMISSION, "0")
    }

    fun setEcommerceStorePermission(status: String) {
        setStringInPrefs(ECOMMERCE_STORE_PERMISSION, status)
    }

    fun getEcommerceStorePermission(): String? {
        return mSharedPreferences!!.getString(ECOMMERCE_STORE_PERMISSION, "0")
    }

    fun setAnnouncementPermission(status: String) {
        setStringInPrefs(ANNOUNCEMENT_PERMISSION, status)
    }

    fun getAnnouncementPermission(): String? {
        return mSharedPreferences!!.getString(ANNOUNCEMENT_PERMISSION, "0")
    }

    fun setChangePasswordPermission(status: String) {
        setStringInPrefs(CHANGE_PASSWORD_PERMISSION, status)
    }

    fun getChangePasswordPermission(): String? {
        return mSharedPreferences!!.getString(CHANGE_PASSWORD_PERMISSION, "0")
    }


    fun setLoginBackground(status: String) {
        setStringInPrefs(LOGIN_BACKGROUND, status)
    }

    fun getLoginBackground(): String? {
        return mSharedPreferences!!.getString(LOGIN_BACKGROUND, "")
    }

    fun setBrandInfoIsComplete(status: String) {
        setStringInPrefs(BRAND_INFO_COMPLETE, status)
    }

    fun getBrandInfoIsComplete(): String? {
        return mSharedPreferences!!.getString(BRAND_INFO_COMPLETE, "0")
    }

}