package fr.freshperf.pve4j.entities.nodes.node;

/**
 * Represents the memory usage of a Proxmox node.
 */
public class PveNodeMemory {

    private long available;
    private long free;
    private long total;
    private long used;

    public long getAvailable() { return available; }
    public long getFree() { return free; }
    public long getTotal() { return total; }
    public long getUsed() { return used; }

    @Override
    public String toString() {
        return "PveNodeMemory{available=" + available + ", free=" + free +
                ", total=" + total + ", used=" + used + '}';
    }
}
