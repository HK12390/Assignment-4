public class DNA {
    private String dnaSeq;


    private static String mutate(String dnaSeq, String codon, String mutation){
        String mutDNA = "";

        if (dnaSeq.contains(codon)){
            mutDNA= dnaSeq.replace(codon,mutation);
        }

        return mutDNA;
    }

    public static void main(String[] args) {
        System.out.println(mutate("ATCGTCAGTCAGCTAGCTAGCTAG","TAG","GAT"));

    }



}