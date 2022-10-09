package net.minecraft.client.lIIIlllIIIllIIIllIII;

import java.util.*;
import com.google.common.collect.*;
import net.optifine.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public abstract class lllIIIIlllllIlIIllIl
{
    private double llIllIIIIIllIlIIIIlI;
    private double IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    protected List llllIIIIlIIIlIlllIll;
    protected boolean IlIlIlIlIlllllllllIl;
    private BitSet IllIIlllIIIIlllIIlIl;
    private final BitSet llllIIIlIlllIlIIIIIl;
    
    public lllIIIIlllllIlIIllIl() {
        this.llllIIIIlIIIlIlllIll = Lists.newArrayListWithCapacity(17424);
        this.llllIIIlIlllIlIIIIIl = new BitSet();
    }
    
    public void llllIIIIlIIIlIlllIll(final double llIllIIIIIllIlIIIIlI, final double ilIIIlIlIIIllIlIlIIl, final double ilIlIIIllIllIIIIIllI) {
        this.IlIlIlIlIlllllllllIl = true;
        this.llllIIIIlIIIlIlllIll.clear();
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        if (llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll()) {
            if (this.IllIIlllIIIIlllIIlIl != null) {
                llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl);
            }
            else {
                this.IllIIlllIIIIlllIIlIl = this.llllIIIlIlllIlIIIIIl;
            }
            this.IllIIlllIIIIlllIIlIl.clear();
        }
        else if (this.IllIIlllIIIIlllIIlIl != null) {
            llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl);
            this.IllIIlllIIIIlllIIlIl = null;
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        final IlIlIlIlIlllllllllIl liiIlllIIIllIIIllIII = ilIllIlIlIIIlIlIlIII.lIIIlllIIIllIIIllIII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)(liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII() - this.llIllIIIIIllIlIIIIlI), (float)(liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII() - this.IlIIIlIlIIIllIlIlIIl), (float)(liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl() - this.IlIlIIIllIllIIIIIllI));
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII) {
        this.llllIIIIlIIIlIlllIll.add(ilIllIlIlIIIlIlIlIII);
        if (this.IllIIlllIIIIlllIIlIl != null) {
            final BitSet ilIlIIIllIllIIIIIllI = ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(ilIIlIlIIIlIIlIlIlII);
            if (ilIlIIIllIllIIIIIllI != null) {
                this.IllIIlllIIIIlllIIlIl.or(ilIlIIIllIllIIIIIllI);
            }
        }
    }
    
    public abstract void llllIIIIlIIIlIlllIll(final IlIIlIlIIIlIIlIlIlII p0);
}
