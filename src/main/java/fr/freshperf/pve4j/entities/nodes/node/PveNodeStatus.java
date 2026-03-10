package fr.freshperf.pve4j.entities.nodes.node;

import com.google.gson.annotations.SerializedName;

/**
 * Represents detailed node status information.
 */
public class PveNodeStatus {

    private String uptime, wait, idle, pveversion, kversion;
    private float cpu;
    private String[] loadavg;
    private PveNodeMemory memory;
    private PveNodeRootfs rootfs;
    private PveNodeSwap swap;
    private PveNodeCpuInfo cpuinfo;

    @SerializedName("boot-info")
    private PveNodeBootInfo bootInfo;

    @SerializedName("current-kernel")
    private PveNodeCurrentKernel currentKernel;

    public String getUptime() {
        return uptime;
    }

    public String getWait() {
        return wait;
    }

    public String getIdle() {
        return idle;
    }

    public String getPveversion() {
        return pveversion;
    }

    public String getKversion() {
        return kversion;
    }

    public float getCpu() {
        return cpu;
    }

    public String[] getLoadavg() {
        return loadavg;
    }

    public PveNodeMemory getMemory() {
        return memory;
    }

    public PveNodeRootfs getRootfs() {
        return rootfs;
    }

    public PveNodeSwap getSwap() {
        return swap;
    }

    public PveNodeCpuInfo getCpuinfo() {
        return cpuinfo;
    }

    public PveNodeBootInfo getBootInfo() {
        return bootInfo;
    }

    public PveNodeCurrentKernel getCurrentKernel() {
        return currentKernel;
    }

    @Override
    public String toString() {
        return "PveNodeStatus{" +
                "uptime='" + uptime + '\'' +
                ", wait='" + wait + '\'' +
                ", idle='" + idle + '\'' +
                ", pveversion='" + pveversion + '\'' +
                ", kversion='" + kversion + '\'' +
                ", cpu=" + cpu +
                ", memory=" + memory +
                ", rootfs=" + rootfs +
                ", swap=" + swap +
                ", cpuinfo=" + cpuinfo +
                ", bootInfo=" + bootInfo +
                ", currentKernel=" + currentKernel +
                '}';
    }
}
