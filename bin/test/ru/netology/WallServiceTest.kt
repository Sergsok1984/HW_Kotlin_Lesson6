package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addNewId() {
        val wallService = WallService()
        val firstPost = Post(text = "First post")

        val addedFirstPost = wallService.add(firstPost)
        val result = addedFirstPost.id

        assertEquals(1, result)
    }

    @Test
    fun updateRealId() {
        val wallService = WallService()
        val newPost = Post(text = "First post")
        val post = wallService.add(newPost)
        val postId = post.id

        val updatedPost = Post(id = postId, text = "Updated post")
        val result = wallService.update(updatedPost)

        assertTrue(result)
    }

    @Test
    fun updateNotRealId() {
        val wallService = WallService()
        val newPost = Post(text = "First post")
        val post = wallService.add(newPost)
        val postId = post.id + 1

        val updatedPost = Post(id = postId, text = "Updated post")
        val result = wallService.update(updatedPost)

        assertFalse(result)
    }
}