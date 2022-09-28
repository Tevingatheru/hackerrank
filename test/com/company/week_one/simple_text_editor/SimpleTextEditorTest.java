package com.company.week_one.simple_text_editor;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SimpleTextEditorTest {

    @Test
    void simpleTextEditor() {
        List<String> input = new ArrayList<>(List.of("8" ,
                "1 abc" ,
                "3 3" ,
                "2 3" ,
                "1 xy" ,
                "3 2" ,
                "4" ,
                "4" ,
                "3 1"));
        SimpleTextEditor.simpleTextEditor(input);
    }

    @Test
    void concat() {
        var result = SimpleTextEditor.concat("abcdefg", 5);
        assertThat(result).isEqualTo("ab");
    }
}