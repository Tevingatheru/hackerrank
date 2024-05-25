package com.company.caesar_cipher_encryption;

import org.junit.jupiter.api.BeforeEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class EncryptionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));

    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }


    @Test
    void testMain() {
        // Prepare the input data
        String input = "5\nHello\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Call the main method
        Encryption.main(new String[]{});

        // Check the output
        String expectedOutput = "[Khoor]";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}