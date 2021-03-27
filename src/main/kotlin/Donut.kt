class Donut(
    private val isDonut: Boolean = false,
    private val paidDuration: Int = 0,
    private val placeholder: Placeholder = Placeholder(),
    private val canPublishFreeCopy:Boolean = false,
    private val editMode: DonutEditMode = DonutEditMode.all
) {
    override fun toString(): String {
        return "Donut(isDonut=$isDonut, paidDuration=$paidDuration, placeholder=$placeholder, canPublishFreeCopy=$canPublishFreeCopy, editMode=$editMode)"
    }
}