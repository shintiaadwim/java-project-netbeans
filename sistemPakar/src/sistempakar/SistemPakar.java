package sistempakar;

import java.util.*;

public class SistemPakar {
    private static final int DEFAULT_THRESHOLD = 80;
    private int threshold;
    
    private String[] symptomKeys = {
        "gejala_bab",
        "gejala_diare",
        "gejala_berak_darah",
        "gejala_lesu",
        "gejala_tidak_nafsu_makan",
        "gejala_mual_muntah",
        "gejala_sakit_perut",
        "gejala_tekanan_rendah",
        "gejala_pusing",
        "gejala_pingsan",
        "gejala_demam",
        "gejala_luka",
        "gejala_lumpuh",
        "riwayat_makan",
        "riwayat_daging",
        "riwayat_jamur",
        "riwayat_kaleng",
        "riwayat_beli_susu",
        "riwayat_minum_susu"
    };
    
    private Map<String, DiseaseWeight> diseaseWeights;
    
    public SistemPakar() {
        this(DEFAULT_THRESHOLD);
    }
    
    public SistemPakar(int threshold) {
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
        
        DiseaseWeight gastroenteritis = new DiseaseWeight("Gastroenteritis Akut");
        gastroenteritis.addWeight("gejala_diare", 10);
        gastroenteritis.addWeight("gejala_mual_muntah", 10);
        gastroenteritis.addWeight("gejala_sakit_perut", 9);
        gastroenteritis.addWeight("gejala_demam", 6);
        gastroenteritis.addWeight("gejala_lesu", 7);
        diseaseWeights.put("Gastroenteritis Akut", gastroenteritis);
        
        DiseaseWeight salmonella = new DiseaseWeight("Salmonellosis");
        salmonella.addWeight("gejala_diare", 10);
        salmonella.addWeight("gejala_demam", 9);
        salmonella.addWeight("gejala_sakit_perut", 9);
        salmonella.addWeight("riwayat_daging", 8);
        salmonella.addWeight("gejala_mual_muntah", 7);
        diseaseWeights.put("Salmonellosis", salmonella);
        
        DiseaseWeight amebiasis = new DiseaseWeight("Amebiasis");
        amebiasis.addWeight("gejala_berak_darah", 10);
        amebiasis.addWeight("gejala_sakit_perut", 9);
        amebiasis.addWeight("gejala_demam", 7);
        amebiasis.addWeight("gejala_diare", 8);
        diseaseWeights.put("Amebiasis", amebiasis);
        
        DiseaseWeight disentri = new DiseaseWeight("Disentri");
        disentri.addWeight("gejala_berak_darah", 10);
        disentri.addWeight("gejala_diare", 10);
        disentri.addWeight("gejala_sakit_perut", 9);
        disentri.addWeight("gejala_demam", 8);
        diseaseWeights.put("Disentri", disentri);
        
        DiseaseWeight botulinum = new DiseaseWeight("Clostridium botulinum (Botulisme)");
        botulinum.addWeight("gejala_lumpuh", 10);
        botulinum.addWeight("gejala_pusing", 8);
        botulinum.addWeight("gejala_pingsan", 9);
        botulinum.addWeight("riwayat_kaleng", 10);
        diseaseWeights.put("Clostridium botulinum", botulinum);
        
        DiseaseWeight mushroom = new DiseaseWeight("Keracunan Jamur");
        mushroom.addWeight("riwayat_jamur", 10);
        mushroom.addWeight("gejala_mual_muntah", 9);
        mushroom.addWeight("gejala_diare", 8);
        mushroom.addWeight("gejala_sakit_perut", 8);
        diseaseWeights.put("Keracunan Jamur", mushroom);
        
        DiseaseWeight lactose = new DiseaseWeight("Intoleransi Laktosa (Non-infeksi)");
        lactose.addWeight("riwayat_minum_susu", 10);
        lactose.addWeight("gejala_diare", 9);
        lactose.addWeight("gejala_sakit_perut", 8);
        diseaseWeights.put("Intoleransi Laktosa", lactose);
        
        DiseaseWeight typhoid = new DiseaseWeight("Demam Tifoid (Tipes)");
        typhoid.addWeight("gejala_demam", 10);
        typhoid.addWeight("gejala_sakit_perut", 9);
        typhoid.addWeight("gejala_lesu", 8);
        typhoid.addWeight("gejala_tidak_nafsu_makan", 8);
        diseaseWeights.put("Demam Tifoid", typhoid);
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
        
        if (symptoms.getOrDefault("gejala_diare", false) &&
            symptoms.getOrDefault("gejala_mual_muntah", false) &&
            symptoms.getOrDefault("gejala_sakit_perut", false)) {
            detected.add("  * Gastroenteritis Akut");
        }
        
        if (symptoms.getOrDefault("gejala_diare", false) && 
            symptoms.getOrDefault("gejala_demam", false) &&
            symptoms.getOrDefault("gejala_sakit_perut", false)) {
            detected.add("  * Salmonellosis");
        }
        
        if (symptoms.getOrDefault("gejala_berak_darah", false) &&
            symptoms.getOrDefault("gejala_sakit_perut", false)) {
            detected.add("  * Disentri / Amebiasis");
        }
        
        if (symptoms.getOrDefault("gejala_lumpuh", false) &&
            symptoms.getOrDefault("riwayat_kaleng", false)) {
            detected.add("  * Clostridium botulinum (Botulisme) [SEGERA KE UGD!]");
        }
        
        if (symptoms.getOrDefault("riwayat_jamur", false) &&
            symptoms.getOrDefault("gejala_mual_muntah", false)) {
            detected.add("  * Keracunan Jamur");
        }
        
        if (symptoms.getOrDefault("riwayat_minum_susu", false) &&
            symptoms.getOrDefault("gejala_diare", false) &&
            !symptoms.getOrDefault("gejala_demam", false)) {
            detected.add("  * Intoleransi Laktosa (Non-infeksi)");
        }
        
        if (symptoms.getOrDefault("gejala_demam", false) &&
            symptoms.getOrDefault("gejala_sakit_perut", false) &&
            symptoms.getOrDefault("gejala_lesu", false)) {
            detected.add("  * Demam Tifoid (Tipes)");
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
        result.append("+----------------------------------------------------------------------------+\n");
        result.append("| No | Status           | Penyakit                              | Skor       |\n");
        result.append("+----------------------------------------------------------------------------+\n");
        
        int no = 1;
        for (DiseaseScore ds : scores) {
            String status;
            if (ds.getScore() >= threshold) {
                status = "[TERINFEKSI]";
            } else if (ds.getScore() >= 50) {
                status = "[KEMUNGKINAN]";
            } else if (ds.getScore() >= 30) {
                status = "[KECIL]     ";
            } else {
                status = "[SANGAT KECIL]";
            }
            
            String penyakit = ds.getDiseaseName();
            if (penyakit.length() > 37) {
                penyakit = penyakit.substring(0, 34) + "...";
            }
            
            result.append(String.format("| %2d | %-16s | %-37s | %5.1f%%     |\n", 
                no++, status, penyakit, ds.getScore()));
        }
        result.append("+----------------------------------------------------------------------------+\n");
        result.append("\n");
        DiseaseScore top = scores.get(0);
        result.append("+----------------------------------------------------------------------------+\n");
        result.append("| PENENTUAN HASIL AKHIR (Weighted Scoring)                                   |\n");
        result.append("+----------------------------------------------------------------------------+\n");
        
        if (top.getScore() >= threshold) {
            result.append("  [TERINFEKSI]").append(String.format("%-62s", top.getDiseaseName())).append("\n");
            result.append(String.format("  Keyakinan : %.1f%%                                            \n", top.getScore()));
            result.append("  Saran     : Segera konsultasikan ke dokter.                                 \n");
        } else if (top.getScore() >= 50) {
            result.append("  [KEMUNGKINAN] ").append(String.format("%-60s", top.getDiseaseName())).append("\n");
            result.append(String.format("  Keyakinan : %.1f%%                                              \n", top.getScore()));
            result.append("  Saran     : Lakukan pemeriksaan lebih lanjut.                                 \n");
        } else if (top.getScore() > 0) {
            result.append("  [BELUM CUKUP BUKTI]                                                     \n");
            result.append(String.format("  Skor tertinggi : %.1f%% (di bawah threshold %d%%)         \n", top.getScore(), threshold));
            result.append("  Saran     : Jika gejala berlanjut, konsultasikan ke dokter.             \n");
        } else {
            result.append("  [TIDAK ADA GEJALA]                                                      \n");
            result.append("  Saran     : Silakan pilih gejala yang anda alami.                       \n");
        }
        result.append("+----------------------------------------------------------------------------+\n");
        
        return result.toString();
    }
    
    public String diagnoseComplete(boolean[] answers) {
        StringBuilder result = new StringBuilder();
        result.append("+----------------------------------------------------------------------------+\n");
        result.append("| METHODE 1 : RULE-BASED (BERBASIS ATURAN / IF-THEN)                         |\n");
        result.append("+----------------------------------------------------------------------------+\n");
        result.append(diagnoseRuleBased(answers));
        result.append("+----------------------------------------------------------------------------+\n");
        result.append("\n");
        result.append("+----------------------------------------------------------------------------+\n");
        result.append("| METHODE 2 : WEIGHTED SCORING (BERBASIS BOBOT / PROSENTASE)                 |\n");
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