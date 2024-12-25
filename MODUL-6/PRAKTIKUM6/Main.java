package PRAKTIKUM6;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Daftar Mahasiswa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        Mahasiswa[] mahasiswaList = {
            new Mahasiswa("2310817120014", "Aliya Raffa Naura Ayu", " "),
            new Mahasiswa("2310817120001", "Dina Izzati Elfadheya", " "),
            new Mahasiswa("2310817220028", "Sheila Sabina"," "),
            new Mahasiswa("2310817220002", "Raudatul Sholehah"," "),
            new Mahasiswa("2310817120010", "Nur Hikmah"," "),
            new Mahasiswa("2310817320007", "Zahra Nabila"," "),
            new Mahasiswa("2310817110007", "Muhammad Daffa Musyafa"," "),
            new Mahasiswa("2310817210009", "Muhammad Ibnu Sina"," "),
            new Mahasiswa("2310817210007", "Raymond Hariyono"," "),
            new Mahasiswa("2310817310010", "Akmallullail Sya'ban"," ")
        };

        String[] kolom = {"NIM", "Nama", " "};
        String[][] data = new String[mahasiswaList.length][2];
        for (int i = 0; i < mahasiswaList.length; i++) {
            data[i][0] = mahasiswaList[i].getNim();
            data[i][1] = mahasiswaList[i].getNama();
        }

        DefaultTableModel model = new DefaultTableModel(data, kolom);

        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane);

        frame.setVisible(true);
    }
}