import java.io.*;
import java.util.HashMap;

public class Main {

    /**
     *  A+	4.5
     * A0	4.0
     * B+	3.5
     * B0	3.0
     * C+	2.5
     * C0	2.0
     * D+	1.5
     * D0	1.0
     * F	0.0
     *
     * ObjectOrientedProgramming1 3.0 A+
     * IntroductiontoComputerEngineering 3.0 A+
     * ObjectOrientedProgramming2 3.0 A0
     * CreativeComputerEngineeringDesign 3.0 A+
     * AssemblyLanguage 3.0 A+
     * InternetProgramming 3.0 B0
     * ApplicationProgramminginJava 3.0 A0
     * SystemProgramming 3.0 B0
     * OperatingSystem 3.0 B0
     * WirelessCommunicationsandNetworking 3.0 C+
     * LogicCircuits 3.0 B0
     * DataStructure 4.0 A+
     * MicroprocessorApplication 3.0 B+
     * EmbeddedSoftware 3.0 C0
     * ComputerSecurity 3.0 D+
     * Database 3.0 C+
     * Algorithm 3.0 B0
     * CapstoneDesigninCSE 3.0 B+
     * CompilerDesign 3.0 D0
     * ProblemSolving 4.0 P
     *
     *
     * 3.284483
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        float total_credit = 0;
        float total_score = 0;

        HashMap<String, Float> map = new HashMap<String, Float>();
        map.put("A+", 4.5F);
        map.put("A0", 4.0F);
        map.put("B+", 3.5F);
        map.put("B0", 3.0F);
        map.put("C+", 2.5F);
        map.put("C0", 2.0F);
        map.put("D+", 1.5F);
        map.put("D0", 1.0F);
        map.put("F", 0F);


        for (int i = 0; i < 20; i++) {
            String[] curriculum = br.readLine().split(" ");

            if (curriculum[2].equals("P")) {
                continue;
            }

            float credit = Float.parseFloat(curriculum[1]);
            float score = map.get(curriculum[2]);

            total_credit += credit;
            total_score += (credit * score);
        }

        bw.write(total_score / total_credit + "");
        bw.flush();
        bw.close();
        br.close();
    }
}