package com.simpleclub.firebase_rest_auth.core.data.rest.models.identitytoolkit

data class SignInWithCustomTokenResponse(
    val idToken: String = "",       // A Firebase Auth ID token for the newly created user
    val refreshToken: String = "",  // A Firebase Auth refresh token for the newly created user
    val expiresIn: String = ""      // The number of seconds in which the ID token expires
)
