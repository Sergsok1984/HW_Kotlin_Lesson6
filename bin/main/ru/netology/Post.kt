package ru.netology

data class Post(
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int = 0,
    val date: Int = 0,
    val text: String = "",
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = false,
    val comments: Comment = Comment(),
    val copyright: Copyright = Copyright(),
    val likes: Likes = Likes(),
    val reposts: Repost = Repost(),
    val views: View = View(),
    val postType: String = "",
    val signerId: Int = 0,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val donut: Donut = Donut(),
    val postponedId: Int = 0
) {
    data class Comment(
        val count: Int = 0,
        val canPost: Boolean = false,
        val groupsCanPost: Boolean = false,
        val canClose: Boolean = false,
        val canOpen: Boolean = false
    )

    data class Copyright(
        val id: Int = 0,
        val link: String = "",
        val name: String = "",
        val type: String = ""
    )

    data class Likes(
        val count: Int = 0,
        val userLikes: Boolean = false,
        val canLike: Boolean = false,
        val canPublish: Boolean = false
    )

    data class Repost(
        val count: Int = 0,
        val userReposted: Boolean = false
    )

    data class View(
        val count: Int = 0
    )

    data class Donut(
        val isDonut: Boolean = false,
        val paidDuration: Int = 0,
        val placeholder: String = "",
        val canPublishFreeCopy: Boolean = false,
        val editMode: String = ""
    )
}

