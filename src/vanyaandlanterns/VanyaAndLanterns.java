/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vanyaandlanterns;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Marco
 */
public class VanyaAndLanterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int cantidad = in.nextInt();
        int largo = in.nextInt();
        int aux;
        TreeMap<Integer, Integer> linternas = new TreeMap<Integer, Integer>();
        for (int i = 0; i < cantidad; i++) {
            aux = in.nextInt();
            linternas.put(aux, aux);
        }
        double diferencia;
        int primera = linternas.firstKey();
        int ultima = linternas.lastKey();
        diferencia = 2 * (largo - ultima);
        if (diferencia < (2 * primera)) {
            diferencia = 2 * primera;
        }
        cantidad = linternas.size();
        for (int i = 0; i < cantidad - 1; i++) {
            primera = linternas.firstKey();
            linternas.remove(primera);
            if (diferencia <= linternas.firstKey() - primera) {
                diferencia = linternas.firstKey() - primera;
            }
        }

        DecimalFormat df = new DecimalFormat("#########.0000000000");

        System.out.println(df.format(diferencia / 2));

    }

}
