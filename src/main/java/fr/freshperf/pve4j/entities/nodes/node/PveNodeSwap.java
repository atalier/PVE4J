package fr.freshperf.pve4j.entities.nodes.node;

/**
 * Represents the swap usage of a Proxmox node.
 */
public class PveNodeSwap {

    private long free;
    private long total;
    private long used;

    public long getFree() { return free; }
    public long getTotal() { return total; }
    public long getUsed() { return used; }

    @Override
    public String toString() {
        return "PveNodeSwap{free=" + free + ", total=" + total + ", used=" + used + '}';
    }
}
