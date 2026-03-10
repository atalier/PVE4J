package fr.freshperf.pve4j.entities.nodes.node;

/**
 * Represents the boot mode meta-information of a Proxmox node.
 */
public class PveNodeBootInfo {

    private String mode;
    private Boolean secureboot;

    public String getMode() { return mode; }
    public Boolean getSecureboot() { return secureboot; }

    @Override
    public String toString() {
        return "PveNodeBootInfo{mode='" + mode + '\'' + ", secureboot=" + secureboot + '}';
    }
}
