package utils.JDKLister;

/**
 * Represents information about a JDK installation
 */
public class JDKInfo {
    private final String path;
    private final String version;
    private final String vendor;

    public JDKInfo(String path, String version, String vendor) {
        this.path = path;
        this.version = version;
        this.vendor = vendor;
    }

    public String getPath() {
        return path;
    }

    public String getVersion() {
        return version;
    }

    public String getVendor() {
        return vendor;
    }

    @Override
    public String toString() {
        return String.format("JDK [Path: %s, Version: %s, Vendor: %s]", 
                           path, version, vendor);
    }
}
