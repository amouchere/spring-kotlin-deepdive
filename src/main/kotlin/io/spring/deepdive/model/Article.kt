package io.spring.deepdive.model

import java.time.LocalDateTime

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Article(
    @Id val slug: String,
    val title: String,
    val headline: String,
    val content: String,
    val author: String,
    val addedAt: LocalDateTime = LocalDateTime.now())
