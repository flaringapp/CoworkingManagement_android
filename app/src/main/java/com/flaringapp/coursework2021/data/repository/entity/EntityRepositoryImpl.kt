package com.flaringapp.coursework2021.data.repository.entity

import com.flaringapp.coursework2021.data.common.call.CallResult
import com.flaringapp.coursework2021.data.common.call.CallResultList
import com.flaringapp.coursework2021.data.common.call.CallResultNothing
import com.flaringapp.coursework2021.data.repository.entity.models.Building
import com.flaringapp.coursework2021.data.repository.entity.models.Room
import com.flaringapp.coursework2021.data.repository.entity.storage.BuildingsStorage
import com.flaringapp.coursework2021.data.repository.entity.storage.RoomsStorage
import kotlinx.coroutines.flow.MutableSharedFlow

class EntityRepositoryImpl: EntityRepository, BuildingsStorage, RoomsStorage {

    override val addBuildingFlow = MutableSharedFlow<Building>()
    override val editBuildingFlow = MutableSharedFlow<Building>()
    override val deleteBuildingFlow = MutableSharedFlow<String>()

    override val addRoomFlow = MutableSharedFlow<Room>()
    override val editRoomFlow = MutableSharedFlow<Room>()
    override val deleteRoomFlow = MutableSharedFlow<String>()

    override suspend fun getBuildings(): CallResultList<Building> {
        return CallResult.Success(emptyList())
    }

    override suspend fun addBuilding(building: Building): CallResult<Building> {
        addBuildingFlow.emit(building)
        return CallResult.Success(building)
    }

    override suspend fun editBuilding(building: Building): CallResult<Building> {
        editBuildingFlow.emit(building)
        return CallResult.Success(building)
    }

    override suspend fun deleteBuilding(id: String): CallResultNothing {
        deleteBuildingFlow.emit(id)
        return CallResult.Success(Unit)
    }

    override suspend fun getRooms(): CallResultList<Room> {
        return CallResult.Success(emptyList())
    }

    override suspend fun addRoom(room: Room): CallResult<Room> {
        addRoomFlow.emit(room)
        return CallResult.Success(room)
    }

    override suspend fun editRoom(room: Room): CallResult<Room> {
        editRoomFlow.emit(room)
        return CallResult.Success(room)
    }

    override suspend fun deleteRoom(id: String): CallResultNothing {
        deleteRoomFlow.emit(id)
        return CallResult.Success(Unit)
    }
}