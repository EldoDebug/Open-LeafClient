package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI;

import org.apache.logging.log4j.*;
import java.util.concurrent.*;
import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;
import java.io.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IllIIlllIIIIlllIIlIl implements lIIIIlIIIIIlllIllIII
{
    private static final Logger IlIlIlIlIlllllllllIl;
    private Set llIllIIIIIllIlIIIIlI;
    private llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl;
    private lIIIIlIIIIIlllIllIII IlIlIIIllIllIIIIIllI;
    private net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII IllIIlllIIIIlllIIlIl;
    public boolean llllIIIIlIIIlIlllIll;
    private lIIllIIIllllIlllIllI llllIIIlIlllIlIIIIIl;
    private List lIIIIlIIIIIlllIllIII;
    private IIIllllllIllIIIlllIl lIIIlllIIIllIIIllIII;
    
    static {
        IlIlIlIlIlllllllllIl = LogManager.getLogger();
    }
    
    public IllIIlllIIIIlllIIlIl(final IIIllllllIllIIIlllIl liiIlllIIIllIIIllIII, final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII illIIlllIIIIlllIIlIl, final lIIIIlIIIIIlllIllIII ilIlIIIllIllIIIIIllI) {
        this.llIllIIIIIllIlIIIIlI = Collections.newSetFromMap(new ConcurrentHashMap<Object, Boolean>());
        this.llllIIIIlIIIlIlllIll = true;
        this.llllIIIlIlllIlIIIIIl = new lIIllIIIllllIlllIllI();
        this.lIIIIlIIIIIlllIllIII = Lists.newArrayList();
        this.IlIIIlIlIIIllIlIlIIl = new llllIIIlIlllIlIIIIIl(liiIlllIIIllIIIllIII, 0, 0);
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, n2));
    }
    
    public List IllIIlllIIIIlllIIlIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public void IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (this.lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI()) {
            if (!this.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI(n, n2)) {
                this.llIllIIIIIllIlIIIIlI.add(net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, n2));
            }
        }
        else {
            this.llIllIIIIIllIlIIIIlI.add(net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, n2));
        }
    }
    
    public void llllIIIlIlllIlIIIIIl() {
        for (final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : this.lIIIIlIIIIIlllIllIII) {
            this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        }
    }
    
    public llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        final long llllIIIIlIIIlIlllIll = net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, n2);
        this.llIllIIIIIllIlIIIIlI.remove(llllIIIIlIIIlIlllIll);
        llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = (llllIIIIlIIIlIlllIll)this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        if (llllIIIIlIIIlIlllIll2 == null) {
            llllIIIIlIIIlIlllIll2 = this.IlIlIIIllIllIIIIIllI(n, n2);
            if (llllIIIIlIIIlIlllIll2 == null) {
                if (this.IlIlIIIllIllIIIIIllI == null) {
                    llllIIIIlIIIlIlllIll2 = this.IlIIIlIlIIIllIlIlIIl;
                }
                else {
                    try {
                        llllIIIIlIIIlIlllIll2 = this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl(n, n2);
                    }
                    catch (Throwable t) {
                        final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Exception generating new chunk");
                        final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Chunk to be generated");
                        llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("Location", String.format("%d,%d", n, n2));
                        llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("Position hash", llllIIIIlIIIlIlllIll);
                        llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("Generator", this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl());
                        throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll3);
                    }
                }
            }
            this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2);
            this.lIIIIlIIIIIlllIllIII.add(llllIIIIlIIIlIlllIll2);
            llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI();
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(this, this, n, n2);
        }
        return llllIIIIlIIIlIlllIll2;
    }
    
    @Override
    public llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl(final int n, final int n2) {
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (llllIIIIlIIIlIlllIll)this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, n2));
        return (llllIIIIlIIIlIlllIll == null) ? ((!this.lIIIlllIIIllIIIllIII.IllIllIIIIlIIlIlllII() && !this.llllIIIIlIIIlIlllIll) ? this.IlIIIlIlIIIllIlIlIIl : this.llIllIIIIIllIlIIIIlI(n, n2)) : llllIIIIlIIIlIlllIll;
    }
    
    private llllIIIIlIIIlIlllIll IlIlIIIllIllIIIIIllI(final int n, final int n2) {
        if (this.IllIIlllIIIIlllIIlIl == null) {
            return null;
        }
        try {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII, n, n2);
            if (llllIIIIlIIIlIlllIll != null) {
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII());
                if (this.IlIlIIIllIllIIIIIllI != null) {
                    this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n, n2);
                }
            }
            return llllIIIIlIIIlIlllIll;
        }
        catch (Exception ex) {
            net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl.error("Couldn't load chunk", (Throwable)ex);
            return null;
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.IllIIlllIIIIlllIIlIl != null) {
            try {
                this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII, llllIIIIlIIIlIlllIll);
            }
            catch (Exception ex) {
                net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl.error("Couldn't save entities", (Throwable)ex);
            }
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.IllIIlllIIIIlllIIlIl != null) {
            try {
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII());
                this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII, llllIIIIlIIIlIlllIll);
            }
            catch (IOException ex) {
                net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl.error("Couldn't save chunk", (Throwable)ex);
            }
            catch (lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
                net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl.error("Couldn't save chunk; already in use by another instance of Minecraft?", (Throwable)lllIIIIlllllIlIIllIl);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final int n, final int n2) {
        final llllIIIIlIIIlIlllIll ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(n, n2);
        if (!ilIIIlIlIIIllIlIlIIl.IIllIIllIIIlIlIIIIlI()) {
            ilIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll();
            if (this.IlIlIIIllIllIIIIIllI != null) {
                this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, n, n2);
                ilIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl();
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
        if (this.IlIlIIIllIllIIIIIllI != null && this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, llllIIIIlIIIlIlllIll, n, n2)) {
            this.IlIIIlIlIIIllIlIlIIl(n, n2).llllIIIlIlllIlIIIIIl();
            return true;
        }
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final boolean b, final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl) {
        int n = 0;
        final ArrayList arrayList = Lists.newArrayList((Iterable)this.lIIIIlIIIIIlllIllIII);
        for (int i = 0; i < arrayList.size(); ++i) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = arrayList.get(i);
            if (b) {
                this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            }
            if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(b)) {
                this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
                llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(false);
                if (++n == 24 && !b) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        if (this.IllIIlllIIIIlllIIlIl != null) {
            this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI();
        }
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        if (!this.lIIIlllIIIllIIIllIII.IIlllIIIlIlllIIlllII) {
            for (int i = 0; i < 100; ++i) {
                if (!this.llIllIIIIIllIlIIIIlI.isEmpty()) {
                    final Long n = this.llIllIIIIIllIlIIIIlI.iterator().next();
                    final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (llllIIIIlIIIlIlllIll)this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(n);
                    if (llllIIIIlIIIlIlllIll != null) {
                        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl();
                        this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
                        this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                        this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl(n);
                        this.lIIIIlIIIIIlllIllIII.remove(llllIIIIlIIIlIlllIll);
                    }
                    this.llIllIIIIIllIlIIIIlI.remove(n);
                }
            }
            if (this.IllIIlllIIIIlllIIlIl != null) {
                this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl();
            }
        }
        return this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI() {
        return !this.lIIIlllIIIllIIIllIII.IIlllIIIlIlllIIlllII;
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl() {
        return "ServerChunkCache: " + this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() + " Drop: " + this.llIllIIIIIllIlIIIIlI.size();
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(illlIlIIllIlIlIlIIl, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final String s, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, s, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI() {
        return this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
    }
    
    @Override
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4);
    }
}
