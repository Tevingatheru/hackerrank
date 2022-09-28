package com.company.duplicate_words;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DuplicateWordsTest {

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of("5", "Goodbye bye bye world world world\n" +
                        "Sam went went to to to his business\n" +
                        "Reya is is the the best player in eye eye game\n" +
                        "in inthe\n" +
                        "Hello hello Ab aB", "Goodbye bye world\n" +
                        "Sam went to his business\n" +
                        "Reya is the best player in eye game\n" +
                        "in inthe\n" +
                        "Hello Ab"),
                Arguments.of("1", "I love Love to To tO code", "I love to code")
        );
    }

    final DuplicateWords duplicateWords = new DuplicateWords();

    @ParameterizedTest(name = "Test number: {index}")
    @MethodSource(value = "argumentsStream")
    void replaceDuplicateWords(int numberSentences, String input, String expectedOutPut) {
        final String actualOutput = duplicateWords.replaceDuplicateWords(numberSentences, input);
        assertThat(actualOutput)
                .isEqualTo(expectedOutPut);
    }
}