package demo;

public class WeightedSamplingAlogrithm {
    public WeightedSamplingAlogrithm() {
    }
    public void setCampainAndAdId(LoginData loginData) {
        double randomCampain = Math.random();
        double randomAd = Math.random();
        double sofaWeight = 0.2;
        double cornerSofaWeight = 0.8;
        double sofaAdWeight1 = 1;
        double sofaAdWeight2 = 1;
        double sofaAdWeight3 = 8;
        double sofaAdWeightSum = sofaAdWeight1 + sofaAdWeight2 + sofaAdWeight3;
        double cornerSofaAdWeight1 = 2;
        double cornerSofaAdWeight2 = 3;
        double cornerSofaAdWeight3 = 4;
        double cornerSofaAdSum = cornerSofaAdWeight1 + cornerSofaAdWeight2 + cornerSofaAdWeight3;
        int campainId = 0;
        int AdId = 0;
        campainId = randomCampain < sofaWeight / cornerSofaWeight ? 3022 :3023;
        AdId = (campainId == 3022) ? randomAd  < sofaAdWeight1 / sofaAdWeightSum ? 1001 : randomAd < (sofaAdWeight1 + sofaAdWeight2) / sofaAdWeightSum ? 1002 : 1003
                :  randomAd  < cornerSofaAdWeight1 / cornerSofaAdSum ? 1004 : randomAd < (cornerSofaAdWeight1 + cornerSofaAdWeight2) / cornerSofaAdSum ? 1005 : 1006;
        loginData.setCampainId(campainId);
        loginData.setAdId(AdId);
    }
}
