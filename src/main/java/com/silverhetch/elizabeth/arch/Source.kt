package com.silverhetch.elizabeth.arch

interface Source<T> {
    fun fetch(): T
}