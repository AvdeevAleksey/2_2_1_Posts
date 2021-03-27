class Comments(
    private val count: Int = 0,
    private val canPost: Boolean = true,
    private val groupsCanPost: Boolean = true,
    private val canClose: Boolean = true,
    private val canOpen: Boolean = true
) {
    override fun toString(): String {
        return "Comments(count=$count, canPost=$canPost, groupsCanPost=$groupsCanPost, canClose=$canClose, canOpen=$canOpen)"
    }
}