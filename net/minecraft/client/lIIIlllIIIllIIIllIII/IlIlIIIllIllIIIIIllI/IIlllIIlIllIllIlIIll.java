package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.*;
import net.optifine.shaders.*;
import java.io.*;
import java.util.concurrent.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IIlllIIlIllIllIlIIll implements IlIlIIIllIllIIIIIllI, IIIIlllIIIIIIlIIIlll
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private final Map IlIlIlIlIlllllllllIl;
    private final List llIllIIIIIllIlIIIIlI;
    private final Map IlIIIlIlIIIllIlIlIIl;
    private IlIlIIIllIIllIlllllI IlIlIIIllIllIIIIIllI;
    private IlIIIlIlIIIllIlIlIIl IllIIlllIIIIlllIIlIl;
    private lIllllIllIllIIllllll llllIIIlIlllIlIIIIIl;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public IIlllIIlIllIllIlIIll(final IlIlIIIllIIllIlllllI ilIlIIIllIllIIIIIllI) {
        this.IlIlIlIlIlllllllllIl = Maps.newHashMap();
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
        this.IlIIIlIlIIIllIlIlIIl = Maps.newHashMap();
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll llllIIIlIlllIlIIIIIl) {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIlllIlIlllIlIllll()) {
            llllIIIlIlllIlIIIIIl = IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl);
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.B()) {
            llllIIIlIlllIlIIIIIl = llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl);
        }
        IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.get(llllIIIlIlllIlIIIIIl);
        if (llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll()) {
            llllIIIIlIIIlIlllIll = llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl);
        }
        if (llllIIIIlIIIlIlllIll == null) {
            llllIIIIlIIIlIlllIll = new lIIIlllIIIllIIIllIII(llllIIIlIlllIlIIIIIl);
            this.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, llllIIIIlIIIlIlllIll);
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        }
        else {
            IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
        }
        this.IllIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        if (this.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, (IlIIIlIlIIIllIlIlIIl)illIIlllIIIIlllIIlIl)) {
            this.llIllIIIIIllIlIIIIlI.add(illIIlllIIIIlllIIlIl);
            return true;
        }
        return false;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll, IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll) {
        boolean b = true;
        try {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
        }
        catch (IOException ex) {
            IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll.warn("Failed to load texture: " + lIllllIllIllIIllllll, (Throwable)ex);
            llllIIIIlIIIlIlllIll = IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll;
            this.IlIlIlIlIlllllllllIl.put(lIllllIllIllIIllllll, llllIIIIlIIIlIlllIll);
            b = false;
        }
        catch (Throwable t) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll;
            final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Registering texture");
            final net.minecraft.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Resource location being registered");
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Resource location", lIllllIllIllIIllllll);
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Texture object class", new lllIIIIlllllIlIIllIl(this, ilIIIlIlIIIllIlIlIIl));
            throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll2);
        }
        this.IlIlIlIlIlllllllllIl.put(lIllllIllIllIIllllll, llllIIIIlIIIlIlllIll);
        return b;
    }
    
    public IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return this.IlIlIlIlIlllllllllIl.get(lIllllIllIllIIllllll);
    }
    
    public lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final String s, IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll) {
        if (s.equals("logo")) {
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        }
        final Integer n = this.IlIIIlIlIIIllIlIlIIl.get(s);
        Integer n2;
        if (n == null) {
            n2 = 1;
        }
        else {
            n2 = n + 1;
        }
        this.IlIIIlIlIIIllIlIlIIl.put(s, n2);
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(String.format("dynamic/%s_%d", s, n2));
        this.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, llllIIIIlIIIlIlllIll);
        return lIllllIllIllIIllllll;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl() {
        final Iterator<IlIlIIIllIllIIIIIllI> iterator = this.llIllIIIIIllIlIIIIlI.iterator();
        while (iterator.hasNext()) {
            iterator.next().IlIlIlIlIlllllllllIl();
        }
    }
    
    public void llIllIIIIIllIlIIIIlI(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll);
        if (ilIlIlIlIlllllllllIl != null) {
            this.IlIlIlIlIlllllllllIl.remove(lIllllIllIllIIllllll);
            IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("*** Reloading textures ***");
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI("Resource packs: " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllIIlllllIIllIIllIl());
        final Iterator<lIllllIllIllIIllllll> iterator = this.IlIlIlIlIlllllllllIl.keySet().iterator();
        while (iterator.hasNext()) {
            final lIllllIllIllIIllllll lIllllIllIllIIllllll = iterator.next();
            final String ilIlIlIlIlllllllllIl = lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl();
            if (ilIlIlIlIlllllllllIl.startsWith("mcpatcher/") || ilIlIlIlIlllllllllIl.startsWith("optifine/") || llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll)) {
                final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = this.IlIlIlIlIlllllllllIl.get(lIllllIllIllIIllllll);
                if (ilIIIlIlIIIllIlIlIIl instanceof net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll) {
                    ((net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll)ilIIIlIlIIIllIlIlIIl).IllIIlllIIIIlllIIlIl();
                }
                iterator.remove();
            }
        }
        llIllIlIlIIIIIIIllII.lIIIIlIIIIIlllIllIII();
        for (final Map.Entry<lIllllIllIllIIllllll, V> entry : new HashSet<Map.Entry<lIllllIllIllIIllllll, V>>(this.IlIlIlIlIlllllllllIl.entrySet())) {
            this.llllIIIIlIIIlIlllIll(entry.getKey(), (IlIIIlIlIIIllIlIlIIl)entry.getValue());
        }
    }
    
    public void llllIIIIlIIIlIlllIll() {
        for (final Map.Entry<lIllllIllIllIIllllll, V> entry : new HashSet<Map.Entry<lIllllIllIllIIllllll, V>>(this.IlIlIlIlIlllllllllIl.entrySet())) {
            final lIllllIllIllIIllllll lIllllIllIllIIllllll = entry.getKey();
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (IlIIIlIlIIIllIlIlIIl)entry.getValue();
            if (ilIIIlIlIIIllIlIlIIl instanceof llllIIIlIlllIlIIIIIl) {
                this.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, ilIIIlIlIIIllIlIlIIl);
            }
        }
    }
    
    public IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public lIllllIllIllIIllllll IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
}
