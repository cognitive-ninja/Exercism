import java.util.*;
class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rna = new StringBuilder(dnaStrand);;
        for(int i=0;i<dnaStrand.length();i++){
            if(dnaStrand.charAt(i)=='C')
                rna.setCharAt(i,'G');
            else if(dnaStrand.charAt(i)=='G')
                rna.setCharAt(i, 'C');
            else if(dnaStrand.charAt(i)=='T')
                rna.setCharAt(i, 'A');
            else if(dnaStrand.charAt(i)=='A')
                rna.setCharAt(i, 'U');
        }
        return rna.toString();
    }

}
