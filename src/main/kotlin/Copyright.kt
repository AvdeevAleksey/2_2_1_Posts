class Copyright(
    private val id: Int = 0,
    private val link: String = "",
    private val name: String = "",
    private val type: String = ""
) {
    override fun toString(): String {
        return "Copyright(id=$id, link='$link', name='$name', type='$type')"
    }
}