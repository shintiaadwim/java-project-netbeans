package gastrousus;

import java.util.*;

public class GastroUsus {
    private static final int DEFAULT_THRESHOLD = 80;
    private int threshold;
    
    private String[] symptomKeys = {
        "gejala_bab",           // 1. Buang air besar (>2x)
        "gejala_diare",         // 2. Berak encer
        "gejala_berak_darah",   // 3. Berak berdarah
        "gejala_lesu",          // 4. Lesu dan tidak bergairah
        "gejala_tidak_nafsu_makan", // 5. Tidak selera makan
        "gejala_mual_muntah",   // 6. Mual dan sering muntah (>1x)
        "gejala_sakit_perut",   // 7. Sakit di bagian perut
        "gejala_tekanan_rendah", // 8. Tekanan darah rendah
        "gejala_pusing",        // 9. Pusing
        "gejala_pingsan",       // 10. Pingsan
        "gejala_demam",         // 11. Suhu badan tinggi
        "gejala_luka",          // 12. Luka di bagian tertentu
        "gejala_lumpuh",        // 13. Tidak dapat menggerakkan anggota badan
        "riwayat_makan",        // 14. Pernah memakan sesuatu
        "riwayat_daging",       // 15. Memakan daging
        "riwayat_jamur",        // 16. Memakan jamur
        "riwayat_kaleng",       // 17. Memakan makanan kaleng
        "riwayat_beli_susu",    // 18. Membeli susu
        "riwayat_minum_susu"    // 19. Meminum susu
    };
    
    private Map<String, DiseaseWeight> diseaseWeights;
    
    public GastroUsus() {
        this(DEFAULT_THRESHOLD);
    }
    
    public GastroUsus(int threshold) {
        this.threshold = threshold;
        initializeDiseaseWeights();
    }
    
    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
    public int getThreshold() {
        return threshold; 
    }
    
    private void initializeDiseaseWeights() {
        diseaseWeights = new LinkedHashMap<>();
        
        DiseaseWeight staphylococcus = new DiseaseWeight("Keracunan Staphylococcus aureus");
        staphylococcus.addWeight("gejala_mual_muntah", 10);
        staphylococcus.addWeight("gejala_sakit_perut", 9);
        staphylococcus.addWeight("gejala_diare", 8);
        staphylococcus.addWeight("gejala_tekanan_rendah", 7);
        staphylococcus.addWeight("gejala_pusing", 7);
        staphylococcus.addWeight("gejala_pingsan", 9);
        diseaseWeights.put("Keracunan Staphylococcus aureus", staphylococcus);
        
        DiseaseWeight jamurBeracun = new DiseaseWeight("Keracunan jamur beracun");
        jamurBeracun.addWeight("riwayat_jamur", 10);    // Memakan jamur
        jamurBeracun.addWeight("gejala_mual_muntah", 10);
        jamurBeracun.addWeight("gejala_diare", 9);
        jamurBeracun.addWeight("gejala_sakit_perut", 9);
        jamurBeracun.addWeight("gejala_pusing", 7);
        jamurBeracun.addWeight("gejala_lumpuh", 8);
        diseaseWeights.put("Keracunan jamur beracun", jamurBeracun);
        
        DiseaseWeight salmonella = new DiseaseWeight("Keracunan Salmonella");
        salmonella.addWeight("gejala_diare", 10);
        salmonella.addWeight("gejala_demam", 10);
        salmonella.addWeight("gejala_sakit_perut", 10);
        salmonella.addWeight("gejala_mual_muntah", 8);
        salmonella.addWeight("riwayat_daging", 9);      // Memakan daging
        salmonella.addWeight("gejala_lesu", 7);
        salmonella.addWeight("gejala_tidak_nafsu_makan", 7);
        diseaseWeights.put("Keracunan Salmonella", salmonella);
        
        DiseaseWeight botulinum = new DiseaseWeight("Keracunan Clostridium botulinum");
        botulinum.addWeight("gejala_lumpuh", 10);
        botulinum.addWeight("gejala_pusing", 8);
        botulinum.addWeight("gejala_pingsan", 10);
        botulinum.addWeight("riwayat_kaleng", 10);     // Memakan makanan kaleng
        botulinum.addWeight("gejala_mual_muntah", 7);
        botulinum.addWeight("gejala_sakit_perut", 6);
        diseaseWeights.put("Keracunan Clostridium botulinum", botulinum);
        
        DiseaseWeight campylobacter = new DiseaseWeight("Keracunan Campylobacter");
        campylobacter.addWeight("gejala_diare", 10);
        campylobacter.addWeight("gejala_berak_darah", 8);
        campylobacter.addWeight("gejala_demam", 9);
        campylobacter.addWeight("gejala_sakit_perut", 10);
        campylobacter.addWeight("gejala_mual_muntah", 7);
        campylobacter.addWeight("gejala_lesu", 7);
        diseaseWeights.put("Keracunan Campylobacter", campylobacter);
    }
    
    public boolean[] collectAnswers(javax.swing.JCheckBox... checkBoxes) {
        boolean[] answers = new boolean[checkBoxes.length];
        for (int i = 0; i < checkBoxes.length; i++) {
            answers[i] = checkBoxes[i].isSelected();
        }
        return answers;
    }
    
    public String diagnoseRuleBased(boolean[] answers) {
        Map<String, Boolean> symptoms = new HashMap<>();
        for (int i = 0; i < symptomKeys.length && i < answers.length; i++) {
            symptoms.put(symptomKeys[i], answers[i]);
        }
        
        StringBuilder result = new StringBuilder();
        List<String> detected = new ArrayList<>();

        if (symptoms.getOrDefault("gejala_bab", false) &&
            symptoms.getOrDefault("gejala_diare", false) &&
            symptoms.getOrDefault("gejala_lesu", false) &&
            symptoms.getOrDefault("gejala_tidak_nafsu_makan", false)) {
            detected.add("  * Mencret (Diare)");
        }
        
        if (symptoms.getOrDefault("gejala_mual_muntah", false) &&
            symptoms.getOrDefault("gejala_sakit_perut", false) &&
            symptoms.getOrDefault("gejala_diare", false)) {
            detected.add("  * Keracunan Staphylococcus aureus");
        }
        
        if (symptoms.getOrDefault("riwayat_jamur", false) &&
            symptoms.getOrDefault("gejala_mual_muntah", false) &&
            symptoms.getOrDefault("gejala_diare", false)) {
            detected.add("  * Keracunan jamur beracun");
        }
        
        if (symptoms.getOrDefault("gejala_diare", false) && 
            symptoms.getOrDefault("gejala_demam", false) &&
            symptoms.getOrDefault("gejala_sakit_perut", false) &&
            symptoms.getOrDefault("riwayat_daging", false)) {
            detected.add("  * Keracunan Salmonella");
        }
        
        if (symptoms.getOrDefault("gejala_lumpuh", false) &&
            symptoms.getOrDefault("gejala_pusing", false) &&
            symptoms.getOrDefault("gejala_pingsan", false) &&
            symptoms.getOrDefault("riwayat_kaleng", false)) {
            detected.add("  * Keracunan Clostridium botulinum [SEGERA KE UGD!]");
        }
        
        if (symptoms.getOrDefault("gejala_berak_darah", false) &&
            symptoms.getOrDefault("gejala_demam", false) &&
            symptoms.getOrDefault("gejala_sakit_perut", false)) {
            detected.add("  * Keracunan Campylobacter");
        }
        
        if (symptoms.getOrDefault("riwayat_minum_susu", false) &&
            symptoms.getOrDefault("gejala_diare", false) &&
            symptoms.getOrDefault("gejala_sakit_perut", false) &&
            !symptoms.getOrDefault("gejala_demam", false)) {
            detected.add("  * Intoleransi Laktosa (Non-infeksi)");
        }
        
        if (detected.isEmpty()) {
            result.append("  [INFO] Tidak ada penyakit yang terdeteksi\n");
            result.append("         (Gejala tidak memenuhi aturan yang ada)\n");
        } else {
            result.append("  [HASIL] Penyakit yang terdeteksi:\n");
            for (String d : detected) {
                result.append(d).append("\n");
            }
        }
        return result.toString();
    }
    
    public String diagnoseWeighted(boolean[] answers) {
        Map<String, Boolean> symptoms = new HashMap<>();
        for (int i = 0; i < symptomKeys.length && i < answers.length; i++) {
            symptoms.put(symptomKeys[i], answers[i]);
        }
        
        List<DiseaseScore> scores = new ArrayList<>();
        for (Map.Entry<String, DiseaseWeight> entry : diseaseWeights.entrySet()) {
            double score = entry.getValue().calculateScore(symptoms);
            scores.add(new DiseaseScore(entry.getKey(), score));
        }
        scores.sort((a, b) -> Double.compare(b.getScore(), a.getScore()));
        
        StringBuilder result = new StringBuilder();
        result.append("\n");
        result.append("+----+----------------------+---------------------------------------------+----------+\n");
        result.append("| No | Status               | Penyakit                                    | Skor     |\n");
        result.append("+----+----------------------+---------------------------------------------+----------+\n");
        
        int no = 1;
        for (DiseaseScore ds : scores) {
            String status;
            if (ds.getScore() >= threshold) {
                status = "[TERINFEKSI]    ";
            } else if (ds.getScore() >= 50) {
                status = "[KEMUNGKINAN]   ";
            } else if (ds.getScore() >= 30) {
                status = "[KECIL]         ";
            } else {
                status = "[SANGAT KECIL]  ";
            }
            
            String penyakit = ds.getDiseaseName();
            if (penyakit.length() > 43) {
                penyakit = penyakit.substring(0, 40) + "...";
            }
            
            result.append(String.format("| %2d | %-20s | %-43s | %5.1f%% |\n", 
                no++, status, penyakit, ds.getScore()));
        }
        
        result.append("+----+----------------------+---------------------------------------------+----------+\n");
        result.append(String.format("|    | THRESHOLD = %d%%                                                           |\n", threshold));
        result.append("+----+----------------------+---------------------------------------------+----------+\n");
        result.append("\n");
        
        // Penentuan hasil: target dengan persentase tertinggi dipilih
        DiseaseScore top = scores.get(0);
        result.append("  PENENTUAN HASIL AKHIR (Weighted Scoring)\n");
        result.append("  +----------------------------------------------------------------------+\n");
        
        if (top.getScore() >= threshold) {
            result.append("  | [TERINFEKSI] ").append(String.format("%-66s", top.getDiseaseName())).append("|\n");
            result.append(String.format("  |   Persentase : %.1f%%                                                     |\n", top.getScore()));
            result.append("  |   Status     : LAYAK sebagai hasil (melebihi threshold)                         |\n");
            result.append("  |   Saran      : Segera konsultasikan ke dokter.                                 |\n");
        } else if (top.getScore() >= 50) {
            result.append("  | [KEMUNGKINAN] ").append(String.format("%-64s", top.getDiseaseName())).append("|\n");
            result.append(String.format("  |   Persentase : %.1f%%                                                     |\n", top.getScore()));
            result.append("  |   Status     : BELUM LAYAK sebagai hasil (di bawah threshold)                   |\n");
            result.append("  |   Saran      : Lakukan pemeriksaan lebih lanjut.                              |\n");
        } else if (top.getScore() > 0) {
            result.append("  | [BELUM CUKUP BUKTI]                                                           |\n");
            result.append(String.format("  |   Persentase tertinggi : %.1f%% (di bawah threshold %d%%)                   |\n", top.getScore(), threshold));
            result.append("  |   Saran      : Jika gejala berlanjut, konsultasikan ke dokter.                |\n");
        } else {
            result.append("  | [TIDAK ADA GEJALA]                                                          |\n");
            result.append("  |   Saran      : Silakan pilih gejala yang anda alami.                         |\n");
        }
        result.append("  +----------------------------------------------------------------------+\n");
        
        return result.toString();
    }
    
    public String diagnoseComplete(boolean[] answers) {
        StringBuilder result = new StringBuilder();
                
        result.append("\n");
        result.append("+==============================================================================+\n");
        result.append("|                    SISTEM PAKAR INFEKSI SISTEM GASTRO-USUS                   |\n");
        result.append("+==============================================================================+\n");
        result.append("|                          Kategori Keracunan:                                |\n");
        result.append("|   1. Keracunan Staphylococcus aureus   4. Keracunan Clostridium botulinum   |\n");
        result.append("|   2. Keracunan jamur beracun           5. Keracunan Campylobacter            |\n");
        result.append("|   3. Keracunan Salmonella                                                   |\n");
        result.append("+==============================================================================+\n");
        result.append("\n");
        
        result.append("+----------------------------------------------------------------------------+\n");
        result.append("| METODE 1 : RULE-BASED (BERBASIS ATURAN / IF-THEN)                         |\n");
        result.append("+----------------------------------------------------------------------------+\n");
        result.append(diagnoseRuleBased(answers));
        
        result.append("\n");
        
        result.append("+----------------------------------------------------------------------------+\n");
        result.append("| METODE 2 : WEIGHTED SCORING (BERBASIS BOBOT / PROSENTASE)                 |\n");
        result.append("+----------------------------------------------------------------------------+\n");
        result.append(diagnoseWeighted(answers));
        
        return result.toString();
    }
    
    public String getMainDisease(boolean[] answers) {
        Map<String, Boolean> symptoms = new HashMap<>();
        for (int i = 0; i < symptomKeys.length && i < answers.length; i++) {
            symptoms.put(symptomKeys[i], answers[i]);
        }
        
        List<DiseaseScore> scores = new ArrayList<>();
        for (Map.Entry<String, DiseaseWeight> entry : diseaseWeights.entrySet()) {
            double score = entry.getValue().calculateScore(symptoms);
            scores.add(new DiseaseScore(entry.getKey(), score));
        }
        scores.sort((a, b) -> Double.compare(b.getScore(), a.getScore()));
        
        if (scores.get(0).getScore() >= threshold) {
            return scores.get(0).getDiseaseName();
        } else if (scores.get(0).getScore() >= 50) {
            return scores.get(0).getDiseaseName() + " (?)";
        } else if (scores.get(0).getScore() > 0) {
            return "Gejala tidak spesifik";
        }
        return "Belum ada gejala";
    }
    
    public double getTopScore(boolean[] answers) {
        Map<String, Boolean> symptoms = new HashMap<>();
        for (int i = 0; i < symptomKeys.length && i < answers.length; i++) {
            symptoms.put(symptomKeys[i], answers[i]);
        }
        
        List<DiseaseScore> scores = new ArrayList<>();
        for (Map.Entry<String, DiseaseWeight> entry : diseaseWeights.entrySet()) {
            double score = entry.getValue().calculateScore(symptoms);
            scores.add(new DiseaseScore(entry.getKey(), score));
        }
        scores.sort((a, b) -> Double.compare(b.getScore(), a.getScore()));
        return scores.get(0).getScore();
    }
}

class DiseaseWeight {
    private String name;
    private Map<String, Integer> weights;
    
    public DiseaseWeight(String name) {
        this.name = name;
        this.weights = new HashMap<>();
    }
    
    public void addWeight(String symptom, int weight) {
        weights.put(symptom, weight);
    }
    
    public double calculateScore(Map<String, Boolean> symptoms) {
        double total = 0, obtained = 0;
        for (Map.Entry<String, Integer> e : weights.entrySet()) {
            total += e.getValue();
            if (symptoms.getOrDefault(e.getKey(), false)) obtained += e.getValue();
        }
        return total == 0 ? 0 : (obtained / total) * 100;
    }
    
    public String getName() { return name; }
}

class DiseaseScore {
    private String diseaseName;
    private double score;
    
    public DiseaseScore(String diseaseName, double score) {
        this.diseaseName = diseaseName;
        this.score = score;
    }
    
    public String getDiseaseName() { return diseaseName; }
    public double getScore() { return score; }
}