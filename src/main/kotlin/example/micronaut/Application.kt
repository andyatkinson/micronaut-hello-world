package example.micronaut

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages()
                .mainClass(Application.javaClass)
                .start()

    }
}

