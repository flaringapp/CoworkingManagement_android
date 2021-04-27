package com.flaringapp.coursework2021.data.repository.entity

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
    override val deleteBuildingFlow = MutableSharedFlow<Building>()

    override val addRoomFlow = MutableSharedFlow<Room>()
    override val editRoomFlow = MutableSharedFlow<Room>()
    override val deleteRoomFlow = MutableSharedFlow<Room>()

    override suspend fun getBuildings(): CallResultList<Building> {
        TODO("Not yet implemented")
    }

    override suspend fun addBuilding(building: Building): CallResultList<Building> {
        TODO("Not yet implemented")
    }

    override suspend fun editBuilding(building: Building): CallResultList<Building> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteBuilding(id: String): CallResultNothing {
        TODO("Not yet implemented")
    }

    override suspend fun getRooms(): CallResultList<Room> {
        TODO("Not yet implemented")
    }

    override suspend fun addRoom(building: Room): CallResultList<Building> {
        TODO("Not yet implemented")
    }

    override suspend fun editRoom(building: Room): CallResultList<Building> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteRoom(id: String): CallResultNothing {
        TODO("Not yet implemented")
    }
}