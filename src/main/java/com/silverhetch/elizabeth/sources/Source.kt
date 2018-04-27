package com.silverhetch.elizabeth.sources

interface Source<T> {
    fun fetch(): T
}