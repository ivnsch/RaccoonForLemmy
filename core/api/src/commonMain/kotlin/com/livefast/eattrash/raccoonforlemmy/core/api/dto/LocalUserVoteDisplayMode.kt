package com.livefast.eattrash.raccoonforlemmy.core.api.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LocalUserVoteDisplayMode(
    @SerialName("downvotes") val downvotes: Boolean,
    @SerialName("score") val score: Boolean,
    @SerialName("upvote_percentage") val upvotePercentage: Boolean,
    @SerialName("upvotes") val upvotes: Boolean,
)
