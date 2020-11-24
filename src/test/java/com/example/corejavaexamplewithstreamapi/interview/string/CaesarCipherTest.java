package com.example.corejavaexamplewithstreamapi.interview.string;

import org.junit.jupiter.api.Test;

class CaesarCipherTest {

    @Test
    void encrypt ( ) {
        final StringBuffer encrypt = CaesarCipher.encrypt("ABC", 3);
        final StringBuffer decrypt = CaesarCipher.decrypt(encrypt.toString(), 3);
        System.out.println(encrypt);
        System.out.println(decrypt);
    }
}