package module5.port;


/* Author's Name: Joseph Portugal
 * Course / Section: LBYCPEI / EQ3
 * Date: 06 - 07 - 2019
 */

import acm.program.ConsoleProgram;

public class Calculator extends ConsoleProgram {

    private CalculatorSoundLevel solveSoundLevel;
    private CalculatorDopplerEffect solveDopplerEffect;

    public void run() {

        solveSoundLevel = new CalculatorSoundLevel();
        solveDopplerEffect = new CalculatorDopplerEffect();

        int choice = 0;

        while (choice != 3) {

            printf("\n1) Calculate the Decrease of Sound with Distance \n2) Doppler Effect \n3) Exit \n\nInput your selection: ");
            choice = readInt();

            if (choice == 1) {

                soundLevels();

            } else if (choice == 2) {

                dopplerEffect();

            } else if (choice == 3) {
                java.lang.System.exit(0);
            } else {
                printf("\nINVALID CHOICE\n\n");
            }

        }
    }

    void soundLevels(){
        int choice = 0;

        while (choice != 5) {
        println("\nYou are now calculating for sound decibels and distance\n\nWhich variable would you like to solve?\n1) Initial Sound Level (dB) \n2) Final Sound Level (dB) \n3) Initial Distance (m) \n4) Final Distance (m)\n5) Back \n\nInput your selection:  ");
        choice = readInt();

            if (choice == 1) {
                println("Input Final Sound Level (dB) from where the sound is heard: ");
                solveSoundLevel.setL2(readDouble());
                println("Input Initial Distance (m) from where the sound is heard: ");
                solveSoundLevel.setR1(readDouble());
                println("Input Final Distance (m) from where the sound is heard: ");
                solveSoundLevel.setR2(readDouble());

                double L1Solved = solveSoundLevel.solveForL1();
                println("\nThe Sound Level (dB) from where the sound is Initially heard: " + L1Solved + " dB" +"\n");
            } else if (choice == 2) {
                println("Input Initial Sound Level (dB) from where the sound is heard: ");
                solveSoundLevel.setL1(readDouble());
                println("Input Initial Distance (m) from where the sound is heard: ");
                solveSoundLevel.setR1(readDouble());
                println("Input Final Distance (m) from where the sound is heard: ");
                solveSoundLevel.setR2(readDouble());

                double L2Solved = solveSoundLevel.solveForL2();

                println("\nThe Sound Level (dB) from where the sound is Last heard: " + L2Solved + " dB" + "\n");

            } else if (choice == 3) {
                println("Input Initial Sound Level (dB) from where the sound is heard: ");
                solveSoundLevel.setL1(readDouble());
                println("Input Final Sound Level (dB) from where the sound is heard: ");
                solveSoundLevel.setL2(readDouble());
                println("Input Final Distance (m) from where the sound is heard: ");
                solveSoundLevel.setR2(readDouble());

                double R1Solved = solveSoundLevel.solveForR1();

                println("\nThe Distance (m) from where the sound is Initially heard: " + R1Solved + " m" + "\n");


            } else if (choice == 4) {
                println("Input Initial Sound Level (dB) from where the sound is heard: ");
                solveSoundLevel.setL1(readDouble());
                println("Input Final Sound Level (dB) from where the sound is heard: ");
                solveSoundLevel.setL2(readDouble());
                println("Input Initial Distance (m) from where the sound is heard: ");
                solveSoundLevel.setR1(readDouble());

                double R2Solved = solveSoundLevel.solveForR2();

                printf("\nThe Distance (m) from where the sound Last is heard: " + R2Solved + " m" + "\n");

            } else if (choice == 5) {
            } else {
                printf("\nINVALID CHOICE\n\n");
            }
        }

    }

    void dopplerEffect(){
        int choice = 0;

        while (choice != 5) {
            println("\nYou are now calculating for the Doppler Effect (the change in wavelength of a wave in relation to an observer who is moving relative to the wave source)\n\nWhich variable would you like to solve?\n1) Observed Frequency (Hz) \n2) Actual Frequency (Hz) \n3) Observer's Velocity (m/s) \n4) Source's Velocity (m/s)\n5) Back \n\nInput your selection: ");
            choice = readInt();

            if (choice == 1) {
                println("Input the Actual Frequency (Hz): ");
                solveDopplerEffect.setFa(readDouble());
                println("Input the Observer's Velocity (m/s): ");
                solveDopplerEffect.setVo(readDouble());
                println("Input the Source's Velocity (m/s): ");
                solveDopplerEffect.setVs(readDouble());

                double FoSolved = solveDopplerEffect.solveForFo();
                println("\nThe Observed Frequency is: " + FoSolved + " Hz" +"\n");

            } else if (choice == 2) {
                println("Input the Observed Frequency (Hz): ");
                solveDopplerEffect.setFa(readDouble());
                println("Input the Observer's Velocity (m/s): ");
                solveDopplerEffect.setVo(readDouble());
                println("Input the Source's Velocity (m/s): ");
                solveDopplerEffect.setVs(readDouble());

                double FaSolved = solveDopplerEffect.solveForFa();

                println("\nThe Actual Frequency is: " + FaSolved + " Hz" +"\n");

            } else if (choice == 3) {
                println("Input the Observed Frequency (Hz): ");
                solveDopplerEffect.setFo(readDouble());
                println("Input the Actual Frequency (Hz): ");
                solveDopplerEffect.setFa(readDouble());
                println("Input the Source's Velocity (m/s): ");
                solveDopplerEffect.setVs(readDouble());

                double VoSolved = solveDopplerEffect.solveForVo();

                println("\nThe Observer's Velocity is: " + VoSolved + " m/s" +"\n");


            } else if (choice == 4) {
                println("Input the Observed Frequency (Hz): ");
                solveDopplerEffect.setFo(readDouble());
                println("Input the Actual Frequency (Hz): ");
                solveDopplerEffect.setFa(readDouble());
                println("Input the Observer's Velocity (m/s): ");
                solveDopplerEffect.setVo(readDouble());

                double VsSolved = solveDopplerEffect.solveForVs();

                println("\nThe Source's Velocity is: " + VsSolved + " m/s" +"\n");

            } else if (choice == 5) {
            } else {
                printf("\nINVALID CHOICE\n\n");
            }
        }

    }


    public static void main (String[] args){
        (new Calculator()).start(args);
    }

}
