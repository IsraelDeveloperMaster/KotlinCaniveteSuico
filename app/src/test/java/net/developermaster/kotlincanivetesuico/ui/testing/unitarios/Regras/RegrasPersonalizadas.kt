package net.developermaster.kotlincanivetesuico.ui.testing.unitarios.Regras

import org.junit.rules.TestWatcher
import org.junit.runner.Description

class RegrasPersonalizadas( valor : String) : TestWatcher() {

    var log2 = valor
    var log = ""

    override fun starting(description: Description?) {

        println( "starting - $log" )


        super.starting(description)
    }

    /**
     * Invoked when a test method finishes (whether passing or failing)
     */
    override fun finished(description: Description?) {

        println( "finished - $log2" )


        super.finished(description)
    }
}