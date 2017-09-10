package demo;

/**
 * Created by Windows on 9/9/2017.
 */
public class LoginData {
    private long deviceIP;
    private long DeviceId;
    private long sessionId;
    private String query;
    private long campainId;
    private double catagoryMatched;
    private boolean isclicked;
    private long adId;


    public LoginData() {
    }

    public LoginData(long deviceIP, long deviceId, long sessionId, String query, double catagoryMatched, boolean isclicked) {
        this.deviceIP = deviceIP;
        DeviceId = deviceId;
        this.sessionId = sessionId;
        this.query = query;
        this.catagoryMatched = catagoryMatched;
        this.isclicked = isclicked;
    }

    public LoginData(long adId) {
        this.adId = adId;
    }

    public long getDeviceIP() {
        return deviceIP;
    }

    public void setDeviceIP(long deviceIP) {
        this.deviceIP = deviceIP;
    }

    public long getDeviceId() {
        return DeviceId;
    }

    public void setDeviceId(long deviceId) {
        DeviceId = deviceId;
    }

    public long getSessionId() {
        return sessionId;
    }

    public long getAdId() {
        return adId;
    }

    public void setAdId(long adId) {
        this.adId = adId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public long getCampainId() {
        return campainId;
    }



    public void setCampainId(long campainId) {
        this.campainId = campainId;
    }

    public double getCatagoryMatched() {
        return catagoryMatched;
    }

    public void setCatagoryMatched(double catagoryMatched) {
        this.catagoryMatched = catagoryMatched;
    }

    public boolean isIsclicked() {
        return isclicked;
    }

    public void setIsclicked(boolean isclicked) {
        this.isclicked = isclicked;
    }

    @Override
    public String toString() {
        return "LoginData{" +
                "deviceIP=" + deviceIP +
                ", DeviceId=" + DeviceId +
                ", sessionId=" + sessionId +
                ", query='" + query + '\'' +
                ", campainId=" + campainId +
                ", adId=" + adId +
                ", catagoryMatched=" + catagoryMatched +
                ", isclicked=" + isclicked +
                '}';
    }

}
