package fr.freshperf.pve4j.entities.nodes.node;

/**
 * Represents the root filesystem usage of a Proxmox node.
 */
public class PveNodeRootfs {

    private long avail;
    private long free;
    private long total;
    private long used;

    public long getAvail() { return avail; }
    public long getFree() { return free; }
    public long getTotal() { return total; }
    public long getUsed() { return used; }

    @Override
    public String toString() {
        return "PveNodeRootfs{avail=" + avail + ", free=" + free +
                ", total=" + total + ", used=" + used + '}';
    }
}
