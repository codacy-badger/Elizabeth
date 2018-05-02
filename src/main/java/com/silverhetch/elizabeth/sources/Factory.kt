package com.silverhetch.elizabeth.sources

interface Factory<T> {
    fun instance(): T
}