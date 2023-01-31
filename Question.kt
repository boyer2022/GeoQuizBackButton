import androidx.annotation.StringRes
// Created a Question class
data class Question(@StringRes val textResId: Int, val answer: Boolean)