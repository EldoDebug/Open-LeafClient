package net.minecraft.client.IlIlIIIllIllIIIIIllI;

import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llllIIIIlIIIlIlllIll implements lIIIIlIIIIIlllIllIII
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    private lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI;
    private List IlIIIlIlIIIllIlIlIIl;
    private IlllllllIIIlIIIlIlII IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII ilIlIIIllIllIIIIIllI) {
        this.llIllIIIIIllIlIIIIlI = new lIIllIIIllllIlllIllI();
        this.IlIIIlIlIIIllIlIlIIl = Lists.newArrayList();
        this.IlIlIlIlIlllllllllIl = new llllIIIlIlllIlIIIIIl(ilIlIIIllIllIIIIIllI, 0, 0);
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return true;
    }
    
    public void IlIlIlIlIlllllllllIl(final int n, final int n2) {
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(n, n2);
        if (!ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII()) {
            ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl();
        }
        this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, n2));
        this.IlIIIlIlIIIllIlIlIIl.remove(ilIIIlIlIIIllIlIlIIl);
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, n, n2);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, n2), llllIIIIlIIIlIlllIll);
        this.IlIIIlIlIIIllIlIlIIl.add(llllIIIIlIIIlIlllIll);
        llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(true);
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl(final int n, final int n2) {
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll)this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, n2));
        return (llllIIIIlIIIlIlllIll == null) ? this.IlIlIlIlIlllllllllIl : llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final boolean b, final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl) {
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        final long currentTimeMillis = System.currentTimeMillis();
        final Iterator<net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll> iterator = this.IlIIIlIlIIIllIlIlIIl.iterator();
        while (iterator.hasNext()) {
            iterator.next().IlIlIlIlIlllllllllIl(System.currentTimeMillis() - currentTimeMillis > 5L);
        }
        if (System.currentTimeMillis() - currentTimeMillis > 100L) {
            net.minecraft.client.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.info("Warning: Clientside chunk ticking took {} ms", new Object[] { System.currentTimeMillis() - currentTimeMillis });
        }
        return false;
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI() {
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final int n, final int n2) {
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
        return false;
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl() {
        return "MultiplayerChunkCache: " + this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() + ", " + this.IlIIIlIlIIIllIlIlIIl.size();
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return null;
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final String s, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return null;
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI() {
        return this.IlIIIlIlIIIllIlIlIIl.size();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4);
    }
}
