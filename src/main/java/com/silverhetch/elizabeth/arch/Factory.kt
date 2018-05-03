package com.silverhetch.elizabeth.arch

interface Factory<T> {
    fun instance(): T
}