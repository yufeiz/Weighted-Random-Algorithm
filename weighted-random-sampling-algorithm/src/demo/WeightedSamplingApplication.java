package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Windows on 9/9/2017.
 */
public class WeightedSamplingApplication {
    private static final String FILENAME = "src/data";
    public static void main(String[] args) {
        LoginData loginData = new LoginData();
        WeightedSamplingAlogrithm weightedSamplingAlogrithm = new WeightedSamplingAlogrithm();
        File file = null;
        try {
            file = new File(FILENAME);
            Scanner scanner = new Scanner(file).useDelimiter(",");
            int[] campainNum = new int[2];
            int[] adNum = new int[6];
            while(scanner.hasNextLine()) {
                weightedSamplingAlogrithm.setCampainAndAdId(loginData);
                int campainIndex = Math.toIntExact(loginData.getCampainId() - 3022);
                int adIndex = Math.toIntExact(loginData.getAdId() - 1001);
                campainNum[campainIndex]++;
                adNum[adIndex]++;
                String nextLineData = scanner.nextLine();
                String characters[] = nextLineData.split(",");
                loginData.setDeviceIP(Long.valueOf(characters[0]));
                loginData.setDeviceId(Long.valueOf(characters[1]));
                loginData.setSessionId(Long.valueOf(characters[2]));
                loginData.setQuery(characters[3]);
                loginData.setCatagoryMatched(Double.valueOf(characters[4]));
                loginData.setIsclicked(Boolean.valueOf(characters[5]));
                System.out.println(loginData);
            }
            System.out.println("CampainId equals 3032 number=" + campainNum[0]);
            System.out.println("CampainId equals 3033 number=" + campainNum[1]);
            System.out.println("AdId equals 1001 number=" + adNum[0]);
            System.out.println("AdId equals 1002 number=" + adNum[1]);
            System.out.println("AdId equals 1003 number=" + adNum[2]);
            System.out.println("AdId equals 1004 number=" + adNum[3]);
            System.out.println("AdId equals 1004 number=" + adNum[3]);
            System.out.println("AdId equals 1005 number=" + adNum[4]);
            System.out.println("AdId equals 1006 number=" +  adNum[5]);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
