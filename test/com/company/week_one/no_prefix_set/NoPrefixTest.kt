package com.company.week_one.no_prefix_set

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class NoPrefixTest {
    companion object {
        @JvmStatic
        private fun provider(): Stream<Arguments>? {
            return Stream.builder<Arguments>()
                .add(
                    Arguments.of(
                        "-1", java.util.List.of(
                            "aab",
                            "defgab",
                            "abcde",
                            "aabcde",
                            "cedaaa",
                            "bbbbbbbbbb",
                            "jabjjjad"
                        ), "aabcde"
                    )
                )
                .add(
                    Arguments.of(
                        "1", java.util.List.of(
                            "hgiiccfchbeadgebc",
                            "biiga",
                            "edchgb",
                            "ccfdbeajaeid",
                            "ijgbeecjbj",
                            "bcfbbacfbfcfbhcbfjafibfhffac",
                            "ebechbfhfcijcjbcehbgbdgbh",
                            "ijbfifdbfifaidje",
                            "acgffegiihcddcdfjhhgadfjb",
                            "ggbdfdhaffhghbdh",
                            "dcjaichjejgheiaie",
                            "d",
                            "jeedfch",
                            "ahabicdffbedcbdeceed",
                            "fehgdfhdiffhegafaaaiijceijdgbb",
                            "beieebbjdgdhfjhj",
                            "ehg",
                            "fdhiibhcbecddgijdb",
                            "jgcgafgjjbg",
                            "c",
                            "fiedahb",
                            "bhfhjgcdbjdcjjhaebejaecdheh",
                            "gbfbbhdaecdjaebadcggbhbchfjg",
                            "jdjejjg",
                            "dbeedfdjaghbhgdhcedcj",
                            "decjacchhaciafafdgha",
                            "a",
                            "hcfibighgfggefghjh",
                            "ccgcgjgaghj",
                            "bfhjgehecgjchcgj",
                            "bjbhcjcbbhf",
                            "daheaggjgfdcjehidfaedjfccdafg",
                            "efejicdecgfieef",
                            "ciidfbibegfca",
                            "jfhcdhbagchjdadcfahdii",
                            "i",
                            "abjfjgaghbc",
                            "bddeejeeedjdcfcjcieceieaei",
                            "cijdgbddbceheaeececeeiebafgi",
                            "haejgebjfcfgjfifhihdbddbacefd",
                            "bhhjbhchdiffb",
                            "jbbdhcbgdefifhafhf",
                            "ajhdeahcjjfie",
                            "idjajdjaebfhhaacecb",
                            "bhiehhcggjai",
                            "bjjfjhiice",
                            "aif",
                            "gbbfjedbhhhjfegeeieig",
                            "fefdhdaiadefifjhedaieaefc",
                            "hgaejbhdebaacbgbgfbbcad",
                            "heghcb",
                            "eggadagajjgjgaihjdigihfhfbijbh",
                            "jadeehcciedcbjhdeca",
                            "ghgbhhjjgghgie",
                            "ibhihfaeeihdffjgddcj",
                            "hiedaegjcdai",
                            "bjcdcafgfjdejgiafdhfed",
                            "fgdgjaihdjaeefejbbijdbfabeie",
                            "aeefgiehgjbfgidcedjhfdaaeigj",
                            "bhbiaeihhdafgaciecb",
                            "igicjdajjdegbceibgebedghihihh",
                            "baeeeehcbffd",
                            "ajfbfhhecgaghgfdadbfbb",
                            "ahgaccehbgajcdfjihicihhc",
                            "bbjhih",
                            "a",
                            "cdfcdejacaicgibghgddd",
                            "afeffehfcfiefhcagg",
                            "ajhebffeh",
                            "e",
                            "hhahehjfgcj",
                            "ageaccdcbbcfidjfc",
                            "gfcjahbbhcbggadcaebae",
                            "gi",
                            "edheggceegiedghhdfgabgcd",
                            "hejdjjbfacggdccgahiai",
                            "ffgeiadgjfgecdbaebagij",
                            "dgaiahge",
                            "hdbaifh",
                            "gbhccajcdebcig",
                            "ejdcbbeiiebjcagfhjfdahbif",
                            "g",
                            "ededbjaaigdhb",
                            "ahhhcibdjhidbgefggdjebfcf",
                            "bdigjaehfchebiedajcjdh",
                            "fjehjgbdbaiifi",
                            "fbgigbdcbcgffdicfcidfdafghajc",
                            "ccajeeijhhb",
                            "gaaagfacgiddfahejhbgdfcfbfeedh",
                            "gdajaigfbjcdegeidgaccjfi",
                            "fghechfchjbaebcghfcfbdicgaic",
                            "cfhigaciaehacdjhfcgajgbhhgj",
                            "edhjdbdjccbfihiaddij",
                            "cbbhagjbcadegicgifgghai",
                            "hgdcdhieji",
                            "fbifgbhdhagch",
                            "cbgcdjea",
                            "dggjafcajhbbbaja",
                            "bejihed",
                            "eeahhcggaaidifdigcfjbficcfhjj"
                        ), "d"
                    )
                )
                .build()
        }

    }

    val noPrefix = NoPrefix()

    @ParameterizedTest(name = "testcase: {0}")
    @MethodSource("provider")
    fun noPrefix(testcase: String?, input: List<String>, output: String) {
//        NoPrefixSet.noPrefix(input);
//        NoPrefix nop = new NoPrefix;
        noPrefix.noPrefix(input)
        println("Expected output: $output")
    }
}