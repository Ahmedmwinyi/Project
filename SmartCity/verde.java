/**
 * verde
 */
public class verde extends Hotel {

    public int licence;

    public verde(String name, String location, int licence) {
        super(name, location);
        this.licence = licence;
    }

    public void setLicence(int licence) {
        this.licence = licence;
    }

    public int getLicence() {
        return licence;
    }
}