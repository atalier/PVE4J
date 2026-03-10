package fr.freshperf.pve4j.entities.nodes.node;

/**
 * Represents the currently booted kernel meta-information of a Proxmox node.
 */
public class PveNodeCurrentKernel {

    private String machine;
    private String release;
    private String sysname;
    private String version;

    public String getMachine() { return machine; }
    public String getRelease() { return release; }
    public String getSysname() { return sysname; }
    public String getVersion() { return version; }

    @Override
    public String toString() {
        return "PveNodeCurrentKernel{machine='" + machine + '\'' + ", release='" + release + '\'' +
                ", sysname='" + sysname + '\'' + ", version='" + version + '\'' + '}';
    }
}
