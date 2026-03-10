package fr.freshperf.pve4j.entities.nodes.node;

/**
 * Represents the CPU information of a Proxmox node.
 */
public class PveNodeCpuInfo {

    private int cores;
    private int cpus;
    private String model;
    private int sockets;

    public int getCores() { return cores; }
    public int getCpus() { return cpus; }
    public String getModel() { return model; }
    public int getSockets() { return sockets; }

    @Override
    public String toString() {
        return "PveNodeCpuInfo{cores=" + cores + ", cpus=" + cpus +
                ", model='" + model + '\'' + ", sockets=" + sockets + '}';
    }
}
