class Reposts(
    private val count: Int = 0,
    private val userReposted: Boolean = false
) {
    override fun toString(): String {
        return "Reposts(count=$count, userReposted=$userReposted)"
    }
}