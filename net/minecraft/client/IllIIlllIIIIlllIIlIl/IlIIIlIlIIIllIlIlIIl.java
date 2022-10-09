package net.minecraft.client.IllIIlllIIIIlllIIlIl;

import java.net.*;
import java.io.*;

public class IlIIIlIlIIIllIlIlIIl extends Thread
{
    private final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll;
    private final InetAddress IlIlIlIlIlllllllllIl;
    private final MulticastSocket llIllIIIIIllIlIIIIlI;
    
    public IlIIIlIlIIIllIlIlIIl(final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll) {
        super("LanServerDetector #" + net.minecraft.client.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.incrementAndGet());
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.setDaemon(true);
        this.llIllIIIIIllIlIIIIlI = new MulticastSocket(4445);
        this.IlIlIlIlIlllllllllIl = InetAddress.getByName("224.0.2.60");
        this.llIllIIIIIllIlIIIIlI.setSoTimeout(5000);
        this.llIllIIIIIllIlIIIIlI.joinGroup(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public void run() {
        final byte[] array = new byte[1024];
        while (!this.isInterrupted()) {
            final DatagramPacket datagramPacket = new DatagramPacket(array, array.length);
            try {
                this.llIllIIIIIllIlIIIIlI.receive(datagramPacket);
            }
            catch (SocketTimeoutException ex2) {
                continue;
            }
            catch (IOException ex) {
                net.minecraft.client.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.error("Couldn't ping server", (Throwable)ex);
                break;
            }
            final String s = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
            net.minecraft.client.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.debug(datagramPacket.getAddress() + ": " + s);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, datagramPacket.getAddress());
        }
        try {
            this.llIllIIIIIllIlIIIIlI.leaveGroup(this.IlIlIlIlIlllllllllIl);
        }
        catch (IOException ex3) {}
        this.llIllIIIIIllIlIIIIlI.close();
    }
}
