package com.flaringapp.coursework2021.data.storage

import android.content.Context
import com.flaringapp.coursework2021.data.storage.common.Preferences

class DataStorageImpl(context: Context) : Preferences(context, "data_prefs"),
    DataStorage {

    override var token: String by StringPref("token", "")

    override var userId: String by StringPref("user_id", "")

    override var userType: String by StringPref("user_type", "")

    override var name: String by StringPref("name", "")

    override var surname: String by StringPref("surname", "")

    override var email: String by StringPref("email", "")

    override var buildingId: String by StringPref("building_id", "")

}
