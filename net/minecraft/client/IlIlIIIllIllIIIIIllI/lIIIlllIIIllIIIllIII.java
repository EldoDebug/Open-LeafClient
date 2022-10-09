package net.minecraft.client.IlIlIIIllIllIIIIIllI;

import java.util.concurrent.atomic.*;
import org.apache.logging.log4j.*;
import java.net.*;
import java.io.*;

public class lIIIlllIIIllIIIllIII extends Thread
{
    private static final AtomicInteger llllIIIIlIIIlIlllIll;
    private static final Logger IlIlIlIlIlllllllllIl;
    private final String llIllIIIIIllIlIIIIlI;
    private final DatagramSocket IlIIIlIlIIIllIlIlIIl;
    private boolean IlIlIIIllIllIIIIIllI;
    private final String IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIIlIIIlIlllIll = new AtomicInteger(0);
        IlIlIlIlIlllllllllIl = LogManager.getLogger();
    }
    
    public lIIIlllIIIllIIIllIII(final String llIllIIIIIllIlIIIIlI, final String illIIlllIIIIlllIIlIl) {
        super("LanServerPinger #" + lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.incrementAndGet());
        this.IlIlIIIllIllIIIIIllI = true;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.setDaemon(true);
        this.IlIIIlIlIIIllIlIlIIl = new DatagramSocket();
    }
    
    @Override
    public void run() {
        final byte[] bytes = llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, this.IllIIlllIIIIlllIIlIl).getBytes();
        while (!this.isInterrupted() && this.IlIlIIIllIllIIIIIllI) {
            try {
                this.IlIIIlIlIIIllIlIlIIl.send(new DatagramPacket(bytes, bytes.length, InetAddress.getByName("224.0.2.60"), 4445));
            }
            catch (IOException ex) {
                lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.warn("LanServerPinger: " + ex.getMessage());
                break;
            }
            try {
                Thread.sleep(1500L);
            }
            catch (InterruptedException ex2) {}
        }
    }
    
    @Override
    public void interrupt() {
        super.interrupt();
        this.IlIlIIIllIllIIIIIllI = false;
    }
    
    public static String llllIIIIlIIIlIlllIll(final String s, final String s2) {
        return "[MOTD]" + s + "[/MOTD][AD]" + s2 + "[/AD]";
    }
    
    public static String llllIIIIlIIIlIlllIll(final String s) {
        final int index = s.indexOf("[MOTD]");
        if (index < 0) {
            return "missing no";
        }
        final int index2 = s.indexOf("[/MOTD]", index + "[MOTD]".length());
        return (index2 < index) ? "missing no" : s.substring(index + "[MOTD]".length(), index2);
    }
    
    public static String IlIlIlIlIlllllllllIl(final String s) {
        final int index = s.indexOf("[/MOTD]");
        if (index < 0) {
            return null;
        }
        if (s.indexOf("[/MOTD]", index + "[/MOTD]".length()) >= 0) {
            return null;
        }
        final int index2 = s.indexOf("[AD]", index + "[/MOTD]".length());
        if (index2 < 0) {
            return null;
        }
        final int index3 = s.indexOf("[/AD]", index2 + "[AD]".length());
        return (index3 < index2) ? null : s.substring(index2 + "[AD]".length(), index3);
    }
}
