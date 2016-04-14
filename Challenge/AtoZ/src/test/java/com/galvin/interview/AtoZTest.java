package com.galvin.interview;

import org.junit.Assert;
import org.junit.Test;

public class AtoZTest
{
    public static final String[] CORRECT_UPPERCASE = {
        "Aqfw",
        "By5eyh",
        "Cbewrr3",
        "D8i7,.7",
        "Ernrn",
        "F89;80",
        "Gdfbdsfh",
        "H8;8;8;",
        "Irtnwrg",
        "J78l785",
        "Kfgndfnfgngn",
        "Lil7l",
        "M245y",
        "Neyj",
        "O7790''",
        "Phtw",
        "Q\tsdfsdhsgdsd",
        "R64uw6",
        "Sw56uw56  w46u6u  wrthrthrht",
        "T4yyrth",
        "Uj76k6",
        "Vl86l68l",
        "Waxcqced",
        "Xw46j46h",
        "Ywrthwr",
        "Zshwrtht",
    };
    
    public static final String[] CORRECT_LOWERCASE = {
        "atbetbet",
        "btebetbrt",
        "cbtbwetbw",
        "dbtbwbt",
        "ebtebwet",
        "fmmtumtu",
        "gtumtum",
        "htumtrmu",
        "imrumuy",
        "jumyrmyum",
        "kmrtumyru",
        "lrtumyrumyur",
        "mrumyumyum",
        "nrumryumyum",
        "ortumrymu",
        "prmuumrymu",
        "qryumy",
        "rrmuyum3535tru",
        "srmuuymy99mu",
        "trumyur66uummu",
        "urmryum5533yuyum",
        "v6k8mu66i86i",
        "wk7l9l",
        "xqedwedewd",
        "yh5yj6",
        "zr6k78k",
    };
    
    public static final String[] INCORRECT_LEADING_WHITESPACE = {
        " A",
        " B",
        " c",
        " D",
        " E",
        " F",
        " G",
        " H",
        " I",
        " J",
        " K",
        " L",
        " M",
        " N",
        " O",
        " P",
        " Q",
        " R",
        " S",
        " T",
        " U",
        " V",
        " W",
        " X",
        " Y",
        " Z",
        "",
    };
    
    public static final String[] INCORRECT_LEADING_CHAR = {
        "1ABCDEFG",
        "2ABCDEFG",
        "3ABCDEFG",
        "4ABCDEFG",
        "5ABCDEFG",
        "6ABCDEFG",
        "7ABCDEFG",
        "8ABCDEFG",
        "9ABCDEFG",
        "0ABCDEFG",
        "`ABCDEFG",
        "~ABCDEFG",
        "!ABCDEFG",
        "@ABCDEFG",
        "#ABCDEFG",
        "$ABCDEFG",
        "%ABCDEFG",
        "^ABCDEFG",
        "&ABCDEFG",
        "*ABCDEFG",
        "(ABCDEFG",
        ")ABCDEFG",
        "_ABCDEFG",
        "=ABCDEFG",
        "+ABCDEFG",
        "{ABCDEFG",
        "[ABCDEFG",
        "}ABCDEFG",
        "]ABCDEFG",
        "|ABCDEFG",
        "\\ABCDEFG",
        ":ABCDEFG",
        ";ABCDEFG",
        "\"ABCDEFG",
        "'ABCDEFG",
        ",ABCDEFG",
        "<ABCDEFG",
        ">ABCDEFG",
        ".ABCDEFG",
        "?ABCDEFG",
        "/ABCDEFG",
        "\u0100",
    };
    
    @Test
    public void testAtoZ() throws Exception {
        AtoZ atoz = new AtoZ();
        
        for( String test : CORRECT_UPPERCASE ) {
            Assert.assertTrue( "Failed to match: " + test, atoz.match( test ) );
            Assert.assertTrue( "Failed to match: " + test, atoz.matchIgnoreCase( test ) );
        }
        
        for( String test : CORRECT_LOWERCASE ) {
            Assert.assertFalse( "Incorrectly matched: " + test, atoz.match( test ) );
            Assert.assertTrue( "Failed to match: " + test, atoz.matchIgnoreCase( test ) );
        }
        
        for( String test : INCORRECT_LEADING_CHAR ) {
            Assert.assertFalse( "Incorrectly matched: " + test, atoz.match( test ) );
            Assert.assertFalse( "Incorrectly matched: " + test, atoz.matchIgnoreCase( test ) );
        }
        
        for( String test : INCORRECT_LEADING_WHITESPACE ) {
            Assert.assertFalse( "Incorrectly matched: " + test, atoz.match( test ) );
            Assert.assertFalse( "Incorrectly matched: " + test, atoz.matchIgnoreCase( test ) );
        }
    }
}
