import java.time.Instant
import java.time.Instant.now

class Post(
    private val id: Int = 0,
    private val ownerId: Int = 0,
    private val formId: Int = 0,
    private val createdBy: Int = 0,
    private val date: Instant? = now(),
    private val text: String = "",
    private val replyOwnerId: Int = 0,
    private val replyPostId: Int = 0,
    private val friendsOnly: Boolean = false,
    private val comments: Comments = Comments(),
    private val copyright: Copyright = Copyright(),
    private val likes: Likes = Likes(),
    private val reposts: Reposts = Reposts(),
    private val views: Views = Views(),
    private val singerId: Int = 0,
    private val canPin: Boolean = false,
    private val canDelete: Boolean = true,
    private val canEdit: Boolean = true,
    private val isPined: Boolean = false,
    private val markedAsAds:Boolean = false,
    private val isFavorite: Boolean = false,
    private val donut: Donut = Donut(),
    private val postponedId: Int = 0
) {
    override fun toString(): String {
        return """Post(id=$id, 
            ownerId=$ownerId, 
            formId=$formId, 
            createdBy=$createdBy, 
            date=$date, 
            text='$text', 
            replyOwnerId=$replyOwnerId, 
            replyPostId=$replyPostId, 
            friendsOnly=$friendsOnly, 
            comments=$comments, 
            copyright=$copyright, 
            likes=$likes, 
            reposts=$reposts, 
            views=$views, 
            singerId=$singerId, 
            canPin=$canPin, 
            canDelete=$canDelete, 
            canEdit=$canEdit, 
            isPined=$isPined, 
            markedAsAds=$markedAsAds, 
            isFavorite=$isFavorite, 
            donut=$donut, 
            postponedId=$postponedId)"""
    }
}

