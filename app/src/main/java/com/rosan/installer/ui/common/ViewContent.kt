package com.rosan.installer.ui.common

data class ViewContent<T>(
    val data: T,
    val progress: Progress
) {
    sealed class Progress {
        data object Loading : Progress()
        data object Loaded : Progress()
    }
}