package annotation

import kotlin.reflect.full.*

@ImAPlant class Plant {
    @get:OnGet
    val isGrowing: Boolean = true

    @set:OnSet
    var needsFood: Boolean = false
}
fun testAnnotations() {
    val plantObject = Plant::class
    val myAnnotationObject = plantObject.findAnnotation<ImAPlant>()
    println(myAnnotationObject)
}
annotation class ImAPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet
@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet
fun labels() {
    outerLoop@ for (i in 1..100) {
        print("$i ")
        for (j in 1..100) {
            if (i > 10) break@outerLoop  // breaks to outer loop
        }
    }
}
fun main() {
    testAnnotations()
    labels()
}