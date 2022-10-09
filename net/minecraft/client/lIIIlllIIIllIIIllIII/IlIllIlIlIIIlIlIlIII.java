package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import leaf.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class IlIllIlIlIIIlIlIlIII implements IIIIlllIIIIIIlIIIlll
{
    private lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll;
    private final llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    private final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI;
    private final IIlllIIlIllIllIlIIll IlIIIlIlIIIllIlIlIIl;
    private final IlIlIlIlIlllllllllIl IlIlIIIllIllIIIIIllI;
    
    public IlIllIlIlIIIlIlIlIII(final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = new llIllIIIIIllIlIIIIlI();
        this.IlIIIlIlIIIllIlIlIIl = new IIlllIIlIllIllIlIIll();
        this.IlIlIIIllIllIIIIIllI = new IlIlIlIlIlllllllllIl();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI() == 3) {
            llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl);
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, new net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll), ilIlIIIllIIllIlllllI).llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI());
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        try {
            int n;
            if (Leaf.instance.modManager.clearGlass) {
                if (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().lllllIlIIIlIlIIlllII().equals("Glass") || llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().lllllIlIIIlIlIIlllII().equals("Glass Pane")) {
                    n = 100;
                }
                else {
                    n = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().llIllIlIIIIllIlIIllI();
                }
            }
            else {
                n = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().llIllIlIIIIllIlIIllI();
            }
            if (n == -1) {
                return false;
            }
            switch (n) {
                case 1: {
                    return this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, liIllIIIllllIlllIllI);
                }
                case 2: {
                    return false;
                }
                case 3: {
                    return this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl), llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, liIllIIIllllIlllIllI);
                }
                default: {
                    return false;
                }
            }
        }
        catch (Throwable t) {
            final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Tesselating block in world");
            lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Block being tesselated"), ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI(), llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl));
            throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
        }
    }
    
    public llIllIIIIIllIlIIIIlI IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    private net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl);
        if (ilIlIlIlIlllllllllIl != null && this.IlIlIlIlIlllllllllIl.IlIlIIIlIIlIlIIlllIl && ilIlIlIlIlllllllllIl2 instanceof llIllIlIIIIllIlIIllI) {
            ilIlIlIlIlllllllllIl2 = ((llIllIlIIIIllIlIIllI)ilIlIlIlIlllllllllIl2).llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl));
        }
        return ilIlIlIlIlllllllllIl2;
    }
    
    public net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        if (lIlIlIIIllIIllIIIllI.p_() != llIllIlIlIIIIIIIllII.llllIIIlIlllIlIIIIIl) {
            try {
                llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl);
            }
            catch (Exception ex) {}
        }
        net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        if (ilIlIlIlIlllllllllIl != null && this.IlIlIlIlIlllllllllIl.IlIlIIIlIIlIlIIlllIl && ilIlIlIlIlllllllllIl2 instanceof llIllIlIIIIllIlIIllI) {
            ilIlIlIlIlllllllllIl2 = ((llIllIlIIIIllIlIIllI)ilIlIlIlIlllllllllIl2).llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl));
        }
        return ilIlIlIlIlllllllllIl2;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final float n) {
        final int llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().llIllIlIIIIllIlIIllI();
        if (llIllIlIIIIllIlIIllI != -1) {
            switch (llIllIlIIIIllIlIIllI) {
                case 2: {
                    this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI(), n);
                    break;
                }
                case 3: {
                    this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, null), llIIlIIIlIIIllIlIIIl, n, true);
                    break;
                }
            }
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        if (llllIIIIlIIIlIlllIll == null) {
            return false;
        }
        final int llIllIlIIIIllIlIIllI = llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI();
        return llIllIlIIIIllIlIIllI != 3 && llIllIlIIIIllIlIIllI == 2;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
    }
}
