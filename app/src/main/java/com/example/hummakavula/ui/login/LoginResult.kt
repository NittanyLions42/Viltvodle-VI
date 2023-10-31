package com.example.hummakavula.ui.login

/**
 * Authentication result : success (user details) or error message.
 */
// Hi its me brenda
data class LoginResult(
    val success: LoggedInUserView? = null,
    val error: Int? = null
)