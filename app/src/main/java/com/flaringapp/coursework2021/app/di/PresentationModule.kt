package com.flaringapp.coursework2021.app.di

import com.flaringapp.coursework2021.presentation.features.login.viewmodel.LoginModel
import com.flaringapp.coursework2021.presentation.features.login.viewmodel.LoginModelImpl
import com.flaringapp.coursework2021.presentation.features.menu.model.MenuModel
import com.flaringapp.coursework2021.presentation.features.menu.model.MenuModelImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val PresentationModule = module {

    viewModel<LoginModel> { LoginModelImpl(get()) }

    viewModel<MenuModel> { MenuModelImpl() }

}