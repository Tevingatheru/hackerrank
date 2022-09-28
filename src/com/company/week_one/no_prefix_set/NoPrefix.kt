package com.company.week_one.no_prefix_set

class NoPrefix {


    fun noPrefix(words : List<String>) {
        words.forEachIndexed { indexOuter, outer ->
            for (i in 0 until indexOuter) {
                if (outer.startsWith(words[i])){
                    println("BAD SET")
                    println(outer)
                    return
                }
            }
        }

        println("GOOD SET")
    }

//    fun noPrefix2(words: List<String>) {
//        // Write your code here
//        val n = words.size
//        var response = "GOOD SET"
//        for (i in 0 until n) {
//            if (i + 1 < n) {
//                for (j in i + 1 until n) {
//                    if (words[j].startsWith(words[i])) {
//                        response = "BAD SET"
//                        println(response)
//                        println(words[j])
//                        return
//                    }
//                }
//            }
//        }
//        if (response != "BAD SET") println(response)
//    }
}