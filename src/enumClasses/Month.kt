package enumClasses

enum class Month(val season: Season) {
    JANUARY(Season.WINTER),
    FEBRUARY(Season.WINTER),
    MARCH(Season.SPRING),
    APRIL(Season.SPRING),
    MAY(Season.SPRING),
    JUNE(Season.SUMMER),
    JULY(Season.SUMMER),
    AUGUST(Season.SUMMER),
    SEPTEMBER(Season.AUTUMN),
    OCTOBER(Season.AUTUMN),
    NOVEMBER(Season.AUTUMN),
    DECEMBER(Season.WINTER);

    companion object {
        fun fromInt(value: Int): Month? = values().find { it.ordinal == value - 1 }
    }
}