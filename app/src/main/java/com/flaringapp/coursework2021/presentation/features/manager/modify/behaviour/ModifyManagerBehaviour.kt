package com.flaringapp.coursework2021.presentation.features.manager.modify.behaviour

import android.os.Parcelable
import com.flaringapp.coursework2021.data.common.call.CallResultNothing
import com.flaringapp.coursework2021.data.repository.managers.models.Manager
import com.flaringapp.coursework2021.presentation.features.manager.modify.models.ManagerEditableData

interface ModifyManagerBehaviour: Parcelable {

    val manager: Manager?
    val preliminaryData: ManagerEditableData?

    val isPasswordRequired: Boolean

    suspend fun modifyManager(manager: Manager): CallResultNothing

}