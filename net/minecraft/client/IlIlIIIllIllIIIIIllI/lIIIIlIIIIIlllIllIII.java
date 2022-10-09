package net.minecraft.client.IlIlIIIllIllIIIIIllI;

import net.minecraft.client.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import java.io.*;
import leaf.*;
import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class lIIIIlIIIIIlllIllIII
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private final Minecraft IlIlIlIlIlllllllllIl;
    private final List llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public lIIIIlIIIIIlllIllIII(final Minecraft ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll();
    }
    
    public void llllIIIIlIIIlIlllIll() {
        try {
            this.llIllIIIIIllIlIIIIlI.clear();
            this.IlIIIlIlIIIllIlIlIIl();
            final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll = net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new File(this.IlIlIlIlIlllllllllIl.mcDataDir, "servers.dat"));
            if (llllIIIIlIIIlIlllIll == null) {
                return;
            }
            final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("servers", 10);
            for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
                this.llIllIIIIIllIlIIIIlI.add(IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i)));
            }
        }
        catch (Exception ex) {
            lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.error("Couldn't load server list", (Throwable)ex);
        }
    }
    
    private void IlIIIlIlIIIllIlIlIIl() {
        if (Leaf.instance.downloadPlayerData.serverData.isEmpty()) {
            return;
        }
        final Iterator<String> iterator = Leaf.instance.downloadPlayerData.serverData.iterator();
        while (iterator.hasNext()) {
            this.llllIIIIlIIIlIlllIll(new IllIIlllIIIIlllIIlIl("Partner Server", iterator.next(), false));
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        try {
            final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
            for (final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl : this.llIllIIIIIllIlIIIIlI) {
                if (!Leaf.instance.downloadPlayerData.serverData.contains(illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl)) {
                    ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll());
                }
            }
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("servers", ilIlIIIlIIlIlIIlllIl);
            net.minecraft.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll, new File(this.IlIlIlIlIlllllllllIl.mcDataDir, "servers.dat"));
        }
        catch (Exception ex) {
            lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.error("Couldn't save server list", (Throwable)ex);
        }
    }
    
    public IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll(final int n) {
        return this.llIllIIIIIllIlIIIIlI.get(n);
    }
    
    public void IlIlIlIlIlllllllllIl(final int n) {
        this.llIllIIIIIllIlIIIIlI.remove(n);
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        this.llIllIIIIIllIlIIIIlI.add(illIIlllIIIIlllIIlIl);
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI.size();
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(n);
        this.llIllIIIIIllIlIIIIlI.set(n, this.llllIIIIlIIIlIlllIll(n2));
        this.llIllIIIIIllIlIIIIlI.set(n2, llllIIIIlIIIlIlllIll);
        this.IlIlIlIlIlllllllllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        this.llIllIIIIIllIlIIIIlI.set(n, illIIlllIIIIlllIIlIl);
    }
    
    public static void IlIlIlIlIlllllllllIl(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = new lIIIIlIIIIIlllIllIII(Minecraft.getMinecraft());
        liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll();
        for (int i = 0; i < liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(); ++i) {
            final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(i);
            if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.equals(illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll) && llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.equals(illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl)) {
                liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(i, illIIlllIIIIlllIIlIl);
                break;
            }
        }
        liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl();
    }
}
