package com.company.week_one.no_prefix_set;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class NoPrefixSetTest {

    private static Stream<Arguments> provider() {
        return Stream.<Arguments>builder()
                .add(Arguments.of("-1", List.of("aab" ,
                        "defgab" ,
                        "abcde" ,
                        "aabcde" ,
                        "cedaaa" ,
                        "bbbbbbbbbb" ,
                        "jabjjjad"), "aabcde"))
                .add(Arguments.of("1",List.of("hgiiccfchbeadgebc" ,
                                "biiga" ,
                                "edchgb" ,
                                "ccfdbeajaeid" ,
                                "ijgbeecjbj" ,
                                "bcfbbacfbfcfbhcbfjafibfhffac" ,
                                "ebechbfhfcijcjbcehbgbdgbh" ,
                                "ijbfifdbfifaidje" ,
                                "acgffegiihcddcdfjhhgadfjb" ,
                                "ggbdfdhaffhghbdh" ,
                                "dcjaichjejgheiaie" ,
                                "d" ,
                                "jeedfch" ,
                                "ahabicdffbedcbdeceed" ,
                                "fehgdfhdiffhegafaaaiijceijdgbb" ,
                                "beieebbjdgdhfjhj" ,
                                "ehg" ,
                                "fdhiibhcbecddgijdb" ,
                                "jgcgafgjjbg" ,
                                "c" ,
                                "fiedahb" ,
                                "bhfhjgcdbjdcjjhaebejaecdheh" ,
                                "gbfbbhdaecdjaebadcggbhbchfjg" ,
                                "jdjejjg" ,
                                "dbeedfdjaghbhgdhcedcj" ,
                                "decjacchhaciafafdgha" ,
                                "a" ,
                                "hcfibighgfggefghjh" ,
                                "ccgcgjgaghj" ,
                                "bfhjgehecgjchcgj" ,
                                "bjbhcjcbbhf" ,
                                "daheaggjgfdcjehidfaedjfccdafg" ,
                                "efejicdecgfieef" ,
                                "ciidfbibegfca" ,
                                "jfhcdhbagchjdadcfahdii" ,
                                "i" ,
                                "abjfjgaghbc" ,
                                "bddeejeeedjdcfcjcieceieaei" ,
                                "cijdgbddbceheaeececeeiebafgi" ,
                                "haejgebjfcfgjfifhihdbddbacefd" ,
                                "bhhjbhchdiffb" ,
                                "jbbdhcbgdefifhafhf" ,
                                "ajhdeahcjjfie" ,
                                "idjajdjaebfhhaacecb" ,
                                "bhiehhcggjai" ,
                                "bjjfjhiice" ,
                                "aif" ,
                                "gbbfjedbhhhjfegeeieig" ,
                                "fefdhdaiadefifjhedaieaefc" ,
                                "hgaejbhdebaacbgbgfbbcad" ,
                                "heghcb" ,
                                "eggadagajjgjgaihjdigihfhfbijbh" ,
                                "jadeehcciedcbjhdeca" ,
                                "ghgbhhjjgghgie" ,
                                "ibhihfaeeihdffjgddcj" ,
                                "hiedaegjcdai" ,
                                "bjcdcafgfjdejgiafdhfed" ,
                                "fgdgjaihdjaeefejbbijdbfabeie" ,
                                "aeefgiehgjbfgidcedjhfdaaeigj" ,
                                "bhbiaeihhdafgaciecb" ,
                                "igicjdajjdegbceibgebedghihihh" ,
                                "baeeeehcbffd" ,
                                "ajfbfhhecgaghgfdadbfbb" ,
                                "ahgaccehbgajcdfjihicihhc" ,
                                "bbjhih" ,
                                "a" ,
                                "cdfcdejacaicgibghgddd" ,
                                "afeffehfcfiefhcagg" ,
                                "ajhebffeh" ,
                                "e" ,
                                "hhahehjfgcj" ,
                                "ageaccdcbbcfidjfc" ,
                                "gfcjahbbhcbggadcaebae" ,
                                "gi" ,
                                "edheggceegiedghhdfgabgcd" ,
                                "hejdjjbfacggdccgahiai" ,
                                "ffgeiadgjfgecdbaebagij" ,
                                "dgaiahge" ,
                                "hdbaifh" ,
                                "gbhccajcdebcig" ,
                                "ejdcbbeiiebjcagfhjfdahbif" ,
                                "g" ,
                                "ededbjaaigdhb" ,
                                "ahhhcibdjhidbgefggdjebfcf" ,
                                "bdigjaehfchebiedajcjdh" ,
                                "fjehjgbdbaiifi" ,
                                "fbgigbdcbcgffdicfcidfdafghajc" ,
                                "ccajeeijhhb" ,
                                "gaaagfacgiddfahejhbgdfcfbfeedh" ,
                                "gdajaigfbjcdegeidgaccjfi" ,
                                "fghechfchjbaebcghfcfbdicgaic" ,
                                "cfhigaciaehacdjhfcgajgbhhgj" ,
                                "edhjdbdjccbfihiaddij" ,
                                "cbbhagjbcadegicgifgghai" ,
                                "hgdcdhieji" ,
                                "fbifgbhdhagch" ,
                                "cbgcdjea" ,
                                "dggjafcajhbbbaja" ,
                                "bejihed" ,
                                "eeahhcggaaidifdigcfjbficcfhjj"), "d"))
                .build();
    }
    @ParameterizedTest(name = "testcase: {0}")
    @MethodSource("provider")
    void noPrefix(String testcase, List<String> input, String output) {
//        NoPrefixSet.noPrefix(input);
        NoPrefixSet.noPrefix2(input);
        System.out.println("Expected output: " + output);
    }
}