package net.developermaster.kotlincanivetesuico.ui.flow.flowMvvm.model

class ListaFlowMvvm {
    companion object {

        fun funcaoRandom(): ModelFlowMvvm {
            val position = (0..10).random()
            return lista[position]
        }

        private val lista = listOf(

            ModelFlowMvvm(
                texto = "It’s not a bug. It’s an undocumented feature!",
                autor = "Anonymous"
            ),
            ModelFlowMvvm(
                texto = "“Software Developer” – An organism that turns caffeine into software",
                autor = "Anonymous"
            ),
            ModelFlowMvvm(
                texto = "If debugging is the process of removing software bugs, then programming must be the process of putting them in",
                autor = "Edsger Dijkstra"
            ),
            ModelFlowMvvm(
                texto = "A user interface is like a joke. If you have to explain it, it’s not that good.",
                autor = "Anonymous"
            ),
            ModelFlowMvvm(
                texto = "I don’t care if it works on your machine! We are not shipping your machine!",
                autor = "Vidiu Platon"
            ),
            ModelFlowMvvm(
                texto = "Measuring programming progress by lines of code is like measuring aircraft building progress by weight.",
                autor = "Bill Gates"
            ),
            ModelFlowMvvm(
                texto = "My code DOESN’T work, I have no idea why. My code WORKS, I have no idea why.",
                autor = "Anonymous"
            ),
            ModelFlowMvvm(
                texto = "Things aren’t always #000000 and #FFFFFF",
                autor = "Anonymous"),

            ModelFlowMvvm(
                texto = "Talk is cheap. Show me the code.",
                autor = "Linus Torvalds"),

            ModelFlowMvvm(
                texto = "Software and cathedrals are much the same — first we build them, then we pray.",
                autor = "Anonymous"
            ),
            ModelFlowMvvm(
                texto = "¿A que esperas?, suscríbete.",
                autor = "AristiDevs")
        )
    }
}