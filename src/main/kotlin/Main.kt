fun main() {

    WallService.add(Post())
    WallService.add(Post())
    WallService.add(Post())
    val posts:Array<Post> = arrayOf(
        WallService.getPostById(0),
        WallService.getPostById(1),
        WallService.getPostById(2)
    )
    println(posts[posts.lastIndex])
}