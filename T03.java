// 12S24057-Laura Awise Sirumapea
// 12S24017-Arya Pratama Sinambela

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String judulbuku, penulis, penerbit, formatbuku, iSBN, kategoribuku, jenisdiskon, conclusion;
        int tahunterbit, stok;
        double minimummargin, rating, hargabuku;

        do {
            iSBN = input.nextLine();
            if (!iSBN.equals("---")) {
                judulbuku = input.nextLine();
                penulis = input.nextLine();
                tahunterbit = Integer.parseInt(input.nextLine());
                penerbit = input.nextLine();
                formatbuku = input.nextLine();
                hargabuku = Double.parseDouble(input.nextLine());
                minimummargin = Double.parseDouble(input.nextLine());
                if (-(minimummargin / hargabuku) >= 0.4) {
                    jenisdiskon = "Once in a lifetime";
                } else {
                    if (-(minimummargin / hargabuku) > 0.2) {
                        jenisdiskon = "Never come twice";
                    } else {
                        jenisdiskon = "No regret";
                    }
                }
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                if (rating >= 4.7) {
                    kategoribuku = "Best Pick";
                } else {
                    if (rating >= 4.5) {
                        kategoribuku = "Must Read";
                    } else {
                        if (rating >= 4.0) {
                            kategoribuku = "Recommended";
                        } else {
                            if (rating >= 3.0) {
                                kategoribuku = "Average";
                            } else {
                                kategoribuku = "Low";
                            }
                        }
                    }
                }
                if (jenisdiskon.equals("Once in a lifetime") && kategoribuku.equals("Best pick")) {
                    conclusion = "The ultimate best";
                } else {
                    conclusion = "---";
                }
                System.out.println(iSBN + "|" + judulbuku + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargabuku + "|" + minimummargin + "|" + stok + "|" + toFixed(rating,1) + "|" + kategoribuku + "|" + jenisdiskon + "|" + conclusion);
            }
        } while (!iSBN.equals("---"));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

