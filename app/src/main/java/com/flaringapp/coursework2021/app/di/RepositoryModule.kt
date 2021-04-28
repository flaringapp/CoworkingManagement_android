package com.flaringapp.coursework2021.app.di

import com.flaringapp.coursework2021.data.repository.entity.EntityRepository
import com.flaringapp.coursework2021.data.repository.entity.EntityRepositoryImpl
import com.flaringapp.coursework2021.data.repository.entity.storage.BuildingsStorage
import com.flaringapp.coursework2021.data.repository.entity.storage.RoomsStorage
import com.flaringapp.coursework2021.data.repository.managers.ManagersRepository
import com.flaringapp.coursework2021.data.repository.managers.ManagersRepositoryImpl
import com.flaringapp.coursework2021.data.repository.managers.storage.ManagersStorage
import com.flaringapp.coursework2021.data.repository.profile.ProfileRepository
import com.flaringapp.coursework2021.data.repository.profile.ProfileRepositoryImpl
import com.flaringapp.coursework2021.data.repository.residents.ResidentsRepository
import com.flaringapp.coursework2021.data.repository.residents.ResidentsRepositoryImpl
import com.flaringapp.coursework2021.data.repository.residents.storage.ResidentsStorage
import com.flaringapp.coursework2021.data.repository.tenants.RentsRepository
import com.flaringapp.coursework2021.data.repository.tenants.RentsRepositoryImpl
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module

val RepositoryModule = module {

    single<ProfileRepository> { ProfileRepositoryImpl(get(), get()) }

    single<EntityRepository> { EntityRepositoryImpl(get() , get()) } binds arrayOf(
        BuildingsStorage::class,
        RoomsStorage::class
    )

    single<ManagersRepository> { ManagersRepositoryImpl(get()) } bind ManagersStorage::class

    single<ResidentsRepository> { ResidentsRepositoryImpl(get()) } bind ResidentsStorage::class

    single<RentsRepository> { RentsRepositoryImpl() }

}