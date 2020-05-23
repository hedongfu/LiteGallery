package com.herman.gallery

import androidx.multidex.MultiDexApplication
import com.facebook.ads.AudienceNetworkAds
import com.github.ajalt.reprint.core.Reprint
import com.simplemobiletools.commons.extensions.checkUseEnglish

class App : MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()
        checkUseEnglish()
        Reprint.initialize(this)
        // Initialize the Audience Network SDK
        AudienceNetworkAds.initialize(this)
    }
}
